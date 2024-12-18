package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Collection;

/* renamed from: X.7PU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7PU implements C7P8 {
    @Override // X.C7P8
    public final boolean ABK() {
        return false;
    }

    @Override // X.C7P8
    public final boolean AFT(UserSession userSession, C83403nh c83403nh) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7P8
    public final boolean AFc(UserSession userSession, C83403nh c83403nh, int i) {
        boolean z;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36323208437181518L) && (i != 29 || C18U.A06(c06090Tz, userSession, 36319312902233238L))) {
            synchronized (c83403nh) {
                ImmutableList A0H = c83403nh.A0H();
                z = false;
                if (A0H != null && !A0H.isEmpty()) {
                    String str = ((C910143t) A0H.get(0)).A0w;
                    if (c83403nh.A10 == C2EY.A1r && str != null) {
                        if (str.startsWith("instagram://share_to_direct_preview")) {
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C7P8
    public final boolean AFi(C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean AFu(UserSession userSession, C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean AFv(UserSession userSession, C83403nh c83403nh) {
        String str;
        C14360o3.A0B(c83403nh, 1);
        Object obj = c83403nh.A1T;
        if (obj != null && (obj instanceof Collection)) {
            Object A0A = AbstractC001800i.A0A((Iterable) obj);
            if ((A0A instanceof C910143t) && (str = ((C910143t) A0A).A0w) != null && AbstractC001900j.A0a(str, "share_to_direct_preview", false)) {
                return true;
            }
        }
        return false;
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
    public final boolean AGC(UserSession userSession, C83403nh c83403nh, int i) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        return AbstractC163297So.A00(c83403nh, userSession.userId);
    }

    @Override // X.C7P8
    public final String C2p(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 1);
        if (c83403nh.A10 == C2EY.A1r) {
            return c83403nh.A1q;
        }
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
        return false;
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

    @Override // X.C7P8
    public final /* synthetic */ boolean AG0(UserSession userSession, C83403nh c83403nh) {
        return false;
    }
}
