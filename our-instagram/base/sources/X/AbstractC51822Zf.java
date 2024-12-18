package X;

import android.os.Debug;

/* renamed from: X.2Zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC51822Zf {
    public static void A00(long[] jArr) {
        String runtimeStat = Debug.getRuntimeStat("art.gc.gc-count");
        if (runtimeStat != null) {
            try {
                jArr[0] = Long.parseLong(runtimeStat);
            } catch (NumberFormatException e) {
                jArr[0] = -1;
                C0K8.A0L("GarbageCollectionStatsCollector", "Error parsing GC count %s", e, runtimeStat);
            }
        }
        String runtimeStat2 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
        if (runtimeStat2 != null) {
            try {
                jArr[1] = Long.parseLong(runtimeStat2);
            } catch (NumberFormatException e2) {
                jArr[1] = -1;
                C0K8.A0L("GarbageCollectionStatsCollector", "Error parsing blocking GC count %s", e2, runtimeStat2);
            }
        }
        String runtimeStat3 = Debug.getRuntimeStat("art.gc.gc-time");
        if (runtimeStat3 != null) {
            try {
                jArr[2] = Long.parseLong(runtimeStat3);
            } catch (NumberFormatException e3) {
                jArr[2] = -1;
                C0K8.A0L("GarbageCollectionStatsCollector", "Error parsing GC time %s", e3, runtimeStat3);
            }
        }
        String runtimeStat4 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
        if (runtimeStat4 != null) {
            try {
                jArr[3] = Long.parseLong(runtimeStat4);
            } catch (NumberFormatException e4) {
                jArr[3] = -1;
                C0K8.A0L("GarbageCollectionStatsCollector", "Error parsing blocking GC time %s", e4, runtimeStat4);
            }
        }
    }
}
