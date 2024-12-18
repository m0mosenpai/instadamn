package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes9.dex */
public final class OXR {
    public final EnumC50628MWp A00;
    public final C18920wW A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, EnumC50628MWp enumC50628MWp, Integer num) {
        String str;
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC50628MWp.A00);
        switch (num.intValue()) {
            case 0:
                str = "post_share_sheet";
                break;
            case 1:
                str = "reels_share_sheet";
                break;
            case 2:
                str = "schedule_picker";
                break;
            case 3:
                str = "draft_overflow";
                break;
            case 4:
                str = "view_all_scheduled_content";
                break;
            case 5:
                str = "view_single_scheduled_content";
                break;
            case 6:
                str = "remove_facebook_sharing_info";
                break;
            case 7:
                str = "remove_barcelona_sharing_info";
                break;
            case 8:
                str = "remove_draft_fundraiser";
                break;
            case 9:
                str = "remove_shopping_metadata";
                break;
            case 10:
                str = "remove_upcoming_event";
                break;
            case 11:
                str = "remove_selected_users";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str = "remove_branded_content";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = "remove_custom_audience";
                break;
            case 14:
                str = "remove_other";
                break;
            case Process.SIGTERM /* 15 */:
                str = "blocked_facebook_sharing_info";
                break;
            case 16:
                str = "blocked_close_friends";
                break;
            case 17:
                str = "blocked_exclusive_content";
                break;
            case 18:
                str = "blocked_trials";
                break;
            case Process.SIGSTOP /* 19 */:
                str = "blocked_custom_audience";
                break;
            case 20:
                str = "blocked_upcoming_events";
                break;
            case 21:
                str = "blocked_audio_translations";
                break;
            case 22:
                str = "blocked_gen_ai_attribution_sticker";
                break;
            case 23:
                str = "blocked_poll";
                break;
            default:
                str = "cancel_scheduling";
                break;
        }
        interfaceC02590Ai.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
    }

    public final void A01(EnumC50628MWp enumC50628MWp) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "content_scheduling_finish_step");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1G(A0f, enumC50628MWp.A00);
            AbstractC31171DnF.A1A(A0f, "schedule_picker");
            A0f.Cht();
        }
    }

    public final void A02(EnumC50628MWp enumC50628MWp) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "content_scheduling_start_step");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1G(A0f, enumC50628MWp.A00);
            AbstractC31171DnF.A1A(A0f, "schedule_picker");
            A0f.Cht();
        }
    }

    public final void A03(EnumC50628MWp enumC50628MWp) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "content_scheduling_tap_component");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1G(A0f, enumC50628MWp.A00);
            AbstractC31171DnF.A1A(A0f, "schedule_picker");
            A0f.AAP("component", "done");
            A0f.Cht();
        }
    }

    public final void A04(EnumC50628MWp enumC50628MWp, Integer num) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "content_scheduling_view_component");
        if (A0f.isSampled()) {
            A00(A0f, enumC50628MWp, num);
            A0f.AAP("component", "unsupported_features_alert");
            A0f.Cht();
        }
    }

    public final void A05(Integer num) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "content_scheduling_finish_step");
        if (A0f.isSampled()) {
            A00(A0f, this.A00, num);
            A0f.Cht();
        }
    }

    public final void A06(Integer num) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "content_scheduling_start_step");
        if (A0f.isSampled()) {
            A00(A0f, this.A00, num);
            A0f.Cht();
        }
    }

    public final void A07(Integer num) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "content_scheduling_view_component");
        if (A0f.isSampled()) {
            A00(A0f, this.A00, num);
            A0f.AAP("component", "schedule");
            A0f.Cht();
        }
    }

    public final void A08(Integer num, Integer num2) {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "content_scheduling_tap_component");
        if (A0f.isSampled()) {
            A00(A0f, this.A00, num);
            switch (num2.intValue()) {
                case 0:
                    str = "done";
                    break;
                case 1:
                    str = "schedule";
                    break;
                case 2:
                    str = "single_media";
                    break;
                case 3:
                    str = AbstractC111324zv.A00(3239);
                    break;
                default:
                    str = "unsupported_features_alert";
                    break;
            }
            A0f.AAP("component", str);
            A0f.Cht();
        }
    }

    public OXR(EnumC50628MWp enumC50628MWp, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1R(userSession, interfaceC11380iw);
        this.A00 = enumC50628MWp;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
