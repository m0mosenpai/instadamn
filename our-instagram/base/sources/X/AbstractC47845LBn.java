package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.LBn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47845LBn {
    public static final KCW A01(UserSession userSession, MRR mrr, EnumC46186KcO enumC46186KcO, String str, List list, boolean z) {
        return A00(userSession, mrr, enumC46186KcO, null, str, "gifs", list, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, z, true);
    }

    public static final KCW A00(UserSession userSession, MRR mrr, EnumC46186KcO enumC46186KcO, DirectThreadKey directThreadKey, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        KCW kcw = new KCW();
        AbstractC25227BEk.A1C(kcw, new C09530e4[]{AbstractC166987dD.A1L("param_extra_initial_search_term", str), AbstractC166987dD.A1L("param_extra_initial_tab", str2), AbstractC166987dD.A1L("param_extra_entry_point", Integer.valueOf(enumC46186KcO.ordinal())), AbstractC166987dD.A1L("param_extra_show_like_button", Boolean.valueOf(z)), AbstractC166987dD.A1L("param_extra_is_broadcast_thread", Boolean.valueOf(z2)), AbstractC166987dD.A1L("param_extra_gif_enabled", Boolean.valueOf(z3)), AbstractC166987dD.A1L("param_extra_sticker_enabled", Boolean.valueOf(z4)), AbstractC166987dD.A1L("param_extra_is_poll_creation_enabled", Boolean.valueOf(z5)), AbstractC166987dD.A1L("param_extra_avatar_enabled", Boolean.valueOf(z6)), AbstractC166987dD.A1L("param_extra_ai_sticker_enabled", Boolean.valueOf(z7)), AbstractC166987dD.A1L("param_extra_imagine_enabled", Boolean.valueOf(z8)), AbstractC166987dD.A1L("param_extra_saved_sticker_enabled", Boolean.valueOf(z9)), AbstractC166987dD.A1L("param_extra_sticker_packs_enabled", Boolean.valueOf(z10)), AbstractC166987dD.A1L("param_extra_is_location_sticker_enabled", Boolean.valueOf(z11)), AbstractC166987dD.A1L("param_extra_is_add_yours_sticker_enabled", Boolean.valueOf(z12)), AbstractC166987dD.A1L("param_extra_is_cutout_sticker_enabled", Boolean.valueOf(z13)), AbstractC166987dD.A1L("param_extra_is_music_sticker_enabled", Boolean.valueOf(z14)), AbstractC166987dD.A1L("param_extra_is_msys_thread", Boolean.valueOf(z15)), AbstractC166987dD.A1L("param_extra_should_hide_drag_handler", Boolean.valueOf(z16)), AbstractC166987dD.A1L("param_extra_should_hide_tab_container", Boolean.valueOf(z17)), AbstractC166987dD.A1L("param_extra_social_stickers_user_ids", AbstractC166987dD.A1F(list)), AbstractC166987dD.A1L("param_extra_direct_thread_key", directThreadKey), AbstractC166987dD.A1L("param_extra_bottom_sheet_session_id", AbstractC166997dE.A0n()), AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.token), AbstractC166987dD.A1L("param_extra_use_initial_search_term_if_no_query", false), AbstractC166987dD.A1L("param_extra_hide_initial_search_term", false)});
        kcw.A02 = mrr;
        return kcw;
    }
}
