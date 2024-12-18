package com.facebook.jni;

/* loaded from: classes.dex */
public class CppSystemErrorException extends CppException {
    public int errorCode;

    public CppSystemErrorException(String str, int i) {
        super(str);
        this.errorCode = i;
    }
}
