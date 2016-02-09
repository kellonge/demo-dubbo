# 远程调用和自动部署示例程序

使用dubbo作为rpc框架，maven作为项目管理工具。

## 自动部署命令
* 编译打包
在`tareget`目录下生成对应的文件
``` shell
-P product clean package
````
`-P`命令指定当前打包的环境，有3种取值`dev,test,product`分别对应开发，测试，生产环境
* 上传文件
``` shell
wagon:upload-single
````
* 运行远程脚本
``` shell
wagon:sshexec
````
* 完整命令
``` shell
-P product clean package wagon:upload-single wagon:sshexec
````
