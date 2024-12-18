package com.facebook.traffic.nts.providers.fgbg;

import X.C09170dP;
import X.C14360o3;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class AppFgBgStateProviderImpl {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    public AppFgBgStateProviderImpl(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    /* loaded from: classes12.dex */
    public final class Companion {
        private final HybridData initHybrid0() {
            return AppFgBgStateProviderImpl.initHybrid0();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.traffic.nts.providers.fgbg.AppFgBgStateProviderImpl$Companion] */
    static {
        C09170dP.A0C("fgbg_provider");
    }

    public AppFgBgStateProviderImpl() {
        this(initHybrid0());
    }
}
