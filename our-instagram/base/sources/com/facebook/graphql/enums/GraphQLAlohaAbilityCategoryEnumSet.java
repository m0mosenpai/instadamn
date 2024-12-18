package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import X.AbstractC31175DnJ;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class GraphQLAlohaAbilityCategoryEnumSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[35];
        System.arraycopy(new String[]{"SYSTEM", "TRAVEL_AND_REVIEWS", "TV_AND_MOVIES", "UNKNOWN", "UTILITIES", "VIDEO", "WEATHER", "WEBSITE"}, AbstractC31175DnJ.A1b(new String[]{"AR_EXPERIENCES", "BUSINESS", "EDUCATION", "ENTERTAINMENT", "FAMILY", "FINANCE", "FOOD", "GAMES", "HEALTH", "HELP", "HOME_AUTOMATION", "INTERNET", "LIFESTYLE", "MUSIC", "MUSIC_AND_PODCASTS", "NEWS", "NEWS_AND_WEATHER", "OTHER", "PHOTO", "PRODUCTIVITY", "REFERENCE", "RETAIL", "SHOPPING", "SHORTCUT", "SHOW", "SOCIAL", "SPORTS"}, strArr) ? 1 : 0, strArr, 27, 8);
        A00 = AbstractC16830sb.A05(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
