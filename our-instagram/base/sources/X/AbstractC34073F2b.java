package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.F2b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34073F2b {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, Map map) {
        String str5 = userSession.userId;
        C14360o3.A0B(str5, 0);
        long A03 = AbstractC167027dH.A03(str5);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_nme_benefits");
        if (A0f.isSampled()) {
            A0f.AAP("event_type", str2);
            A0f.AAP("benefit_type", "BRANDED_THREADS");
            A0f.AAP("subject_type", "subscriber");
            AbstractC31178DnM.A1B(A0f, str3, A03);
            AbstractC31171DnF.A1E(A0f, str);
            A0f.A9M("extra", map);
            A0f.AAP("entrypoint", str4);
            A0f.Cht();
        }
    }
}
