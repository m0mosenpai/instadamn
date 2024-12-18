package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.0Xc, reason: invalid class name */
/* loaded from: classes.dex */
public interface C0Xc {
    public static final int[] A00 = {-1};

    C0Xa getListenerFlags();

    C06650Xb getListenerMarkers();

    String getName();

    void onMarkEvent(C0XX c0xx);

    void onMarkerAnnotate(C0XX c0xx);

    void onMarkerDrop(C0XX c0xx);

    void onMarkerPoint(C0XX c0xx, String str, C0XJ c0xj, long j, long j2, boolean z, int i);

    void onMarkerRestart(C0XX c0xx);

    void onMarkerStart(C0XX c0xx);

    void onMarkerStop(C0XX c0xx);

    void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger);
}
