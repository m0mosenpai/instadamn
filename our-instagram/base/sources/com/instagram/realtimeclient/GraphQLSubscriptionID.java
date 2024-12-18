package com.instagram.realtimeclient;

import X.AnonymousClass001;

/* loaded from: classes11.dex */
public class GraphQLSubscriptionID {
    public static final String CLIENT_CONFIG_UPDATE_QUERY_ID = "17849856529644700";
    public static final String DIRECT_TYPING_INDICATOR_QUERY_ID = "17867973967082385";
    public static final String FEEDBACK_LIKE_SUBSCRIBE_QUERY_ID = "17877917527113814";
    public static final String FLEET_BEACON_ID = "18252321364031815";
    public static final String HANGOUTS_CANVAS_REALTIME_DELETION_QUERY_ID = "3486750871449347";
    public static final String HANGOUTS_CANVAS_REALTIME_EVENT_QUERY_ID = "4903445126366131";
    public static final String IGLIVE_COMMENT_LIKE_QUERY_ID = "17999974195454899";
    public static final String IGLIVE_COMMENT_QUERY_ID = "18006547105399202";
    public static final String IGLIVE_GAMES_QUERY_ID = "17918410814692079";
    public static final String IGLIVE_MODERATOR_QUERY_ID = "17906039861231287";
    public static final String IGLIVE_NOTIFY_QUERY_ID = "18028293154391958";
    public static final String IGLIVE_REACTIONS_QUERY_ID = "6737978086323782";
    public static final String IGLIVE_TRIVIA_QUERY_ID = "18020948095509657";
    public static final String IGLIVE_USER_PAY_QUERY_ID = "17983313284401962";
    public static final String IGLIVE_WAVE_QUERY_ID = "17888837228289969";
    public static final String IG_INAPP_NOTIFICATION_QUERY_ID = "17899377895239777";
    public static final String IG_INTERACTIVITY_ACTIVATE_QUESTION_QUERY_ID = "18005526940184517";
    public static final String IG_INTERACTIVITY_QUERY_ID = "17907616480241689";
    public static final String IG_INTERACTIVITY_REALTIME_SUBMISSIONS_STATUS_QUERY_ID = "18027779584026952";
    public static final String IG_REEL_TRAY_QUERY_ID = "18220052389172762";
    public static final String INAPP_NOTIFICATION_QUERY_MODEL_NAME = "inapp_notification_subscribe";
    public static final String INAPP_NOTIFICATION_TYPE_COMMENT = "comment";
    public static final String INAPP_NOTIFICATION_TYPE_COMMENT_MENTION_AND_REPLY = "comment_mention_and_reply";
    public static final String INAPP_NOTIFICATION_TYPE_DEFAULT = "default";
    public static final String INAPP_NOTIFICATION_TYPE_FUNDRAISER_COHOST_INVITED = "fundraiser_cohost_invited";
    public static final String INAPP_NOTIFICATION_TYPE_PROMPT_STICKER_REPLY = "prompt_sticker_reply";
    public static final String INAPP_NOTIFICATION_TYPE_REELS_TOGETHER = "reels_together";
    public static final String INAPP_NOTIFICATION_TYPE_STORY_EMOJI_REACTION = "story_emoji_reaction";
    public static final String INAPP_NOTIFICATION_TYPE_WATCH_RECEIPTS = "watch_receipt";
    public static final String LIVE_PINNED_PRODUCT_QUERY_ID = "17858277713002581";
    public static final String LIVE_REALTIME_COMMENT_QUERY_ID = "17855344750227125";
    public static final String REACT_NATIVE_OTA_UPDATE_QUERY_ID = "17861494672288167";
    public static final String SUPERVISED_USER_SCHEDULED_BREAK_SETTINGS_QUERY_ID = "4845998365511133";
    public static final String SUPERVISED_USER_SCREENTIME_SETTINGS_QUERY_ID = "4051374451653505";
    public static final String VIDEO_CALL_IN_CALL_ALERT_QUERY_ID = "18025651213162780";
    public static final String VIDEO_CALL_PARTICIPANT_ANSWER_STATE_QUERY_ID = "17977239895057311";
    public static final String VIDEO_CALL_PARTICIPANT_ANSWER_STATE_QUERY_NAME = "video_call_participant_state_delivery";
    public static final String VIDEO_CALL_PROTOTYPE_PUBLISH_QUERY_ID = "18031704190010162";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static String idToString(String str) {
        switch (str.hashCode()) {
            case -2069738616:
                if (str.equals(IG_INTERACTIVITY_REALTIME_SUBMISSIONS_STATUS_QUERY_ID)) {
                    return "IG_INTERACTIVITY_REALTIME_SUBMISSIONS_STATUS_QUERY_ID";
                }
                return AnonymousClass001.A0R("unknown: ", str);
            case -1245320171:
                if (str.equals(FEEDBACK_LIKE_SUBSCRIBE_QUERY_ID)) {
                    return "FEEDBACK_LIKE_SUBSCRIBE_QUERY_ID";
                }
                return AnonymousClass001.A0R("unknown: ", str);
            case -1219905189:
                if (str.equals(CLIENT_CONFIG_UPDATE_QUERY_ID)) {
                    return "CLIENT_CONFIG_UPDATE_QUERY_ID";
                }
                return AnonymousClass001.A0R("unknown: ", str);
            case -1202610738:
                if (str.equals(LIVE_REALTIME_COMMENT_QUERY_ID)) {
                    return "LIVE_REALTIME_COMMENT_QUERY_ID";
                }
                return AnonymousClass001.A0R("unknown: ", str);
            case -282716072:
                if (str.equals(IG_INTERACTIVITY_ACTIVATE_QUESTION_QUERY_ID)) {
                    return "IG_INTERACTIVITY_ACTIVATE_QUESTION_QUERY_ID";
                }
                return AnonymousClass001.A0R("unknown: ", str);
            case 216352336:
                if (str.equals(VIDEO_CALL_IN_CALL_ALERT_QUERY_ID)) {
                    return "VIDEO_CALL_IN_CALL_ALERT_QUERY_ID";
                }
                return AnonymousClass001.A0R("unknown: ", str);
            case 324624248:
                if (str.equals(LIVE_PINNED_PRODUCT_QUERY_ID)) {
                    return "LIVE_PINNED_PRODUCT_QUERY_ID";
                }
                return AnonymousClass001.A0R("unknown: ", str);
            case 577873495:
                if (str.equals(IGLIVE_WAVE_QUERY_ID)) {
                    return "IGLIVE_WAVE_QUERY_ID";
                }
                return AnonymousClass001.A0R("unknown: ", str);
            case 1103601907:
                if (str.equals(IG_INTERACTIVITY_QUERY_ID)) {
                    return "IG_INTERACTIVITY_QUERY_ID";
                }
                return AnonymousClass001.A0R("unknown: ", str);
            case 1868710814:
                if (str.equals(DIRECT_TYPING_INDICATOR_QUERY_ID)) {
                    return "DIRECT_TYPING_INDICATOR_QUERY_ID";
                }
                return AnonymousClass001.A0R("unknown: ", str);
            default:
                return AnonymousClass001.A0R("unknown: ", str);
        }
    }
}
