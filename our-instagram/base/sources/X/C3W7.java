package X;

import android.view.ViewStub;

/* renamed from: X.3W7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W7 implements C33R {
    public int A00;
    public C75113Zb A01;
    public final InterfaceC56392iX A02;

    public C3W7(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A02 = AbstractC56372iV.A01(viewStub, false, false);
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        if (i != 4 && i != 38) {
            return;
        }
        int i2 = c75113Zb.A02;
        int i3 = c75113Zb.A04;
        boolean z = false;
        if (i3 < this.A00) {
            z = true;
        }
        boolean z2 = false;
        if (i2 == i3 - 1) {
            z2 = true;
        }
        if (z && z2) {
            this.A02.setVisibility(0);
        } else {
            this.A02.setVisibility(8);
        }
    }
}
