package X;

import com.instagram.api.schemas.MoreInfoType;
import com.instagram.common.session.UserSession;

/* renamed from: X.5LV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LV {
    public static final C5LV A00 = new Object();
    public static final java.util.Set A01 = AbstractC16830sb.A07(MoreInfoType.A0D, MoreInfoType.A09);

    public final boolean A03(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC60442pS, 1);
        C14360o3.A0B(c38321qM, 2);
        if (A02(c38321qM) && A01(userSession, interfaceC60442pS.getModuleName()) && A00(userSession, c38321qM) && C18U.A06(C06090Tz.A05, userSession, 36326502677100455L)) {
            return true;
        }
        return false;
    }

    public final boolean A04(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC60442pS, 1);
        C14360o3.A0B(c38321qM, 2);
        if (A02(c38321qM) && A01(userSession, interfaceC60442pS.getModuleName()) && A00(userSession, c38321qM) && C18U.A06(C06090Tz.A05, userSession, 36326502677624750L)) {
            return true;
        }
        return false;
    }

    public final boolean A05(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC60442pS, 1);
        C14360o3.A0B(c38321qM, 2);
        if (A02(c38321qM) && A01(userSession, interfaceC60442pS.getModuleName()) && A00(userSession, c38321qM) && C18U.A06(C06090Tz.A05, userSession, 36326502677165992L)) {
            return true;
        }
        return false;
    }

    public final boolean A06(UserSession userSession, C38321qM c38321qM, String str) {
        C14360o3.A0B(str, 1);
        if (A01(userSession, str) && A00(userSession, c38321qM) && C18U.A06(C06090Tz.A05, userSession, 36326502677231529L)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(C38321qM c38321qM) {
        MoreInfoType moreInfoType;
        InterfaceC107114sH AtW;
        java.util.Set set = A01;
        InterfaceC87803vo BUx = c38321qM.A0C.BUx();
        if (BUx != null && (AtW = BUx.AtW()) != null) {
            moreInfoType = AtW.BUy();
        } else {
            moreInfoType = null;
        }
        return AbstractC001800i.A0u(set, moreInfoType);
    }

    public static final boolean A00(UserSession userSession, C38321qM c38321qM) {
        if (!c38321qM.CdW() && !C18U.A06(C06090Tz.A05, userSession, 36326502677362603L)) {
            return false;
        }
        if (!c38321qM.A67() && !c38321qM.A5m()) {
            return true;
        }
        return C18U.A06(C06090Tz.A05, userSession, 36326502677428140L);
    }

    public static final boolean A01(UserSession userSession, String str) {
        String str2;
        int hashCode = str.hashCode();
        if (hashCode != -975990334) {
            if (hashCode != 339532540) {
                if (hashCode == 877420756) {
                    str2 = "feed_contextual_chain";
                } else {
                    return false;
                }
            } else {
                str2 = "feed_contextual_profile";
            }
            if (str.equals(str2)) {
                return C18U.A06(C06090Tz.A05, userSession, 36326502677297066L);
            }
            return false;
        }
        if (str.equals("feed_timeline")) {
            return true;
        }
        return false;
    }
}
