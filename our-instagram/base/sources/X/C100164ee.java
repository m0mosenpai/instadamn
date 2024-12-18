package X;

import android.os.SystemClock;
import java.io.File;

/* renamed from: X.4ee, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100164ee extends AbstractC100174ef {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final File A0F;
    public final String A0G;
    public final boolean A0H;
    public final String A0I;
    public final boolean A0J;
    public final long[] A0K;

    private boolean A00(long[] jArr) {
        try {
            String A01 = AbstractC100174ef.A01(new File(this.A0I));
            if (A01 == null) {
                return false;
            }
            String[] split = A01.split("\\s+");
            jArr[0] = Long.parseLong(split[9]);
            jArr[1] = Long.parseLong(split[11]);
            jArr[2] = Long.parseLong(split[13]);
            jArr[3] = Long.parseLong(split[14]);
            jArr[4] = Long.parseLong(split[41]);
            return true;
        } catch (Throwable unused) {
            this.A0D = false;
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
    
        if ((r3 - (r5 * 10)) <= 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A01() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100164ee.A01():java.lang.String");
    }

    public final void A02() {
        if (this.A0D) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long[] jArr = this.A0K;
            if (A00(jArr)) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = super.A00;
                long j5 = j3 * j4;
                long j6 = jArr[3] * j4;
                long j7 = jArr[4] * j4;
                if (this.A0C) {
                    this.A07 = j;
                    this.A06 = j2;
                    this.A0A = j5;
                    this.A08 = j6;
                } else {
                    this.A09 = uptimeMillis;
                    this.A0A = j5;
                    this.A08 = j6;
                    this.A07 = j;
                    this.A06 = j2;
                }
                this.A05 = j7;
                this.A0C = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r1.canRead() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C100164ee(int r9) {
        /*
            r8 = this;
            r8.<init>()
            r0 = 5
            long[] r0 = new long[r0]
            r8.A0K = r0
            r5 = 1
            r8.A0C = r5
            int r4 = android.os.Process.myPid()
            r8.A0E = r9
            java.lang.String r7 = "/proc/"
            java.lang.String r6 = "/task/"
            java.lang.String r0 = "/stat"
            java.lang.String r0 = X.AnonymousClass001.A0n(r7, r6, r0, r4, r9)
            r8.A0I = r0
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            r8.A0F = r1
            boolean r0 = r1.exists()
            r3 = 0
            if (r0 == 0) goto L32
            boolean r1 = r1.canRead()
            r0 = 1
            if (r1 != 0) goto L33
        L32:
            r0 = 0
        L33:
            r8.A0D = r0
            java.lang.String r2 = "<unknown>"
            int r0 = android.os.Process.myPid()
            if (r9 != r0) goto L49
            java.lang.String r2 = "main"
        L3f:
            r8.A0G = r2
            if (r9 != r4) goto L44
            r5 = 0
        L44:
            r8.A0H = r5
            r8.A0J = r3
            return
        L49:
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "/comm"
            java.lang.String r1 = X.AnonymousClass001.A0n(r7, r6, r0, r1, r9)     // Catch: java.lang.Throwable -> L3f
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L3f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = X.AbstractC100174ef.A01(r0)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3f
            r2 = r0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100164ee.<init>(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r1.canRead() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C100164ee() {
        /*
            r4 = this;
            r4.<init>()
            r0 = 5
            long[] r0 = new long[r0]
            r4.A0K = r0
            r3 = 1
            r4.A0C = r3
            int r2 = android.os.Process.myPid()
            r4.A0E = r2
            java.lang.String r1 = "/proc/"
            java.lang.String r0 = "/stat"
            java.lang.String r0 = X.AnonymousClass001.A0c(r1, r0, r2)
            r4.A0I = r0
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            r4.A0F = r1
            boolean r0 = r1.exists()
            r2 = 0
            if (r0 == 0) goto L30
            boolean r1 = r1.canRead()
            r0 = 1
            if (r1 != 0) goto L31
        L30:
            r0 = 0
        L31:
            r4.A0D = r0
            android.app.ActivityThread r1 = android.app.ActivityThread.currentActivityThread()
            if (r1 == 0) goto L4a
            java.lang.String r0 = r1.getProcessName()
            if (r0 == 0) goto L4a
            java.lang.String r0 = r1.getProcessName()
        L43:
            r4.A0G = r0
            r4.A0H = r2
            r4.A0J = r3
            return
        L4a:
            java.lang.String r0 = "<unknown>"
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100164ee.<init>():void");
    }
}
