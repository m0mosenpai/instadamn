package X;

import com.instagram.user.model.User;

/* renamed from: X.GIl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36762GIl implements InterfaceC37219GaU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.InterfaceC37219GaU
    public final void Czi() {
    }

    @Override // X.InterfaceC37219GaU
    public final void DqX() {
    }

    @Override // X.InterfaceC37219GaU
    public final void onCancel() {
    }

    public C36762GIl(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // X.InterfaceC37219GaU
    public final void D6t() {
        if (this.A00 != 0) {
            ((GIS) this.A03).A06.A00((C38266GsB) this.A01, ((User) this.A02).CQf());
        }
    }

    @Override // X.InterfaceC37219GaU
    public final void DFf() {
        if (this.A00 == 0) {
            AbstractC31171DnF.A1K((C6FQ) this.A01, (InterfaceC103384lE) this.A02);
        }
    }

    @Override // X.InterfaceC37219GaU
    public final void onSuccess() {
        if (this.A00 == 0) {
            AbstractC31171DnF.A1K((C6FQ) this.A01, (InterfaceC103384lE) this.A03);
        }
    }
}
