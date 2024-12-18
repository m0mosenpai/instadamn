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
public final class StoryTrendingTemplateSectionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryTrendingTemplateSectionType[] A03;
    public static final StoryTrendingTemplateSectionType A04;
    public static final StoryTrendingTemplateSectionType A05;
    public static final StoryTrendingTemplateSectionType A06;
    public static final StoryTrendingTemplateSectionType A07;
    public static final StoryTrendingTemplateSectionType A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StoryTrendingTemplateSectionType storyTrendingTemplateSectionType = new StoryTrendingTemplateSectionType("UNRECOGNIZED", 0, "StoryTrendingTemplateSectionType_unspecified");
        A08 = storyTrendingTemplateSectionType;
        StoryTrendingTemplateSectionType storyTrendingTemplateSectionType2 = new StoryTrendingTemplateSectionType("CAMERA", 1, "CAMERA");
        A04 = storyTrendingTemplateSectionType2;
        StoryTrendingTemplateSectionType storyTrendingTemplateSectionType3 = new StoryTrendingTemplateSectionType("FIND_IT_FIRST", 2, "FIND_IT_FIRST");
        A05 = storyTrendingTemplateSectionType3;
        StoryTrendingTemplateSectionType storyTrendingTemplateSectionType4 = new StoryTrendingTemplateSectionType("HOT_RIGHT_NOW", 3, "HOT_RIGHT_NOW");
        A06 = storyTrendingTemplateSectionType4;
        StoryTrendingTemplateSectionType storyTrendingTemplateSectionType5 = new StoryTrendingTemplateSectionType("INTERNATIONAL_HITS", 4, "INTERNATIONAL_HITS");
        A07 = storyTrendingTemplateSectionType5;
        StoryTrendingTemplateSectionType[] storyTrendingTemplateSectionTypeArr = {storyTrendingTemplateSectionType, storyTrendingTemplateSectionType2, storyTrendingTemplateSectionType3, storyTrendingTemplateSectionType4, storyTrendingTemplateSectionType5, new StoryTrendingTemplateSectionType("REEL_TEMPLATE_BROWSER", 5, "REEL_TEMPLATE_BROWSER")};
        A03 = storyTrendingTemplateSectionTypeArr;
        A02 = AbstractC12190kN.A00(storyTrendingTemplateSectionTypeArr);
        StoryTrendingTemplateSectionType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (StoryTrendingTemplateSectionType storyTrendingTemplateSectionType6 : values) {
            A18.put(storyTrendingTemplateSectionType6.A00, storyTrendingTemplateSectionType6);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(36);
    }

    public static StoryTrendingTemplateSectionType valueOf(String str) {
        return (StoryTrendingTemplateSectionType) Enum.valueOf(StoryTrendingTemplateSectionType.class, str);
    }

    public static StoryTrendingTemplateSectionType[] values() {
        return (StoryTrendingTemplateSectionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryTrendingTemplateSectionType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
