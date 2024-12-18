package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ipf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42378Ipf implements InterfaceC43071ya {
    public long A00 = -1;
    public final UserSession A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        long BmE;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        if (((C41044IFn) c59062n7.A03).A00.A01 == C05F.A04) {
            int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
            if (A01 != A1R) {
                if (A01 != 2) {
                    if (A01 != 0) {
                        throw B4Z.A00();
                    }
                    return;
                } else {
                    BmE = -1;
                    if (this.A00 == -1) {
                        return;
                    }
                }
            } else if (interfaceC57162jr.CGk(c59062n7) >= 0.5f && this.A00 <= -1 && interfaceC57162jr.CGk(c59062n7) >= 0.5f) {
                BmE = interfaceC57162jr.BmE();
            } else {
                return;
            }
            this.A00 = BmE;
        }
    }

    public C42378Ipf(UserSession userSession) {
        this.A01 = userSession;
    }
}
