package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class StoryPollColorType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryPollColorType[] A03;
    public static final StoryPollColorType A04;
    public static final StoryPollColorType A05;
    public static final StoryPollColorType A06;
    public static final StoryPollColorType A07;
    public static final StoryPollColorType A08;
    public static final StoryPollColorType A09;
    public static final StoryPollColorType A0A;
    public static final StoryPollColorType A0B;
    public static final StoryPollColorType A0C;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        StoryPollColorType storyPollColorType = new StoryPollColorType("UNRECOGNIZED", 0, "StoryPollColorType_unspecified");
        A0C = storyPollColorType;
        StoryPollColorType storyPollColorType2 = new StoryPollColorType("BLACK", 1, "black");
        A04 = storyPollColorType2;
        StoryPollColorType storyPollColorType3 = new StoryPollColorType("BLUE", 2, "blue");
        A05 = storyPollColorType3;
        StoryPollColorType storyPollColorType4 = new StoryPollColorType("EMPTY", 3, "");
        A06 = storyPollColorType4;
        StoryPollColorType storyPollColorType5 = new StoryPollColorType("GREEN", 4, "green");
        A07 = storyPollColorType5;
        StoryPollColorType storyPollColorType6 = new StoryPollColorType("LAVENDER", 5, "lavender");
        A08 = storyPollColorType6;
        StoryPollColorType storyPollColorType7 = new StoryPollColorType("ORANGE", 6, "orange");
        A09 = storyPollColorType7;
        StoryPollColorType storyPollColorType8 = new StoryPollColorType("PINK", 7, "pink");
        A0A = storyPollColorType8;
        StoryPollColorType storyPollColorType9 = new StoryPollColorType("PURPLE", 8, "purple");
        A0B = storyPollColorType9;
        StoryPollColorType[] storyPollColorTypeArr = {storyPollColorType, storyPollColorType2, storyPollColorType3, storyPollColorType4, storyPollColorType5, storyPollColorType6, storyPollColorType7, storyPollColorType8, storyPollColorType9};
        A03 = storyPollColorTypeArr;
        A02 = AbstractC12190kN.A00(storyPollColorTypeArr);
        StoryPollColorType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (StoryPollColorType storyPollColorType10 : values) {
            linkedHashMap.put(storyPollColorType10.A00, storyPollColorType10);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(13);
    }

    public static StoryPollColorType valueOf(String str) {
        return (StoryPollColorType) Enum.valueOf(StoryPollColorType.class, str);
    }

    public static StoryPollColorType[] values() {
        return (StoryPollColorType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryPollColorType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
