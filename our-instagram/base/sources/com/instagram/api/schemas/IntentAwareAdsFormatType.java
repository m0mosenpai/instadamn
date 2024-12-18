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
/* loaded from: classes3.dex */
public final class IntentAwareAdsFormatType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IntentAwareAdsFormatType[] A03;
    public static final IntentAwareAdsFormatType A04;
    public static final IntentAwareAdsFormatType A05;
    public static final IntentAwareAdsFormatType A06;
    public static final IntentAwareAdsFormatType A07;
    public static final IntentAwareAdsFormatType A08;
    public static final IntentAwareAdsFormatType A09;
    public static final IntentAwareAdsFormatType A0A;
    public static final IntentAwareAdsFormatType A0B;
    public static final IntentAwareAdsFormatType A0C;
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
        IntentAwareAdsFormatType intentAwareAdsFormatType = new IntentAwareAdsFormatType("UNRECOGNIZED", 0, "IntentAwareAdsFormatType_unspecified");
        A0C = intentAwareAdsFormatType;
        IntentAwareAdsFormatType intentAwareAdsFormatType2 = new IntentAwareAdsFormatType("B2B_AD_POD", 1, "B2B_AD_POD");
        A04 = intentAwareAdsFormatType2;
        IntentAwareAdsFormatType intentAwareAdsFormatType3 = new IntentAwareAdsFormatType("GRID", 2, "GRID");
        A05 = intentAwareAdsFormatType3;
        IntentAwareAdsFormatType intentAwareAdsFormatType4 = new IntentAwareAdsFormatType("H_SCROLL", 3, "H_SCROLL");
        A06 = intentAwareAdsFormatType4;
        IntentAwareAdsFormatType intentAwareAdsFormatType5 = new IntentAwareAdsFormatType("MAC_BANNER_V1", 4, "MAC_BANNER_V1");
        A07 = intentAwareAdsFormatType5;
        IntentAwareAdsFormatType intentAwareAdsFormatType6 = new IntentAwareAdsFormatType("MAC_SUBTLE_V1", 5, "MAC_SUBTLE_V1");
        A08 = intentAwareAdsFormatType6;
        IntentAwareAdsFormatType intentAwareAdsFormatType7 = new IntentAwareAdsFormatType("MAC_SUBTLE_V2", 6, "MAC_SUBTLE_V2");
        A09 = intentAwareAdsFormatType7;
        IntentAwareAdsFormatType intentAwareAdsFormatType8 = new IntentAwareAdsFormatType("MEGACARD", 7, "MEGACARD");
        A0A = intentAwareAdsFormatType8;
        IntentAwareAdsFormatType intentAwareAdsFormatType9 = new IntentAwareAdsFormatType("SINGLE_AD", 8, "SINGLE_AD");
        A0B = intentAwareAdsFormatType9;
        IntentAwareAdsFormatType[] intentAwareAdsFormatTypeArr = {intentAwareAdsFormatType, intentAwareAdsFormatType2, intentAwareAdsFormatType3, intentAwareAdsFormatType4, intentAwareAdsFormatType5, intentAwareAdsFormatType6, intentAwareAdsFormatType7, intentAwareAdsFormatType8, intentAwareAdsFormatType9};
        A03 = intentAwareAdsFormatTypeArr;
        A02 = AbstractC12190kN.A00(intentAwareAdsFormatTypeArr);
        IntentAwareAdsFormatType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IntentAwareAdsFormatType intentAwareAdsFormatType10 : values) {
            linkedHashMap.put(intentAwareAdsFormatType10.A00, intentAwareAdsFormatType10);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(32);
    }

    public static IntentAwareAdsFormatType valueOf(String str) {
        return (IntentAwareAdsFormatType) Enum.valueOf(IntentAwareAdsFormatType.class, str);
    }

    public static IntentAwareAdsFormatType[] values() {
        return (IntentAwareAdsFormatType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IntentAwareAdsFormatType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
