package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sfj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63231Sfj {
    public static final LinkedHashMap A00(C62620SJd c62620SJd, C43031yW c43031yW) {
        boolean A1U;
        boolean A1U2;
        boolean A1U3;
        boolean A1U4;
        boolean A1U5;
        boolean A1U6;
        String A0B;
        C14360o3.A0B(c43031yW, 1);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        C09530e4[] c09530e4Arr = new C09530e4[46];
        UserSession userSession = c43031yW.A00;
        C06090Tz c06090Tz = C06090Tz.A06;
        C09530e4 A1L = AbstractC166987dD.A1L("show_update_prompt_on_contact_edit", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800415746626L)));
        String valueOf = String.valueOf(false);
        C09530e4 A1L2 = AbstractC166987dD.A1L("enable_fix_contact_data_fetch", valueOf);
        C09530e4 A1L3 = AbstractC166987dD.A1L("use_logger_v2", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800417974879L)));
        String A04 = C18U.A04(c06090Tz, userSession, 36873376572309516L);
        C14360o3.A0A(A04);
        C09530e4 A1L4 = AbstractC166987dD.A1L("payment_autofill_regex_versions_used", A04);
        C09530e4 A1L5 = AbstractC166987dD.A1L("enable_automatic_contact_update", String.valueOf(c43031yW.A01()));
        C09530e4 A1L6 = AbstractC166987dD.A1L("enable_autofill_perf_qpl_logging", String.valueOf(c43031yW.A09(false)));
        C06090Tz c06090Tz2 = C06090Tz.A05;
        if (C18U.A06(c06090Tz2, userSession, 36322800418040416L)) {
            A1U = false;
        } else {
            A1U = AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800417122898L);
        }
        C09530e4 A1L7 = AbstractC166987dD.A1L("enable_autofill_perf_js_ping_logging", String.valueOf(A1U));
        C09530e4 A1L8 = AbstractC166987dD.A1L("enable_autofill_usage_contact_bloks", String.valueOf(c43031yW.A0E(false)));
        C09530e4 A1L9 = AbstractC166987dD.A1L("enable_autofill_save_contact_bloks", String.valueOf(c43031yW.A0D(false)));
        if (C18U.A06(c06090Tz2, userSession, 36322800417647194L)) {
            A1U2 = false;
        } else {
            A1U2 = AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800416401994L);
        }
        C09530e4 A1L10 = AbstractC166987dD.A1L("enable_autofill_update_contact_bloks", String.valueOf(A1U2));
        C09530e4 A1L11 = AbstractC166987dD.A1L("enable_autofill_save_payment_bloks", String.valueOf(c43031yW.A0F(false)));
        C09530e4 A1L12 = AbstractC166987dD.A1L("enable_autofill_usage_payment_bloks", String.valueOf(c43031yW.A0G(false)));
        C09530e4 A1L13 = AbstractC166987dD.A1L("prefetch_bloks_payment_save_on_app_start", String.valueOf(c43031yW.A05()));
        C09530e4 A1L14 = AbstractC166987dD.A1L("prefetch_bloks_payment_usage_on_app_start", String.valueOf(c43031yW.A06()));
        C09530e4 A1L15 = AbstractC166987dD.A1L("prefetch_bloks_contact_update_on_app_start", String.valueOf(c43031yW.A03()));
        C09530e4 A1L16 = AbstractC166987dD.A1L("prefetch_bloks_contact_save_on_app_start", String.valueOf(c43031yW.A02()));
        C09530e4 A1L17 = AbstractC166987dD.A1L("enable_consolidated_autofill", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800417057361L)));
        C09530e4 A1L18 = AbstractC166987dD.A1L("is_multi_pills_contact_soft_keyboard_variant", valueOf);
        C09530e4 A1L19 = AbstractC166987dD.A1L("is_single_pill_contact_soft_keyboard_variant", valueOf);
        C09530e4 A1L20 = AbstractC166987dD.A1L("show_contact_soft_keyboard", valueOf);
        C09530e4 A1L21 = AbstractC166987dD.A1L("show_single_entry_contact_soft_keyboard", valueOf);
        C09530e4 A1L22 = AbstractC166987dD.A1L("show_multiple_entries_Enabled", valueOf);
        C09530e4 A1L23 = AbstractC166987dD.A1L("disable_unbound_cards_usage", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36310426619412581L)));
        C09530e4 A1L24 = AbstractC166987dD.A1L("autofill_visible_fields_only", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800419809911L)));
        if (AbstractC58319PtB.A1S(c06090Tz2, userSession)) {
            A1U3 = false;
        } else {
            A1U3 = AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800420596349L);
        }
        C09530e4 A1L25 = AbstractC166987dD.A1L("suppress_contact_nux_enabled", String.valueOf(A1U3));
        if (AbstractC58319PtB.A1S(c06090Tz2, userSession)) {
            A1U4 = false;
        } else {
            A1U4 = AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800420727423L);
        }
        C09530e4 A1L26 = AbstractC166987dD.A1L("suppress_payment_nux_enabled", String.valueOf(A1U4));
        if (AbstractC58319PtB.A1S(c06090Tz2, userSession)) {
            A1U5 = false;
        } else {
            A1U5 = AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800420924034L);
        }
        System.arraycopy(new C09530e4[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, A1L22, A1L23, A1L24, A1L25, A1L26, AbstractC166987dD.A1L("suppress_automatic_update_enabled", String.valueOf(A1U5))}, 0, c09530e4Arr, 0, 27);
        if (AbstractC58319PtB.A1S(c06090Tz2, userSession)) {
            A1U6 = false;
        } else {
            A1U6 = AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800420661886L);
        }
        C09530e4 A1L27 = AbstractC166987dD.A1L("suppress_all_nux_enabled", String.valueOf(A1U6));
        C09530e4 A1L28 = AbstractC166987dD.A1L("enable_hide_ads_consent_contact_nux", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800420989571L)));
        C09530e4 A1L29 = AbstractC166987dD.A1L("enable_hide_ads_consent_payments_nux", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800420858497L)));
        C09530e4 A1L30 = AbstractC166987dD.A1L("enable_hide_ads_consent_contact_payments_nux", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800420792960L)));
        C09530e4 A1L31 = AbstractC166987dD.A1L("enable_nux_personalization_contact", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800421382793L)));
        C09530e4 A1L32 = AbstractC166987dD.A1L("enable_nux_personalization_payment", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800421251719L)));
        C09530e4 A1L33 = AbstractC166987dD.A1L("enable_nux_personalization_contact_and_payment", String.valueOf(c43031yW.A0B(false)));
        C09530e4 A1L34 = AbstractC166987dD.A1L("payment_soft_keyboard_variant", AbstractC58320PtC.A0y(c06090Tz, userSession));
        String A042 = C18U.A04(c06090Tz, userSession, 36885750375187126L);
        C14360o3.A0A(A042);
        C09530e4 A1L35 = AbstractC166987dD.A1L("contact_autofill_wallet_stored_data_variant", A042);
        C09530e4 A1L36 = AbstractC166987dD.A1L("remove_hybrid_save_enabled", String.valueOf(c43031yW.A0C(false)));
        C09530e4 A1L37 = AbstractC166987dD.A1L("payment_disclosure_updated_style_enabled", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800422103697L)));
        String A043 = C18U.A04(c06090Tz, userSession, 36885750369682089L);
        C14360o3.A0A(A043);
        System.arraycopy(new C09530e4[]{A1L27, A1L28, A1L29, A1L30, A1L31, A1L32, A1L33, A1L34, A1L35, A1L36, A1L37, AbstractC166987dD.A1L("split_hybrid_prompt_variant", A043), AbstractC166987dD.A1L("enable_contact_autofill_android_framework", String.valueOf(c43031yW.A07(false))), AbstractC166987dD.A1L("use_local_autofill_cvv_verification", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800416926288L))), AbstractC166987dD.A1L("show_lightweight_disclosure", valueOf), AbstractC166987dD.A1L("enable_contact_automatic_autofill", String.valueOf(c43031yW.A0A(false))), AbstractC166987dD.A1L("lightweight_disclosure_bottomsheet_target_list", NetInfoModule.CONNECTION_TYPE_NONE), AbstractC166987dD.A1L("expand_save_to_all_navigations", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800422431382L))), AbstractC166987dD.A1L("expand_save_to_js_form_submission", String.valueOf(AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800422496919L)))}, 0, c09530e4Arr, 27, 19);
        A1I.putAll(AbstractC06930Yk.A06(c09530e4Arr));
        C51756Mtf c51756Mtf = c62620SJd.A0G;
        C14360o3.A0B(c51756Mtf, 0);
        Map map = (Map) c51756Mtf.A00;
        if (MSW.A1b(map) && (A0B = new Gson().A0B(map)) != null) {
            A1I.put("autofill_qrt", A0B);
        }
        return A1I;
    }

    public static final boolean A03(C43031yW c43031yW, boolean z) {
        C06090Tz c06090Tz;
        UserSession userSession = c43031yW.A00;
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        String A04 = C18U.A04(c06090Tz, userSession, 36885750369682089L);
        C14360o3.A0A(A04);
        return AbstractC167007dF.A0h(AbstractC25228BEl.A1A(A04)).equals("pure_payment");
    }

    public static final boolean A01(C62620SJd c62620SJd, C43031yW c43031yW, boolean z) {
        C06090Tz c06090Tz;
        AbstractC167017dG.A1N(c62620SJd, c43031yW);
        UserSession userSession = c43031yW.A00;
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        if (AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800421382793L) || c43031yW.A0B(z)) {
            List<C50627MWo> list = (List) c62620SJd.A0F.A00;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (C50627MWo c50627MWo : list) {
                if (c50627MWo.A00 == C05F.A01 && c50627MWo.A01 == C05F.A0Y) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean A02(C62620SJd c62620SJd, C43031yW c43031yW, boolean z) {
        C06090Tz c06090Tz;
        AbstractC167017dG.A1N(c62620SJd, c43031yW);
        UserSession userSession = c43031yW.A00;
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        if (AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800421251719L) || c43031yW.A0B(z)) {
            List<C50627MWo> list = (List) c62620SJd.A0F.A00;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (C50627MWo c50627MWo : list) {
                if (c50627MWo.A00 == C05F.A00 && c50627MWo.A01 == C05F.A01) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
