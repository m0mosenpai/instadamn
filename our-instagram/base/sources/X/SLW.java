package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes10.dex */
public final class SLW {
    public final int A00;
    public final int A01;
    public final LightweightQuickPerformanceLogger A02;

    public final void A00(String str) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A02;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerPoint(28447843, this.A00, str);
        }
    }

    public SLW(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, int i, int i2) {
        this.A02 = lightweightQuickPerformanceLogger;
        this.A01 = i;
        this.A00 = i2;
    }
}
