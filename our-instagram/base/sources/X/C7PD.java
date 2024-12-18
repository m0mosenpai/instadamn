package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7PD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7PD implements C7P8 {
    @Override // X.C7P8
    public final boolean ABK() {
        return true;
    }

    @Override // X.C7P8
    public final boolean AFT(UserSession userSession, C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final boolean AFc(UserSession userSession, C83403nh c83403nh, int i) {
        String str;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        if (!c83403nh.A2P && c83403nh.A0s != null) {
            C1DX A00 = C1DW.A00(userSession);
            C38321qM c38321qM = c83403nh.A0s;
            if (c38321qM != null) {
                str = c38321qM.getId();
            } else {
                str = null;
            }
            if (A00.A02(str) != null) {
                if (i != 29 || C18U.A06(C06090Tz.A05, userSession, 36319312902167701L)) {
                    if (c83403nh.A10 != C2EY.A1s || C18U.A06(C06090Tz.A05, userSession, 36327559240497847L)) {
                        return true;
                    }
                    return false;
                }
                return false;
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
        C38321qM c38321qM;
        String id;
        Integer A0c;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        if (c83403nh.A0h() == null || c83403nh.A2P || (((c38321qM = c83403nh.A0s) != null && (id = c38321qM.getId()) != null && JUW.A03(userSession, c83403nh.A1S()) && (A0c = c83403nh.A0c(id)) != null && A0c.intValue() == 100) || c83403nh.A0W() == EnumC40111tc.A0E)) {
            return false;
        }
        return true;
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
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        if ((JUW.A03(userSession, c83403nh.A1S()) && c83403nh.A1b()) || c83403nh.A0W() == EnumC40111tc.A0E) {
            return false;
        }
        return true;
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
        return null;
    }

    @Override // X.C7P8
    public final String CGv() {
        return "permanent_media_message";
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
