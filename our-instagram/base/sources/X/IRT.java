package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class IRT {
    public static final void A00(EnumC39652Hih enumC39652Hih, C8JW c8jw, UserSession userSession, Long l, String str, String str2, String str3, long j) {
        AbstractC167017dG.A1N(userSession, str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_music_on_profile_tap");
        if (A0f.isSampled()) {
            AbstractC37303Gc4.A0n(A0f, str, j);
            AbstractC25225BEi.A1M(enumC39652Hih, A0f);
            AbstractC25225BEi.A1N(A0f, str2);
            A0f.A8R(c8jw, "pivot_page_entry_point");
            A0f.AAP("pivot_page_session_id", str3);
            A0f.A9K("best_audio_cluster_id", l);
            AbstractC37300Gc1.A0p(A0f, AbstractC166997dE.A0n());
            A0f.Cht();
        }
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, Long l2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_audio_unavailable_impression");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            long j = 0;
            AbstractC25230BEn.A1B(A0f, AbstractC25232BEp.A0t(l));
            if (l2 != null) {
                j = l2.longValue();
            }
            A0f.A9K("target_id", Long.valueOf(j));
            A0f.Cht();
        }
    }
}
