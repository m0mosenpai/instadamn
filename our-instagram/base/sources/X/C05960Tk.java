package X;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;

/* renamed from: X.0Tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05960Tk {
    public final NetworkStats.Bucket A00;
    public final NetworkStatsManager A01;

    public static void A00(C05960Tk c05960Tk, long[] jArr, int i, int i2) {
        try {
            NetworkStats querySummary = c05960Tk.A01.querySummary(i, null, Long.MIN_VALUE, Long.MAX_VALUE);
            while (querySummary.hasNextBucket()) {
                NetworkStats.Bucket bucket = c05960Tk.A00;
                querySummary.getNextBucket(bucket);
                int i3 = 4;
                if (bucket.getState() == 2) {
                    i3 = 0;
                }
                int i4 = i2 | i3;
                jArr[i4] = jArr[i4] + bucket.getRxBytes();
                int i5 = i3 | i2 | 1;
                jArr[i5] = jArr[i5] + bucket.getTxBytes();
            }
            querySummary.close();
        } catch (IllegalStateException | SecurityException e) {
            android.util.Log.e("NetworkStatsManagerBytesCollector", "NetworkStatsManager throws exception: ", e);
        }
    }

    public C05960Tk(Context context) {
        this.A00 = new NetworkStats.Bucket();
        this.A01 = (NetworkStatsManager) context.getSystemService(NetworkStatsManager.class);
    }

    public C05960Tk() {
    }
}
