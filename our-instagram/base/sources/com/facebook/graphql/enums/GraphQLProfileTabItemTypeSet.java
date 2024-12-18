package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import X.AbstractC31175DnJ;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class GraphQLProfileTabItemTypeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[32];
        System.arraycopy(new String[]{"SHOP", "SUBSCRIBER_HUB", "TOPICS", "TRIBUTES", "VIDEOS"}, AbstractC31175DnJ.A1b(new String[]{"ABOUT", "ARTICLES", "CHATS", "COLLECTIBLES", "COMMUNITY", "COMMUNITY_HELP", "EVENTS", "EVENTS_BLOKS", "FAN_HUB", "FILES", "FUNDRAISERS", "GUIDES", "HOME", "JOBS", "JOINABLE_VIDEO_CHATS", "LOOKING_FOR_PLAYERS", "MENTIONS", "MENTORSHIP", "MENU", "MUSIC_CHARTS", "OVERFLOW", "PHOTOS", "PODCASTS", "QUESTIONS", "RECOMMENDATIONS", "REELS", "SERVICES"}, strArr) ? 1 : 0, strArr, 27, 5);
        A00 = AbstractC16830sb.A05(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
