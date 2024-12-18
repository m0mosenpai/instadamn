package X;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* renamed from: X.6NE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NE implements Runnable, Choreographer.FrameCallback, C2DD, C6ND {
    public static long A06;
    public long A00;
    public boolean A01;
    public boolean A02;
    public final View A04;
    public final C57S A05 = new C57S(new C6NF[16]);
    public final Choreographer A03 = Choreographer.getInstance();

    @Override // X.C2DD
    public final void CuG() {
    }

    @Override // X.C2DD
    public final void DI8() {
        this.A01 = false;
        this.A04.removeCallbacks(this);
        this.A03.removeFrameCallback(this);
    }

    @Override // X.C2DD
    public final void Deh() {
        this.A01 = true;
    }

    @Override // X.C6ND
    public final void EM6(C6NF c6nf) {
        this.A05.A09(c6nf);
        if (!this.A02) {
            this.A02 = true;
            this.A04.post(this);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.A01) {
            this.A00 = j;
            this.A04.post(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r10 != false) goto L24;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            X.57S r9 = r11.A05
            int r1 = r9.A00
            r0 = 0
            if (r1 != 0) goto L8
            r0 = 1
        L8:
            r8 = 0
            if (r0 != 0) goto L57
            boolean r0 = r11.A02
            if (r0 == 0) goto L57
            boolean r0 = r11.A01
            if (r0 == 0) goto L57
            android.view.View r0 = r11.A04
            int r0 = r0.getWindowVisibility()
            if (r0 != 0) goto L57
            long r0 = r11.A00
            long r2 = X.C6NE.A06
            long r0 = r0 + r2
            X.BGk r7 = new X.BGk
            r7.<init>(r0)
            r10 = 0
        L26:
            int r0 = r9.A00
            if (r0 == 0) goto L4f
            if (r10 != 0) goto L51
            long r5 = r7.A00
            long r0 = java.lang.System.nanoTime()
            long r5 = r5 - r0
            r3 = 0
            long r1 = java.lang.Math.max(r3, r5)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4d
            java.lang.Object[] r0 = r9.A02
            r0 = r0[r8]
            X.6NF r0 = (X.C6NF) r0
            boolean r0 = r0.ATS(r7)
            if (r0 != 0) goto L4d
            r9.A00(r8)
            goto L26
        L4d:
            r10 = 1
            goto L26
        L4f:
            if (r10 == 0) goto L57
        L51:
            android.view.Choreographer r0 = r11.A03
            r0.postFrameCallback(r11)
            return
        L57:
            r11.A02 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6NE.run():void");
    }

    public C6NE(View view) {
        this.A04 = view;
        if (A06 == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            A06 = 1.0E9f / f;
        }
    }
}
