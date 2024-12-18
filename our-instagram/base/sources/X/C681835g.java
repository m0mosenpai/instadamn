package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;

/* renamed from: X.35g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C681835g implements InterfaceC43071ya {
    public final C17570ts A00;
    public final UserSession A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                C17530to A00 = A00(c59062n7);
                A00.A03 = Integer.valueOf(((C75113Zb) c59062n7.A04).getPosition());
                C17640tz c17640tz = A00.A02;
                if (c17640tz.A03(c17640tz.A04.now())) {
                    A00.A07 = true;
                }
                this.A00.A05(A00);
                return;
            }
            if (C18U.A06(C06090Tz.A05, this.A01, 36312114536645545L) && ((C75113Zb) c59062n7.A04).A02() <= 0) {
                return;
            }
            A01(c59062n7, interfaceC57162jr);
            return;
        }
        A01(c59062n7, interfaceC57162jr);
        C55772hI.A00(this.A01).A0D = ((C38321qM) c59062n7.A03).A2u();
    }

    private final C17530to A00(C59062n7 c59062n7) {
        String str;
        C17570ts c17570ts = this.A00;
        C38321qM c38321qM = (C38321qM) c59062n7.A03;
        C17530to A01 = c17570ts.A01(c38321qM.getId());
        if (A01 == null) {
            String id = c38321qM.getId();
            if (id != null) {
                User A2E = c38321qM.A2E(this.A01);
                String str2 = null;
                if (A2E != null) {
                    str = A2E.getId();
                } else {
                    str = null;
                }
                ProductType A1z = c38321qM.A1z();
                if (A1z != null) {
                    str2 = A1z.A00;
                }
                return new C17530to(id, str, str2);
            }
            throw new IllegalStateException("Required value was null.");
        }
        return A01;
    }

    public C681835g(UserSession userSession, C17570ts c17570ts) {
        this.A00 = c17570ts;
        this.A01 = userSession;
    }

    private final void A01(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C17530to A00 = A00(c59062n7);
        A00.A00(interfaceC57162jr.CGk(c59062n7));
        A00.A03 = Integer.valueOf(((C75113Zb) c59062n7.A04).getPosition());
        this.A00.A05(A00);
    }
}
