package com.instagram.common.api.base;

import X.AbstractC26181Oz;
import X.C14360o3;
import X.C1D9;
import X.C1QW;
import X.C1QY;
import X.C1RA;
import X.C9F3;
import X.C9FC;
import X.C9G1;
import X.C9G4;
import X.C9GF;
import X.InterfaceC16660sJ;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes.dex */
public final class CacheBehaviorLogger {
    public static final String ATTEMPTED_CACHE = "attempted_cache";
    public static final String CACHE_MISS = "cache_miss";
    public static final String CACHE_POLICY = "cache_policy";
    public static final String CACHE_TASK_DISPATCH_NETWORK_SUCCESS = "cache_task_dispatch_network_success";
    public static final String CACHE_TIMEOUT = "cache_timeout";
    public static final C1D9 Companion = new Object();
    public static final String EXPIRE_THRESHOLD = "expire_threshold";
    public static final String PASS_TO_NEXT_LAYER = "pass_to_next_layer";
    public static final String SET_READ_MODE = "set_read_mode";
    public static final String SOURCE = "source";
    public static final String TIGON_FAIL = "tigon_fail";
    public static final String TIGON_ON_RESPONSE = "tigon_on_response";
    public static final String TIGON_RESPONSE_BODY_START = "tigon_response_body_start";
    public static final String TIGON_SEND_REQUEST = "tigon_send_request";
    public static final String TIGON_SUCCESS = "tigon_success";
    public static final String URI = "uri";
    public final LightweightQuickPerformanceLogger logger;

    public CacheBehaviorLogger(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        C14360o3.A0B(lightweightQuickPerformanceLogger, 1);
        this.logger = lightweightQuickPerformanceLogger;
    }

    public final void markerAnnotate(C1QW c1qw, String str, String str2) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        withMarkers(new C9GF(this, c1qw, str, str2, 1));
    }

    public final void markerEnd(C1QW c1qw, short s) {
        C14360o3.A0B(c1qw, 0);
        withMarkers(new C9FC(s, 2, this, c1qw));
    }

    public final void markerPoint(C1QW c1qw, String str) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(str, 1);
        withMarkers(new C9G1(this, c1qw, str, 3));
    }

    public final void markerStartWithAnnotations(C1QW c1qw, C1QY c1qy) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        withMarkers(new C9F3(42, this, c1qw));
        markerAnnotate(c1qw, CACHE_POLICY, AbstractC26181Oz.A00(c1qy.A0C));
        markerAnnotate(c1qw, "uri", C1RA.A00(c1qw.A09));
        markerAnnotate(c1qw, CACHE_TIMEOUT, c1qy.A00);
        markerAnnotate(c1qw, EXPIRE_THRESHOLD, c1qy.A01);
    }

    private final void withMarkers(InterfaceC16660sJ interfaceC16660sJ) {
        interfaceC16660sJ.invoke(25625981);
    }

    public final void markerAnnotate(C1QW c1qw, String str, long j) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(str, 1);
        withMarkers(new C9G4(this, c1qw, str, 1, j));
    }

    public final void markerPoint(C1QW c1qw, String str, String str2) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        withMarkers(new C9GF(this, c1qw, str, str2, 2));
    }
}
