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
public final class IGAdsGenericCardInfoTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdsGenericCardInfoTypeEnum[] A03;
    public static final IGAdsGenericCardInfoTypeEnum A04;
    public static final IGAdsGenericCardInfoTypeEnum A05;
    public static final IGAdsGenericCardInfoTypeEnum A06;
    public static final IGAdsGenericCardInfoTypeEnum A07;
    public static final IGAdsGenericCardInfoTypeEnum A08;
    public static final IGAdsGenericCardInfoTypeEnum A09;
    public static final IGAdsGenericCardInfoTypeEnum A0A;
    public static final IGAdsGenericCardInfoTypeEnum A0B;
    public static final IGAdsGenericCardInfoTypeEnum A0C;
    public static final IGAdsGenericCardInfoTypeEnum A0D;
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
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum = new IGAdsGenericCardInfoTypeEnum("UNRECOGNIZED", 0, "IGAdsGenericCardInfoTypeEnum_unspecified");
        A0D = iGAdsGenericCardInfoTypeEnum;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum2 = new IGAdsGenericCardInfoTypeEnum("BASIC_CARD", 1, "BASIC_CARD");
        A04 = iGAdsGenericCardInfoTypeEnum2;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum3 = new IGAdsGenericCardInfoTypeEnum("HEADLINE", 2, "HEADLINE");
        A05 = iGAdsGenericCardInfoTypeEnum3;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum4 = new IGAdsGenericCardInfoTypeEnum("JOIN_TIME", 3, "JOIN_TIME");
        A06 = iGAdsGenericCardInfoTypeEnum4;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum5 = new IGAdsGenericCardInfoTypeEnum("NUMBER_OF_FOLLOWERS", 4, "NUMBER_OF_FOLLOWERS");
        A07 = iGAdsGenericCardInfoTypeEnum5;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum6 = new IGAdsGenericCardInfoTypeEnum("PAYMENT_OPTIONS", 5, "PAYMENT_OPTIONS");
        A08 = iGAdsGenericCardInfoTypeEnum6;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum7 = new IGAdsGenericCardInfoTypeEnum("PRICE_RANGE", 6, "PRICE_RANGE");
        A09 = iGAdsGenericCardInfoTypeEnum7;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum8 = new IGAdsGenericCardInfoTypeEnum("RATING_AND_REVIEW", 7, "RATING_AND_REVIEW");
        A0A = iGAdsGenericCardInfoTypeEnum8;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum9 = new IGAdsGenericCardInfoTypeEnum("RETURN_POLICY", 8, "RETURN_POLICY");
        A0B = iGAdsGenericCardInfoTypeEnum9;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum10 = new IGAdsGenericCardInfoTypeEnum("SHIPPING_POLICY", 9, "SHIPPING_POLICY");
        A0C = iGAdsGenericCardInfoTypeEnum10;
        IGAdsGenericCardInfoTypeEnum[] iGAdsGenericCardInfoTypeEnumArr = {iGAdsGenericCardInfoTypeEnum, iGAdsGenericCardInfoTypeEnum2, iGAdsGenericCardInfoTypeEnum3, iGAdsGenericCardInfoTypeEnum4, iGAdsGenericCardInfoTypeEnum5, iGAdsGenericCardInfoTypeEnum6, iGAdsGenericCardInfoTypeEnum7, iGAdsGenericCardInfoTypeEnum8, iGAdsGenericCardInfoTypeEnum9, iGAdsGenericCardInfoTypeEnum10, new IGAdsGenericCardInfoTypeEnum("SHORT_CAPTION", 10, "SHORT_CAPTION")};
        A03 = iGAdsGenericCardInfoTypeEnumArr;
        A02 = AbstractC12190kN.A00(iGAdsGenericCardInfoTypeEnumArr);
        IGAdsGenericCardInfoTypeEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum11 : values) {
            linkedHashMap.put(iGAdsGenericCardInfoTypeEnum11.A00, iGAdsGenericCardInfoTypeEnum11);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(10);
    }

    public static IGAdsGenericCardInfoTypeEnum valueOf(String str) {
        return (IGAdsGenericCardInfoTypeEnum) Enum.valueOf(IGAdsGenericCardInfoTypeEnum.class, str);
    }

    public static IGAdsGenericCardInfoTypeEnum[] values() {
        return (IGAdsGenericCardInfoTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAdsGenericCardInfoTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
