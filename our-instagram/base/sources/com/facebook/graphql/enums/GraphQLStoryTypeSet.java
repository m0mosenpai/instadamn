package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import X.AbstractC31175DnJ;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public final class GraphQLStoryTypeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[29];
        System.arraycopy(new String[]{"USER_FOLLOWED", "USER_TAGGED"}, AbstractC31175DnJ.A1b(new String[]{"AD_SUBMITTED", "COLLAB_POST_AUTHOR_REMOVE_COAUTHOR", "COLLAB_POST_COAUTHOR_ACCEPT", "COLLAB_POST_COAUTHOR_INVITE", "COLLAB_POST_COAUTHOR_INVITE_REMINDER", "COLLAB_POST_COAUTHOR_REMOVE_SELF", "COMMENT", "COMMENT_LIKE", "COMMENT_ON_TAG", "DIRECT_V2_BUSINESS_UNREAD_REMINDER", "IG_REELS_DRAFT_REMINDER", "LIKE", "MEDIA_LIKE", "MENTIONED_COMMENT", MessageAvailabilityResponseId$Companion.NOT_SUPPORTED, "POST_LIKE", "REELS_LIKE", "REPLY_TO_COMMENT_WITH_THREADING", "STORIES_COUNTDOWN_REMINDER", "STORIES_QUESTION_RESPONSE", "STORIES_QUESTION_RESPONSE_SHARED", "STORY_EMOJI_REACTION", "STORY_LIKE", "SUPPORT_TICKET_V2", "SUSPICIOUS_LOGIN", "TWO_FACTOR_TRUSTED_NOTIFICATION", "UNKNOWN"}, strArr) ? 1 : 0, strArr, 27, 2);
        A00 = AbstractC16830sb.A05(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
