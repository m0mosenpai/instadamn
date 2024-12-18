package X;

import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class U39 implements InterfaceC24551Hy {
    public final U34 A00;
    public final UQE A01;
    public final /* synthetic */ C65979TxY A02;

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    @Override // X.InterfaceC24551Hy
    public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
        C14360o3.A0B(abstractC115105If, 1);
        U34 u34 = this.A00;
        InterfaceC169457hL interfaceC169457hL = u34.A01.A00;
        if (interfaceC169457hL != null) {
            interfaceC169457hL.Dfq(u34.A00, abstractC115105If);
        }
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DVR() {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    public U39(UQE uqe, U34 u34, C65979TxY c65979TxY) {
        this.A02 = c65979TxY;
        this.A01 = uqe;
        this.A00 = u34;
    }

    @Override // X.InterfaceC24551Hy
    public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) interfaceC40801un;
        C14360o3.A0B(interfaceC40821up, 2);
        this.A00.A00(interfaceC40821up);
        InterfaceC169467hM interfaceC169467hM = this.A02.A00;
        if (interfaceC169467hM != null) {
            interfaceC169467hM.DpU(true);
        }
    }

    @Override // X.InterfaceC24551Hy
    public final void Dg4() {
        LinkedHashMap linkedHashMap = this.A02.A01;
        C15500q5.A04(linkedHashMap).remove(this.A01);
        U34 u34 = this.A00;
        InterfaceC169457hL interfaceC169457hL = u34.A01.A00;
        if (interfaceC169457hL != null) {
            interfaceC169457hL.Dg0(u34.A00);
        }
    }

    @Override // X.InterfaceC24551Hy
    public final void DgK() {
        U34 u34 = this.A00;
        InterfaceC169457hL interfaceC169457hL = u34.A01.A00;
        if (interfaceC169457hL != null) {
            interfaceC169457hL.DgG(u34.A00);
        }
        InterfaceC169467hM interfaceC169467hM = this.A02.A00;
        if (interfaceC169467hM != null) {
            interfaceC169467hM.DpU(false);
        }
    }
}
