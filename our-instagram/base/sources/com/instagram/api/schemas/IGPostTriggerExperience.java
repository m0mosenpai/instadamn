package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IGPostTriggerExperience implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGPostTriggerExperience[] A03;
    public static final IGPostTriggerExperience A04;
    public static final IGPostTriggerExperience A05;
    public static final IGPostTriggerExperience A06;
    public static final IGPostTriggerExperience A07;
    public static final IGPostTriggerExperience A08;
    public static final IGPostTriggerExperience A09;
    public static final IGPostTriggerExperience A0A;
    public static final IGPostTriggerExperience A0B;
    public static final IGPostTriggerExperience A0C;
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
        IGPostTriggerExperience iGPostTriggerExperience = new IGPostTriggerExperience("UNRECOGNIZED", 0, "IGPostTriggerExperience_unspecified");
        A0C = iGPostTriggerExperience;
        IGPostTriggerExperience iGPostTriggerExperience2 = new IGPostTriggerExperience("IG_POST_TRIGGER_EXPERIENCE_CONTEXTUAL_REELS_PILL", 1, "6");
        A04 = iGPostTriggerExperience2;
        IGPostTriggerExperience iGPostTriggerExperience3 = new IGPostTriggerExperience("IG_POST_TRIGGER_EXPERIENCE_EXPLORE_GRID_AD_ELIGIBLE_FOR_B2B_ADS", 2, "9");
        A05 = iGPostTriggerExperience3;
        IGPostTriggerExperience iGPostTriggerExperience4 = new IGPostTriggerExperience("IG_POST_TRIGGER_EXPERIENCE_FEED_POST_AD_ENGAGEMENT_GAP_0", 3, "4");
        A06 = iGPostTriggerExperience4;
        IGPostTriggerExperience iGPostTriggerExperience5 = new IGPostTriggerExperience("IG_POST_TRIGGER_EXPERIENCE_FEED_VIDEO_AD_TO_REELS_CHAIN", 4, "5");
        A07 = iGPostTriggerExperience5;
        IGPostTriggerExperience iGPostTriggerExperience6 = new IGPostTriggerExperience("IG_POST_TRIGGER_EXPERIENCE_FEED_VIDEO_AD_TO_REELS_CHAIN_FOR_B2B_ELIGIBLE_ADS", 5, "7");
        A08 = iGPostTriggerExperience6;
        IGPostTriggerExperience iGPostTriggerExperience7 = new IGPostTriggerExperience("IG_POST_TRIGGER_EXPERIENCE_REELS_POST_AD_ENGAGEMENT_GAP_0", 6, "8");
        A09 = iGPostTriggerExperience7;
        IGPostTriggerExperience iGPostTriggerExperience8 = new IGPostTriggerExperience("IG_POST_TRIGGER_EXPERIENCE_STORIES_CONTEXTUAL_AD_NEXT_AD_SLOT", 7, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0A = iGPostTriggerExperience8;
        IGPostTriggerExperience iGPostTriggerExperience9 = new IGPostTriggerExperience("IG_POST_TRIGGER_EXPERIENCE_STORIES_MULTI_ADVERTISER_CAROUSEL", 8, "3");
        A0B = iGPostTriggerExperience9;
        IGPostTriggerExperience[] iGPostTriggerExperienceArr = {iGPostTriggerExperience, iGPostTriggerExperience2, iGPostTriggerExperience3, iGPostTriggerExperience4, iGPostTriggerExperience5, iGPostTriggerExperience6, iGPostTriggerExperience7, iGPostTriggerExperience8, iGPostTriggerExperience9, new IGPostTriggerExperience("IG_POST_TRIGGER_EXPERIENCE_STORIES_RECONSIDERATION_INJECTED_STORY", 9, "2")};
        A03 = iGPostTriggerExperienceArr;
        A02 = AbstractC12190kN.A00(iGPostTriggerExperienceArr);
        IGPostTriggerExperience[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGPostTriggerExperience iGPostTriggerExperience10 : values) {
            linkedHashMap.put(iGPostTriggerExperience10.A00, iGPostTriggerExperience10);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(24);
    }

    public static IGPostTriggerExperience valueOf(String str) {
        return (IGPostTriggerExperience) Enum.valueOf(IGPostTriggerExperience.class, str);
    }

    public static IGPostTriggerExperience[] values() {
        return (IGPostTriggerExperience[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGPostTriggerExperience(String str, int i, String str2) {
        this.A00 = str2;
    }
}
