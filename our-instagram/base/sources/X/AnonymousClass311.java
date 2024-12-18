package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

/* renamed from: X.311, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass311 implements AnonymousClass310 {
    public long A00 = -1;
    public InterfaceC670130s A01;
    public final UserSession A02;

    @Override // X.AnonymousClass310
    public final void COU(C38321qM c38321qM, Integer num, int i) {
        InterfaceC39271s5 AaR;
        InterfaceC106394qt B5h;
        InterfaceC670130s interfaceC670130s;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(num, 2);
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null && (AaR = injected.AaR()) != null && (B5h = AaR.B5h()) != null) {
            C82373m0 A00 = AbstractC39720Hjq.A00(AFI_TYPE.A05, B5h, this.A02, c38321qM, num, i, this.A00);
            if (A00 != null && (interfaceC670130s = this.A01) != null) {
                interfaceC670130s.DnX(C05F.A00, AbstractC16960so.A1N(A00));
            }
        }
    }

    @Override // X.AnonymousClass310
    public final void EGE() {
        this.A01 = null;
    }

    @Override // X.AnonymousClass310
    public final boolean Eio(C38321qM c38321qM) {
        InterfaceC39541sb injected;
        InterfaceC39271s5 AaR;
        boolean z = false;
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.CdW() && (injected = c38321qM.A0C.getInjected()) != null && (AaR = injected.AaR()) != null && AaR.B5h() != null) {
            UserSession userSession = this.A02;
            z = true;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36326163374683864L) || !C18U.A06(c06090Tz, userSession, 36326163374749401L)) {
                return false;
            }
        }
        return z;
    }

    public AnonymousClass311(UserSession userSession) {
        this.A02 = userSession;
    }

    @Override // X.AnonymousClass310
    public final void Eco(InterfaceC670130s interfaceC670130s) {
        this.A01 = interfaceC670130s;
    }
}
