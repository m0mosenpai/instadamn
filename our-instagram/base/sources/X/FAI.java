package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class FAI {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, Map map) {
        long j;
        Long A0j;
        if (str5 != null && (A0j = AbstractC166997dE.A0j(str5)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_nme_benefits");
        if (A0f.isSampled()) {
            A0f.AAP("event_type", str);
            A0f.AAP("benefit_type", "BIZ_MULTIPLE_ADDRESSES");
            A0f.AAP("subject_type", str3);
            AbstractC31178DnM.A1B(A0f, str2, j);
            AbstractC31171DnF.A1E(A0f, str4);
            AbstractC31174DnI.A1F(A0f, map);
        }
    }
}
