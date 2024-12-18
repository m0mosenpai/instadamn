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
public final class ProductTileTextColorType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductTileTextColorType[] A03;
    public static final ProductTileTextColorType A04;
    public static final ProductTileTextColorType A05;
    public static final ProductTileTextColorType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductTileTextColorType productTileTextColorType = new ProductTileTextColorType("UNRECOGNIZED", 0, "ProductTileTextColorType_unspecified");
        A06 = productTileTextColorType;
        ProductTileTextColorType productTileTextColorType2 = new ProductTileTextColorType("PRIMARY_BUTTON", 1, "primary_button");
        A04 = productTileTextColorType2;
        ProductTileTextColorType productTileTextColorType3 = new ProductTileTextColorType("PRIMARY_TEXT", 2, "primary_text");
        A05 = productTileTextColorType3;
        ProductTileTextColorType[] productTileTextColorTypeArr = {productTileTextColorType, productTileTextColorType2, productTileTextColorType3, new ProductTileTextColorType("SECONDARY_TEXT", 3, "secondary_text")};
        A03 = productTileTextColorTypeArr;
        A02 = AbstractC12190kN.A00(productTileTextColorTypeArr);
        ProductTileTextColorType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProductTileTextColorType productTileTextColorType4 : values) {
            A18.put(productTileTextColorType4.A00, productTileTextColorType4);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(68);
    }

    public static ProductTileTextColorType valueOf(String str) {
        return (ProductTileTextColorType) Enum.valueOf(ProductTileTextColorType.class, str);
    }

    public static ProductTileTextColorType[] values() {
        return (ProductTileTextColorType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductTileTextColorType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
