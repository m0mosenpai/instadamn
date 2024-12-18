package com.facebook.pando;

import X.C09170dP;
import X.C68316VMc;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class PandoFlipperUtil {
    public static final C68316VMc Companion = new Object();

    public static final native PandoConsistencyStackJNI createConsistencyStack(PandoConsistencyStackJNI pandoConsistencyStackJNI, Executor executor);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.VMc, java.lang.Object] */
    static {
        C09170dP.A0C("pando-flipper-jni");
    }
}
