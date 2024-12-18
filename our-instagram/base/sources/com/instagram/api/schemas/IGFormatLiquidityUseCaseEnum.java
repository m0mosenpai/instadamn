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
public final class IGFormatLiquidityUseCaseEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGFormatLiquidityUseCaseEnum[] A03;
    public static final IGFormatLiquidityUseCaseEnum A04;
    public static final IGFormatLiquidityUseCaseEnum A05;
    public static final IGFormatLiquidityUseCaseEnum A06;
    public static final IGFormatLiquidityUseCaseEnum A07;
    public static final IGFormatLiquidityUseCaseEnum A08;
    public static final IGFormatLiquidityUseCaseEnum A09;
    public static final IGFormatLiquidityUseCaseEnum A0A;
    public static final IGFormatLiquidityUseCaseEnum A0B;
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
        IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum = new IGFormatLiquidityUseCaseEnum("UNRECOGNIZED", 0, "IGFormatLiquidityUseCaseEnum_unspecified");
        A0B = iGFormatLiquidityUseCaseEnum;
        IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum2 = new IGFormatLiquidityUseCaseEnum("DYNAMIC_CAROUSEL_TO_COLLECTION", 1, "DYNAMIC_CAROUSEL_TO_COLLECTION");
        A04 = iGFormatLiquidityUseCaseEnum2;
        IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum3 = new IGFormatLiquidityUseCaseEnum("PARTNERSHIP_DYNAMIC_COLLECTION", 2, "PARTNERSHIP_DYNAMIC_COLLECTION");
        A05 = iGFormatLiquidityUseCaseEnum3;
        IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum4 = new IGFormatLiquidityUseCaseEnum("PRODUCT_EXTENSION_SINGLE_MEDIA_9X16_LEARNING", 3, "PRODUCT_EXTENSION_SINGLE_MEDIA_9X16_LEARNING");
        A06 = iGFormatLiquidityUseCaseEnum4;
        IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum5 = new IGFormatLiquidityUseCaseEnum("PRODUCT_EXTENSION_SINGLE_MEDIA_TO_COLLECTION", 4, "PRODUCT_EXTENSION_SINGLE_MEDIA_TO_COLLECTION");
        A07 = iGFormatLiquidityUseCaseEnum5;
        IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum6 = new IGFormatLiquidityUseCaseEnum("PRODUCT_TAGS_SINGLE_MEDIA_TO_COLLECTION", 5, "PRODUCT_TAGS_SINGLE_MEDIA_TO_COLLECTION");
        A08 = iGFormatLiquidityUseCaseEnum6;
        IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum7 = new IGFormatLiquidityUseCaseEnum("PROFILE_EXTENSION_SINGLE_MEDIA_TO_COLLECTION", 6, "PROFILE_EXTENSION_SINGLE_MEDIA_TO_COLLECTION");
        A09 = iGFormatLiquidityUseCaseEnum7;
        IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum8 = new IGFormatLiquidityUseCaseEnum("SITE_EXTENSION_SINGLE_MEDIA_TO_COLLECTION", 7, "SITE_EXTENSION_SINGLE_MEDIA_TO_COLLECTION");
        A0A = iGFormatLiquidityUseCaseEnum8;
        IGFormatLiquidityUseCaseEnum[] iGFormatLiquidityUseCaseEnumArr = {iGFormatLiquidityUseCaseEnum, iGFormatLiquidityUseCaseEnum2, iGFormatLiquidityUseCaseEnum3, iGFormatLiquidityUseCaseEnum4, iGFormatLiquidityUseCaseEnum5, iGFormatLiquidityUseCaseEnum6, iGFormatLiquidityUseCaseEnum7, iGFormatLiquidityUseCaseEnum8, new IGFormatLiquidityUseCaseEnum("STATIC_CAROUSEL_TO_COLLECTION", 8, "STATIC_CAROUSEL_TO_COLLECTION")};
        A03 = iGFormatLiquidityUseCaseEnumArr;
        A02 = AbstractC12190kN.A00(iGFormatLiquidityUseCaseEnumArr);
        IGFormatLiquidityUseCaseEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum9 : values) {
            linkedHashMap.put(iGFormatLiquidityUseCaseEnum9.A00, iGFormatLiquidityUseCaseEnum9);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(16);
    }

    public static IGFormatLiquidityUseCaseEnum valueOf(String str) {
        return (IGFormatLiquidityUseCaseEnum) Enum.valueOf(IGFormatLiquidityUseCaseEnum.class, str);
    }

    public static IGFormatLiquidityUseCaseEnum[] values() {
        return (IGFormatLiquidityUseCaseEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGFormatLiquidityUseCaseEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
