package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Orv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55906Orv implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "RtcAvatarLoggerImpl";
    public RtcCallKey A00;
    public final C54823OLg A01;
    public final C54963OSt A02;
    public final C18920wW A03;
    public final C1EL A04;
    public final EnumC53137Neq A05;

    public static final void A00(C55906Orv c55906Orv, Integer num, Integer num2, String str, String str2) {
        String str3;
        EnumC53137Neq enumC53137Neq;
        String str4 = null;
        C54823OLg c54823OLg = c55906Orv.A01;
        if (!c54823OLg.A01() && ((enumC53137Neq = c55906Orv.A05) == EnumC53137Neq.A04 || enumC53137Neq == EnumC53137Neq.A02)) {
            return;
        }
        boolean A01 = c54823OLg.A01();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c55906Orv.A03, "rtc_avatar_call_action");
        A0f.AAP("action_source", AbstractC54154Nwq.A00(num2));
        switch (num.intValue()) {
            case 0:
                str3 = "enable_avatar_mode_did_tap";
                break;
            case 1:
                str3 = "disable_avatar_mode_did_tap";
                break;
            case 2:
                str3 = "avatar_effect_did_apply";
                break;
            case 3:
                str3 = "avatar_effect_did_fail_to_apply";
                break;
            case 4:
                str3 = "avatar_creation_nux_did_show";
                break;
            case 5:
                str3 = "avatar_creation_nux_did_tap";
                break;
            case 6:
                str3 = "call_end_avatar_promo_impression";
                break;
            case 7:
                str3 = "call_end_avatar_promo_button_tapped";
                break;
            case 8:
                str3 = "avatar_in_call_personalised_promo_shown";
                break;
            case 9:
                str3 = "avatar_in_call_custom_promo_shown";
                break;
            case 10:
                str3 = "avatar_in_call_personalised_promo_tapped";
                break;
            case 11:
                str3 = "avatar_in_call_custom_promo_tapped";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str3 = "avatar_in_call_discovery_promo_shown";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str3 = "avatar_in_call_discovery_promo_tapped";
                break;
            case 14:
                str3 = "avatar_in_call_app_upgrade_upsell_shown";
                break;
            case Process.SIGTERM /* 15 */:
                str3 = "avatar_in_call_app_upgrade_upsell_dismissed";
                break;
            case 16:
                str3 = "avatar_is_generating_notification_did_show";
                break;
            case 17:
                str3 = "avatar_loading_notification_did_show";
                break;
            default:
                str3 = "avatar_loading_error_notification_did_show";
                break;
        }
        A0f.AAP(AbstractC111324zv.A00(164), str3);
        A0f.A9K("steady_time", Long.valueOf(c55906Orv.A04.now()));
        if (A01) {
            str = "1004";
        }
        A0f.AAP("effect_id", str);
        if (A01) {
            str2 = null;
        }
        A0f.AAP(AbstractC111324zv.A00(4354), str2);
        A0f.AAP("emote_id", null);
        A0f.AAP("emote_name", null);
        RtcCallKey rtcCallKey = c55906Orv.A00;
        if (rtcCallKey != null) {
            str4 = rtcCallKey.A00;
        }
        A0f.AAP("server_info_data", str4);
        A0f.AAP(AbstractC111324zv.A00(1963), null);
        A0f.Cht();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "rtc_avatar";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1EL] */
    public /* synthetic */ C55906Orv(UserSession userSession, EnumC53137Neq enumC53137Neq, RtcCallKey rtcCallKey) {
        C54963OSt c54963OSt = new C54963OSt(C006802i.A0p);
        C54823OLg c54823OLg = new C54823OLg(userSession);
        this.A00 = rtcCallKey;
        this.A05 = enumC53137Neq;
        this.A02 = c54963OSt;
        this.A01 = c54823OLg;
        this.A03 = AbstractC12220kQ.A01(this, userSession);
        this.A04 = new Object();
    }
}
