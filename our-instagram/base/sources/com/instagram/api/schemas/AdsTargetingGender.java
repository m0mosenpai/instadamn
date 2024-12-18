package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AdsTargetingGender implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AdsTargetingGender[] A03;
    public static final AdsTargetingGender A04;
    public static final AdsTargetingGender A05;
    public static final AdsTargetingGender A06;
    public static final AdsTargetingGender A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AdsTargetingGender adsTargetingGender = new AdsTargetingGender("UNRECOGNIZED", 0, "AdsTargetingGender_unspecified");
        A07 = adsTargetingGender;
        AdsTargetingGender adsTargetingGender2 = new AdsTargetingGender("ALL", 1, "ALL");
        A04 = adsTargetingGender2;
        AdsTargetingGender adsTargetingGender3 = new AdsTargetingGender("FEMALE", 2, "FEMALE");
        A05 = adsTargetingGender3;
        AdsTargetingGender adsTargetingGender4 = new AdsTargetingGender("MALE", 3, "MALE");
        A06 = adsTargetingGender4;
        AdsTargetingGender[] adsTargetingGenderArr = {adsTargetingGender, adsTargetingGender2, adsTargetingGender3, adsTargetingGender4};
        A03 = adsTargetingGenderArr;
        A02 = AbstractC12190kN.A00(adsTargetingGenderArr);
        AdsTargetingGender[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (AdsTargetingGender adsTargetingGender5 : values) {
            linkedHashMap.put(adsTargetingGender5.A00, adsTargetingGender5);
        }
        A01 = linkedHashMap;
        CREATOR = new C63469Sl9(43);
    }

    public static AdsTargetingGender valueOf(String str) {
        return (AdsTargetingGender) Enum.valueOf(AdsTargetingGender.class, str);
    }

    public static AdsTargetingGender[] values() {
        return (AdsTargetingGender[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AdsTargetingGender(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
