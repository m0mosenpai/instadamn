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
public final class StoryPromptPrefType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryPromptPrefType[] A03;
    public static final StoryPromptPrefType A04;
    public static final StoryPromptPrefType A05;
    public static final StoryPromptPrefType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StoryPromptPrefType storyPromptPrefType = new StoryPromptPrefType("UNRECOGNIZED", 0, "StoryPromptPrefType_unspecified");
        A06 = storyPromptPrefType;
        StoryPromptPrefType storyPromptPrefType2 = new StoryPromptPrefType("NOT_APPLICABLE", 1, "0");
        A04 = storyPromptPrefType2;
        StoryPromptPrefType storyPromptPrefType3 = new StoryPromptPrefType("ON", 2, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A05 = storyPromptPrefType3;
        StoryPromptPrefType[] storyPromptPrefTypeArr = {storyPromptPrefType, storyPromptPrefType2, storyPromptPrefType3, new StoryPromptPrefType("OFF", 3, "2")};
        A03 = storyPromptPrefTypeArr;
        A02 = AbstractC12190kN.A00(storyPromptPrefTypeArr);
        StoryPromptPrefType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (StoryPromptPrefType storyPromptPrefType4 : values) {
            A18.put(storyPromptPrefType4.A00, storyPromptPrefType4);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(24);
    }

    public static StoryPromptPrefType valueOf(String str) {
        return (StoryPromptPrefType) Enum.valueOf(StoryPromptPrefType.class, str);
    }

    public static StoryPromptPrefType[] values() {
        return (StoryPromptPrefType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryPromptPrefType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
