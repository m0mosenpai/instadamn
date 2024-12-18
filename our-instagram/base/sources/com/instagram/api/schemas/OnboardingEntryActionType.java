package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class OnboardingEntryActionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ OnboardingEntryActionType[] A03;
    public static final OnboardingEntryActionType A04;
    public static final OnboardingEntryActionType A05;
    public static final OnboardingEntryActionType A06;
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
        OnboardingEntryActionType onboardingEntryActionType = new OnboardingEntryActionType("UNRECOGNIZED", 0, "OnboardingEntryActionType_unspecified");
        A06 = onboardingEntryActionType;
        OnboardingEntryActionType onboardingEntryActionType2 = new OnboardingEntryActionType("GIFT_AWARENESS", 1, "gift_awareness");
        A04 = onboardingEntryActionType2;
        OnboardingEntryActionType onboardingEntryActionType3 = new OnboardingEntryActionType("GIFT_FEED", 2, "gift_feed");
        A05 = onboardingEntryActionType3;
        OnboardingEntryActionType[] onboardingEntryActionTypeArr = {onboardingEntryActionType, onboardingEntryActionType2, onboardingEntryActionType3, new OnboardingEntryActionType("GIFTING", 3, "gifting")};
        A03 = onboardingEntryActionTypeArr;
        A02 = AbstractC12190kN.A00(onboardingEntryActionTypeArr);
        OnboardingEntryActionType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (OnboardingEntryActionType onboardingEntryActionType4 : values) {
            linkedHashMap.put(onboardingEntryActionType4.A00, onboardingEntryActionType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(70);
    }

    public static OnboardingEntryActionType valueOf(String str) {
        return (OnboardingEntryActionType) Enum.valueOf(OnboardingEntryActionType.class, str);
    }

    public static OnboardingEntryActionType[] values() {
        return (OnboardingEntryActionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public OnboardingEntryActionType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
