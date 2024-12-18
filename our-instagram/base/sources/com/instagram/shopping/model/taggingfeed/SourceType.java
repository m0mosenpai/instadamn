package com.instagram.shopping.model.taggingfeed;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class SourceType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SourceType[] A03;
    public static final SourceType A04;
    public static final SourceType A05;
    public static final SourceType A06;
    public static final SourceType A07;
    public static final SourceType A08;
    public static final SourceType A09;
    public static final SourceType A0A;
    public static final SourceType A0B;
    public static final SourceType A0C;
    public static final SourceType A0D;
    public static final SourceType A0E;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        SourceType sourceType = new SourceType("UNRECOGNIZED", 0, "SourceType_unspecified");
        A0E = sourceType;
        SourceType sourceType2 = new SourceType("OPT_SHOP", 1, "opt_shop");
        A04 = sourceType2;
        SourceType sourceType3 = new SourceType("OPT_SOURCE_SELECTION", 2, "opt_source_selection");
        A05 = sourceType3;
        SourceType sourceType4 = new SourceType("PRODUCT_CATALOG", 3, "product_catalog");
        A06 = sourceType4;
        SourceType sourceType5 = new SourceType("PURCHASED_PRODUCTS", 4, "purchased_products");
        A07 = sourceType5;
        SourceType sourceType6 = new SourceType("SAVED_PRODUCTS", 5, "saved_products");
        A08 = sourceType6;
        SourceType sourceType7 = new SourceType("SELLER", 6, "seller");
        A09 = sourceType7;
        SourceType sourceType8 = new SourceType("SOURCE_SELECTION", 7, "source_selection");
        A0A = sourceType8;
        SourceType sourceType9 = new SourceType("STOREFRONT_COLLECTION", 8, "storefront_collection");
        A0B = sourceType9;
        SourceType sourceType10 = new SourceType("STOREFRONT_DISCOUNT", 9, "storefront_discount");
        A0C = sourceType10;
        SourceType sourceType11 = new SourceType("SUGGESTED_PRODUCT_SET", 10, "suggested_product_set");
        A0D = sourceType11;
        SourceType[] sourceTypeArr = {sourceType, sourceType2, sourceType3, sourceType4, sourceType5, sourceType6, sourceType7, sourceType8, sourceType9, sourceType10, sourceType11, new SourceType("SUGGESTED_PRODUCTS", 11, "suggested_products")};
        A03 = sourceTypeArr;
        A02 = AbstractC12190kN.A00(sourceTypeArr);
        SourceType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (SourceType sourceType12 : values) {
            A18.put(sourceType12.A00, sourceType12);
        }
        A01 = A18;
        CREATOR = C37324GcR.A00(91);
    }

    public static SourceType valueOf(String str) {
        return (SourceType) Enum.valueOf(SourceType.class, str);
    }

    public static SourceType[] values() {
        return (SourceType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public SourceType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
