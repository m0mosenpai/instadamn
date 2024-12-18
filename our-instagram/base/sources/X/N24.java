package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class N24 extends VK4 {
    public float A00;
    public int A01 = 4;
    public final /* synthetic */ PCO A02;

    public N24(PCO pco) {
        this.A02 = pco;
    }

    @Override // X.VK4
    public final void A01(View view, float f) {
        float f2 = this.A00;
        if (f2 > 0.0f && f < f2) {
            C54468O4w c54468O4w = this.A02.A01;
            if (c54468O4w != null) {
                NTY nty = c54468O4w.A00;
                if (nty.A07) {
                    View view2 = nty.A0A.A03;
                    view2.clearFocus();
                    AbstractC13880nE.A0O(view2);
                }
            }
            C14360o3.A0F("listener");
            throw C00O.createAndThrow();
        }
        this.A00 = f;
        C54468O4w c54468O4w2 = this.A02.A01;
        if (c54468O4w2 != null) {
            c54468O4w2.A00.A09.A05(new PD2(f));
            return;
        }
        C14360o3.A0F("listener");
        throw C00O.createAndThrow();
    }

    @Override // X.VK4
    public final void A02(View view, int i) {
        int i2 = this.A01;
        if (i2 == 4 && i == 1) {
            this.A02.A07.A0W(i2);
            i = this.A01;
        }
        if (i == 4 || i == 5) {
            C54468O4w c54468O4w = this.A02.A01;
            if (c54468O4w != null) {
                NTY nty = c54468O4w.A00;
                NTY.A00(nty);
                if (nty.A07) {
                    View view2 = nty.A0A.A03;
                    view2.clearFocus();
                    AbstractC13880nE.A0O(view2);
                }
                C54553O8f c54553O8f = (C54553O8f) AbstractC001800i.A0L(nty.A02.A00);
                if (c54553O8f != null) {
                    nty.A09.A05(new PD1(c54553O8f.A00));
                }
            } else {
                C14360o3.A0F("listener");
                throw C00O.createAndThrow();
            }
        }
        this.A01 = i;
    }
}
