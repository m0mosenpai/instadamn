package X;

import android.view.View;

/* renamed from: X.3PA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PA implements C3PB {
    public float A00;
    public float A01;
    public final View A02;

    public C3PA(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = view;
        this.A00 = view.getScaleX();
        this.A01 = view.getScaleY();
    }

    @Override // X.C3PB
    public final void D0H(C3PF c3pf) {
        if (c3pf.A07.A03 == 1.0d) {
            View view = this.A02;
            this.A00 = view.getScaleX();
            this.A01 = view.getScaleY();
        }
        if (c3pf.A0B) {
            this.A02.setLayerType(2, null);
        }
    }

    @Override // X.C3PB
    public final void D0I(C3PF c3pf) {
        if (!c3pf.A00) {
            this.A02.setLayerType(c3pf.A05, null);
        }
    }

    @Override // X.C3PB
    public final void D0J(C3PF c3pf) {
        float f = (float) c3pf.A07.A09.A00;
        View view = this.A02;
        view.setScaleX(this.A00 * f);
        view.setScaleY(f * this.A01);
    }

    @Override // X.C3PB
    public final void DgY(C3PF c3pf) {
        this.A02.setLayerType(c3pf.A05, null);
    }
}
