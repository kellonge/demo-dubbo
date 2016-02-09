#!/bin/sh

JAVA_HOME=/DISK/software/java/jdk1.7.0_80
JRE_HOME=$JAVA_HOME/jre                
CLASSPATH=.:$JAVA_HOME/lib:$JRE_HOME/lib
PATH=$JAVA_HOME/bin:$JRE_HOME/bin:$PATH

pid=`ps aux | grep java.*RpcServerStart | grep -v grep | awk '{print $2}'`
if [ $pid ]
then
	kill -9 $pid
fi
nohup java -classpath ".:lib/*" com.kellonge.rpc.server.start.RpcServerStart > /DISK/log/rpc.server/nohup.out 2>&1 &