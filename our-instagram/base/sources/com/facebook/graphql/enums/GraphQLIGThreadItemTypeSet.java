package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class GraphQLIGThreadItemTypeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[60];
        System.arraycopy(new String[]{"ACTION_LOG", "ANIMATED_MEDIA", "APPOINTMENT_BOOKING", "AR_EFFECT", "AVATAR_STICKER", "BOOK_NOW_LINK_SHARE", "CLIP", "COLLABORATOR_INVITE", "COLLAB_POST_COAUTHOR_ACCEPT", "COLLAB_POST_INVITE_COAUTHOR", "DESTINATION", "DIRECT_GROUP_POLL_V1", "DIRECT_HEADMOJI", "FBPAY_REFERRAL", "FELIX_SHARE", "FUNDRAISER", "GENERIC_FALLBACK", "GENERIC_TEMPLATE", "GENERIC_XMA", "GUIDE_SHARE", "HASHTAG", "HSCROLL_SHARE", "IG_ROOMS_XMA", "INFO_CENTER", "INFO_CENTER_FACT", "INSTANT_REPLY", "INTEROP_PERMANENT_MEDIA"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"INTEROP_PERMANENT_MEDIA_LIST", "INTEROP_RAVEN_MEDIA", "LIKE", "LINK", "LIVE_VIDEO_SHARE", "LIVE_VIEWER_INVITE", "LOCATION", "LOCATION_SHARE_XMA", "MEDIA", "MEDIA_SHARE", "MUSIC", "P2B_ORDER", "P2P_PAYMENT", "PLACEHOLDER", "PRODUCT_SHARE", "PROFILE", "RAVEN_MEDIA", "REACTION_LOG", "REELS_AUDIO_SHARE", "REEL_SHARE", "SELFIE_STICKER", "SHOPS_COLLECTION_SHARE", "SHOP_SHARE", "STATIC_STICKER", "STATUS_REPLY", "STORE_STICKER", "STORY_SHARE"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"TEXT", "UNSUPPORTED", "VIDEO_CALL_EVENT", "VOICE_MEDIA", "XMA", "XMA_REEL_SHARE"}, 0, strArr, 54, 6);
        A00 = AbstractC16830sb.A05(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
