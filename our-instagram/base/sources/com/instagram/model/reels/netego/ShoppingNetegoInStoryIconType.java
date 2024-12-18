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
public final class ShoppingNetegoInStoryIconType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ShoppingNetegoInStoryIconType[] A03;
    public static final ShoppingNetegoInStoryIconType A04;
    public static final ShoppingNetegoInStoryIconType A05;
    public static final ShoppingNetegoInStoryIconType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType = new ShoppingNetegoInStoryIconType("UNRECOGNIZED", 0, "ShoppingNetegoInStoryIconType_unspecified");
        A06 = shoppingNetegoInStoryIconType;
        ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType2 = new ShoppingNetegoInStoryIconType("GIFT_CARD", 1, "gift_card");
        A04 = shoppingNetegoInStoryIconType2;
        ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType3 = new ShoppingNetegoInStoryIconType("SHOPPING_BAG", 2, "shopping_bag");
        A05 = shoppingNetegoInStoryIconType3;
        ShoppingNetegoInStoryIconType[] shoppingNetegoInStoryIconTypeArr = {shoppingNetegoInStoryIconType, shoppingNetegoInStoryIconType2, shoppingNetegoInStoryIconType3, new ShoppingNetegoInStoryIconType("TAG_STAR", 3, "tag_star")};
        A03 = shoppingNetegoInStoryIconTypeArr;
        A02 = AbstractC12190kN.A00(shoppingNetegoInStoryIconTypeArr);
        ShoppingNetegoInStoryIconType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType4 : values) {
            A18.put(shoppingNetegoInStoryIconType4.A00, shoppingNetegoInStoryIconType4);
        }
        A01 = A18;
        CREATOR = new C55343Oh9(96);
    }

    public static ShoppingNetegoInStoryIconType valueOf(String str) {
        return (ShoppingNetegoInStoryIconType) Enum.valueOf(ShoppingNetegoInStoryIconType.class, str);
    }

    public static ShoppingNetegoInStoryIconType[] values() {
        return (ShoppingNetegoInStoryIconType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ShoppingNetegoInStoryIconType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
