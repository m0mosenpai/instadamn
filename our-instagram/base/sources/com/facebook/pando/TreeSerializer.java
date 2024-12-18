package com.facebook.pando;

import X.C09170dP;
import X.C61810Ru4;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class TreeSerializer {
    public static final C61810Ru4 Companion = new Object();

    public static final native TreeJNI deserializeFromBytesNative(ByteBuffer byteBuffer, Class cls);

    public static final native ByteBuffer serializeAsBytes(TreeJNI treeJNI);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Ru4, java.lang.Object] */
    static {
        C09170dP.A0C("pando-serialize-jni");
    }
}
