package com.instagram.giphy.webp;

import X.AnonymousClass754;
import X.C09170dP;
import X.C14360o3;
import com.facebook.jni.HybridData;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class IgWebPAnim {
    public static final AnonymousClass754 Companion = new Object();
    public HybridData mHybridData = initHybrid();
    public final AtomicBoolean destructed = new AtomicBoolean(false);

    private final native HybridData initHybrid();

    private final native IgWebPAnimDecoder nativeCreateDecoder();

    private final native void prepareFromFile(String str);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.754] */
    static {
        C09170dP.A0C("webpdecoder-native");
    }

    public IgWebPAnim(File file) {
        String path = file.getPath();
        C14360o3.A07(path);
        prepareFromFile(path);
    }

    public final IgWebPAnimDecoder createDecoder() {
        return nativeCreateDecoder();
    }
}
