package X;

import android.location.LocationManager;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.google.common.collect.EvictingQueue;

/* renamed from: X.4lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103774lw {
    public static final String[] A08 = {"gps", "network"};
    public C103804lz A00;
    public final LocationManager A01;
    public final C103724lq A02;
    public final C103734lr A03;
    public final LightweightQuickPerformanceLogger A04;
    public final C103754lu A05;
    public final C3VM A06;
    public final EvictingQueue A07 = new EvictingQueue(0);

    private void A00(String str, boolean z) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A04;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794441906, str, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C103804lz A01(java.lang.String r27, float r28, long r29, boolean r31) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103774lw.A01(java.lang.String, float, long, boolean):X.4lz");
    }

    public final boolean A03() {
        if (!this.A06.A00()) {
            return false;
        }
        return true;
    }

    public C103774lw(LocationManager locationManager, C103724lq c103724lq, C103734lr c103734lr, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, C103754lu c103754lu, C3VM c3vm) {
        this.A02 = c103724lq;
        this.A01 = locationManager;
        this.A03 = c103734lr;
        this.A06 = c3vm;
        this.A05 = c103754lu;
        this.A04 = lightweightQuickPerformanceLogger;
    }

    public final void A02(C103804lz c103804lz) {
        String str;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A04;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(794430333);
        }
        short s = 3;
        if (c103804lz == null) {
            str = "new location is null";
        } else {
            C103804lz c103804lz2 = this.A00;
            if (c103804lz2 == null || c103804lz2.A03() == null || (c103804lz.A03() != null && c103804lz.A03().longValue() > c103804lz2.A03().longValue())) {
                this.A00 = c103804lz;
                s = 2;
                if (lightweightQuickPerformanceLogger == null) {
                    return;
                }
                lightweightQuickPerformanceLogger.markerEnd(794430333, s);
            }
            str = "saved location is newer";
        }
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794430333, "end_reason", str);
            lightweightQuickPerformanceLogger.markerEnd(794430333, s);
        }
    }
}
