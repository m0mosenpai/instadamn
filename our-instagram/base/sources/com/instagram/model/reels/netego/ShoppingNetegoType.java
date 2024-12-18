package com.instagram.model.reels.netego;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ShoppingNetegoType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ShoppingNetegoType[] A03;
    public static final ShoppingNetegoType A04;
    public static final ShoppingNetegoType A05;
    public static final ShoppingNetegoType A06;
    public static final ShoppingNetegoType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ShoppingNetegoType shoppingNetegoType = new ShoppingNetegoType("UNRECOGNIZED", 0, "ShoppingNetegoType_unspecified");
        A07 = shoppingNetegoType;
        ShoppingNetegoType shoppingNetegoType2 = new ShoppingNetegoType("CONTINUE_SHOPPING_IN_STORY", 1, "continue_shopping_in_story");
        A04 = shoppingNetegoType2;
        ShoppingNetegoType shoppingNetegoType3 = new ShoppingNetegoType("MINORITY_OWNED_BUSINESS_SHOPS_YOU_MAY_LIKE", 2, "minority_owned_business_shops_you_may_like");
        A05 = shoppingNetegoType3;
        ShoppingNetegoType shoppingNetegoType4 = new ShoppingNetegoType("RECONSIDERATION_PRODUCTS_FOR_YOU", 3, "reconsideration_products_for_you");
        A06 = shoppingNetegoType4;
        ShoppingNetegoType[] shoppingNetegoTypeArr = {shoppingNetegoType, shoppingNetegoType2, shoppingNetegoType3, shoppingNetegoType4, new ShoppingNetegoType("RECONSIDERATION_PRODUCTS_FOR_YOU_IN_STORY", 4, "reconsideration_products_for_you_in_story")};
        A03 = shoppingNetegoTypeArr;
        A02 = AbstractC12190kN.A00(shoppingNetegoTypeArr);
        ShoppingNetegoType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ShoppingNetegoType shoppingNetegoType5 : values) {
            A18.put(shoppingNetegoType5.A00, shoppingNetegoType5);
        }
        A01 = A18;
        CREATOR = new C55343Oh9(98);
    }

    public static ShoppingNetegoType valueOf(String str) {
        return (ShoppingNetegoType) Enum.valueOf(ShoppingNetegoType.class, str);
    }

    public static ShoppingNetegoType[] values() {
        return (ShoppingNetegoType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ShoppingNetegoType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
