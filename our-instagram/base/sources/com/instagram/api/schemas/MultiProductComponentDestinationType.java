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
public final class MultiProductComponentDestinationType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MultiProductComponentDestinationType[] A03;
    public static final MultiProductComponentDestinationType A04;
    public static final MultiProductComponentDestinationType A05;
    public static final MultiProductComponentDestinationType A06;
    public static final MultiProductComponentDestinationType A07;
    public static final MultiProductComponentDestinationType A08;
    public static final MultiProductComponentDestinationType A09;
    public static final MultiProductComponentDestinationType A0A;
    public static final MultiProductComponentDestinationType A0B;
    public static final MultiProductComponentDestinationType A0C;
    public static final MultiProductComponentDestinationType A0D;
    public static final MultiProductComponentDestinationType A0E;
    public static final MultiProductComponentDestinationType A0F;
    public static final MultiProductComponentDestinationType A0G;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MultiProductComponentDestinationType multiProductComponentDestinationType = new MultiProductComponentDestinationType("UNRECOGNIZED", 0, "MultiProductComponentDestinationType_unspecified");
        A0G = multiProductComponentDestinationType;
        MultiProductComponentDestinationType multiProductComponentDestinationType2 = new MultiProductComponentDestinationType("BAG_FROM_MERCHANT", 1, "bag_from_merchant");
        A04 = multiProductComponentDestinationType2;
        MultiProductComponentDestinationType multiProductComponentDestinationType3 = new MultiProductComponentDestinationType("CHECKOUT_RECONSIDERATION", 2, "checkout_reconsideration");
        A05 = multiProductComponentDestinationType3;
        MultiProductComponentDestinationType multiProductComponentDestinationType4 = new MultiProductComponentDestinationType("CTA_WITH_DISMISS", 3, "cta_with_dismiss");
        A06 = multiProductComponentDestinationType4;
        MultiProductComponentDestinationType multiProductComponentDestinationType5 = new MultiProductComponentDestinationType("EDITORIAL", 4, "editorial");
        A07 = multiProductComponentDestinationType5;
        MultiProductComponentDestinationType multiProductComponentDestinationType6 = new MultiProductComponentDestinationType("PRODUCTS_FROM_FOLLOWED_BRANDS", 5, "products_from_followed_brands");
        A08 = multiProductComponentDestinationType6;
        MultiProductComponentDestinationType multiProductComponentDestinationType7 = new MultiProductComponentDestinationType("PRODUCTS_FROM_LIKED_MEDIA", 6, "products_from_liked_media");
        A09 = multiProductComponentDestinationType7;
        MultiProductComponentDestinationType multiProductComponentDestinationType8 = new MultiProductComponentDestinationType("PRODUCTS_FROM_SAVED_MEDIA", 7, "products_from_saved_media");
        A0A = multiProductComponentDestinationType8;
        MultiProductComponentDestinationType multiProductComponentDestinationType9 = new MultiProductComponentDestinationType("PROFILE_SHOP_RECONSIDERATION_HSCROLLS_FEED", 8, "profile_shop_product_collections_feed");
        A0B = multiProductComponentDestinationType9;
        MultiProductComponentDestinationType multiProductComponentDestinationType10 = new MultiProductComponentDestinationType("RECENTLY_VIEWED_FROM_MERCHANT", 9, "recently_viewed_from_merchant");
        A0C = multiProductComponentDestinationType10;
        MultiProductComponentDestinationType multiProductComponentDestinationType11 = new MultiProductComponentDestinationType("SAVED", 10, "saved");
        A0D = multiProductComponentDestinationType11;
        MultiProductComponentDestinationType multiProductComponentDestinationType12 = new MultiProductComponentDestinationType("SAVED_FROM_MERCHANT", 11, "saved_from_merchant");
        A0E = multiProductComponentDestinationType12;
        MultiProductComponentDestinationType multiProductComponentDestinationType13 = new MultiProductComponentDestinationType("SAVED_FROM_MERCHANTS", 12, "saved_from_merchants");
        A0F = multiProductComponentDestinationType13;
        MultiProductComponentDestinationType[] multiProductComponentDestinationTypeArr = {multiProductComponentDestinationType, multiProductComponentDestinationType2, multiProductComponentDestinationType3, multiProductComponentDestinationType4, multiProductComponentDestinationType5, multiProductComponentDestinationType6, multiProductComponentDestinationType7, multiProductComponentDestinationType8, multiProductComponentDestinationType9, multiProductComponentDestinationType10, multiProductComponentDestinationType11, multiProductComponentDestinationType12, multiProductComponentDestinationType13, new MultiProductComponentDestinationType("SELLER_PRODUCT_COLLECTION", 13, "seller_product_collection")};
        A03 = multiProductComponentDestinationTypeArr;
        A02 = AbstractC12190kN.A00(multiProductComponentDestinationTypeArr);
        MultiProductComponentDestinationType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MultiProductComponentDestinationType multiProductComponentDestinationType14 : values) {
            A18.put(multiProductComponentDestinationType14.A00, multiProductComponentDestinationType14);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(4);
    }

    public static MultiProductComponentDestinationType valueOf(String str) {
        return (MultiProductComponentDestinationType) Enum.valueOf(MultiProductComponentDestinationType.class, str);
    }

    public static MultiProductComponentDestinationType[] values() {
        return (MultiProductComponentDestinationType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MultiProductComponentDestinationType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
