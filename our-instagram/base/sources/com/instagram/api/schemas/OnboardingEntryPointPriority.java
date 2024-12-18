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
/* loaded from: classes2.dex */
public final class OnboardingEntryPointPriority implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ OnboardingEntryPointPriority[] A03;
    public static final OnboardingEntryPointPriority A04;
    public static final OnboardingEntryPointPriority A05;
    public static final OnboardingEntryPointPriority A06;
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
        OnboardingEntryPointPriority onboardingEntryPointPriority = new OnboardingEntryPointPriority("UNRECOGNIZED", 0, "OnboardingEntryPointPriority_unspecified");
        A06 = onboardingEntryPointPriority;
        OnboardingEntryPointPriority onboardingEntryPointPriority2 = new OnboardingEntryPointPriority("HIGH", 1, "3");
        A04 = onboardingEntryPointPriority2;
        OnboardingEntryPointPriority onboardingEntryPointPriority3 = new OnboardingEntryPointPriority("LOW", 2, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A05 = onboardingEntryPointPriority3;
        OnboardingEntryPointPriority[] onboardingEntryPointPriorityArr = {onboardingEntryPointPriority, onboardingEntryPointPriority2, onboardingEntryPointPriority3, new OnboardingEntryPointPriority("MID", 3, "2")};
        A03 = onboardingEntryPointPriorityArr;
        A02 = AbstractC12190kN.A00(onboardingEntryPointPriorityArr);
        OnboardingEntryPointPriority[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (OnboardingEntryPointPriority onboardingEntryPointPriority4 : values) {
            linkedHashMap.put(onboardingEntryPointPriority4.A00, onboardingEntryPointPriority4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(71);
    }

    public static OnboardingEntryPointPriority valueOf(String str) {
        return (OnboardingEntryPointPriority) Enum.valueOf(OnboardingEntryPointPriority.class, str);
    }

    public static OnboardingEntryPointPriority[] values() {
        return (OnboardingEntryPointPriority[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public OnboardingEntryPointPriority(String str, int i, String str2) {
        this.A00 = str2;
    }
}
