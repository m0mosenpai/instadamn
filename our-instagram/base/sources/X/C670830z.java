package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

/* renamed from: X.30z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C670830z implements AnonymousClass310 {
    public InterfaceC670130s A00;
    public final UserSession A01;

    @Override // X.AnonymousClass310
    public final void COU(C38321qM c38321qM, Integer num, int i) {
        InterfaceC39271s5 AaR;
        InterfaceC106394qt B5r;
        InterfaceC670130s interfaceC670130s;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(num, 2);
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null && (AaR = injected.AaR()) != null && (B5r = AaR.B5r()) != null) {
            C82373m0 A00 = AbstractC39720Hjq.A00(AFI_TYPE.A0D, B5r, this.A01, c38321qM, num, i, -1L);
            if (A00 != null && (interfaceC670130s = this.A00) != null) {
                interfaceC670130s.DnX(C05F.A00, AbstractC16960so.A1N(A00));
            }
        }
    }

    @Override // X.AnonymousClass310
    public final void EGE() {
        this.A00 = null;
    }

    @Override // X.AnonymousClass310
    public final boolean Eio(C38321qM c38321qM) {
        InterfaceC39541sb injected;
        InterfaceC39271s5 AaR;
        C14360o3.A0B(c38321qM, 0);
        if (!c38321qM.CdW() || (injected = c38321qM.A0C.getInjected()) == null || (AaR = injected.AaR()) == null || AaR.B5r() == null) {
            return false;
        }
        return AbstractC129385t0.A03(this.A01);
    }

    public C670830z(UserSession userSession) {
        this.A01 = userSession;
    }

    @Override // X.AnonymousClass310
    public final void Eco(InterfaceC670130s interfaceC670130s) {
        this.A00 = interfaceC670130s;
    }
}
