package X;

import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class PJ3 implements XDT {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public PJ3(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    @Override // X.XDT
    public final void CuW() {
        C51169MjD c51169MjD;
        int bindingAdapterPosition;
        switch (this.A00) {
            case 0:
                C56802PIt c56802PIt = (C56802PIt) ((InterfaceC58171Pqb) this.A01);
                User user = c56802PIt.A04;
                if (user == null) {
                    return;
                }
                c51169MjD = (C51169MjD) this.A03;
                C3OO c3oo = (C3OO) this.A02;
                AbstractC52865NaM abstractC52865NaM = ((AbstractC52821NZe) c51169MjD.A05).A03;
                AbstractC166987dD.A1Z(new PZR(abstractC52865NaM, user, null, 5), AbstractC141776au.A00(abstractC52865NaM));
                c56802PIt.A00 = 0;
                bindingAdapterPosition = c3oo.getBindingAdapterPosition();
                c51169MjD.notifyItemChanged(bindingAdapterPosition);
            case 1:
                c51169MjD = (C51169MjD) this.A03;
                c51169MjD.A05.DWD((C56802PIt) this.A02);
                break;
            default:
                c51169MjD = (C51169MjD) this.A03;
                c51169MjD.A05.DHv((C56802PIt) this.A02);
                break;
        }
        int indexOf = c51169MjD.A07.indexOf((InterfaceC58171Pqb) this.A01);
        if (indexOf >= 0) {
            bindingAdapterPosition = C51169MjD.A00(c51169MjD, indexOf);
            c51169MjD.notifyItemChanged(bindingAdapterPosition);
        }
    }

    @Override // X.XDT
    public final void D69() {
        if (this.A00 == 0) {
            InterfaceC58172Pqc interfaceC58172Pqc = ((C51169MjD) this.A03).A05;
            ((PJ0) interfaceC58172Pqc).A09.A01((InterfaceC58171Pqb) this.A01);
        }
    }

    @Override // X.XDT
    public final void DDH() {
        if (this.A00 == 0) {
            ((C56802PIt) ((InterfaceC58171Pqb) this.A01)).A00 = 3;
            ((C2UU) this.A03).notifyItemChanged(((C3OO) this.A02).getBindingAdapterPosition());
        }
    }
}
