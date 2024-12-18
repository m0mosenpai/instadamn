package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class IGAdsRrFormatEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsRrFormatEnum[] A03;
    public static final IGAdsRrFormatEnum A04;
    public static final IGAdsRrFormatEnum A05;
    public static final IGAdsRrFormatEnum A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGAdsRrFormatEnum iGAdsRrFormatEnum = new IGAdsRrFormatEnum("UNRECOGNIZED", 0, "IGAdsRrFormatEnum_unspecified");
        A06 = iGAdsRrFormatEnum;
        IGAdsRrFormatEnum iGAdsRrFormatEnum2 = new IGAdsRrFormatEnum("PROFILE_CARD_DIMENSIONAL", 1, "PROFILE_CARD_DIMENSIONAL");
        A04 = iGAdsRrFormatEnum2;
        IGAdsRrFormatEnum iGAdsRrFormatEnum3 = new IGAdsRrFormatEnum("PROFILE_CARD_RATING_ONLY", 2, "PROFILE_CARD_RATING_ONLY");
        A05 = iGAdsRrFormatEnum3;
        IGAdsRrFormatEnum[] iGAdsRrFormatEnumArr = {iGAdsRrFormatEnum, iGAdsRrFormatEnum2, iGAdsRrFormatEnum3, new IGAdsRrFormatEnum("PROFILE_CARD_TOPICS", 3, "PROFILE_CARD_TOPICS")};
        A03 = iGAdsRrFormatEnumArr;
        A02 = AbstractC12190kN.A00(iGAdsRrFormatEnumArr);
        IGAdsRrFormatEnum[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (IGAdsRrFormatEnum iGAdsRrFormatEnum4 : values) {
            linkedHashMap.put(iGAdsRrFormatEnum4.A00, iGAdsRrFormatEnum4);
        }
        A01 = linkedHashMap;
        CREATOR = new C41858IgC(22);
    }

    public static IGAdsRrFormatEnum valueOf(String str) {
        return (IGAdsRrFormatEnum) Enum.valueOf(IGAdsRrFormatEnum.class, str);
    }

    public static IGAdsRrFormatEnum[] values() {
        return (IGAdsRrFormatEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsRrFormatEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
