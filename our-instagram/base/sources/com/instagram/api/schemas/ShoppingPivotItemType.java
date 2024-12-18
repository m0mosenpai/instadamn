package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ShoppingPivotItemType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ShoppingPivotItemType[] A03;
    public static final ShoppingPivotItemType A04;
    public static final ShoppingPivotItemType A05;
    public static final ShoppingPivotItemType A06;
    public static final ShoppingPivotItemType A07;
    public static final ShoppingPivotItemType A08;
    public static final ShoppingPivotItemType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ShoppingPivotItemType shoppingPivotItemType = new ShoppingPivotItemType("UNRECOGNIZED", 0, "ShoppingPivotItemType_unspecified");
        A09 = shoppingPivotItemType;
        ShoppingPivotItemType shoppingPivotItemType2 = new ShoppingPivotItemType("BRANDS_WITH_PRODUCTS", 1, "brands_with_products");
        A04 = shoppingPivotItemType2;
        ShoppingPivotItemType shoppingPivotItemType3 = new ShoppingPivotItemType("FEATURED_PRODUCTS", 2, "featured_products");
        A05 = shoppingPivotItemType3;
        ShoppingPivotItemType shoppingPivotItemType4 = new ShoppingPivotItemType("MULTIBRAND_PRODUCT", 3, "multibrand_product");
        A06 = shoppingPivotItemType4;
        ShoppingPivotItemType shoppingPivotItemType5 = new ShoppingPivotItemType("RECONSIDERATION_PRODUCTS", 4, "reconsideration_products");
        A07 = shoppingPivotItemType5;
        ShoppingPivotItemType shoppingPivotItemType6 = new ShoppingPivotItemType("SINGLEBRAND_PRODUCT", 5, "singlebrand_product");
        A08 = shoppingPivotItemType6;
        ShoppingPivotItemType[] shoppingPivotItemTypeArr = {shoppingPivotItemType, shoppingPivotItemType2, shoppingPivotItemType3, shoppingPivotItemType4, shoppingPivotItemType5, shoppingPivotItemType6, new ShoppingPivotItemType("TAGGED_PRODUCTS", 6, "tagged_products")};
        A03 = shoppingPivotItemTypeArr;
        A02 = AbstractC12190kN.A00(shoppingPivotItemTypeArr);
        ShoppingPivotItemType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ShoppingPivotItemType shoppingPivotItemType7 : values) {
            A18.put(shoppingPivotItemType7.A00, shoppingPivotItemType7);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(2);
    }

    public static ShoppingPivotItemType valueOf(String str) {
        return (ShoppingPivotItemType) Enum.valueOf(ShoppingPivotItemType.class, str);
    }

    public static ShoppingPivotItemType[] values() {
        return (ShoppingPivotItemType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ShoppingPivotItemType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
