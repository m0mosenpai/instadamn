package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.7PA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7PA implements C7P8 {
    @Override // X.C7P8
    public final boolean ABK() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7P8
    public final boolean AFT(UserSession userSession, C83403nh c83403nh) {
        C2EY c2ey;
        C910143t c910143t;
        ImmutableList A01;
        C910143t c910143t2;
        C14360o3.A0B(c83403nh, 0);
        C14360o3.A0B(userSession, 1);
        if (c83403nh.A0P() == null) {
            return false;
        }
        if (!C18U.A06(C06090Tz.A05, userSession, 36327408915266103L)) {
            return true;
        }
        AnonymousClass442 A0P = c83403nh.A0P();
        if (A0P == null || (((c910143t = A0P.A09) == null || !c910143t.A1l) && ((A01 = A0P.A01()) == null || (c910143t2 = (C910143t) A01.get(0)) == null || !c910143t2.A1l))) {
            AnonymousClass442 A0P2 = c83403nh.A0P();
            if (A0P2 != null) {
                c2ey = A0P2.A0F;
            } else {
                c2ey = null;
            }
            if (c2ey != C2EY.A1O) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C7P8
    public final boolean AFc(UserSession userSession, C83403nh c83403nh, int i) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        if (!c83403nh.A2P && c83403nh.A0G() == AnonymousClass541.A0J) {
            if (i != 29 || C18U.A06(C06090Tz.A05, userSession, 36319312902102164L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C7P8
    public final boolean AFi(C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean AFu(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 1);
        if (c83403nh.A0h() != null && !c83403nh.A2P && c83403nh.A0G() != AnonymousClass541.A0G) {
            return true;
        }
        return false;
    }

    @Override // X.C7P8
    public final boolean AFv(UserSession userSession, C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean AFw(UserSession userSession, C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final boolean AFx(UserSession userSession, C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final boolean AG0(UserSession userSession, C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean AGC(UserSession userSession, C83403nh c83403nh, int i) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        return AbstractC163297So.A00(c83403nh, userSession.userId);
    }

    @Override // X.C7P8
    public final String C2p(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 1);
        Object obj = c83403nh.A1T;
        if (obj instanceof String) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            return (String) obj;
        }
        C0f5 AEp = C18950wb.A01.AEp("DirectTextMessagePresenter: message content is not String", 817891009);
        AEp.ABW("message content", String.valueOf(c83403nh.A1T));
        AEp.report();
        return null;
    }

    @Override // X.C7P8
    public final String CGv() {
        return null;
    }

    @Override // X.C7P8
    public final boolean CQP() {
        return true;
    }

    @Override // X.C7P8
    public final boolean CT9(UserSession userSession) {
        return false;
    }

    @Override // X.C7P8
    public final boolean CTC(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        return AbstractC1576275w.A00(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final boolean CTE(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        return AbstractC1576275w.A01(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final boolean CTQ(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        return AbstractC1576275w.A02(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final boolean CWd(UserSession userSession, C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean Cea() {
        return true;
    }

    @Override // X.C7P8
    public final boolean CfJ(InterfaceC83433nk interfaceC83433nk) {
        return true;
    }

    @Override // X.C7P8
    public final /* synthetic */ boolean AFY(C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final /* synthetic */ boolean AFz(C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final /* synthetic */ boolean AGD(C83403nh c83403nh) {
        return false;
    }
}