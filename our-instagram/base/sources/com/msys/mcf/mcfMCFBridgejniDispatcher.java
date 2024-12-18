package com.msys.mcf;

import X.C09170dP;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class mcfMCFBridgejniDispatcher {
    public static native NativeHolder MCFURLCreateWithFileSystemPathNative(String str, boolean z);

    public static native NativeHolder MCFURLCreateWithStringNative(String str);

    static {
        C09170dP.A0C("mcfMCFBridgejni");
    }
}
