package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.F1s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34065F1s {
    public static final void A00(UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, HashMap hashMap, int i) {
        String str7;
        C14360o3.A0B(userSession, 0);
        String str8 = userSession.userId;
        C14360o3.A0B(str8, 0);
        long A03 = AbstractC31178DnM.A03(AbstractC003100w.A0k(10, str8));
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "creator_broadcast_chat";
        C25531Mh A0E = C25531Mh.A0E(c12210kP.A00());
        if (AbstractC25226BEj.A1Z(A0E)) {
            AbstractC31180DnO.A1M(A0E, str3, str4, A03);
            A0E.A0o(str5);
            A0E.A0p(str6);
            if (i != 1) {
                if (i != 2) {
                    str7 = "instagram";
                } else {
                    str7 = "subscriber_broadcast";
                }
            } else {
                str7 = "broadcast";
            }
            A0E.A0n(str7);
            A0E.A0r(str);
            AbstractC31175DnJ.A1C(A0E, AbstractC31177DnL.A0Z(str2), hashMap);
        }
    }
}
