############################# Makefile ##########################
all: tp_pm2
tp_pm2: javac chatrmi/*.java && javac rmi/server/*.java && rmic -classpath /rmi/server/ChatServerDriver && rmic -classpath /chatrmi/ChatClient && rmiregistry 2020 && java /rmi/server/ChatServerDriver & && java /chatrmi/Chatrmi &

mrproper: clean
		rm -rf */*.class
		rm -rf */*/*.class
