package com.facebook.graphql.rtgql.sdk;

import X.C09170dP;
import X.C14360o3;
import X.C48C;
import com.facebook.graphql.rtgql.sdk.base.RealtimeGraphQLSDKProviderBase;
import com.facebook.jni.HybridData;
import com.facebook.realtime.common.appstate.AppStateSyncer;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class RealtimeGraphQLSDKProvider extends RealtimeGraphQLSDKProviderBase {
    public static final C48C Companion = new Object();

    public static final native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService, AppStateSyncer appStateSyncer);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.48C, java.lang.Object] */
    static {
        C09170dP.A0C("rtgqlsdk");
    }

    public /* synthetic */ RealtimeGraphQLSDKProvider(ScheduledExecutorService scheduledExecutorService, AppStateSyncer appStateSyncer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(scheduledExecutorService, (i & 2) != 0 ? null : appStateSyncer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeGraphQLSDKProvider(ScheduledExecutorService scheduledExecutorService, AppStateSyncer appStateSyncer) {
        super(initHybrid(scheduledExecutorService, appStateSyncer));
        C14360o3.A0B(scheduledExecutorService, 1);
    }
}
