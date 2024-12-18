package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.OXz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55033OXz {
    public static void A00(EnumC53360NjB enumC53360NjB, InterfaceC58279PsX interfaceC58279PsX, Integer num, String str, String str2, HashMap hashMap) {
        String str3;
        C14360o3.A0B(interfaceC58279PsX, 0);
        C54780OIu BOh = interfaceC58279PsX.BOh();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC58279PsX, BOh.A03), AbstractC43591JPw.A00(1048));
        if (A0f.isSampled()) {
            switch (num.intValue()) {
                case 0:
                    str3 = "media_kit_init_create";
                    break;
                case 1:
                    str3 = "media_kit_view_intro";
                    break;
                case 2:
                    str3 = "media_kit_intro_click_close";
                    break;
                case 3:
                    str3 = "media_kit_intro_info_click_close";
                    break;
                case 4:
                    str3 = "media_kit_view_intro_info";
                    break;
                case 5:
                    str3 = "media_kit_intro_click_info_icon";
                    break;
                case 6:
                    str3 = "media_kit_intro_click_proceed";
                    break;
                case 7:
                    str3 = "media_kit_template_promo_click";
                    break;
                case 8:
                    str3 = "media_kit_loaded";
                    break;
                case 9:
                    str3 = "media_kit_view";
                    break;
                case 10:
                    str3 = "media_kit_view_edit_menu_sheet";
                    break;
                case 11:
                    str3 = "media_kit_start_edit_title";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str3 = "media_kit_start_edit_bio";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str3 = "media_kit_view_visibility_sheet";
                    break;
                case 14:
                    str3 = "media_kit_set_visibility_private";
                    break;
                case Process.SIGTERM /* 15 */:
                    str3 = "media_kit_set_visibility_public";
                    break;
                case 16:
                    str3 = "media_kit_click_share";
                    break;
                case 17:
                    str3 = "media_kit_load_error";
                    break;
                case 18:
                    str3 = "media_kit_template_load_error";
                    break;
                case Process.SIGSTOP /* 19 */:
                    str3 = "media_kit_update_visibility_error";
                    break;
                case 20:
                    str3 = "media_kit_delete_error";
                    break;
                case 21:
                    str3 = "media_kit_update_error";
                    break;
                case 22:
                    str3 = "media_kit_publish_error";
                    break;
                case 23:
                    str3 = "media_kit_fetch_insights_error";
                    break;
                case 24:
                    str3 = "media_kit_click_edit_cover";
                    break;
                case 25:
                    str3 = "media_kit_published";
                    break;
                case 26:
                    str3 = "media_kit_updated";
                    break;
                case 27:
                    str3 = "media_kit_click_delete";
                    break;
                case 28:
                    str3 = "media_kit_confirm_delete";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    str3 = "media_kit_click_edit";
                    break;
                case 30:
                    str3 = "media_kit_click_add_section";
                    break;
                case 31:
                    str3 = "media_kit_select_add_section";
                    break;
                case 32:
                    str3 = "media_kit_click_remove_section";
                    break;
                case 33:
                    str3 = "media_kit_confirm_remove_section";
                    break;
                case 34:
                    str3 = "media_kit_click_reorder_sections";
                    break;
                case 35:
                    str3 = "media_kit_click_hide_like_count";
                    break;
                case 36:
                    str3 = "media_kit_click_show_like_count";
                    break;
                case 37:
                    str3 = "media_kit_click_save";
                    break;
                case 38:
                    str3 = "media_kit_click_close";
                    break;
                case 39:
                    str3 = "media_kit_confirm_discard";
                    break;
                case 40:
                    str3 = "media_kit_click_insights_info_icon";
                    break;
                case Seq.NULL_REFNUM /* 41 */:
                    str3 = "media_kit_click_accounts_info_icon";
                    break;
                case Seq.RefTracker.REF_OFFSET /* 42 */:
                    str3 = "media_kit_view_specific_media";
                    break;
                case 43:
                    str3 = "media_kit_view_ig_profile";
                    break;
                case 44:
                    str3 = "media_kit_view_creator_profile";
                    break;
                case 45:
                    str3 = "media_kit_start_edit_section_title";
                    break;
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    str3 = "media_kit_start_edit_section_description";
                    break;
                case 47:
                    str3 = "media_kit_selected_posts_media";
                    break;
                case 48:
                    str3 = "media_kit_selected_cover_media";
                    break;
                case 49:
                    str3 = "media_kit_selected_user_profiles";
                    break;
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    str3 = "media_kit_view_direct_sheet";
                    break;
                case 51:
                    str3 = "media_kit_send_direct_message";
                    break;
                case 52:
                    str3 = "media_kit_view_message_creator";
                    break;
                case 53:
                    str3 = "media_kit_click_message_creator";
                    break;
                case 54:
                    str3 = "media_kit_click_preferred_brand_partners";
                    break;
                case 55:
                    str3 = "media_kit_enabled_audio";
                    break;
                default:
                    str3 = "media_kit_disabled_audio";
                    break;
            }
            A0f.AAP("event_name", str3);
            A0f.AAP("bc_product_type", "media_kit");
            A0f.A9K("media_kit_id", AbstractC37302Gc3.A0V(BOh.A01));
            A0f.AAP(AbstractC31182DnR.A04(), BOh.A02);
            A0f.AAP("entrypoint", BOh.A00.A00);
            A0f.A8R(enumC53360NjB, "media_kit_section_type");
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                if (A1K.getValue() != null) {
                    AbstractC43594JPz.A1S(A1I, A1K);
                }
            }
            A0f.A9M("extra_data", A1I);
            A0f.AAP("error_identifier", str);
            A0f.AAP("error_message", str2);
            A0f.Cht();
        }
    }

    public static final void A01(InterfaceC58279PsX interfaceC58279PsX, Integer num) {
        A02(interfaceC58279PsX, num, AbstractC31174DnI.A11(interfaceC58279PsX, 0));
    }

    public static void A02(InterfaceC58279PsX interfaceC58279PsX, Integer num, HashMap hashMap) {
        A00(null, interfaceC58279PsX, num, null, null, hashMap);
    }
}
