package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class StoryTrendingPromptSubType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryTrendingPromptSubType[] A03;
    public static final StoryTrendingPromptSubType A04;
    public static final StoryTrendingPromptSubType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StoryTrendingPromptSubType storyTrendingPromptSubType = new StoryTrendingPromptSubType("UNRECOGNIZED", 0, "StoryTrendingPromptSubType_unspecified");
        A05 = storyTrendingPromptSubType;
        StoryTrendingPromptSubType storyTrendingPromptSubType2 = new StoryTrendingPromptSubType("CONNECTED_AND_CURATED_TRENDING", 1, "connected_and_curated_trending");
        A04 = storyTrendingPromptSubType2;
        StoryTrendingPromptSubType[] storyTrendingPromptSubTypeArr = {storyTrendingPromptSubType, storyTrendingPromptSubType2, new StoryTrendingPromptSubType("CURATED_TRENDING", 2, "curated_trending")};
        A03 = storyTrendingPromptSubTypeArr;
        A02 = AbstractC12190kN.A00(storyTrendingPromptSubTypeArr);
        StoryTrendingPromptSubType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (StoryTrendingPromptSubType storyTrendingPromptSubType3 : values) {
            A18.put(storyTrendingPromptSubType3.A00, storyTrendingPromptSubType3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(35);
    }

    public static StoryTrendingPromptSubType valueOf(String str) {
        return (StoryTrendingPromptSubType) Enum.valueOf(StoryTrendingPromptSubType.class, str);
    }

    public static StoryTrendingPromptSubType[] values() {
        return (StoryTrendingPromptSubType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryTrendingPromptSubType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
