package com.facebook.quicklog;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@Deprecated
/* loaded from: classes.dex */
public interface LightweightQuickPerformanceLogger {
    long currentMonotonicTimestamp();

    long currentMonotonicTimestampNanos();

    boolean isMarkerOn(int i, int i2, boolean z);

    boolean isMarkerOn(int i, boolean z);

    EventBuilder markEventBuilder(int i, int i2, String str);

    EventBuilder markEventBuilder(int i, String str);

    void markerAnnotate(int i, int i2, String str, double d);

    void markerAnnotate(int i, int i2, String str, int i3);

    void markerAnnotate(int i, int i2, String str, long j);

    void markerAnnotate(int i, int i2, String str, String str2);

    void markerAnnotate(int i, int i2, String str, boolean z);

    void markerAnnotate(int i, int i2, String str, double[] dArr);

    void markerAnnotate(int i, int i2, String str, int[] iArr);

    void markerAnnotate(int i, int i2, String str, long[] jArr);

    void markerAnnotate(int i, int i2, String str, String[] strArr);

    void markerAnnotate(int i, int i2, String str, boolean[] zArr);

    void markerAnnotate(int i, String str, double d);

    void markerAnnotate(int i, String str, int i2);

    void markerAnnotate(int i, String str, long j);

    void markerAnnotate(int i, String str, String str2);

    void markerAnnotate(int i, String str, boolean z);

    void markerAnnotate(int i, String str, double[] dArr);

    void markerAnnotate(int i, String str, int[] iArr);

    void markerAnnotate(int i, String str, long[] jArr);

    void markerAnnotate(int i, String str, String[] strArr);

    void markerAnnotate(int i, String str, boolean[] zArr);

    void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3);

    void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2);

    void markerDrop(int i);

    void markerDrop(int i, int i2);

    void markerDropForUserFlow(int i, int i2);

    void markerEnd(int i, int i2, short s);

    void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit);

    void markerEnd(int i, short s);

    void markerEnd(int i, short s, long j, TimeUnit timeUnit);

    void markerEndAtPointForUserFlow(int i, int i2, short s, String str);

    void markerEndForUserFlow(int i, int i2, short s);

    void markerEndForUserFlow(int i, String str, int i2, short s);

    void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map map);

    void markerLinkPivot(int i, int i2, String str);

    void markerPoint(int i, int i2, String str);

    void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit);

    void markerPoint(int i, int i2, String str, String str2);

    void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit);

    void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3);

    void markerPoint(int i, String str);

    void markerPoint(int i, String str, long j, TimeUnit timeUnit);

    void markerPoint(int i, String str, String str2);

    void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit);

    void markerStart(int i);

    void markerStart(int i, int i2);

    void markerStart(int i, int i2, long j, TimeUnit timeUnit);

    void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3);

    void markerStart(int i, int i2, String str, String str2);

    void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit);

    void markerStart(int i, String str, String str2);

    void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit);

    void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z);

    void markerStartForUserFlow(int i, int i2, String str, boolean z, long j);

    void markerStartForUserFlow(int i, int i2, String str, boolean z, long j, long j2, TimeUnit timeUnit);

    void markerStartForUserFlow(int i, int i2, boolean z, long j);

    void markerStartWithCancelPolicy(int i, boolean z);

    void markerStartWithCancelPolicy(int i, boolean z, int i2);

    void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit);

    @Deprecated
    void markerTag(int i, int i2, String str);

    @Deprecated
    void markerTag(int i, String str);

    MarkerEditor withMarker(int i);

    MarkerEditor withMarker(int i, int i2);
}
