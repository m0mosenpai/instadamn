package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PKT implements InterfaceC31005Dk4 {
    public final /* synthetic */ C52161N6n A00;

    public PKT(C52161N6n c52161N6n) {
        this.A00 = c52161N6n;
    }

    @Override // X.InterfaceC31005Dk4
    public final boolean CcY(View view) {
        View view2;
        C3OO c3oo = (C3OO) ((C50999Mg6) this.A00.A0L.getValue()).A07.getValue();
        if (c3oo != null) {
            view2 = c3oo.itemView;
        } else {
            view2 = null;
        }
        return view.equals(view2);
    }

    @Override // X.InterfaceC31005Dk4
    public final void DIf(C38514GwZ c38514GwZ) {
        MSX.A0X(this.A00).A0H(c38514GwZ);
    }
}
