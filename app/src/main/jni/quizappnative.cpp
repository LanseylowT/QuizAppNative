#include <jni.h>

// Write C++ code here.
//
// Do not forget to dynamically load the C++ library into your application.
//
// For instance,
//
// In MainActivity.java:
//    static {
//       System.loadLibrary("quizappnative");
//    }
//
// Or, in MainActivity.kt:
//    companion object {
//      init {
//         System.loadLibrary("quizappnative")
//      }
//    }

extern "C"
JNIEXPORT jint JNICALL
Java_com_quizappnative_MainActivity_00024Companion_getShit(JNIEnv *env, jobject thiz) {
    // TODO: implement getShit()
    return 1 + 1;
}