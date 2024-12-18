package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Locale;

/* renamed from: X.0vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18700vx implements InterfaceC03430Gv {
    public static int A00 = 2;
    public static int A01 = 5;
    public static int A02 = 30;
    public static int A03 = 40;
    public static int A04 = 45000;
    public static int A05 = -1;
    public static int A06 = -1;
    public static int A07;
    public static long A08;
    public static C0Gk A09;
    public static C0Gk A0A;
    public static C18700vx A0B;
    public static C06100Ua A0C;
    public static C06100Ua A0D;
    public static boolean A0E;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0UZ, java.lang.Object] */
    public static C0UZ A00(String str) {
        if (str != null) {
            try {
                C0UZ c0uz = (C0UZ) Class.forName(str).newInstance();
                if (c0uz != null) {
                    return c0uz;
                }
            } catch (Throwable th) {
                android.util.Log.e("CatchMeIfYouCan", "instantiating custom remedy class failed; continuing", th);
            }
        }
        return new Object();
    }

    public static void A01(Context context) {
        int i;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        if (activityManager.getRunningAppProcesses() != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.uid == myUid && (i = runningAppProcessInfo.pid) != myPid) {
                    String.format(Locale.US, "killing sibling process %d (%s)", Integer.valueOf(i), runningAppProcessInfo.processName);
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(android.content.Context r9, long r10, boolean r12) {
        /*
            java.lang.String r3 = "CatchMeIfYouCan"
            if (r12 == 0) goto L9
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
        L7:
            r6 = 0
            goto Ld
        L9:
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L7
        Ld:
            java.io.File r4 = X.C06100Ua.A00(r9, r12)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "r"
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L69
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L69
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L5f
            r0.close()     // Catch: java.lang.Throwable -> L69
            long r0 = r4.lastModified()     // Catch: java.lang.Throwable -> L69
            X.0Ua r4 = new X.0Ua     // Catch: java.lang.Throwable -> L69
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> L69
            long r0 = r4.A01
            long r10 = r10 - r0
            boolean r0 = X.C18700vx.A0E
            if (r0 == 0) goto L4a
            java.util.Locale r5 = java.util.Locale.US
            int r0 = r4.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "previous crash remedy level %d applied %d milliseconds ago (remedy applications forgotten after %d milliseconds)"
            java.lang.String.format(r5, r0, r1)
        L4a:
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L57
            java.lang.String r0 = "remedy is from the future!"
            android.util.Log.w(r3, r0)
            goto L7e
        L57:
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 < 0) goto L7e
            X.C06100Ua.A01(r9, r12)
            goto L7f
        L5f:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)     // Catch: java.lang.Throwable -> L69
        L68:
            throw r1     // Catch: java.lang.Throwable -> L69
        L69:
            r1 = move-exception
            java.io.File r0 = X.C06100Ua.A00(r9, r12)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L7a
            java.lang.String r0 = "unable to read remedy log file"
            android.util.Log.w(r3, r0, r1)
        L7a:
            X.C06100Ua.A01(r9, r12)
            r4 = r6
        L7e:
            r6 = r4
        L7f:
            if (r12 == 0) goto L84
            X.C18700vx.A0C = r6
            return
        L84:
            X.C18700vx.A0D = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18700vx.A02(android.content.Context, long, boolean):void");
    }

    @Override // X.InterfaceC03430Gv
    public final int handleUncaughtException(Thread thread, Throwable th, C0Gl c0Gl) {
        if (!(th instanceof C03410Gt)) {
            if ((A07 & 2) != 0) {
                try {
                    if (System.currentTimeMillis() - A08 > A04) {
                        A09.A00();
                    } else {
                        A0A.A00();
                    }
                } catch (Throwable th2) {
                    try {
                        android.util.Log.e("CatchMeIfYouCan", "unable to record crash in crash log!", th2);
                    } catch (Throwable unused) {
                    }
                }
            }
            try {
                if (A0E) {
                    android.util.Log.e("CatchMeIfYouCan", AnonymousClass001.A0g("Uncaught exception in '", C0JA.A00().A03(), "':"));
                    for (String str : android.util.Log.getStackTraceString(th).split("\n")) {
                        android.util.Log.e("CatchMeIfYouCan", str);
                    }
                }
            } catch (Throwable unused2) {
            }
            if ((A07 & 1) != 0) {
                android.util.Log.e("CatchMeIfYouCan", "CatchMeIfYouCan is killing this process");
                Process.killProcess(Process.myPid());
                System.exit(10);
                while (true) {
                }
            } else {
                android.util.Log.e("CatchMeIfYouCan", "Not killing process because SILENT_EXIT flag is not set.");
            }
        }
        return 0;
    }

    public static void A03(Context context, String str, int i, int i2, long j, boolean z) {
        C06110Ub A022;
        C0UZ A002 = A00(str);
        if (z) {
            A022 = A002.A03(context, Collections.singletonMap("number_of_crashes", Long.valueOf(A06)), i, i2);
        } else {
            A022 = A002.A02(context, Collections.singletonMap("number_of_crashes", Long.valueOf(A05)), i, i2);
        }
        if (A022.A01) {
            try {
                C06100Ua c06100Ua = new C06100Ua(j, i);
                File A003 = C06100Ua.A00(context, z);
                RandomAccessFile randomAccessFile = new RandomAccessFile(A003, "rw");
                try {
                    randomAccessFile.writeInt(c06100Ua.A00);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    randomAccessFile.close();
                    if (!A003.setLastModified(c06100Ua.A01)) {
                        android.util.Log.w("CrashLoopRemedyLog", "unable to set remedy log last modified timestamp");
                    }
                    if (z) {
                        A0C = c06100Ua;
                    } else {
                        A0D = c06100Ua;
                    }
                } finally {
                }
            } catch (IOException e) {
                android.util.Log.w("CatchMeIfYouCan", "error recording remedy log", e);
            }
        }
        if (A022.A00) {
            try {
                A01(context);
            } catch (Throwable th) {
                android.util.Log.w("CatchMeIfYouCan", "error killing sibling processes", th);
            }
            android.util.Log.e("CatchMeIfYouCan", "CatchMeIfYouCan is killing this process");
            Process.killProcess(Process.myPid());
            System.exit(10);
            while (true) {
            }
        }
    }
}
