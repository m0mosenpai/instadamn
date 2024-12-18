package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.6Q1, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6Q1 {
    public static final String A00(UserSession userSession, int i) {
        if (i != 14) {
            if (i != 16) {
                if (i != 50) {
                    if (i != 32) {
                        if (i != 33) {
                            if (i != 54) {
                                if (i != 55) {
                                    switch (i) {
                                        case 0:
                                            return "4";
                                        case 1:
                                            return "3";
                                        case 2:
                                            return "6";
                                        case 3:
                                            return "9";
                                        case 4:
                                            return "feed_reshare";
                                        case 5:
                                            return "reel_reshare";
                                        case 6:
                                            return "question_response_reshare";
                                        default:
                                            switch (i) {
                                                case 8:
                                                    return "product_reshare";
                                                case 9:
                                                    return "countdown_reshare";
                                                case 10:
                                                    return "otd_reshare";
                                                case 11:
                                                    return "fundraiser_dupicate_sticker_prompt";
                                                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                                    return "fundraiser_public_thanks_sticker_prompt";
                                                default:
                                                    switch (i) {
                                                        case 20:
                                                            return "upcoming_event_reshare";
                                                        case 21:
                                                            return "link_share";
                                                        case 22:
                                                            return "standalone_fundraiser_sticker_share";
                                                        case 23:
                                                            return "group_profile_reshare";
                                                        case 24:
                                                            return "memory_pog_reshare";
                                                        default:
                                                            switch (i) {
                                                                case 26:
                                                                    return "fb_post_reshare";
                                                                case 27:
                                                                    return "channel_share";
                                                                case 28:
                                                                    return "event_share";
                                                                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                                                                    return "follower_milestone";
                                                                case 30:
                                                                    return "48";
                                                                default:
                                                                    switch (i) {
                                                                        case 61:
                                                                            return "stories_templates";
                                                                        case 62:
                                                                            return "channel_challenge_share";
                                                                        case StringTreeSet.PAYLOAD_MASK /* 63 */:
                                                                            return "music_first_story";
                                                                        default:
                                                                            switch (i) {
                                                                                case 108:
                                                                                    return "108";
                                                                                case 109:
                                                                                    return "109";
                                                                                case 110:
                                                                                    return "14";
                                                                                case 111:
                                                                                    return "5";
                                                                                case 112:
                                                                                    return "profile_card_share";
                                                                                case 113:
                                                                                    return "quick_snap_recap_share";
                                                                                default:
                                                                                    if (userSession != null && !C18U.A06(C06090Tz.A05, userSession, 36327920016309202L)) {
                                                                                        throw new UnsupportedOperationException(AnonymousClass001.A0O("Unknown source type: ", i));
                                                                                    }
                                                                                    return "-1";
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                }
                                return "hands_free_sharing";
                            }
                            return "54";
                        }
                        return "stories_gallery_template";
                    }
                    return "302";
                }
                return "50";
            }
            return "creator_fan_engagement_reshare";
        }
        return "smb_support_reshare";
    }
}
