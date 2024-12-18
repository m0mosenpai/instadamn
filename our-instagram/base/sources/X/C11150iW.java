package X;

import android.app.ActivityManager;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import java.util.Map;

/* renamed from: X.0iW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11150iW {
    public static ActivityManager A0W;
    public long A04;
    public long A05;
    public long A0A;
    public boolean A0V = false;
    public boolean A0U = false;
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = -1;
    public String A0R = "not set";
    public long A0B = -1;
    public long A0E = -1;
    public long A0D = -1;
    public long A0C = -1;
    public long A0F = -1;
    public long A03 = -1;
    public long A06 = -1;
    public long A07 = -1;
    public C0BD A0O = null;
    public ActivityManager.MemoryInfo A0M = null;
    public C0B9 A0N = null;
    public C0GQ A0Q = null;
    public ClassLoadingStats.SnapshotStats A0P = null;
    public Map A0S = null;
    public long A0G = -1;
    public long A0J = -1;
    public long A0I = -1;
    public long A0L = -1;
    public long A0H = -1;
    public long A0K = -1;
    public long A08 = -1;
    public long A09 = -1;
    public boolean A0T = false;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map A01(java.util.Map r6) {
        /*
            java.lang.String r1 = X.C0CR.A00
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            r5 = 0
            if (r0 != 0) goto Lc
            return r5
        Lc:
            java.lang.String r0 = "/sys/fs/bpf/"
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r1)     // Catch: java.io.IOException -> L40
            boolean r4 = com.facebook.bpf.BpfCounters.A00     // Catch: java.io.IOException -> L40
            if (r4 == 0) goto L1b
            int r2 = com.facebook.bpf.BpfCounters.openBpfMapImpl(r0)     // Catch: java.io.IOException -> L40
            goto L1c
        L1b:
            r2 = -1
        L1c:
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            r0 = -1
            if (r2 <= r0) goto L29
            if (r4 == 0) goto L29
            com.facebook.bpf.BpfCounters.getBpfCountersImpl(r3, r2)     // Catch: java.lang.Throwable -> L31
        L29:
            if (r2 <= r0) goto L52
            if (r4 == 0) goto L52
            com.facebook.bpf.BpfCounters.closeBpfMapImpl(r2)     // Catch: java.io.IOException -> L43
            goto L52
        L31:
            r1 = move-exception
            r0 = -1
            if (r2 <= r0) goto L3f
            if (r4 == 0) goto L3f
            com.facebook.bpf.BpfCounters.closeBpfMapImpl(r2)     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)     // Catch: java.io.IOException -> L40
        L3f:
            throw r1     // Catch: java.io.IOException -> L40
        L40:
            r2 = move-exception
            r3 = r5
            goto L44
        L43:
            r2 = move-exception
        L44:
            java.lang.String r1 = "FbPerfStats"
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L52
            java.lang.String r0 = "Failed to read Bpf counters map."
            android.util.Log.w(r1, r0, r2)
        L52:
            if (r3 != 0) goto L55
            return r5
        L55:
            if (r6 != 0) goto L58
            return r3
        L58:
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L60:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r0 = r6.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L60
            long r2 = r1.longValue()
            long r0 = r0.longValue()
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.put(r4, r0)
            goto L60
        L8f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11150iW.A01(java.util.Map):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C11150iW r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11150iW.A02(X.0iW, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0128  */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.0BD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(int r13) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11150iW.A03(int):void");
    }

    public static Long A00(String str, Map map) {
        long j;
        if (map.get(str) != null) {
            j = ((Number) map.get(str)).longValue();
        } else {
            j = -1;
        }
        return Long.valueOf(j);
    }
}
