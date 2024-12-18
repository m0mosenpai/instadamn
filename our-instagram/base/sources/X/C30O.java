package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.30O, reason: invalid class name */
/* loaded from: classes2.dex */
public class C30O extends C30P {
    public final UserSession A00;
    public final boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30O(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, boolean z) {
        super(interfaceC60442pS, str);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
        this.A00 = userSession;
        this.A01 = z;
    }

    public C4T2 A0D(C4T2 c4t2, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c4t2, 1);
        super.A06(c4t2, c38321qM);
        C75363a3 A00 = A00(c38321qM, this);
        UserSession userSession = this.A00;
        c4t2.A06("video_format", C4T3.A01(A00, false, c38321qM.A4x()));
        String BJN = c38321qM.A0C.BJN();
        if (BJN != null) {
            c4t2.A06("inventory_source", BJN);
        }
        java.util.Set set = C95694Sd.A0I;
        C95694Sd c95694Sd = (C95694Sd) userSession.A01(C95694Sd.class, new C9EK(userSession, 44));
        if (c95694Sd != null) {
            c95694Sd.A03(c4t2, null, null, A00(c38321qM, this), A03(c38321qM));
        }
        String AmY = C4T4.A00(userSession).AmY(c38321qM.A2h());
        if (AmY != null) {
            c4t2.A06("channel_pk", AmY);
        }
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            c4t2.A01(C4T3.A00(A2E.B7L()), "instagram_follow_status");
        }
        return c4t2;
    }

    @Override // X.C30P
    public final /* bridge */ /* synthetic */ C4T2 A06(C4T2 c4t2, Object obj) {
        A0D(c4t2, (C38321qM) obj);
        return c4t2;
    }

    public C95804So A0C(C38321qM c38321qM) {
        String str;
        if (this instanceof C30N) {
            C30N c30n = (C30N) this;
            C14360o3.A0B(c38321qM, 0);
            C46h c46h = (C46h) c30n.A01.get();
            if ((c46h instanceof C4JL) && ((C75113Zb) c46h.A03()).A2p && c38321qM.A5P()) {
                str = "clips_netego";
                C4S0 c4s0 = C4S0.A05;
                if (C4S0.A03()) {
                    String id = c38321qM.getId();
                    if (id != null) {
                        c4s0.A04(id, "clips_netego");
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                str = null;
            }
            C95804So A01 = c30n.A01(c30n.A00, c38321qM);
            A01.A06("subtype", str);
            return A01;
        }
        C14360o3.A0B(c38321qM, 0);
        return A01(this.A00, c38321qM);
    }

    public static final C75363a3 A00(C38321qM c38321qM, C30O c30o) {
        if (c38321qM.Cff() || c38321qM.A5J() || (c30o.A01 && c38321qM.A5M())) {
            return c38321qM.CFR();
        }
        return null;
    }
}
