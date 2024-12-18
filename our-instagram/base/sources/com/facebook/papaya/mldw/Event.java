package com.facebook.papaya.mldw;

import X.C09170dP;
import com.facebook.jni.HybridData;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Event {
    public static final Event $redex_init_class = null;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(long j, Map map);

    static {
        C09170dP.A0C("papaya-mldw");
    }

    public Event(long j, ImmutableMap immutableMap) {
        this.mHybridData = initHybrid(j, immutableMap);
    }
}
