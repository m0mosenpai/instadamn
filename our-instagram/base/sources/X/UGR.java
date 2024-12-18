package X;

import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes11.dex */
public final class UGR extends C110814yt {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;

    @Override // X.C110814yt
    public final int A08() {
        return -1;
    }

    @Override // X.C110814yt, X.AbstractC110824yu
    public final void A04(View view, C110834yv c110834yv, C3F5 c3f5) {
        int i;
        AbstractC70663Fe abstractC70663Fe = ((AbstractC110824yu) this).A02;
        if (abstractC70663Fe != null) {
            C3H6 c3h6 = new C3H6(abstractC70663Fe);
            float A03 = (c3h6.A03() - c3h6.A06()) * 0.8f;
            int A0D = (c3h6.A0D(view) + (c3h6.A0B(view) / 2)) - (c3h6.A06() + (c3h6.A07() / 2));
            if (A0D > 0) {
                A0D = (int) (A0D - A03);
            }
            int i2 = ((int) A03) - this.A01;
            if (Math.abs(A0D) > i2) {
                int i3 = -1;
                if (A0D > 0) {
                    i3 = 1;
                }
                A0D = i2 * i3;
            }
            if (A0D < 0) {
                i = this.A02;
            } else {
                i = this.A00;
            }
            int i4 = A0D - i;
            int A09 = A09(i4);
            if (A09 > 0) {
                c110834yv.A00(((C110814yt) this).A06, 0, i4, A09);
            }
        }
    }

    @Override // X.C110814yt, X.AbstractC110824yu
    public final void A05(C110834yv c110834yv, C3F5 c3f5, int i, int i2) {
        this.A01 += i2;
        if (((AbstractC110824yu) this).A02 != null) {
            if (this.A01 >= Math.floor(((r2.A00 - r2.Bat()) - r2.Bax()) * 0.8f)) {
                A01();
                return;
            }
        }
        super.A05(c110834yv, c3f5, i, i2);
    }

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        float f;
        float f2;
        if (!this.A03) {
            f2 = displayMetrics.densityDpi;
            f = 25.0f;
        } else {
            f = 5.5f;
            f2 = displayMetrics.densityDpi;
        }
        return f / f2;
    }

    @Override // X.C110814yt
    public final int A09(int i) {
        int A09 = super.A09(i);
        if (!this.A03) {
            return A09;
        }
        return (int) (((int) ((((AbstractC110824yu) this).A02.A00 * 0.8f) / (i + this.A01))) * A09 * 0.75f);
    }
}
