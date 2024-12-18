package com.instagram.model.reels;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class StoryWedgingType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryWedgingType[] A03;
    public static final StoryWedgingType A04;
    public static final StoryWedgingType A05;
    public static final StoryWedgingType A06;
    public static final StoryWedgingType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StoryWedgingType storyWedgingType = new StoryWedgingType("UNRECOGNIZED", 0, "StoryWedgingType_unspecified");
        A07 = storyWedgingType;
        StoryWedgingType storyWedgingType2 = new StoryWedgingType("OFF", 1, "off");
        A04 = storyWedgingType2;
        StoryWedgingType storyWedgingType3 = new StoryWedgingType("SHOW_ALL", 2, "show_all");
        A05 = storyWedgingType3;
        StoryWedgingType storyWedgingType4 = new StoryWedgingType("SHOW_ALL_REINSERT", 3, "show_all_reinsert");
        A06 = storyWedgingType4;
        StoryWedgingType[] storyWedgingTypeArr = {storyWedgingType, storyWedgingType2, storyWedgingType3, storyWedgingType4, new StoryWedgingType("SHOW_ALL_RANKING", 4, "show_all_ranking")};
        A03 = storyWedgingTypeArr;
        A02 = AbstractC12190kN.A00(storyWedgingTypeArr);
        StoryWedgingType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (StoryWedgingType storyWedgingType5 : values) {
            A18.put(storyWedgingType5.A00, storyWedgingType5);
        }
        A01 = A18;
        CREATOR = C55343Oh9.A00(94);
    }

    public static StoryWedgingType valueOf(String str) {
        return (StoryWedgingType) Enum.valueOf(StoryWedgingType.class, str);
    }

    public static StoryWedgingType[] values() {
        return (StoryWedgingType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryWedgingType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
