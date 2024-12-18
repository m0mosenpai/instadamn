package com.facebook.common.patch.core;

import com.facebook.soloader.NativeLibrary;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class BsdiffNativeLibrary extends NativeLibrary {
    public static native void patch(String str, String str2, String str3);

    public BsdiffNativeLibrary() {
        super(Arrays.asList("c++_shared", "bsdiff", "commonpatchjni"));
    }
}
