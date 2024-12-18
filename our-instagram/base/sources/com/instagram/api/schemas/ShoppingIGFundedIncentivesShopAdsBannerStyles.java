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
public final class ShoppingIGFundedIncentivesShopAdsBannerStyles implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ShoppingIGFundedIncentivesShopAdsBannerStyles[] A03;
    public static final ShoppingIGFundedIncentivesShopAdsBannerStyles A04;
    public static final ShoppingIGFundedIncentivesShopAdsBannerStyles A05;
    public static final ShoppingIGFundedIncentivesShopAdsBannerStyles A06;
    public static final ShoppingIGFundedIncentivesShopAdsBannerStyles A07;
    public static final ShoppingIGFundedIncentivesShopAdsBannerStyles A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ShoppingIGFundedIncentivesShopAdsBannerStyles shoppingIGFundedIncentivesShopAdsBannerStyles = new ShoppingIGFundedIncentivesShopAdsBannerStyles("UNRECOGNIZED", 0, "ShoppingIGFundedIncentivesShopAdsBannerStyles_unspecified");
        A08 = shoppingIGFundedIncentivesShopAdsBannerStyles;
        ShoppingIGFundedIncentivesShopAdsBannerStyles shoppingIGFundedIncentivesShopAdsBannerStyles2 = new ShoppingIGFundedIncentivesShopAdsBannerStyles("NEW_DESIGN", 1, "new_design");
        A04 = shoppingIGFundedIncentivesShopAdsBannerStyles2;
        ShoppingIGFundedIncentivesShopAdsBannerStyles shoppingIGFundedIncentivesShopAdsBannerStyles3 = new ShoppingIGFundedIncentivesShopAdsBannerStyles("REGULAR_DESIGN", 2, "regular_design");
        A05 = shoppingIGFundedIncentivesShopAdsBannerStyles3;
        ShoppingIGFundedIncentivesShopAdsBannerStyles shoppingIGFundedIncentivesShopAdsBannerStyles4 = new ShoppingIGFundedIncentivesShopAdsBannerStyles("REGULAR_DESIGN_CTA_BOI", 3, "regular_design_cta_boi");
        A06 = shoppingIGFundedIncentivesShopAdsBannerStyles4;
        ShoppingIGFundedIncentivesShopAdsBannerStyles shoppingIGFundedIncentivesShopAdsBannerStyles5 = new ShoppingIGFundedIncentivesShopAdsBannerStyles("REGULAR_DESIGN_CTA_SF", 4, "regular_design_cta_sf");
        A07 = shoppingIGFundedIncentivesShopAdsBannerStyles5;
        ShoppingIGFundedIncentivesShopAdsBannerStyles[] shoppingIGFundedIncentivesShopAdsBannerStylesArr = {shoppingIGFundedIncentivesShopAdsBannerStyles, shoppingIGFundedIncentivesShopAdsBannerStyles2, shoppingIGFundedIncentivesShopAdsBannerStyles3, shoppingIGFundedIncentivesShopAdsBannerStyles4, shoppingIGFundedIncentivesShopAdsBannerStyles5};
        A03 = shoppingIGFundedIncentivesShopAdsBannerStylesArr;
        A02 = AbstractC12190kN.A00(shoppingIGFundedIncentivesShopAdsBannerStylesArr);
        ShoppingIGFundedIncentivesShopAdsBannerStyles[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ShoppingIGFundedIncentivesShopAdsBannerStyles shoppingIGFundedIncentivesShopAdsBannerStyles6 : values) {
            A18.put(shoppingIGFundedIncentivesShopAdsBannerStyles6.A00, shoppingIGFundedIncentivesShopAdsBannerStyles6);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(1);
    }

    public static ShoppingIGFundedIncentivesShopAdsBannerStyles valueOf(String str) {
        return (ShoppingIGFundedIncentivesShopAdsBannerStyles) Enum.valueOf(ShoppingIGFundedIncentivesShopAdsBannerStyles.class, str);
    }

    public static ShoppingIGFundedIncentivesShopAdsBannerStyles[] values() {
        return (ShoppingIGFundedIncentivesShopAdsBannerStyles[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ShoppingIGFundedIncentivesShopAdsBannerStyles(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
