package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import X.AbstractC31175DnJ;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class GraphQLGroupsSubTabSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[29];
        System.arraycopy(new String[]{"YOUR_GROUPS", "YOUR_GROUP_JOINS"}, AbstractC31175DnJ.A1b(new String[]{"ACTIVITY_LOG", "CATEGORIES", "COMPOSER", "CREATE", "CROSS_GROUP_INBOX", "CROSS_GROUP_INBOX_CHATS_ONLY", "CROSS_GROUP_INBOX_JVC_ONLY", "DISCOVER_MAIN", "ENGAGE_MAIN", "EVENTS", "FOR_YOU", "GROUP_DIGEST", "GROUP_SET", "INVITES", "JOINED", "LOCAL", "MANAGE_GROUPS", "ME", "POSTS", "QUESTIONS", "RELATED_CONTENT", "RISING", "SETTINGS", "THANKS", "UNKNOWN", "VIDEOS", "YOUR_CHATS"}, strArr) ? 1 : 0, strArr, 27, 2);
        A00 = AbstractC16830sb.A05(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
