package X;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.quicklog.EventBuilder;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2SC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2SC {
    public static boolean A0N;
    public File A00;
    public CharSequence A01;
    public String A02;
    public int A03;
    public int A04;
    public final C2S7 A05;
    public final C2Rs A06;
    public final C2SE A07;
    public final C2RW A08;
    public final C2S4 A09;
    public final C49912Rb A0A;
    public final C2S8 A0B;
    public final File A0C;
    public final String A0D;
    public final String A0E;
    public final StringBuilder A0G;
    public final StringBuilder A0H;
    public final StringBuilder A0I;
    public final StringBuilder A0J;
    public final Context A0K;
    public final C2RX A0L;
    public final StringBuilder A0M = new StringBuilder(512);
    public final StringBuilder A0F = new StringBuilder(4096);

    private void A04(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, String str, String str2, int i) {
        try {
            try {
                AbstractC09780fb.A01("MemoryDumper.dumpHprof", 1188219010);
                A01(this, charSequence4, str, str2);
                boolean z = true;
                if (i == 0) {
                    this.A04 = this.A06.dumpJavaHeap(charSequence, charSequence2, charSequence3, this.A0M);
                } else {
                    C2Rs c2Rs = this.A06;
                    StringBuilder sb = this.A0M;
                    boolean z2 = false;
                    if (i == 1) {
                        z2 = true;
                    }
                    int dumpJavaHeapAsync = c2Rs.dumpJavaHeapAsync(charSequence, charSequence2, charSequence3, sb, z2);
                    this.A04 = dumpJavaHeapAsync;
                    z = false;
                    if ((dumpJavaHeapAsync & 15) == 6) {
                        z = true;
                    }
                    this.A03 = i;
                }
                AbstractC09780fb.A00(511652756);
                this.A01 = charSequence4;
                this.A02 = str;
                if (z) {
                    A08();
                    this.A01 = null;
                    this.A02 = null;
                }
            } catch (IOException e) {
                A05(charSequence4, str, str2, e);
                C0K8.A0F("MemoryDumper", "IOException writing dump", e);
            }
        } finally {
            StringBuilder sb2 = this.A0M;
            sb2.delete(0, sb2.length());
        }
    }

    private void A00() {
        StringBuilder sb = this.A0H;
        sb.delete(0, sb.length());
        StringBuilder sb2 = this.A0G;
        sb2.delete(0, sb2.length());
        StringBuilder sb3 = this.A0J;
        if (sb3 != null) {
            sb3.delete(0, sb3.length());
        }
        StringBuilder sb4 = this.A0I;
        if (sb4 != null) {
            sb4.delete(0, sb4.length());
        }
        String path = this.A0C.getPath();
        sb.append(C2SD.A00());
        sb.append('_');
        sb2.append(path);
        sb2.append("/dump_");
        if (sb3 != null) {
            sb3.append(path);
            sb3.append("/space_stats_");
        }
        if (sb4 != null) {
            sb4.append(path);
            sb4.append("/maps_");
        }
        sb.append(System.currentTimeMillis());
        sb2.append((CharSequence) sb);
        sb2.append(".hprof");
        this.A00 = new File(sb2.toString());
        if (sb3 != null) {
            sb3.append((CharSequence) sb);
            sb3.append(OptSvcAnalyticsStore.FILE_SUFFIX);
        }
        if (sb4 != null) {
            sb4.append((CharSequence) sb);
            sb4.append(OptSvcAnalyticsStore.FILE_SUFFIX);
        }
    }

    public static void A01(C2SC c2sc, CharSequence charSequence, String str, String str2) {
        C2RW c2rw = c2sc.A08;
        String str3 = c2sc.A0D;
        EventBuilder A00 = C2RW.A00(c2rw, str, "dump_started", System.currentTimeMillis());
        A00.annotate("hprof_id", charSequence.toString());
        A00.annotate("asl_session_id", str3);
        if (str2 != null) {
            A00.annotate("cause_details", str2);
        }
        A00.report();
    }

    public static void A02(C2SC c2sc, String str, String str2) {
        C2RW c2rw = c2sc.A08;
        String str3 = c2sc.A0D;
        EventBuilder A00 = C2RW.A00(c2rw, str, "dump_requested", System.currentTimeMillis());
        A00.annotate("asl_session_id", str3);
        if (str2 != null) {
            A00.annotate("cause_details", str2);
        }
        A00.report();
    }

    public static void A03(C2SC c2sc, String str, String str2, String str3) {
        C2RW c2rw = c2sc.A08;
        String str4 = c2sc.A0D;
        EventBuilder A00 = C2RW.A00(c2rw, str, "dump_declined", System.currentTimeMillis());
        if (str4 != null) {
            A00.annotate("asl_session_id", str4);
        }
        A00.annotate("reason", str3);
        if (str2 != null) {
            A00.annotate("cause_details", str2);
        }
        A00.report();
    }

    private void A05(CharSequence charSequence, String str, String str2, Throwable th) {
        this.A08.A02(charSequence, str, this.A0D, th.getMessage());
        this.A0L.A00("hprof_dump_failed", th, "dump_cause", str, "dump_cause_details", str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A06(X.C2SC r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.io.File r4 = r5.A0C
            java.nio.file.Path r1 = r4.toPath()     // Catch: java.io.IOException -> L2d
            java.lang.String r0 = "*hprof*"
            java.nio.file.DirectoryStream r2 = java.nio.file.Files.newDirectoryStream(r1, r0)     // Catch: java.io.IOException -> L2d
            if (r2 == 0) goto L2d
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L23
            X.AbstractC05810Sj.A00(r0)     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L1f
            r2.close()     // Catch: java.io.IOException -> L2d
            goto L2f
        L1f:
            r2.close()     // Catch: java.io.IOException -> L2d
            goto L2d
        L23:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r0 = move-exception
            X.AbstractC61625Rqp.A00(r1, r0)     // Catch: java.io.IOException -> L2d
        L2c:
            throw r1     // Catch: java.io.IOException -> L2d
        L2d:
            r0 = 0
            goto L30
        L2f:
            r0 = 1
        L30:
            r3 = 0
            if (r0 == 0) goto L93
            X.2SE r0 = r5.A07
            java.lang.String r0 = r0.A0A
            if (r0 != 0) goto L90
            X.2S1 r2 = X.C2S1.A00()
            monitor-enter(r2)
            android.app.Application r0 = r2.A00     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L5a
            java.lang.String r1 = "MemoryManager.getMemoryDumper"
            r0 = -311667887(0xffffffffed6c5351, float:-4.571199E27)
            X.AbstractC09780fb.A01(r1, r0)     // Catch: java.lang.Throwable -> L8d
            X.0cm r0 = r2.A0G     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L8d
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L8d
            r2.A00 = r0     // Catch: java.lang.Throwable -> L8d
            r0 = 1053174206(0x3ec629be, float:0.38703722)
            X.AbstractC09780fb.A00(r0)     // Catch: java.lang.Throwable -> L8d
        L5a:
            android.app.Application r1 = r2.A00     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r2)
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            if (r0 == 0) goto L90
            java.util.List r0 = r0.getAllPendingJobs()
            java.util.Iterator r2 = r0.iterator()
        L70:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r2.next()
            android.app.job.JobInfo r0 = (android.app.job.JobInfo) r0
            int r1 = r0.getId()
            r0 = 2131435144(0x7f0b1e88, float:1.8492122E38)
            if (r1 != r0) goto L70
            java.lang.String r0 = "not_dumping_because_dump_and_pending_job_exist"
            A03(r5, r6, r7, r0)
            r3 = 1
            return r3
        L8d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L90:
            X.C2SF.A00(r4, r3)
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2SC.A06(X.2SC, java.lang.String, java.lang.String):boolean");
    }

    public final void A08() {
        CharSequence charSequence;
        C2Rs c2Rs = this.A06;
        StringBuilder sb = this.A0M;
        int waitForDump = c2Rs.waitForDump(sb);
        String str = this.A02;
        if (str != null && (charSequence = this.A01) != null) {
            int i = this.A04;
            if (i == 0) {
                this.A04 = waitForDump;
                i = waitForDump;
            }
            C2RW c2rw = this.A08;
            String str2 = this.A0D;
            int i2 = this.A03;
            String obj = sb.toString();
            EventBuilder A00 = C2RW.A00(c2rw, str, "dump_finished", System.currentTimeMillis());
            A00.annotate("result_code", i);
            A00.annotate("hprof_id", charSequence.toString());
            A00.annotate("async_behavior", i2);
            if (!TextUtils.isEmpty(obj)) {
                A00.annotate("error_details", obj);
            }
            if (!TextUtils.isEmpty(str2)) {
                A00.annotate("asl_session_id", str2);
            }
            A00.report();
            String str3 = this.A02;
            CharSequence charSequence2 = this.A01;
            if ((this.A04 & 15) == 0 && sb.length() == 0) {
                long length = this.A00.length();
                EventBuilder A002 = C2RW.A00(c2rw, str3, "dump_succeeded", System.currentTimeMillis());
                A002.annotate("hprof_id", charSequence2.toString());
                A002.annotate("file_size", length);
                if (!TextUtils.isEmpty(str2)) {
                    A002.annotate("asl_session_id", str2);
                }
                A002.report();
                this.A05.A00(str3);
                return;
            }
            c2rw.A02(charSequence2, str3, str2, sb.toString());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:126:0x01e0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001d. Please report as an issue. */
    public final void A09(java.lang.String r22, java.lang.String r23, int r24) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2SC.A09(java.lang.String, java.lang.String, int):void");
    }

    public C2SC(Application application, C2S7 c2s7, C2Rs c2Rs, C2RW c2rw, C2RX c2rx, C2S4 c2s4, C49912Rb c49912Rb, C2S8 c2s8, String str, String str2, String str3) {
        Context applicationContext = application.getApplicationContext();
        this.A0K = applicationContext;
        this.A09 = c2s4;
        this.A08 = c2rw;
        this.A0L = c2rx;
        this.A0A = c49912Rb;
        File dir = applicationContext.getDir("hprof", 0);
        this.A0C = dir;
        this.A06 = c2Rs;
        this.A0E = str;
        this.A0D = str2;
        this.A0H = new StringBuilder(50);
        this.A05 = c2s7;
        this.A0B = c2s8;
        int length = dir.getPath().length() + 50;
        int i = length + 6;
        this.A0G = new StringBuilder(i + 6);
        String str4 = null;
        if (C20150ym.A07(AbstractC20070ye.A00(18296341638480130L))) {
            this.A0J = new StringBuilder(length + 13 + 4);
        } else {
            this.A0J = null;
        }
        if (C20150ym.A07(AbstractC20070ye.A00(18296341638545667L))) {
            this.A0I = new StringBuilder(i + 4);
        } else {
            this.A0I = null;
        }
        A00();
        PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager != null) {
            try {
                str4 = packageManager.getPackageInfo(applicationContext.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.A07 = new C2SE(BuildConstants.A01(), str4, str3);
        C2SF.A00(this.A0K.getFilesDir(), true);
    }

    public final String A07() {
        boolean z;
        synchronized (C2SC.class) {
            z = false;
            if (A0N) {
                A03(this, "Debug", null, "not_dumping_because_already_dumping");
            } else {
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0C);
        sb.append(File.separator);
        sb.append("dump.hprof");
        String obj = sb.toString();
        A04(obj, null, null, "", "Debug", null, 0);
        return obj;
    }
}
