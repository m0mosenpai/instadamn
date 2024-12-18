package X;

import android.os.Process;

/* loaded from: classes4.dex */
public abstract class AFT {
    public static final int[] A00 = {8224, 8224, 8224};

    public static final C9ZS A00() {
        try {
            long[] jArr = new long[3];
            Class.forName("android.os.Process").getMethod("readProcFile", String.class, int[].class, String[].class, long[].class, float[].class).invoke(null, AnonymousClass001.A0c("/proc/", "/schedstat", Process.myPid()), A00, null, jArr, null);
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            if (j == 0 && j2 == 0 && j3 == 0) {
                return null;
            }
            return new C9ZS(j, j2, j3, 0);
        } catch (Exception e) {
            C0K8.A0G("SchedStatsCollector", "There was a problem accessing the schedstat data.", e);
            return null;
        }
    }
}
