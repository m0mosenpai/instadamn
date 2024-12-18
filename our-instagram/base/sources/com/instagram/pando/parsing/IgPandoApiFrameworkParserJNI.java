package com.instagram.pando.parsing;

import X.C09170dP;
import X.C40757I4l;
import X.JHF;
import com.facebook.jni.HybridClassBase;
import com.facebook.pando.TreeJNI;

/* loaded from: classes7.dex */
public final class IgPandoApiFrameworkParserJNI extends HybridClassBase implements JHF {
    public static final C40757I4l Companion = new Object();

    @Override // X.JHF
    public native TreeJNI complete(Class cls);

    @Override // X.JHF
    public native void parseByteArray(byte[] bArr, int i);

    public native void parseString(String str);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.I4l, java.lang.Object] */
    static {
        C09170dP.A0C("pando-parsing-instagram-jni");
    }
}
