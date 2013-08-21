#-*- coding:latin1 -*-

import tornado.httpserver
import tornado.ioloop

from tornadows import soaphandler
from tornadows import webservices
from tornadows import complextypes
from tornadows.soaphandler import webservice

class Pessoa(complextypes.ComplexType):
    nome = str
    idade = int

class MainHandler(soaphandler.SoapHandler):

    @webservice(_params=[int, int], _returns=int)
    def soma(self, a, b):
        return a+b

    @webservice(_params=Pessoa, _returns=str)
    def imprimePessoa(self, pessoa):
        return "%s - %d"%(pessoa.nome,pessoa.idade)

    @webservice(_params=[str, int], _returns=Pessoa)
    def getPessoa(self, nome, idade):
        pessoa = Pessoa()
        pessoa.nome = nome
        pessoa.idade = idade
        return pessoa

    


if __name__ == '__main__':
    application = [("Math", MainHandler)]
    ws = webservices.WebService(application)
    http_server = tornado.httpserver.HTTPServer(ws)
    http_server.listen(8080)
    tornado.ioloop.IOLoop.instance().start()
