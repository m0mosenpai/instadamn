package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class IntegrityInterstitialType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IntegrityInterstitialType[] A03;
    public static final IntegrityInterstitialType A04;
    public static final IntegrityInterstitialType A05;
    public static final IntegrityInterstitialType A06;
    public static final IntegrityInterstitialType A07;
    public static final IntegrityInterstitialType A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IntegrityInterstitialType integrityInterstitialType = new IntegrityInterstitialType("UNRECOGNIZED", 0, "IntegrityInterstitialType_unspecified");
        A07 = integrityInterstitialType;
        IntegrityInterstitialType integrityInterstitialType2 = new IntegrityInterstitialType("BLOCK_ACCESS", 1, "BLOCK_ACCESS");
        A04 = integrityInterstitialType2;
        IntegrityInterstitialType integrityInterstitialType3 = new IntegrityInterstitialType("COHORT_BLOCK", 2, "COHORT_BLOCK");
        A05 = integrityInterstitialType3;
        IntegrityInterstitialType integrityInterstitialType4 = new IntegrityInterstitialType("COHORT_BLOCK_CA", 3, "COHORT_BLOCK_CA");
        A06 = integrityInterstitialType4;
        IntegrityInterstitialType integrityInterstitialType5 = new IntegrityInterstitialType("WARN_USER", 4, "WARN_USER");
        A08 = integrityInterstitialType5;
        IntegrityInterstitialType[] integrityInterstitialTypeArr = {integrityInterstitialType, integrityInterstitialType2, integrityInterstitialType3, integrityInterstitialType4, integrityInterstitialType5};
        A03 = integrityInterstitialTypeArr;
        A02 = AbstractC12190kN.A00(integrityInterstitialTypeArr);
        IntegrityInterstitialType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IntegrityInterstitialType integrityInterstitialType6 : values) {
            A18.put(integrityInterstitialType6.A00, integrityInterstitialType6);
        }
        A01 = A18;
        CREATOR = new C41858IgC(62);
    }

    public static IntegrityInterstitialType valueOf(String str) {
        return (IntegrityInterstitialType) Enum.valueOf(IntegrityInterstitialType.class, str);
    }

    public static IntegrityInterstitialType[] values() {
        return (IntegrityInterstitialType[]) A03.clone();
    }

    public IntegrityInterstitialType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
