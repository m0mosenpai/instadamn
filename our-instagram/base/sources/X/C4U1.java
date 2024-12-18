package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4U1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4U1 {
    public float A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public Surface A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public boolean A0D;
    public final C4U2 A0E = new C4U2();
    public final C4U6 A0F;
    public final C4U5 A0G;

    public final void A03() {
        this.A0D = true;
        this.A02 = 0L;
        this.A03 = -1L;
        this.A05 = -1L;
        C4U5 c4u5 = this.A0G;
        if (c4u5 != null) {
            C4U6 c4u6 = this.A0F;
            c4u6.getClass();
            c4u6.A02.sendEmptyMessage(1);
            c4u5.ED0(new InterfaceC71909X9t() { // from class: X.XNV
                @Override // X.InterfaceC71909X9t
                public final void D9W(Display display) {
                    long j;
                    C4U1 c4u1 = C4U1.this;
                    if (display != null) {
                        long refreshRate = (long) (1.0E9d / display.getRefreshRate());
                        c4u1.A07 = refreshRate;
                        j = (refreshRate * 80) / 100;
                    } else {
                        AbstractC46512Bo.A04("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                        j = -9223372036854775807L;
                        c4u1.A07 = -9223372036854775807L;
                    }
                    c4u1.A08 = j;
                }
            });
        }
        A02(this, false);
    }

    public final void A04() {
        this.A0D = false;
        C4U5 c4u5 = this.A0G;
        if (c4u5 != null) {
            c4u5.F9T();
            C4U6 c4u6 = this.A0F;
            c4u6.getClass();
            c4u6.A02.sendEmptyMessage(2);
        }
        A01(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r9.A02 < 5000000000L) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00() {
        /*
            r12 = this;
            int r0 = com.google.android.exoplayer2.util.Util.A00
            r7 = 30
            if (r0 < r7) goto L59
            android.view.Surface r0 = r12.A09
            if (r0 == 0) goto L59
            X.4U2 r8 = r12.A0E
            X.4U3 r9 = r8.A03
            boolean r11 = r9.A02()
            if (r11 == 0) goto L63
            r4 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            long r2 = r9.A01
            r0 = 0
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L24
            long r0 = r9.A02
            long r0 = r0 / r2
        L24:
            double r2 = (double) r0
            double r4 = r4 / r2
            float r6 = (float) r4
        L27:
            float r10 = r12.A0B
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 == 0) goto L59
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L5a
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L5a
            if (r11 == 0) goto L48
            long r3 = r9.A02
            r1 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            if (r0 >= 0) goto L4a
        L48:
            r1 = 1065353216(0x3f800000, float:1.0)
        L4a:
            float r0 = r6 - r10
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L59
        L54:
            r12.A0B = r6
            A02(r12, r5)
        L59:
            return
        L5a:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L54
            int r0 = r8.A00
            if (r0 < r7) goto L59
            goto L54
        L63:
            float r6 = r12.A0A
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4U1.A00():void");
    }

    public static void A01(C4U1 c4u1) {
        Surface surface;
        if (Util.A00 >= 30 && (surface = c4u1.A09) != null && c4u1.A01 != Integer.MIN_VALUE && c4u1.A0C != 0.0f) {
            c4u1.A0C = 0.0f;
            XMh.A00(surface, 0.0f);
        }
    }

    public static void A02(C4U1 c4u1, boolean z) {
        Surface surface;
        if (Util.A00 >= 30 && (surface = c4u1.A09) != null && c4u1.A01 != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (c4u1.A0D) {
                float f2 = c4u1.A0B;
                if (f2 != -1.0f) {
                    f = c4u1.A00 * f2;
                }
            }
            if (!z && c4u1.A0C == f) {
                return;
            }
            c4u1.A0C = f;
            XMh.A00(surface, f);
        }
    }

    public final void A05(float f) {
        this.A0A = f;
        C4U2 c4u2 = this.A0E;
        c4u2.A03.A00();
        c4u2.A02.A00();
        c4u2.A04 = false;
        c4u2.A01 = -9223372036854775807L;
        c4u2.A00 = 0;
        A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r8.A07[(int) ((r3 - 1) % 15)] != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(long r12) {
        /*
            r11 = this;
            long r3 = r11.A05
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto Le
            r11.A03 = r3
            long r0 = r11.A06
            r11.A04 = r0
        Le:
            long r0 = r11.A02
            r9 = 1
            long r0 = r0 + r9
            r11.A02 = r0
            X.4U2 r7 = r11.A0E
            r0 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r0
            X.4U3 r0 = r7.A03
            r0.A01(r12)
            boolean r0 = r0.A02()
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L51
            r7.A04 = r5
        L29:
            boolean r0 = r7.A04
            if (r0 == 0) goto L3d
            X.4U3 r1 = r7.A02
            boolean r0 = r1.A02()
            if (r0 == 0) goto L3d
            X.4U3 r0 = r7.A03
            r7.A03 = r1
            r7.A02 = r0
            r7.A04 = r5
        L3d:
            r7.A01 = r12
            X.4U3 r0 = r7.A03
            boolean r0 = r0.A02()
            if (r0 != 0) goto L4b
            int r0 = r7.A00
            int r5 = r0 + 1
        L4b:
            r7.A00 = r5
            r11.A00()
            return
        L51:
            long r0 = r7.A01
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L29
            boolean r0 = r7.A04
            if (r0 == 0) goto L75
            X.4U3 r8 = r7.A02
            long r3 = r8.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L81
            boolean[] r2 = r8.A07
            long r3 = r3 - r9
            r0 = 15
            long r3 = r3 % r0
            int r0 = (int) r3
            boolean r0 = r2[r0]
            if (r0 == 0) goto L81
        L75:
            X.4U3 r0 = r7.A02
            r0.A00()
            X.4U3 r8 = r7.A02
            long r0 = r7.A01
            r8.A01(r0)
        L81:
            r7.A04 = r6
            r8.A01(r12)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4U1.A06(long):void");
    }

    public C4U1(Context context) {
        C4U6 c4u6;
        C4U5 c4u5 = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            DisplayManager displayManager = (DisplayManager) applicationContext.getSystemService("display");
            if (displayManager != null) {
                c4u5 = new C4U4(displayManager);
            } else {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    c4u5 = new WcN(windowManager);
                } else {
                    c4u5 = null;
                }
            }
        }
        this.A0G = c4u5;
        if (c4u5 != null) {
            c4u6 = C4U6.A05;
        } else {
            c4u6 = null;
        }
        this.A0F = c4u6;
        this.A07 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0A = -1.0f;
        this.A00 = 1.0f;
        this.A01 = 0;
    }
}
