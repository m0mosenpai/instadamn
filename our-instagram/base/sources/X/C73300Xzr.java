package X;

/* renamed from: X.Xzr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73300Xzr {
    public volatile long A02;
    public long A01 = 0;
    public long A00 = 0;

    public static void A00(C73300Xzr c73300Xzr) {
        if (c73300Xzr.A01 == 0) {
            C0K8.A0C("AnomalyDetector", "Detected Anomaly - all outputs disabled");
            c73300Xzr.A02++;
        }
        long j = c73300Xzr.A01;
        long j2 = c73300Xzr.A00;
        if (j > j2) {
            C0K8.A0O("AnomalyDetector", "Detected Anomaly - didn't complete all draws to output %d > %d", Long.valueOf(j), Long.valueOf(j2));
            c73300Xzr.A02++;
        }
        c73300Xzr.A01 = 0L;
        c73300Xzr.A00 = 0L;
    }
}
