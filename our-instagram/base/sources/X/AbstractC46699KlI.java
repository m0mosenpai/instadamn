package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KlI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46699KlI {
    public static final void A00(EnumC39652Hih enumC39652Hih, C8JW c8jw, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1O(userSession, c8jw);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_audio_tap");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            A0f.AAP("media_compound_key", "");
            A0f.A8R(enumC39652Hih, "action_source");
            Long A0d = AbstractC167007dF.A0d();
            A0f.A9K("target_id", A0d);
            A0f.AAP("media_tap_token", "");
            A0f.A9K("media_index", A0d);
            A0f.AAP(MSV.A00(125), null);
            A0f.AAP(AbstractC111324zv.A00(125), "");
            AbstractC25233BEq.A17(A0f, "ranking_info_token", "");
            A0f.A8R(c8jw, "pivot_page_entry_point");
            A0f.AAP(AbstractC111324zv.A00(358), AbstractC25041Ki.A00);
            A0f.Cht();
        }
    }
}
