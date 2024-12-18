package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;

/* renamed from: X.35f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C681735f extends AnonymousClass346 {
    public final C681935h A00;
    public final C681835g A01;
    public final C17570ts A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.35h] */
    public C681735f(final UserSession userSession, final C17570ts c17570ts) {
        this.A02 = c17570ts;
        this.A01 = new C681835g(userSession, c17570ts);
        this.A00 = new InterfaceC43071ya(userSession, c17570ts) { // from class: X.35h
            public final C17570ts A00;
            public final UserSession A01;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C17530to A00;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                if (intValue != 0 && intValue != 1) {
                    A00 = A00(c59062n7);
                    if (A00 != null) {
                        C17640tz c17640tz = A00.A02;
                        if (c17640tz.A03(c17640tz.A04.now())) {
                            A00.A07 = true;
                        }
                    } else {
                        return;
                    }
                } else {
                    A00 = A00(c59062n7);
                    if (A00 == null) {
                        return;
                    } else {
                        A00.A00(interfaceC57162jr.CGk(c59062n7));
                    }
                }
                this.A00.A05(A00);
            }

            private final C17530to A00(C59062n7 c59062n7) {
                String A2z;
                String str;
                C38321qM A1e = ((C38321qM) c59062n7.A03).A1e(((C42C) c59062n7.A04).A00);
                String str2 = null;
                if (A1e == null || (A2z = A1e.A2z()) == null) {
                    return null;
                }
                C17530to A01 = this.A00.A01(A1e.A2z());
                if (A01 == null) {
                    User A2E = A1e.A2E(this.A01);
                    if (A2E != null) {
                        str = A2E.getId();
                    } else {
                        str = null;
                    }
                    ProductType A1z = A1e.A1z();
                    if (A1z != null) {
                        str2 = A1z.A00;
                    }
                    return new C17530to(A2z, str, str2);
                }
                return A01;
            }

            {
                this.A00 = c17570ts;
                this.A01 = userSession;
            }
        };
    }
}
