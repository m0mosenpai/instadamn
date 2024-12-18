package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class LL0 {
    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num) {
        C14360o3.A0B(userSession, 0);
        A05(interfaceC11380iw, userSession, num, null);
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, Integer num2, Integer num3) {
        C14360o3.A0B(userSession, 0);
        A03(interfaceC11380iw, userSession, num, num2, num3, null, null, null, null, null);
    }

    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, Integer num2, Integer num3, String str, String str2, String str3, Throwable th, Map map) {
        String str4;
        String str5;
        String str6;
        String str7;
        AbstractC167007dF.A1K(userSession, interfaceC11380iw);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_branded_content_event");
        if (A0f.isSampled()) {
            User A0Y = AbstractC166997dE.A0Y(userSession);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            if (map != null) {
                A1I.putAll(map);
            }
            if (num == C05F.A0Y) {
                A1I.putAll(AbstractC25233BEq.A0p("can_use_branded_content_discovery_as_creator", String.valueOf(A0Y.A1P()), AbstractC166987dD.A1L("can_use_branded_content_discovery_as_brand", String.valueOf(AbstractC167007dF.A1T(A0Y.A03.Al9())))));
            }
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 1:
                        str7 = "feed_advanced_settings";
                        break;
                    case 2:
                        str7 = "feed_edit";
                        break;
                    case 3:
                        str7 = "story";
                        break;
                    case 4:
                        str7 = "story_edit";
                        break;
                    case 5:
                        str7 = "video_main";
                        break;
                    case 6:
                        str7 = "video_advanced_settings";
                        break;
                    case 7:
                        str7 = "video_edit";
                        break;
                    case 8:
                        str7 = "reel";
                        break;
                    case 9:
                        str7 = "reel_edit";
                        break;
                    case 10:
                        str7 = "panavision";
                        break;
                    case 11:
                        str7 = "panavision_edit";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        str7 = "live";
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        str7 = "suspected_bc_notif";
                        break;
                    default:
                        str7 = "feed_main";
                        break;
                }
                A1I.put("entrypoint", str7);
            }
            if (str2 != null) {
                A1I.put("entrypoint", str2);
            }
            if (num3 != null) {
                if (1 - num3.intValue() != 0) {
                    str6 = "brands_only";
                } else {
                    str6 = "project_and_brands";
                }
                A1I.put("flow", str6);
            }
            switch (num.intValue()) {
                case 0:
                    str4 = "bc_ineligible_screen_impression";
                    break;
                case 1:
                    str4 = "bc_ineligible_launch_unified_monetization_screen";
                    break;
                case 2:
                    str4 = "bc_partnerships_creator_entrypoint_impression";
                    break;
                case 3:
                    str4 = "bc_partnerships_brand_entrypoint_impression";
                    break;
                case 4:
                    str4 = "branded_content_creator_contact_about_partnership_tap";
                    break;
                case 5:
                    str4 = "settings_screen_impression";
                    break;
                case 6:
                    str4 = "approve_creators_screen_impression";
                    break;
                case 7:
                    str4 = "approve_creators_screen_button_action";
                    break;
                case 8:
                    str4 = "approve_creators_screen_request_impression";
                    break;
                case 9:
                    str4 = "request_brand_approval_screen_impression";
                    break;
                case 10:
                    str4 = "approve_media_request_screen_impression";
                    break;
                case 11:
                    str4 = "approve_media_request_screen_button_action";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str4 = "ig_branded_content_allowlisted_accounts_entry";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str4 = "branded_content_creator_contact_drawer_shown";
                    break;
                case 14:
                    str4 = "brand_onboarding_bc_settings_impression";
                    break;
                case Process.SIGTERM /* 15 */:
                    str4 = "brand_onboarding_bc_settings_click";
                    break;
                case 16:
                    str4 = "app_campaign_cta_click";
                    break;
                case 17:
                    str4 = "desktop_tool_bc_settings_impression";
                    break;
                case 18:
                    str4 = "desktop_tool_bc_settings_click";
                    break;
                case Process.SIGSTOP /* 19 */:
                    str4 = "add_pp_label_toggle_switched";
                    break;
                case 20:
                    str4 = "add_brand_partners_brand_action";
                    break;
                case 21:
                    str4 = "add_brand_partners_next_button_tapped";
                    break;
                case 22:
                    str4 = "disclosure_entrypoint_rendered";
                    break;
                case 23:
                    str4 = "disclosure_suggestions_rendered";
                    break;
                case 24:
                    str4 = "disclosure_entrypoint_tapped";
                    break;
                case 25:
                    str4 = "disclosure_suggestion_tapped";
                    break;
                case 26:
                    str4 = "disclosure_menu_rendered";
                    break;
                case 27:
                    str4 = "disclosure_menu_select_project_click";
                    break;
                case 28:
                    str4 = "disclosure_menu_add_brands_manually_click";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    str4 = "disclosure_menu_back_click";
                    break;
                case 30:
                    str4 = "disclosure_menu_project_deselected";
                    break;
                case 31:
                    str4 = "disclosure_menu_audience_restrictions_click";
                    break;
                case 32:
                    str4 = "disclosure_menu_brand_deselected";
                    break;
                case 33:
                    str4 = "disclosure_menu_ads_permission_toggled";
                    break;
                case 34:
                    str4 = "disclosure_review_done_button_tapped";
                    break;
                case 35:
                    str4 = "disclosure_review_brand_partners_tapped";
                    break;
                case 36:
                    str4 = "disclosure_review_brand_removed";
                    break;
                case 37:
                    str4 = "disclosure_review_add_audience_restrictions_tapped";
                    break;
                case 38:
                    str4 = "request_approval_dialog_action";
                    break;
                case 39:
                    str4 = "project_selection_project_selected";
                    break;
                case 40:
                    str4 = "project_selection_done_click";
                    break;
                case Seq.NULL_REFNUM /* 41 */:
                    str4 = "project_selection_back_click";
                    break;
                case Seq.RefTracker.REF_OFFSET /* 42 */:
                    str4 = "error_loading_user";
                    break;
                case 43:
                    str4 = "error_get_list_of_projects_api";
                    break;
                case 44:
                    str4 = "error_get_list_of_projects_missing_fields";
                    break;
                case 45:
                    str4 = "stories_more_options_menu_item_count";
                    break;
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    str4 = "error_get_list_of_campaign_api";
                    break;
                case 47:
                    str4 = "error_get_list_of_campaign_missing_fields";
                    break;
                case 48:
                    str4 = "suspected_bc_alert_impression";
                    break;
                case 49:
                    str4 = "suspected_bc_share_anyway_tapped";
                    break;
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    str4 = "suspected_bc_add_tags_tapped";
                    break;
                case 51:
                    str4 = "suspected_bc_creator_review_impression";
                    break;
                case 52:
                    str4 = "suspected_bc_creator_add_ppl_tapped";
                    break;
                case 53:
                    str4 = "suspected_bc_creator_not_bc_tapped";
                    break;
                default:
                    str4 = "suspected_bc_creator_review_confirmation_impression";
                    break;
            }
            A0f.AAP("event_name", str4);
            String str8 = userSession.userId;
            C14360o3.A0B(str8, 0);
            A0f.A9K("user_ig_id", AbstractC003100w.A0k(10, str8));
            EnumC222416a A0I = A0Y.A0I();
            if (A0I != null) {
                str5 = A0I.A01;
            } else {
                str5 = null;
            }
            A0f.AAP("account_type", str5);
            AbstractC25233BEq.A17(A0f, "media_id", str3);
            A0f.A9M("extra_data", A1I);
            if (str != null) {
                A0f.A9K("creator_ig_id", AbstractC003100w.A0k(10, str));
            }
            if (th != null) {
                A0f.AAP("exception_message", th.getMessage());
                A0f.AAP(AbstractC58317Pt9.A00(100), C2Ql.A00(th));
            }
            A0f.Cht();
        }
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, String str, Map map) {
        A03(interfaceC11380iw, userSession, num, null, null, str, null, null, null, map);
    }

    public static final void A05(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, Map map) {
        A03(interfaceC11380iw, userSession, num, null, null, null, null, null, null, map);
    }

    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Integer num) {
        Long l;
        String A00;
        String str;
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        if (c38321qM != null) {
            String[] A6p = c38321qM.A6p();
            C14360o3.A0B(A6p, 0);
            if (A6p.length != 0 && (str = A6p[0]) != null) {
                l = AbstractC166997dE.A0j(str);
            } else {
                l = null;
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_branded_content_event");
            if (A0f.isSampled()) {
                A0f.AAP("event_name", "paid_partnership_label_impression");
                A0f.A9K("user_ig_id", AbstractC25231BEo.A0j(0, userSession.userId));
                A0f.AAP("media_id", c38321qM.A38());
                switch (num.intValue()) {
                    case 0:
                        A00 = AbstractC111324zv.A00(1218);
                        break;
                    case 1:
                        A00 = "story_tray";
                        break;
                    case 2:
                        A00 = AbstractC111324zv.A00(413);
                        break;
                    default:
                        A00 = "feed_peek";
                        break;
                }
                A0f.AAP("event_source", A00);
                if (l != null) {
                    A0f.A9K("sponsor_ig_id", Long.valueOf(l.longValue()));
                }
                A0f.Cht();
            }
        }
    }
}
