package X;

import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.View;
import android.widget.OverScroller;

/* renamed from: X.Wxk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71638Wxk implements Runnable {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public Matrix A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public float A0B;
    public float A0C;
    public float[] A0D = new float[2];
    public final View A0E;
    public final OverScroller A0F;
    public final X7I A0G;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i;
        int i2;
        if (!this.A06) {
            if (!this.A0A) {
                if (this.A07) {
                    this.A0F.forceFinished(true);
                    this.A01 = 0.0f;
                } else if (this.A08) {
                    this.A0F.forceFinished(true);
                    this.A00 = 0.0f;
                }
                this.A08 = false;
                this.A07 = false;
                this.A0A = true;
            }
            if (this.A0F.computeScrollOffset()) {
                float[] fArr = this.A0D;
                fArr[0] = r2.getCurrX();
                fArr[1] = r2.getCurrY();
                Matrix matrix = this.A04;
                if (matrix != null) {
                    matrix.mapPoints(fArr);
                }
                float f = fArr[0];
                float f2 = fArr[1];
                if (this.A09) {
                    this.A09 = false;
                    this.A0B = f;
                    this.A0C = f2;
                }
                X7I x7i = this.A0G;
                float f3 = f - this.A0B;
                float f4 = f2 - this.A0C;
                C66356UBx c66356UBx = (C66356UBx) x7i;
                double d = c66356UBx.A02;
                long j = c66356UBx.A0K;
                float f5 = (float) j;
                c66356UBx.A02 = C66356UBx.A00(d - (f3 / f5));
                c66356UBx.A03 = c66356UBx.A0D(j, c66356UBx.A03 - (f4 / f5));
                this.A0B = f;
                this.A0C = f2;
                z = true;
            } else {
                z = false;
            }
            double d2 = this.A01;
            if (d2 < -0.01d || d2 > 0.01d) {
                long j2 = this.A03;
                long uptimeMillis = SystemClock.uptimeMillis();
                if (j2 == 0) {
                    this.A03 = uptimeMillis;
                    i = 1;
                } else {
                    i = ((int) (uptimeMillis - j2)) / 10;
                    this.A03 = j2 + (i * 10);
                }
                float pow = (float) (d2 * Math.pow(0.9150000214576721d, i));
                this.A01 = pow;
                C66356UBx c66356UBx2 = (C66356UBx) this.A0G;
                float f6 = c66356UBx2.A08;
                float f7 = c66356UBx2.A09;
                float f8 = c66356UBx2.A0C * (pow + 1.0f);
                int i3 = c66356UBx2.A0H;
                while (f8 > 2.0f) {
                    f8 /= 2.0f;
                    i3++;
                }
                while (f8 < 1.0f) {
                    f8 *= 2.0f;
                    i3--;
                }
                if (c66356UBx2.A0G((i3 + f8) - 1.0f, f6, f7)) {
                    z = true;
                } else {
                    this.A01 = 0.0f;
                }
            }
            double d3 = this.A00;
            if (d3 >= -0.01d && d3 <= 0.01d) {
                if (!z) {
                    this.A0A = false;
                    this.A05 = false;
                }
            } else {
                long j3 = this.A02;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                if (j3 == 0) {
                    this.A02 = uptimeMillis2;
                    i2 = 1;
                } else {
                    i2 = ((int) (uptimeMillis2 - j3)) / 10;
                    this.A02 = j3 + (i2 * 10);
                }
                float pow2 = (float) (d3 * Math.pow(0.8500000238418579d, i2));
                this.A00 = pow2;
                C66356UBx c66356UBx3 = (C66356UBx) this.A0G;
                c66356UBx3.A0E(c66356UBx3.A0B + pow2, c66356UBx3.A08, c66356UBx3.A09);
            }
            View view = this.A0E;
            view.invalidate();
            view.postOnAnimation(this);
            return;
        }
        C66356UBx c66356UBx4 = (C66356UBx) this.A0G;
        c66356UBx4.A0M.A05();
        C66356UBx.A0A(c66356UBx4);
    }

    public RunnableC71638Wxk(View view, X7I x7i) {
        this.A0E = view;
        this.A0G = x7i;
        OverScroller overScroller = new OverScroller(view.getContext());
        this.A0F = overScroller;
        overScroller.setFriction(0.035f);
    }
}
