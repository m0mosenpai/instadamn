package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes11.dex */
public final class UGS extends C110814yt {
    public int A00;
    public final int A01;

    @Override // X.C110814yt, X.AbstractC110824yu
    public final void A04(View view, C110834yv c110834yv, C3F5 c3f5) {
        AbstractC167007dF.A1D(view, 0, c110834yv);
        AbstractC70663Fe abstractC70663Fe = ((AbstractC110824yu) this).A02;
        if (abstractC70663Fe != null) {
            float Bat = ((abstractC70663Fe.A00 - abstractC70663Fe.Bat()) - r4) * 0.8f;
            int A00 = AbstractC110854yx.A00(view, abstractC70663Fe) - abstractC70663Fe.Bax();
            if (A00 > 0) {
                A00 -= (int) Bat;
            }
            int i = ((int) Bat) - this.A00;
            if (Math.abs(A00) > i) {
                int i2 = -1;
                if (A00 > 0) {
                    i2 = 1;
                }
                A00 = i2 * i;
            }
            if (A00 < 0) {
                A00 -= this.A01;
            }
            int A09 = A09(A00);
            if (A09 > 0) {
                c110834yv.A00(((C110814yt) this).A06, 0, A00, A09);
            }
        }
    }

    @Override // X.C110814yt
    public final int A08() {
        return -1;
    }

    public UGS(Context context, int i) {
        super(context);
        this.A01 = i;
    }

    @Override // X.C110814yt, X.AbstractC110824yu
    public final void A05(C110834yv c110834yv, C3F5 c3f5, int i, int i2) {
        AbstractC167017dG.A1R(c3f5, c110834yv);
        this.A00 += i2;
        if (((AbstractC110824yu) this).A02 != null) {
            if (this.A00 >= Math.floor(((r2.A00 - r2.Bat()) - r2.Bax()) * 0.8f)) {
                A01();
                return;
            }
        }
        super.A05(c110834yv, c3f5, i, i2);
    }
}
