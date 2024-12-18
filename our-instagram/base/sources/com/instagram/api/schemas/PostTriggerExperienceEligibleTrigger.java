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
public final class PostTriggerExperienceEligibleTrigger implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PostTriggerExperienceEligibleTrigger[] A03;
    public static final PostTriggerExperienceEligibleTrigger A04;
    public static final PostTriggerExperienceEligibleTrigger A05;
    public static final PostTriggerExperienceEligibleTrigger A06;
    public static final PostTriggerExperienceEligibleTrigger A07;
    public static final PostTriggerExperienceEligibleTrigger A08;
    public static final PostTriggerExperienceEligibleTrigger A09;
    public static final PostTriggerExperienceEligibleTrigger A0A;
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
        PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger = new PostTriggerExperienceEligibleTrigger("UNRECOGNIZED", 0, "PostTriggerExperienceEligibleTrigger_unspecified");
        A0A = postTriggerExperienceEligibleTrigger;
        PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger2 = new PostTriggerExperienceEligibleTrigger("CAPTION_TAP", 1, "5");
        A04 = postTriggerExperienceEligibleTrigger2;
        PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger3 = new PostTriggerExperienceEligibleTrigger("CTA_CLICK", 2, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A05 = postTriggerExperienceEligibleTrigger3;
        PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger4 = new PostTriggerExperienceEligibleTrigger("DWELL_5S", 3, "6");
        A06 = postTriggerExperienceEligibleTrigger4;
        PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger5 = new PostTriggerExperienceEligibleTrigger("OPT_IN_TAP", 4, "4");
        A07 = postTriggerExperienceEligibleTrigger5;
        PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger6 = new PostTriggerExperienceEligibleTrigger("PROFILE_TAP", 5, "2");
        A08 = postTriggerExperienceEligibleTrigger6;
        PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger7 = new PostTriggerExperienceEligibleTrigger("RESHARE_BUTTON", 6, "7");
        A09 = postTriggerExperienceEligibleTrigger7;
        PostTriggerExperienceEligibleTrigger[] postTriggerExperienceEligibleTriggerArr = {postTriggerExperienceEligibleTrigger, postTriggerExperienceEligibleTrigger2, postTriggerExperienceEligibleTrigger3, postTriggerExperienceEligibleTrigger4, postTriggerExperienceEligibleTrigger5, postTriggerExperienceEligibleTrigger6, postTriggerExperienceEligibleTrigger7, new PostTriggerExperienceEligibleTrigger("TAP_AND_HOLD", 7, "3")};
        A03 = postTriggerExperienceEligibleTriggerArr;
        A02 = AbstractC12190kN.A00(postTriggerExperienceEligibleTriggerArr);
        PostTriggerExperienceEligibleTrigger[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger8 : values) {
            linkedHashMap.put(postTriggerExperienceEligibleTrigger8.A00, postTriggerExperienceEligibleTrigger8);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(81);
    }

    public static PostTriggerExperienceEligibleTrigger valueOf(String str) {
        return (PostTriggerExperienceEligibleTrigger) Enum.valueOf(PostTriggerExperienceEligibleTrigger.class, str);
    }

    public static PostTriggerExperienceEligibleTrigger[] values() {
        return (PostTriggerExperienceEligibleTrigger[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PostTriggerExperienceEligibleTrigger(String str, int i, String str2) {
        this.A00 = str2;
    }
}
