package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class StoryPromptDisablementState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryPromptDisablementState[] A03;
    public static final StoryPromptDisablementState A04;
    public static final StoryPromptDisablementState A05;
    public static final StoryPromptDisablementState A06;
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
        StoryPromptDisablementState storyPromptDisablementState = new StoryPromptDisablementState("UNRECOGNIZED", 0, "StoryPromptDisablementState_unspecified");
        A06 = storyPromptDisablementState;
        StoryPromptDisablementState storyPromptDisablementState2 = new StoryPromptDisablementState("DISABLED", 1, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A04 = storyPromptDisablementState2;
        StoryPromptDisablementState storyPromptDisablementState3 = new StoryPromptDisablementState("ENABLED", 2, "0");
        A05 = storyPromptDisablementState3;
        StoryPromptDisablementState[] storyPromptDisablementStateArr = {storyPromptDisablementState, storyPromptDisablementState2, storyPromptDisablementState3};
        A03 = storyPromptDisablementStateArr;
        A02 = AbstractC12190kN.A00(storyPromptDisablementStateArr);
        StoryPromptDisablementState[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (StoryPromptDisablementState storyPromptDisablementState4 : values) {
            linkedHashMap.put(storyPromptDisablementState4.A00, storyPromptDisablementState4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(14);
    }

    public static StoryPromptDisablementState valueOf(String str) {
        return (StoryPromptDisablementState) Enum.valueOf(StoryPromptDisablementState.class, str);
    }

    public static StoryPromptDisablementState[] values() {
        return (StoryPromptDisablementState[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryPromptDisablementState(String str, int i, String str2) {
        this.A00 = str2;
    }
}
