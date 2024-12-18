package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Map;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.1Mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25531Mh extends AbstractC02600Aj implements C0Ah, InterfaceC02570Af {
    public final int A00;

    public final void A0T() {
        A0W(2);
    }

    public C25531Mh(InterfaceC02590Ai interfaceC02590Ai, int i) {
        this.A00 = i;
        super.A00 = interfaceC02590Ai;
    }

    public static C25531Mh A00(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "client_execute_autofillappjob_atomic"), 37);
    }

    public static C25531Mh A01(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "commerce_feed_click"), 128);
    }

    public static C25531Mh A02(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "commerce_feed_impression"), 129);
    }

    public final /* bridge */ /* synthetic */ void A0U() {
        A0M(EnumC50631MWs.A0I, "surface");
    }

    public final void A0V(int i) {
        super.A00.A8p("camera_position", Integer.valueOf(i));
    }

    public final /* bridge */ /* synthetic */ void A0X(int i) {
        if (i != Integer.MIN_VALUE) {
            super.A00.A8p("action_type", Integer.valueOf(i));
        } else {
            A0R("action_type", null);
        }
    }

    public final /* bridge */ /* synthetic */ void A0a(EnumC114925Hg enumC114925Hg) {
        A0M(enumC114925Hg, "camera_destination");
    }

    public final /* bridge */ /* synthetic */ void A0g(Long l) {
        A0Q("actor_id", l);
    }

    public final /* bridge */ /* synthetic */ void A0h(Long l) {
        A0Q("consistent_thread_fbid", l);
    }

    public final void A0j(String str) {
        A0R("action", str);
    }

    public final /* bridge */ /* synthetic */ void A0u(String str) {
        A0R(AbstractC50531MSk.A02(32, 10, 12), str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AbstractC02600Aj, X.C0Ah
    public final void Cht() {
        String str;
        String str2;
        String A00;
        String str3;
        switch (this.A00) {
            case 9:
            case 10:
            case 150:
            case 164:
            case 165:
            case 278:
            case 302:
            case 305:
            case 306:
            case 308:
            case 309:
            case 340:
                str = AbstractC25041Ki.A00;
                str2 = "canonical_nav_chain";
                A0R(str2, str);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
            case 44:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 47:
            case 48:
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case HucClient.BODY_UPLOAD_TIMEOUT_SECONDS /* 120 */:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 389:
            case 390:
            case 391:
            case 392:
            case 393:
            case 394:
            case 395:
            case 396:
            case 397:
            case 398:
            case ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI /* 400 */:
            case 401:
            case 402:
            case 404:
            case 405:
            case 406:
            case 407:
            case 408:
            case 409:
            case 410:
            case 411:
            case 412:
            case 413:
                A0R(AbstractC50531MSk.A02(32, 10, 12), C2O0.A00);
                A0R("product_type", AbstractC49212Oa.A00);
                A0R("platform", "android");
                A0Q("actual_event_time", Long.valueOf(System.currentTimeMillis()));
                break;
            case 149:
                A00 = C72Z.A00();
                str3 = "canonical_attributed_notifications";
                A0R(str3, A00);
                str = AbstractC25041Ki.A00;
                str2 = "canonical_nav_chain";
                A0R(str2, str);
                break;
            case 153:
            case 299:
                A0R("canonical_nav_chain", AbstractC25041Ki.A00);
                A0R("device_aspect_ratio_category", AbstractC82663mU.A00);
                A0R("device_fold_orientation", AbstractC82673mV.A00);
                A0R("device_fold_state", AbstractC82683mW.A00);
                A0O("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                break;
            case 178:
                A0R("canonical_nav_chain", AbstractC25041Ki.A00);
                str = AbstractC123905j4.A00;
                str2 = "canonical_correlation_id";
                A0R(str2, str);
                break;
            case 199:
            case 202:
            case 205:
            case 206:
                A0R("device_fold_orientation", AbstractC82673mV.A00);
                A0R("device_fold_state", AbstractC82683mW.A00);
                A0O("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                str = AbstractC82663mU.A00;
                str2 = "device_aspect_ratio_category";
                A0R(str2, str);
                break;
            case 204:
                A0R("device_aspect_ratio_category", AbstractC82663mU.A00);
                A0R("device_fold_orientation", AbstractC82673mV.A00);
                A0R("device_fold_state", AbstractC82683mW.A00);
                A0O("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                break;
            case 225:
                A00 = AbstractC123905j4.A00;
                str3 = "canonical_correlation_id";
                A0R(str3, A00);
                str = AbstractC25041Ki.A00;
                str2 = "canonical_nav_chain";
                A0R(str2, str);
                break;
            case 341:
                str = AbstractC123905j4.A00;
                str2 = "canonical_correlation_id";
                A0R(str2, str);
                break;
        }
        super.Cht();
    }

    public static C25531Mh A03(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "direct_prompts"), 148);
    }

    public static C25531Mh A04(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "direct_thread_generic_template_click"), 151);
    }

    public static C25531Mh A05(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "direct_thread_link_tap"), 152);
    }

    public static C25531Mh A06(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "iab_autofill_interaction"), AbstractC62862SUj.MAX_FACTORIAL);
    }

    public static C25531Mh A07(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_camera_draft"), 200);
    }

    public static C25531Mh A08(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_camera_entity_tap"), 201);
    }

    public static C25531Mh A09(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_camera_share_media"), 204);
    }

    public static C25531Mh A0A(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_apply"), 207);
    }

    public static C25531Mh A0B(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_remove"), 208);
    }

    public static C25531Mh A0C(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_story_entity_tap"), 242);
    }

    public static C25531Mh A0D(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_visible_load"), 278);
    }

    public static C25531Mh A0E(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "igd_broadcast_chats_actions"), 279);
    }

    public static C25531Mh A0F(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "igd_public_chats_actions"), 281);
    }

    public static C25531Mh A0G(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_inform_module_button_click"), 294);
    }

    public static C25531Mh A0H(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_inform_module_see_results_click"), 296);
    }

    public static C25531Mh A0I(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_organic_interact"), 305);
    }

    public static C25531Mh A0J(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "messaging_ai_agent_interactions"), 342);
    }

    public static C25531Mh A0K(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "messaging_notification_event"), 343);
    }

    public static C25531Mh A0L(InterfaceC02550Ad interfaceC02550Ad) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        return new C25531Mh(c18920wW.A00(c18920wW.A00, "privacy_flow_trigger_event"), 359);
    }

    public final void A0W(int i) {
        super.A00.A8p("event_type", Integer.valueOf(i));
    }

    public final /* bridge */ /* synthetic */ void A0Y(int i) {
        if (i != Integer.MIN_VALUE) {
            super.A00.A8p("screen_type", Integer.valueOf(i));
        } else {
            A0R("screen_type", null);
        }
    }

    public final /* bridge */ /* synthetic */ void A0Z(int i) {
        super.A00.A8p("view_name", Integer.valueOf(i));
    }

    public final /* bridge */ /* synthetic */ void A0b(C22P c22p) {
        A0M(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public final void A0c(AnonymousClass249 anonymousClass249) {
        A0M(anonymousClass249, "media_type");
    }

    public final /* bridge */ /* synthetic */ void A0d(C4SX c4sx) {
        super.A00.AAK(c4sx, "merchant_id");
    }

    public final /* bridge */ /* synthetic */ void A0e(Integer num) {
        super.A00.A8p("media_index", num);
    }

    public final /* bridge */ /* synthetic */ void A0f(Integer num) {
        super.A00.A8p("total_num_candidates", num);
    }

    public final /* bridge */ /* synthetic */ void A0i(Long l) {
        A0Q("persona_id", l);
    }

    public final void A0k(String str) {
        A0R("event", str);
    }

    public final void A0l(String str) {
        A0R("m_pk", str);
    }

    public final void A0m(String str) {
        A0R("module", str);
    }

    public final void A0n(String str) {
        A0R("parent_surface", str);
    }

    public final void A0o(String str) {
        A0R(CacheBehaviorLogger.SOURCE, str);
    }

    public final void A0p(String str) {
        A0R("surface", str);
    }

    public final /* bridge */ /* synthetic */ void A0q(String str) {
        A0R("entity", str);
    }

    public final /* bridge */ /* synthetic */ void A0r(String str) {
        A0R("ig_thread_id", str);
    }

    public final /* bridge */ /* synthetic */ void A0s(String str) {
        A0R("legacy_falco_event_name", str);
    }

    public final /* bridge */ /* synthetic */ void A0t(String str) {
        A0R("nav_chain", str);
    }

    public final /* bridge */ /* synthetic */ void A0v(Map map) {
        super.A00.A9M("extra", map);
    }

    public final /* bridge */ /* synthetic */ void A0w(Map map) {
        super.A00.A9M("extra_data", map);
    }

    public final /* bridge */ /* synthetic */ void A0x(Map map) {
        super.A00.A9M("product_merchant_ids", map);
    }
}
