package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProductTaggingFeedComponentType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductTaggingFeedComponentType[] A03;
    public static final ProductTaggingFeedComponentType A04;
    public static final ProductTaggingFeedComponentType A05;
    public static final ProductTaggingFeedComponentType A06;
    public static final ProductTaggingFeedComponentType A07;
    public static final ProductTaggingFeedComponentType A08;
    public static final ProductTaggingFeedComponentType A09;
    public static final ProductTaggingFeedComponentType A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductTaggingFeedComponentType productTaggingFeedComponentType = new ProductTaggingFeedComponentType("UNRECOGNIZED", 0, "ProductTaggingFeedComponentType_unspecified");
        A0A = productTaggingFeedComponentType;
        ProductTaggingFeedComponentType productTaggingFeedComponentType2 = new ProductTaggingFeedComponentType("BLOKS", 1, "bloks");
        A04 = productTaggingFeedComponentType2;
        ProductTaggingFeedComponentType productTaggingFeedComponentType3 = new ProductTaggingFeedComponentType("COMMERCE_ITEM", 2, "commerce_item");
        A05 = productTaggingFeedComponentType3;
        ProductTaggingFeedComponentType productTaggingFeedComponentType4 = new ProductTaggingFeedComponentType("DIVIDER", 3, "divider");
        A06 = productTaggingFeedComponentType4;
        ProductTaggingFeedComponentType productTaggingFeedComponentType5 = new ProductTaggingFeedComponentType("EXPANSION", 4, "expansion");
        A07 = productTaggingFeedComponentType5;
        ProductTaggingFeedComponentType productTaggingFeedComponentType6 = new ProductTaggingFeedComponentType("NULL_STATE", 5, "null_state");
        A08 = productTaggingFeedComponentType6;
        ProductTaggingFeedComponentType productTaggingFeedComponentType7 = new ProductTaggingFeedComponentType("TEXT_WITH_ENTITIES_BLOCK", 6, "text_with_entities_block");
        A09 = productTaggingFeedComponentType7;
        ProductTaggingFeedComponentType[] productTaggingFeedComponentTypeArr = {productTaggingFeedComponentType, productTaggingFeedComponentType2, productTaggingFeedComponentType3, productTaggingFeedComponentType4, productTaggingFeedComponentType5, productTaggingFeedComponentType6, productTaggingFeedComponentType7, new ProductTaggingFeedComponentType("TITLE", 7, DialogModule.KEY_TITLE)};
        A03 = productTaggingFeedComponentTypeArr;
        A02 = AbstractC12190kN.A00(productTaggingFeedComponentTypeArr);
        ProductTaggingFeedComponentType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProductTaggingFeedComponentType productTaggingFeedComponentType8 : values) {
            A18.put(productTaggingFeedComponentType8.A00, productTaggingFeedComponentType8);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(52);
    }

    public static ProductTaggingFeedComponentType valueOf(String str) {
        return (ProductTaggingFeedComponentType) Enum.valueOf(ProductTaggingFeedComponentType.class, str);
    }

    public static ProductTaggingFeedComponentType[] values() {
        return (ProductTaggingFeedComponentType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductTaggingFeedComponentType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
