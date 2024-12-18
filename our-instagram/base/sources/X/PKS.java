package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PKS implements InterfaceC31005Dk4 {
    public final /* synthetic */ C52159N6l A00;

    public PKS(C52159N6l c52159N6l) {
        this.A00 = c52159N6l;
    }

    @Override // X.InterfaceC31005Dk4
    public final boolean CcY(View view) {
        View view2;
        C3OO c3oo = (C3OO) ((C25852Bc7) this.A00.A0F.getValue()).A08.getValue();
        if (c3oo != null) {
            view2 = c3oo.itemView;
        } else {
            view2 = null;
        }
        return view.equals(view2);
    }

    @Override // X.InterfaceC31005Dk4
    public final void DIf(C38514GwZ c38514GwZ) {
        C52159N6l c52159N6l = this.A00;
        if (AbstractC167007dF.A1Z(c52159N6l.A0H)) {
            C52159N6l.A00(c52159N6l);
        }
        ((Gt6) c52159N6l.A0D.getValue()).A0H(c38514GwZ);
    }
}
