package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AchievementButtonAction implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AchievementButtonAction[] A03;
    public static final AchievementButtonAction A04;
    public static final AchievementButtonAction A05;
    public static final AchievementButtonAction A06;
    public static final AchievementButtonAction A07;
    public static final AchievementButtonAction A08;
    public static final AchievementButtonAction A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AchievementButtonAction achievementButtonAction = new AchievementButtonAction("UNRECOGNIZED", 0, "AchievementButtonAction_unspecified");
        A09 = achievementButtonAction;
        AchievementButtonAction achievementButtonAction2 = new AchievementButtonAction("CREATE_POST", 1, "create_post");
        A04 = achievementButtonAction2;
        AchievementButtonAction achievementButtonAction3 = new AchievementButtonAction("CREATE_REEL", 2, "create_reel");
        A05 = achievementButtonAction3;
        AchievementButtonAction achievementButtonAction4 = new AchievementButtonAction("CREATE_STORY", 3, "create_story");
        A06 = achievementButtonAction4;
        AchievementButtonAction achievementButtonAction5 = new AchievementButtonAction("DEEPLINK", 4, "deeplink");
        A07 = achievementButtonAction5;
        AchievementButtonAction achievementButtonAction6 = new AchievementButtonAction("SHARE_TO_STORY_WITH_MEDIA", 5, "share_to_story_with_media");
        A08 = achievementButtonAction6;
        AchievementButtonAction[] achievementButtonActionArr = {achievementButtonAction, achievementButtonAction2, achievementButtonAction3, achievementButtonAction4, achievementButtonAction5, achievementButtonAction6, new AchievementButtonAction("VIEW_ACHIEVEMENTS_CATEGORY", 6, "view_achievements_category")};
        A03 = achievementButtonActionArr;
        A02 = AbstractC12190kN.A00(achievementButtonActionArr);
        AchievementButtonAction[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (AchievementButtonAction achievementButtonAction7 : values) {
            linkedHashMap.put(achievementButtonAction7.A00, achievementButtonAction7);
        }
        A01 = linkedHashMap;
        CREATOR = new C63469Sl9(27);
    }

    public static AchievementButtonAction valueOf(String str) {
        return (AchievementButtonAction) Enum.valueOf(AchievementButtonAction.class, str);
    }

    public static AchievementButtonAction[] values() {
        return (AchievementButtonAction[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AchievementButtonAction(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
