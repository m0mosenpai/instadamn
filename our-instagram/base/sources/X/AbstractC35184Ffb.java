package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ffb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35184Ffb {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C1M1 c1m1, String str, String str2, int i, boolean z) {
        AbstractC25234BEr.A0j(2, interfaceC60442pS, userSession, c38321qM, c75113Zb);
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        AbstractC41756IeX.A04(userSession, c38321qM, interfaceC60442pS, str2, i);
        C33172EkJ c33172EkJ = new C33172EkJ(A00, 6);
        if (!A03(userSession) && !A02(userSession)) {
            FB6.A00().A01(fragmentActivity, userSession, c38321qM, interfaceC60442pS, c75113Zb, c33172EkJ, c1m1, str, str2, i);
        } else {
            FB6.A00().A06(fragmentActivity, userSession, c38321qM, interfaceC60442pS, c75113Zb, c33172EkJ, i, z);
        }
        A00.A05(new C42240InQ(true));
    }

    public static final boolean A01(UserSession userSession) {
        if (!A02(userSession)) {
            Boolean BCS = AbstractC31174DnI.A0m(userSession).BCS();
            boolean z = AbstractC166987dD.A0x(userSession).getBoolean("has_private_collections", false);
            if (BCS != null) {
                if (!C14360o3.A0K(Boolean.valueOf(z), BCS)) {
                    C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                    AbstractC31177DnL.A1N(A00.A01, "has_private_collections", BCS.booleanValue());
                }
                z = BCS.booleanValue();
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        Boolean BBM = AbstractC31174DnI.A0m(userSession).BBM();
        boolean z = AbstractC166987dD.A0x(userSession).getBoolean("has_collab_collections", false);
        if (BBM != null) {
            if (!C14360o3.A0K(Boolean.valueOf(z), BBM)) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                AbstractC31177DnL.A1N(A00.A01, "has_collab_collections", BBM.booleanValue());
            }
            return BBM.booleanValue();
        }
        return z;
    }

    public static final boolean A03(UserSession userSession) {
        boolean A01 = A01(userSession);
        int i = 3;
        if (A01) {
            i = 1;
        }
        if (AbstractC2056298m.A00(userSession).A00.getInt("direct_collab_collection_feed_creation_nux_impression_count", 0) >= i && !A01) {
            return false;
        }
        return true;
    }
}
