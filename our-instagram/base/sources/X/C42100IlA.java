package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IlA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42100IlA implements InterfaceC48192Ji {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C42100IlA(HE0 he0, UserSession userSession, C38321qM c38321qM, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A00 = i;
        this.A03 = he0;
        this.A01 = c38321qM;
        this.A04 = userSession;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        InterfaceC1118152j interfaceC1118152j;
        InterfaceC1118152j interfaceC1118152j2;
        int i = this.A00;
        HE0 he0 = (HE0) this.A03;
        InterfaceC1118152j interfaceC1118152j3 = he0.A00;
        if (i != 0) {
            if (interfaceC1118152j3 != null) {
                C41211IMa AKI = interfaceC1118152j3.AKI();
                AKI.A02 = false;
                interfaceC1118152j2 = AKI.A00();
            } else {
                interfaceC1118152j2 = null;
            }
            he0.A00 = interfaceC1118152j2;
            C38321qM c38321qM = (C38321qM) this.A01;
            AbstractC37668Gi1.A00(c38321qM, he0.A04, false);
            AbstractC37301Gc2.A1O((UserSession) this.A04, c38321qM);
            AbstractC166987dD.A1Y(this.A02);
            return;
        }
        if (interfaceC1118152j3 != null) {
            C41211IMa AKI2 = interfaceC1118152j3.AKI();
            AKI2.A02 = true;
            interfaceC1118152j = AKI2.A00();
        } else {
            interfaceC1118152j = null;
        }
        he0.A00 = interfaceC1118152j;
        C38321qM c38321qM2 = (C38321qM) this.A01;
        AbstractC37668Gi1.A00(c38321qM2, he0.A04, true);
        AbstractC37301Gc2.A1O((UserSession) this.A04, c38321qM2);
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A02;
        if (interfaceC16820sZ == null) {
            return;
        }
        interfaceC16820sZ.invoke();
    }
}
