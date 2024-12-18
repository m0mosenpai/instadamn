package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* loaded from: classes9.dex */
public abstract class OOQ {
    public static final void A00(C22P c22p, UserSession userSession, String str) {
        C14360o3.A0B(str, 0);
        C448724r c448724r = AnonymousClass229.A01(userSession).A0F;
        InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
        if (A0M.isSampled()) {
            MSW.A1N(C81X.A2e, A0M);
            AbstractC166987dD.A1S(A0M, AbstractC50522MSa.A0i(A0M, c448724r, "IG_CAMERA_TAG_PEOPLE_TAP"));
            MSZ.A1B(EnumC114925Hg.CLIPS, A0M, "camera_destination");
            AbstractC50522MSa.A16(c22p, A0M, 2);
            AbstractC50523MSb.A0y(A0M, str);
            AbstractC167017dG.A1C(A0M);
        }
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, SearchContext searchContext, InterfaceC43589JPu interfaceC43589JPu, Long l, String str, long j) {
        C14360o3.A0B(searchContext, 7);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_clips_tagged_people_tap");
        if (A0f.isSampled()) {
            AbstractC37300Gc1.A0e(BQL.A1I, A0f);
            AbstractC25225BEi.A1M(EnumC120795dP.A0g, A0f);
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC25230BEn.A1C(A0f, j);
            AbstractC25225BEi.A1P(A0f, interfaceC43589JPu.CGJ());
            A0f.A9K(AbstractC43591JPw.A00(36), l);
            A0f.AAP("media_compound_key", c38321qM.getId());
            AbstractC25234BEr.A10(A0f, c38321qM);
            A0f.AAP("viewer_init_media_compound_key", str);
            A0f.AAP("search_session_id", searchContext.A05);
            A0f.AAP("rank_token", searchContext.A03);
            A0f.AAP("query_text", searchContext.A02);
            A0f.Cht();
        }
    }
}
