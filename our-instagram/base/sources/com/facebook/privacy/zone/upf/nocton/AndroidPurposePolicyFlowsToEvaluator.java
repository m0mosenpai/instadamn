package com.facebook.privacy.zone.upf.nocton;

import X.C09170dP;
import X.C14360o3;
import X.C39715Hjl;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes7.dex */
public final class AndroidPurposePolicyFlowsToEvaluator {
    public static final C39715Hjl Companion = new Object();
    public final HybridData mHybridData;

    public AndroidPurposePolicyFlowsToEvaluator(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native int flowsTo(String str, String str2, Map map);

    public static final native HybridData initHybrid0();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Hjl] */
    static {
        C09170dP.A0C("mobile_purpose_policy");
    }

    public AndroidPurposePolicyFlowsToEvaluator() {
        this(initHybrid0());
    }
}
