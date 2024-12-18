package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7PE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7PE implements C7P8 {
    @Override // X.C7P8
    public final boolean ABK() {
        return false;
    }

    @Override // X.C7P8
    public final boolean AFT(UserSession userSession, C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean AFi(C83403nh c83403nh) {
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
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36319312902036627L);
    }

    @Override // X.C7P8
    public final String CGv() {
        return "media_reshare_message";
    }

    @Override // X.C7P8
    public final boolean CQP() {
        return true;
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
    public final boolean AFc(UserSession userSession, C83403nh c83403nh, int i) {
        C910143t c910143t;
        if (c83403nh.A2P) {
            return false;
        }
        if (i == 29) {
            C14360o3.A0B(userSession, 0);
            if (!C18U.A06(C06090Tz.A05, userSession, 36319312902691997L)) {
                return false;
            }
        }
        if (c83403nh.A1Y() || c83403nh.A1X()) {
            return false;
        }
        C2EY c2ey = c83403nh.A10;
        if (c2ey.equals(C2EY.A1F)) {
            C38321qM A0S = c83403nh.A0S();
            if (A0S == null || A0S.A0C.BRN() != null || A0S.A57()) {
                return false;
            }
        } else if (c2ey.equals(C2EY.A1x)) {
            ImmutableList A0H = c83403nh.A0H();
            if (A0H == null || (c910143t = (C910143t) A0H.iterator().next()) == null || !c910143t.A04()) {
                return false;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid content type: ");
            sb.append(c2ey);
            throw new IllegalStateException(sb.toString());
        }
        return true;
    }

    @Override // X.C7P8
    public final boolean AFv(UserSession userSession, C83403nh c83403nh) {
        return C18U.A06(C06090Tz.A05, userSession, 36311272724103652L);
    }

    @Override // X.C7P8
    public final boolean AGC(UserSession userSession, C83403nh c83403nh, int i) {
        return AbstractC163297So.A00(c83403nh, userSession.userId);
    }

    @Override // X.C7P8
    public final String C2p(UserSession userSession, C83403nh c83403nh) {
        Object obj = c83403nh.A1T;
        if (C9CL.A00(obj, 2)) {
            String str = ((C9CL) obj).A04;
            if (str != null && !str.equals("")) {
                return str;
            }
        } else if (c83403nh.A10 == C2EY.A1x) {
            return c83403nh.A1q;
        }
        return null;
    }

    @Override // X.C7P8
    public final boolean AFu(UserSession userSession, C83403nh c83403nh) {
        if (c83403nh.A1X() || c83403nh.A0h() == null || c83403nh.A2P) {
            return false;
        }
        return true;
    }

    @Override // X.C7P8
    public final boolean CT9(UserSession userSession) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C14360o3.A0B(A00, 0);
        InterfaceC19630xq interfaceC19630xq = A00.A01;
        if (!interfaceC19630xq.getBoolean("direct_forwarding_has_forwarded", false) && interfaceC19630xq.getInt("direct_forwarding_nux_count", 0) <= 3 && System.currentTimeMillis() - interfaceC19630xq.getLong("direct_forwarding_seen_timestamp", 0L) > TimeUnit.DAYS.toMillis(1L)) {
            return true;
        }
        return false;
    }

    @Override // X.C7P8
    public final boolean CTC(UserSession userSession, C83403nh c83403nh) {
        return AbstractC1576275w.A00(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final boolean CTE(UserSession userSession, C83403nh c83403nh) {
        return AbstractC1576275w.A01(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final boolean CTQ(UserSession userSession, C83403nh c83403nh) {
        return AbstractC1576275w.A02(AbstractC23021Ah.A00(userSession));
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
