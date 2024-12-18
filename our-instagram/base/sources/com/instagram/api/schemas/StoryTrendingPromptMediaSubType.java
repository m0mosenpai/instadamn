package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class StoryTrendingPromptMediaSubType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryTrendingPromptMediaSubType[] A03;
    public static final StoryTrendingPromptMediaSubType A04;
    public static final StoryTrendingPromptMediaSubType A05;
    public static final StoryTrendingPromptMediaSubType A06;
    public static final StoryTrendingPromptMediaSubType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StoryTrendingPromptMediaSubType storyTrendingPromptMediaSubType = new StoryTrendingPromptMediaSubType("UNRECOGNIZED", 0, "StoryTrendingPromptMediaSubType_unspecified");
        A07 = storyTrendingPromptMediaSubType;
        StoryTrendingPromptMediaSubType storyTrendingPromptMediaSubType2 = new StoryTrendingPromptMediaSubType("CONNECTED", 1, RealtimeConstants.MQTT_CONNECTED);
        A04 = storyTrendingPromptMediaSubType2;
        StoryTrendingPromptMediaSubType storyTrendingPromptMediaSubType3 = new StoryTrendingPromptMediaSubType("CURATED", 2, "curated");
        A05 = storyTrendingPromptMediaSubType3;
        StoryTrendingPromptMediaSubType storyTrendingPromptMediaSubType4 = new StoryTrendingPromptMediaSubType("INJECTED", 3, "injected");
        A06 = storyTrendingPromptMediaSubType4;
        StoryTrendingPromptMediaSubType[] storyTrendingPromptMediaSubTypeArr = {storyTrendingPromptMediaSubType, storyTrendingPromptMediaSubType2, storyTrendingPromptMediaSubType3, storyTrendingPromptMediaSubType4, new StoryTrendingPromptMediaSubType("UNCONNECTED", 4, "unconnected")};
        A03 = storyTrendingPromptMediaSubTypeArr;
        A02 = AbstractC12190kN.A00(storyTrendingPromptMediaSubTypeArr);
        StoryTrendingPromptMediaSubType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (StoryTrendingPromptMediaSubType storyTrendingPromptMediaSubType5 : values) {
            A18.put(storyTrendingPromptMediaSubType5.A00, storyTrendingPromptMediaSubType5);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(34);
    }

    public static StoryTrendingPromptMediaSubType valueOf(String str) {
        return (StoryTrendingPromptMediaSubType) Enum.valueOf(StoryTrendingPromptMediaSubType.class, str);
    }

    public static StoryTrendingPromptMediaSubType[] values() {
        return (StoryTrendingPromptMediaSubType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryTrendingPromptMediaSubType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
