package com.instagram.pando.livetree;

import X.C09170dP;
import X.C14360o3;
import X.C40756I4k;
import com.facebook.jni.HybridData;
import java.util.Set;

/* loaded from: classes7.dex */
public final class SupportedFieldsJNI {
    public static final C40756I4k Companion = new Object();
    public final HybridData mHybridData;

    public SupportedFieldsJNI(Set set) {
        C14360o3.A0B(set, 1);
        this.mHybridData = initHybridData(set);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybridData(Set set);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.I4k, java.lang.Object] */
    static {
        C09170dP.A0C("live-tree-jni");
    }
}
