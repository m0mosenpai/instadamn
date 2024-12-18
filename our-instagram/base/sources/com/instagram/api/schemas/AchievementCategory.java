package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class AchievementCategory implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AchievementCategory[] A03;
    public static final AchievementCategory A04;
    public static final AchievementCategory A05;
    public static final AchievementCategory A06;
    public static final AchievementCategory A07;
    public static final AchievementCategory A08;
    public static final AchievementCategory A09;
    public static final AchievementCategory A0A;
    public static final AchievementCategory A0B;
    public static final AchievementCategory A0C;
    public static final AchievementCategory A0D;
    public static final AchievementCategory A0E;
    public static final AchievementCategory A0F;
    public static final AchievementCategory A0G;
    public static final AchievementCategory A0H;
    public static final AchievementCategory A0I;
    public static final AchievementCategory A0J;
    public static final AchievementCategory A0K;
    public static final AchievementCategory A0L;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AchievementCategory achievementCategory = new AchievementCategory("UNRECOGNIZED", 0, "AchievementCategory_unspecified");
        A0L = achievementCategory;
        AchievementCategory achievementCategory2 = new AchievementCategory("BONUS_EARNINGS", 1, "bonus_earnings");
        A04 = achievementCategory2;
        AchievementCategory achievementCategory3 = new AchievementCategory("COLLABORATOR", 2, "collaborator");
        A05 = achievementCategory3;
        AchievementCategory achievementCategory4 = new AchievementCategory("COMMENTS", 3, "comments");
        A06 = achievementCategory4;
        AchievementCategory achievementCategory5 = new AchievementCategory("COMMUNITY_BUILDER", 4, "community_builder");
        A07 = achievementCategory5;
        AchievementCategory achievementCategory6 = new AchievementCategory("CREATIVE_STREAK", 5, "creative_streak");
        A08 = achievementCategory6;
        AchievementCategory achievementCategory7 = new AchievementCategory("DOGFOODER", 6, "dogfooder");
        A09 = achievementCategory7;
        AchievementCategory achievementCategory8 = new AchievementCategory("FIRST_BONUSES_CONTENT", 7, "first_bonuses_content");
        A0A = achievementCategory8;
        AchievementCategory achievementCategory9 = new AchievementCategory("FOLLOWERS", 8, "followers");
        A0B = achievementCategory9;
        AchievementCategory achievementCategory10 = new AchievementCategory("LIKES", 9, "likes");
        A0C = achievementCategory10;
        AchievementCategory achievementCategory11 = new AchievementCategory("PLAYS", 10, "plays");
        A0D = achievementCategory11;
        AchievementCategory achievementCategory12 = new AchievementCategory("POST_IMPRESSIONS", 11, "post_impressions");
        A0F = achievementCategory12;
        AchievementCategory achievementCategory13 = new AchievementCategory("POSTS", 12, "posts");
        A0E = achievementCategory13;
        AchievementCategory achievementCategory14 = new AchievementCategory("REELS", 13, "reels");
        A0G = achievementCategory14;
        AchievementCategory achievementCategory15 = new AchievementCategory("REELS_WATCH_TIME", 14, "reels_watch_time");
        A0H = achievementCategory15;
        AchievementCategory achievementCategory16 = new AchievementCategory("SMASH_HIT", 15, "smash_hit");
        A0I = achievementCategory16;
        AchievementCategory achievementCategory17 = new AchievementCategory("STORIES", 16, "stories");
        A0J = achievementCategory17;
        AchievementCategory achievementCategory18 = new AchievementCategory("STORY_REACH", 17, "story_reach");
        A0K = achievementCategory18;
        AchievementCategory[] achievementCategoryArr = {achievementCategory, achievementCategory2, achievementCategory3, achievementCategory4, achievementCategory5, achievementCategory6, achievementCategory7, achievementCategory8, achievementCategory9, achievementCategory10, achievementCategory11, achievementCategory12, achievementCategory13, achievementCategory14, achievementCategory15, achievementCategory16, achievementCategory17, achievementCategory18, new AchievementCategory("TRENDSPOTTER", 18, "trendspotter")};
        A03 = achievementCategoryArr;
        A02 = AbstractC12190kN.A00(achievementCategoryArr);
        AchievementCategory[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (AchievementCategory achievementCategory19 : values) {
            A18.put(achievementCategory19.A00, achievementCategory19);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(29);
    }

    public static AchievementCategory valueOf(String str) {
        return (AchievementCategory) Enum.valueOf(AchievementCategory.class, str);
    }

    public static AchievementCategory[] values() {
        return (AchievementCategory[]) A03.clone();
    }

    public AchievementCategory(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
