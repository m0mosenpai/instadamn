package com.facebook.pando;

import X.C09170dP;
import X.XgY;

/* loaded from: classes.dex */
public final class TreeUtils {
    public static final XgY Companion = new Object();

    public static final native String appendWeakRecordIndex(String str, int i);

    public static final native String appendWeakRecordPath(String str, String str2);

    public static final native String canonicalNameFromTemplate(String str, TreeJNI treeJNI);

    public static final native String makeStrongConcatenatedKey(String str, String str2);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.XgY] */
    static {
        C09170dP.A0C("pando-jni");
    }
}
