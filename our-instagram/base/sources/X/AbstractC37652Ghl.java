package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Ghl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37652Ghl {
    public static final EnumC39550HdM A00(C120985dq c120985dq, UserSession userSession, UpcomingEvent upcomingEvent, boolean z) {
        boolean z2;
        EnumC39550HdM enumC39550HdM;
        C14360o3.A0B(userSession, 3);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM == null) {
            return null;
        }
        if (C76253bV.A09(c38321qM) && C76253bV.A04(userSession, c38321qM)) {
            z2 = true;
            if (z) {
                enumC39550HdM = EnumC39550HdM.A04;
            } else {
                enumC39550HdM = EnumC39550HdM.A03;
            }
        } else {
            z2 = false;
            enumC39550HdM = null;
        }
        boolean A1b = AbstractC31177DnL.A1b(AbstractC57812ku.A00(new C146066i4(userSession).A00).A0M(upcomingEvent));
        if (!C76253bV.A00(c120985dq, userSession)) {
            return null;
        }
        if (!new C146066i4(userSession).A00(upcomingEvent)) {
            if (!z2) {
                return EnumC39550HdM.A02;
            }
        } else {
            if (A1b) {
                return EnumC39550HdM.A06;
            }
            if (!upcomingEvent.getReminderEnabled()) {
                return EnumC39550HdM.A05;
            }
            if (!z2) {
                return EnumC39550HdM.A07;
            }
        }
        return enumC39550HdM;
    }

    public static final C37644Ghd A01(C120985dq c120985dq, UserSession userSession, C3YT c3yt, C75113Zb c75113Zb, C37648Ghh c37648Ghh) {
        EnumC39535Hd6 enumC39535Hd6;
        FollowStatus followStatus;
        C84923qg A1Y;
        C38321qM c38321qM;
        String A2u;
        int i;
        boolean z;
        C84923qg A1V;
        C75113Zb c75113Zb2 = c75113Zb;
        AbstractC167007dF.A1D(userSession, 0, c3yt);
        if (c3yt.A00.getBoolean(c120985dq.A0D(), false)) {
            enumC39535Hd6 = EnumC39535Hd6.A02;
        } else {
            enumC39535Hd6 = EnumC39535Hd6.A03;
        }
        if (c75113Zb == null) {
            List list = c120985dq.A0R;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null) {
                z = c38321qM2.A4w();
            } else {
                z = false;
            }
            c75113Zb2 = new C75113Zb(i, z);
            AnonymousClass341 anonymousClass341 = AnonymousClass341.A07;
            C14360o3.A0B(anonymousClass341, 0);
            c75113Zb2.A0o = anonymousClass341;
            C38321qM c38321qM3 = c120985dq.A02;
            if (c38321qM3 != null && AbstractC75343a1.A08(userSession, c38321qM3) && (!C18U.A06(C06090Tz.A05, userSession, 2342165869759113931L) || c38321qM3.A1V() == null || ((A1V = c38321qM3.A1V()) != null && !A1V.A0i))) {
                c75113Zb2.A0N(EnumC75183Zl.A06);
            }
        }
        C38321qM c38321qM4 = c120985dq.A02;
        C45127Jxw c45127Jxw = null;
        if (c38321qM4 != null && (A1Y = c38321qM4.A1Y()) != null && (c38321qM = c120985dq.A02) != null && (A2u = c38321qM.A2u()) != null) {
            c45127Jxw = new C45127Jxw(AbstractC166987dD.A1J(A1Y), 19, A2u);
        }
        User user = c120985dq.A0K;
        if (user != null) {
            followStatus = C57582kX.A00(userSession).A0M(user.B7L(), user.A0M(), user.getId());
        } else {
            followStatus = FollowStatus.A08;
        }
        EnumC75193Zm enumC75193Zm = c75113Zb2.A0m;
        boolean z2 = c75113Zb2.A2Q;
        boolean z3 = c120985dq.A0A;
        int i2 = c75113Zb2.A0Q;
        C51737MtK c51737MtK = new C51737MtK(7);
        Float valueOf = Float.valueOf(0.0f);
        return new C37644Ghd(c51737MtK, c45127Jxw, null, enumC39535Hd6, enumC75193Zm, c75113Zb2, c37648Ghh, followStatus, null, null, null, null, new C09530e4(valueOf, valueOf), i2, 0, false, false, true, false, false, z3, z2, false, false, true, true, true, false, true, false, false, false, false, false, false);
    }
}
