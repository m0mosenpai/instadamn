package X;

import android.system.Os;
import android.system.OsConstants;
import java.util.Locale;

/* loaded from: classes9.dex */
public abstract class OZK {
    public static long A00;
    public static boolean A01;

    public static double A00(String[] strArr, int i, long j) {
        double d = 0.0d;
        if (i >= strArr.length) {
            return 0.0d;
        }
        if (j > 0) {
            String str = strArr[i];
            try {
                d = Long.parseLong(str) / j;
                return d;
            } catch (NumberFormatException e) {
                C0K8.A0H("CpuInfoUtils", String.format(Locale.US, "Error parsing %d /proc/[pid]/stat field as long: %s", Integer.valueOf(i), str), e);
                return d;
            }
        }
        throw AbstractC166987dD.A12("clockTicksPerSecond should be positive.");
    }

    public static OKO A01(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        if (!A01) {
            A00 = Os.sysconf(OsConstants._SC_CLK_TCK);
            A01 = true;
        }
        long j = A00;
        double A002 = A00(strArr, 13, j);
        double A003 = A00(strArr, 14, j);
        A00(strArr, 15, j);
        A00(strArr, 16, j);
        return new OKO(A002, A003);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] A02(java.lang.String r9) {
        /*
            java.lang.String r5 = "Error closing procfs file: %s"
            boolean r0 = X.MSY.A1Z(r9)
            r8 = 0
            if (r0 != 0) goto L15
            java.lang.String r1 = "CpuInfoUtils"
            java.lang.String r0 = "stat file not found "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r9)
            X.C0K8.A0D(r1, r0)
        L14:
            return r8
        L15:
            android.os.StrictMode$ThreadPolicy r7 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L71
            r6.<init>(r9, r0)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L71
            java.lang.String r3 = r6.readLine()     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L6f
            r6.close()     // Catch: java.io.IOException -> L28
            goto L38
        L28:
            r2 = move-exception
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            java.lang.String r1 = java.lang.String.format(r1, r5, r0)
            java.lang.String r0 = "CpuInfoUtils"
            X.C0K8.A0H(r0, r1, r2)
        L38:
            android.os.StrictMode.setThreadPolicy(r7)
            if (r3 == 0) goto L14
            java.lang.String r0 = " "
            java.lang.String[] r8 = r3.split(r0)
            return r8
        L44:
            r4 = move-exception
            goto L48
        L46:
            r4 = move-exception
            r6 = r8
        L48:
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = "Error reading cpu time from procfs file: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = java.lang.String.format(r3, r1, r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "CpuInfoUtils"
            X.C0K8.A0H(r2, r0, r4)     // Catch: java.lang.Throwable -> L6f
            if (r6 == 0) goto L14
            r6.close()     // Catch: java.io.IOException -> L5f
            goto L6b
        L5f:
            r1 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            java.lang.String r0 = java.lang.String.format(r3, r5, r0)
            X.C0K8.A0H(r2, r0, r1)
        L6b:
            android.os.StrictMode.setThreadPolicy(r7)
            return r8
        L6f:
            r3 = move-exception
            goto L73
        L71:
            r3 = move-exception
            r6 = r8
        L73:
            if (r6 == 0) goto L8c
            r6.close()     // Catch: java.io.IOException -> L79
            goto L89
        L79:
            r2 = move-exception
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            java.lang.String r1 = java.lang.String.format(r1, r5, r0)
            java.lang.String r0 = "CpuInfoUtils"
            X.C0K8.A0H(r0, r1, r2)
        L89:
            android.os.StrictMode.setThreadPolicy(r7)
        L8c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZK.A02(java.lang.String):java.lang.String[]");
    }
}
