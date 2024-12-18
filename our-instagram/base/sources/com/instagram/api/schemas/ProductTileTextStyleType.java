package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProductTileTextStyleType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductTileTextStyleType[] A03;
    public static final ProductTileTextStyleType A04;
    public static final ProductTileTextStyleType A05;
    public static final ProductTileTextStyleType A06;
    public static final ProductTileTextStyleType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductTileTextStyleType productTileTextStyleType = new ProductTileTextStyleType("UNRECOGNIZED", 0, "ProductTileTextStyleType_unspecified");
        A07 = productTileTextStyleType;
        ProductTileTextStyleType productTileTextStyleType2 = new ProductTileTextStyleType("BODY_1", 1, "body_1");
        A04 = productTileTextStyleType2;
        ProductTileTextStyleType productTileTextStyleType3 = new ProductTileTextStyleType("BODY_1_EMPHASIZED", 2, "body_1_emphasized");
        A05 = productTileTextStyleType3;
        ProductTileTextStyleType productTileTextStyleType4 = new ProductTileTextStyleType("ERROR", 3, "error");
        A06 = productTileTextStyleType4;
        ProductTileTextStyleType[] productTileTextStyleTypeArr = {productTileTextStyleType, productTileTextStyleType2, productTileTextStyleType3, productTileTextStyleType4, new ProductTileTextStyleType("SECONDARY", 4, "secondary")};
        A03 = productTileTextStyleTypeArr;
        A02 = AbstractC12190kN.A00(productTileTextStyleTypeArr);
        ProductTileTextStyleType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProductTileTextStyleType productTileTextStyleType5 : values) {
            A18.put(productTileTextStyleType5.A00, productTileTextStyleType5);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(69);
    }

    public static ProductTileTextStyleType valueOf(String str) {
        return (ProductTileTextStyleType) Enum.valueOf(ProductTileTextStyleType.class, str);
    }

    public static ProductTileTextStyleType[] values() {
        return (ProductTileTextStyleType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductTileTextStyleType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
