package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class UEU extends AbstractC17900uT {
    public int A00;
    public boolean A01;
    public final int A02;
    public final Object A03;

    public UEU(C69708Vu3 c69708Vu3) {
        this.A02 = 0;
        this.A03 = c69708Vu3;
        this.A01 = false;
        this.A00 = 0;
    }

    @Override // X.AbstractC17900uT, X.C04F
    public final void CwU(View view) {
        if (1 - this.A02 != 0) {
            super.CwU(view);
        } else {
            this.A01 = true;
        }
    }

    @Override // X.C04F
    public final void CwY(View view) {
        if (this.A02 != 0) {
            if (!this.A01) {
                ((WPa) this.A03).A09.setVisibility(this.A00);
                return;
            }
            return;
        }
        int i = this.A00 + 1;
        this.A00 = i;
        C69708Vu3 c69708Vu3 = (C69708Vu3) this.A03;
        if (i != c69708Vu3.A04.size()) {
            return;
        }
        C04F c04f = c69708Vu3.A02;
        if (c04f != null) {
            c04f.CwY(null);
        }
        this.A00 = 0;
        this.A01 = false;
        c69708Vu3.A03 = false;
    }

    @Override // X.AbstractC17900uT, X.C04F
    public final void Cwg(View view) {
        if (this.A02 != 0) {
            ((WPa) this.A03).A09.setVisibility(0);
            return;
        }
        if (this.A01) {
            return;
        }
        this.A01 = true;
        C04F c04f = ((C69708Vu3) this.A03).A02;
        if (c04f == null) {
            return;
        }
        c04f.Cwg(null);
    }

    public UEU(WPa wPa, int i) {
        this.A02 = 1;
        this.A03 = wPa;
        this.A00 = i;
        this.A01 = false;
    }
}
