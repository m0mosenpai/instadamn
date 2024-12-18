package X;

import android.os.Debug;

/* renamed from: X.Y9j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73353Y9j implements YNY {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.XeB, X.XRv, java.lang.Object] */
    @Override // X.YNY
    public final /* bridge */ /* synthetic */ AbstractC72463XeB BTc() {
        ?? obj = new Object();
        try {
            obj.A07 = Debug.getRuntimeStat("art.gc.gc-count-rate-histogram");
            obj.A06 = Debug.getRuntimeStat("art.gc.blocking-gc-count-rate-histogram");
            String runtimeStat = Debug.getRuntimeStat("art.gc.bytes-allocated");
            if (runtimeStat != null) {
                obj.A04 = AbstractC25228BEl.A13(runtimeStat);
            }
            String runtimeStat2 = Debug.getRuntimeStat("art.gc.bytes-freed");
            if (runtimeStat2 != null) {
                obj.A05 = AbstractC25228BEl.A13(runtimeStat2);
            }
            String runtimeStat3 = Debug.getRuntimeStat("art.gc.gc-count");
            if (runtimeStat3 != null) {
                obj.A02 = AbstractC25228BEl.A13(runtimeStat3);
            }
            String runtimeStat4 = Debug.getRuntimeStat("art.gc.gc-time");
            if (runtimeStat4 != null) {
                obj.A03 = AbstractC25228BEl.A13(runtimeStat4);
            }
            String runtimeStat5 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
            if (runtimeStat5 != null) {
                obj.A00 = AbstractC25228BEl.A13(runtimeStat5);
            }
            String runtimeStat6 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
            if (runtimeStat6 != null) {
                obj.A01 = AbstractC25228BEl.A13(runtimeStat6);
                return obj;
            }
        } catch (NumberFormatException e) {
            C0K8.A0J("GCStatsMetricsCollector", e.getMessage(), e);
        }
        return obj;
    }
}
