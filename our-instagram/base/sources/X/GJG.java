package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GJG implements InterfaceC37213GaO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.InterfaceC37213GaO
    public final void DqW() {
    }

    @Override // X.InterfaceC37213GaO
    public final void DqX() {
    }

    public GJG(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj3;
    }

    @Override // X.InterfaceC37213GaO
    public final void Dgt() {
        if (this.A00 == 0) {
            InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A02;
            C131845xK.A00((C6FQ) this.A01, C6FW.A01, interfaceC103384lE);
        }
    }

    @Override // X.InterfaceC37213GaO
    public final void Dgu() {
        if (this.A00 != 0) {
            ((User) this.A01).A1B(true);
            C38266GsB c38266GsB = (C38266GsB) this.A02;
            c38266GsB.A0G = true;
            c38266GsB.A0D = true;
            ((GIS) this.A03).A07.CtN();
        }
    }

    @Override // X.InterfaceC37213GaO
    public final void DqY() {
        if (this.A00 == 0) {
            InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
            C131845xK.A00((C6FQ) this.A01, C6FW.A01, interfaceC103384lE);
        }
    }
}
