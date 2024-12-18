package X;

import android.app.ActivityManager;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;

/* renamed from: X.0qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15900qk {
    public static C15900qk A06;
    public int A04;
    public int A05;
    public int A00 = 0;
    public int A01 = Integer.MAX_VALUE;
    public boolean A03 = false;
    public String A02 = "";

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r1 = (int) (java.lang.Float.parseFloat(r1.substring(r1.lastIndexOf(58) + 2)) * 1000.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r1 <= r4.A00) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r4.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r1 >= r4.A01) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        r4.A01 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C15900qk r4) {
        /*
            r0 = 0
            r3 = -1
            r4.A02(r0)     // Catch: java.lang.Exception -> L6c
            int r0 = r4.A06()     // Catch: java.lang.Exception -> L6c
            r1 = 1
            if (r0 <= r1) goto L14
            int r0 = r4.A06()     // Catch: java.lang.Exception -> L6c
            int r0 = r0 - r1
            r4.A02(r0)     // Catch: java.lang.Exception -> L6c
        L14:
            int r0 = r4.A00     // Catch: java.lang.Exception -> L6c
            if (r0 != 0) goto L76
            java.lang.String r0 = "/proc/cpuinfo"
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L6c
            r1.<init>(r0)     // Catch: java.lang.Exception -> L6c
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L6c
            if (r0 == 0) goto L76
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Exception -> L6c
            r0.<init>(r1)     // Catch: java.lang.Exception -> L6c
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L6c
            r2.<init>(r0)     // Catch: java.lang.Exception -> L6c
        L2f:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L5e
            java.lang.String r0 = "cpu MHz"
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L2f
            r0 = 58
            int r0 = r1.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L62
            int r0 = r0 + 2
            java.lang.String r0 = r1.substring(r0)     // Catch: java.lang.Throwable -> L62
            float r1 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.Throwable -> L62
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L62
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L62
            if (r1 <= r0) goto L58
            r4.A00 = r1     // Catch: java.lang.Throwable -> L62
        L58:
            int r0 = r4.A01     // Catch: java.lang.Throwable -> L62
            if (r1 >= r0) goto L5e
            r4.A01 = r1     // Catch: java.lang.Throwable -> L62
        L5e:
            r2.close()     // Catch: java.lang.Exception -> L6c
            goto L76
        L62:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L67
            goto L6b
        L67:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)     // Catch: java.lang.Exception -> L6c
        L6b:
            throw r1     // Catch: java.lang.Exception -> L6c
        L6c:
            r2 = move-exception
            java.lang.String r1 = "ProcessorInfoUtil"
            java.lang.String r0 = "Unable to read a CPU core maximum frequency"
            X.C0K8.A0H(r1, r0, r2)
            r4.A00 = r3
        L76:
            int r1 = r4.A00
            int r0 = r4.A01
            if (r1 > r0) goto L82
            if (r1 != 0) goto L80
            r4.A00 = r3
        L80:
            r4.A01 = r3
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15900qk.A03(X.0qk):void");
    }

    public static long A00(Context context, boolean z) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        if (z) {
            return memoryInfo.totalMem;
        }
        return memoryInfo.availMem;
    }

    public static C15900qk A01() {
        C15900qk c15900qk = A06;
        if (c15900qk == null) {
            C15900qk c15900qk2 = new C15900qk();
            A06 = c15900qk2;
            return c15900qk2;
        }
        return c15900qk;
    }

    public final int A05() {
        int i = this.A05;
        if (i == 0) {
            int max = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            this.A05 = max;
            return max;
        }
        return i;
    }

    public final int A06() {
        int i;
        int i2 = this.A04;
        if (i2 == 0) {
            try {
                File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: X.0qj
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        return file.getName().matches("cpu[0-9]+");
                    }
                });
                if (listFiles != null) {
                    i = listFiles.length;
                } else {
                    i = -1;
                }
                this.A04 = i;
                if (i == 0) {
                    this.A04 = -1;
                    return -1;
                }
                return i;
            } catch (Exception e) {
                C0K8.A0H("ProcessorInfoUtil", "Unable to get reliable CPU Core count", e);
                this.A04 = -1;
                return -1;
            }
        }
        return i2;
    }

    private void A02(int i) {
        File file = new File(StringFormatUtil.formatStrLocaleSafe("/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", Integer.valueOf(i)));
        if (file.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String readLine = bufferedReader.readLine();
                readLine.getClass();
                int parseInt = Integer.parseInt(readLine);
                if (parseInt > this.A00) {
                    this.A00 = parseInt;
                }
                if (parseInt < this.A01) {
                    this.A01 = parseInt;
                }
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }
    }

    public final int A04() {
        int A062 = A06();
        if (A062 == -1) {
            return A05();
        }
        return A062;
    }
}
