package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CTV {
    public final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, long j) {
        AbstractC167017dG.A1O(userSession, str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_clips_likers_impression");
        if (A0f.isSampled()) {
            A0f.A8R(BQL.A0n, "action");
            AbstractC25225BEi.A1M(EnumC120795dP.A0U, A0f);
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            A0f.AAP("media_compound_key", str);
            AbstractC25230BEn.A1C(A0f, j);
            AbstractC25225BEi.A1P(A0f, "");
            A0f.Cht();
        }
    }
}
