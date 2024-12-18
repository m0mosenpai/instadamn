package com.facebook.pando.primaryexecution.cache;

import X.C09170dP;
import X.C14360o3;
import X.C4Id;
import com.facebook.jni.HybridData;
import com.facebook.stash.core.FileStash;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class PandoResponseCache {
    public static final C4Id Companion = new Object();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybridData(Executor executor, FileStash fileStash, boolean z, int i, boolean z2);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Id, java.lang.Object] */
    static {
        C09170dP.A0C("pando-client-cache-jni");
    }

    public /* synthetic */ PandoResponseCache(Executor executor, FileStash fileStash, boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, fileStash, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? false : z2);
    }

    public PandoResponseCache(Executor executor, FileStash fileStash, boolean z, int i, boolean z2) {
        C14360o3.A0B(executor, 1);
        C14360o3.A0B(fileStash, 2);
        this.mHybridData = initHybridData(executor, fileStash, z, i, z2);
    }
}
