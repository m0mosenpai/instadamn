package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.WindowManager;

/* renamed from: X.4Ty, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96154Ty {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final C96164Tz A0A;
    public final C4U0 A0B;

    public final void A02() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A02.sendEmptyMessage(1);
            C96164Tz c96164Tz = this.A0A;
            if (c96164Tz != null) {
                c96164Tz.A00.registerDisplayListener(c96164Tz, null);
            }
            A00(this);
        }
    }

    public static void A00(C96154Ty c96154Ty) {
        if (c96154Ty.A09.getDefaultDisplay() != null) {
            long refreshRate = (long) (1.0E9d / r0.getRefreshRate());
            c96154Ty.A06 = refreshRate;
            c96154Ty.A07 = (refreshRate * 80) / 100;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (java.lang.Math.abs((r23 - r20.A01) - r15) > 20000000) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A01(long r21, long r23) {
        /*
            r20 = this;
            r6 = 1000(0x3e8, double:4.94E-321)
            r10 = r21
            long r6 = r6 * r21
            r13 = r20
            boolean r12 = r13.A08
            r8 = r23
            if (r12 == 0) goto L9b
            long r0 = r13.A04
            int r2 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r2 == 0) goto L1f
            long r0 = r13.A03
            r2 = 1
            long r0 = r0 + r2
            r13.A03 = r0
            long r0 = r13.A05
            r13.A02 = r0
        L1f:
            long r0 = r13.A03
            r3 = 6
            r14 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            long r4 = r13.A00
            long r15 = r6 - r4
            if (r2 < 0) goto L88
            long r15 = r15 / r0
            long r2 = r13.A02
            long r2 = r2 + r15
            long r17 = r2 - r4
            long r0 = r13.A01
            long r15 = r23 - r0
            long r15 = r15 - r17
            long r18 = java.lang.Math.abs(r15)
            r16 = 20000000(0x1312d00, double:9.881313E-317)
            int r15 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r15 > 0) goto L98
            long r0 = r0 + r2
            long r0 = r0 - r4
        L45:
            if (r12 != 0) goto L52
            r13.A00 = r6
            r13.A01 = r8
            r4 = 0
            r13.A03 = r4
            r4 = 1
            r13.A08 = r4
        L52:
            r13.A04 = r10
            r13.A05 = r2
            X.4U0 r7 = r13.A0B
            if (r7 == 0) goto L9e
            long r5 = r13.A06
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L9e
            long r5 = r7.A04
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L9e
            long r7 = r13.A06
            long r2 = r0 - r5
            long r2 = r2 / r7
            long r2 = r2 * r7
            long r5 = r5 + r2
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L84
            long r2 = r5 - r7
        L78:
            long r7 = r5 - r0
            long r0 = r0 - r2
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 < 0) goto L80
            r5 = r2
        L80:
            long r0 = r13.A07
            long r5 = r5 - r0
            return r5
        L84:
            long r7 = r7 + r5
            r2 = r5
            r5 = r7
            goto L78
        L88:
            long r0 = r13.A01
            long r2 = r23 - r0
            long r2 = r2 - r15
            long r3 = java.lang.Math.abs(r2)
            r1 = 20000000(0x1312d00, double:9.881313E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9b
        L98:
            r13.A08 = r14
            r12 = 0
        L9b:
            r0 = r8
            r2 = r6
            goto L45
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96154Ty.A01(long, long):long");
    }

    public C96154Ty(Context context) {
        C96164Tz c96164Tz;
        if (context != null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            this.A09 = windowManager;
            if (windowManager != null) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager == null) {
                    c96164Tz = null;
                } else {
                    c96164Tz = new C96164Tz(displayManager, this);
                }
                this.A0A = c96164Tz;
                this.A0B = C4U0.A05;
                this.A06 = -9223372036854775807L;
                this.A07 = -9223372036854775807L;
            }
        } else {
            this.A09 = null;
        }
        this.A0A = null;
        this.A0B = null;
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public C96154Ty() {
        this(null);
    }
}
