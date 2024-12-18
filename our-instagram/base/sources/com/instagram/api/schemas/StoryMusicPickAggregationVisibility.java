package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class StoryMusicPickAggregationVisibility implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryMusicPickAggregationVisibility[] A03;
    public static final StoryMusicPickAggregationVisibility A04;
    public static final StoryMusicPickAggregationVisibility A05;
    public static final StoryMusicPickAggregationVisibility A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StoryMusicPickAggregationVisibility storyMusicPickAggregationVisibility = new StoryMusicPickAggregationVisibility("UNRECOGNIZED", 0, "StoryMusicPickAggregationVisibility_unspecified");
        A05 = storyMusicPickAggregationVisibility;
        StoryMusicPickAggregationVisibility storyMusicPickAggregationVisibility2 = new StoryMusicPickAggregationVisibility("VISIBLE", 1, "0");
        A06 = storyMusicPickAggregationVisibility2;
        StoryMusicPickAggregationVisibility storyMusicPickAggregationVisibility3 = new StoryMusicPickAggregationVisibility("HIDDEN", 2, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A04 = storyMusicPickAggregationVisibility3;
        StoryMusicPickAggregationVisibility[] storyMusicPickAggregationVisibilityArr = {storyMusicPickAggregationVisibility, storyMusicPickAggregationVisibility2, storyMusicPickAggregationVisibility3};
        A03 = storyMusicPickAggregationVisibilityArr;
        A02 = AbstractC12190kN.A00(storyMusicPickAggregationVisibilityArr);
        StoryMusicPickAggregationVisibility[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (StoryMusicPickAggregationVisibility storyMusicPickAggregationVisibility4 : values) {
            A18.put(storyMusicPickAggregationVisibility4.A00, storyMusicPickAggregationVisibility4);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(19);
    }

    public static StoryMusicPickAggregationVisibility valueOf(String str) {
        return (StoryMusicPickAggregationVisibility) Enum.valueOf(StoryMusicPickAggregationVisibility.class, str);
    }

    public static StoryMusicPickAggregationVisibility[] values() {
        return (StoryMusicPickAggregationVisibility[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryMusicPickAggregationVisibility(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
