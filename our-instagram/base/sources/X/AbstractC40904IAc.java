package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IAc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40904IAc {
    public static final boolean A00(UserSession userSession, EnumC39595He5 enumC39595He5) {
        C14360o3.A0B(userSession, 0);
        int ordinal = enumC39595He5.ordinal();
        InterfaceC19630xq A03 = C1AT.A01(userSession).A03(C1AV.A0J);
        switch (ordinal) {
            case 0:
            case 5:
                boolean A1O = AbstractC167007dF.A1O(((System.currentTimeMillis() - AbstractC31175DnJ.A03(A03, enumC39595He5.A01)) > 86400000L ? 1 : ((System.currentTimeMillis() - AbstractC31175DnJ.A03(A03, enumC39595He5.A01)) == 86400000L ? 0 : -1)));
                boolean z = false;
                if (A03.getInt(enumC39595He5.A02, 0) < enumC39595He5.A00) {
                    z = true;
                }
                if (A1O && z) {
                    return true;
                }
                return false;
            default:
                if (A03.getInt(enumC39595He5.A02, 0) < enumC39595He5.A00) {
                    return true;
                }
                return false;
        }
    }
}
