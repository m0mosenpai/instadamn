package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.F1e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34051F1e {
    public static final String A00(int i) {
        switch (i) {
            case 0:
                return "unknown";
            case 1:
                return "story";
            case 2:
                return "search";
            case 3:
                return "new_group";
            case 4:
                return "send_to";
            case 5:
            case 6:
            case Process.SIGSTOP /* 19 */:
            case 31:
                return "suggested";
            case 7:
                return "recent";
            case 8:
                return "alphabetical";
            case 9:
                return "group_stories";
            case 10:
            case 20:
            case 27:
            case 34:
            case 39:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            default:
                throw AbstractC25230BEn.A0n("Invalid section: ", i);
            case 11:
                return "facebook_friends";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "instagram_non_contacts";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "facebook_non_friends";
            case 14:
                return "not_following_recipients";
            case Process.SIGTERM /* 15 */:
                return "facebook_friends_see_all";
            case 16:
                return "instagram_non_contacts_see_all";
            case 17:
                return "facebook_non_friends_see_all";
            case 18:
                return "recent_see_all";
            case 21:
                return "instagram_business_only_non_contacts";
            case 22:
                return "instagram_business_only_non_contacts_see_all";
            case 23:
                return "instagram_people_only_non_contacts";
            case 24:
                return "instagram_people_only_non_contacts_see_all";
            case 25:
                return "messages";
            case 26:
                return "instagram_in_this_story_mention";
            case 28:
                return "relevant_shares";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "latest_shares";
            case 30:
                return "channels";
            case 32:
                return "occamadillo";
            case 33:
                return "categories";
            case 35:
                return "ai_agents";
            case 36:
                return "ai_agents_see_all";
            case 37:
                return "channels_see_all";
            case 38:
                return "ai_picker";
            case 40:
                return "null_state_suggested_prompt";
            case Seq.NULL_REFNUM /* 41 */:
                return "meta_ai_typeahead_prompt";
            case 43:
                return "invite_contact";
        }
    }
}
