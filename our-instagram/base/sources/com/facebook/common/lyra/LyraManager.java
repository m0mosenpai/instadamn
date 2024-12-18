package com.facebook.common.lyra;

import X.C09170dP;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class LyraManager {
    public static final LyraManager INSTANCE = new Object();
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    public static final native void installLibraryIdentifierFunction();

    public static final native boolean nativeInstallLyraHook(boolean z);

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.common.lyra.LyraManager, java.lang.Object] */
    static {
        C09170dP.A0C("lyramanager");
    }
}
