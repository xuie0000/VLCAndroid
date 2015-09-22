# vlc-android
vlc-android源码 - 缩减了只剩下Android部分

# ubuntu 15.04 编译Android-VLC
查看本文之前，请先看VLC官网：

> wiki.videolan.org/AndroidCompile

编译VLC在网络上已经有许多人在说了，我是站在前人的基础上编译的，碰到问题多取百家之长是明智的！
下面是记录我在ubuntu上编译VLC的经历
##环境变量配置

```
xuie0000@Vostro-3900:~$ java -version
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
java version "1.8.0_51"
Java(TM) SE Runtime Environment (build 1.8.0_51-b16)
Java HotSpot(TM) 64-Bit Server VM (build 25.51-b03, mixed mode)
xuie0000@Vostro-3900:~$ echo $ANDROID_NDK 
/opt/android-ndk/android-ndk-r10d
xuie0000@Vostro-3900:~$ echo $ANDROID_SDK 
/opt/android-sdk
```
##编译错误处理
- 普遍的错误
这里列举一个例子的异常：

```
make: *** [../../contrib/tarballs/openjpeg-1.5.0.tar.gz] Error 7
make: *** Deleting file `../../contrib/tarballs/openjpeg-1.5.0.tar.gz'
contribs: make fetch failed
```
谷歌搜索“openjpeg-1.5.0.tar.gz”且下载，放在vlc/contrib/tarballs目录下，重新编译

- 版本错误
主要呢文档说明不是很详细，以致会出现以下不容易直接跳过的问题

```
# 安装yasm ---> 官网：If targeting an Android-x86 device, yasm must be installed too.
sudo apt-get install yasm
# 安装gettext ---> 官网：notably gettext 0.19.3 or later is required.
#下载gettext-0.19.3.tar.xz
xz -d gettext-0.19.3.tar.xz
tar -xf gettext-0.19.3.tar.xz
cd gettext-0.19.3
./configure
make -j4
sudo make instal
```
##编译

```
vlc$ sh compile.sh
```
最终显示了`BUILD SUCCESSFUL`表示已经编译成功了！

http://blog.csdn.net/xuie0000/article/details/47667835
