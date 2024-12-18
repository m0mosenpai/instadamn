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
public final class StoryTextAttributionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryTextAttributionType[] A03;
    public static final StoryTextAttributionType A04;
    public static final StoryTextAttributionType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StoryTextAttributionType storyTextAttributionType = new StoryTextAttributionType("UNRECOGNIZED", 0, "StoryTextAttributionType_unspecified");
        A05 = storyTextAttributionType;
        StoryTextAttributionType storyTextAttributionType2 = new StoryTextAttributionType("MULTIPLE_LISTS", 1, "multiple_lists");
        A04 = storyTextAttributionType2;
        StoryTextAttributionType[] storyTextAttributionTypeArr = {storyTextAttributionType, storyTextAttributionType2};
        A03 = storyTextAttributionTypeArr;
        A02 = AbstractC12190kN.A00(storyTextAttributionTypeArr);
        StoryTextAttributionType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (StoryTextAttributionType storyTextAttributionType3 : values) {
            A18.put(storyTextAttributionType3.A00, storyTextAttributionType3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(32);
    }

    public static StoryTextAttributionType valueOf(String str) {
        return (StoryTextAttributionType) Enum.valueOf(StoryTextAttributionType.class, str);
    }

    public static StoryTextAttributionType[] values() {
        return (StoryTextAttributionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryTextAttributionType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
