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
public final class ShoppingNetegoInStorySuggestionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ShoppingNetegoInStorySuggestionType[] A03;
    public static final ShoppingNetegoInStorySuggestionType A04;
    public static final ShoppingNetegoInStorySuggestionType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ShoppingNetegoInStorySuggestionType shoppingNetegoInStorySuggestionType = new ShoppingNetegoInStorySuggestionType("UNRECOGNIZED", 0, "ShoppingNetegoInStorySuggestionType_unspecified");
        A05 = shoppingNetegoInStorySuggestionType;
        ShoppingNetegoInStorySuggestionType shoppingNetegoInStorySuggestionType2 = new ShoppingNetegoInStorySuggestionType("PRODUCTS", 1, "products");
        A04 = shoppingNetegoInStorySuggestionType2;
        ShoppingNetegoInStorySuggestionType[] shoppingNetegoInStorySuggestionTypeArr = {shoppingNetegoInStorySuggestionType, shoppingNetegoInStorySuggestionType2, new ShoppingNetegoInStorySuggestionType("SHOPS", 2, "shops")};
        A03 = shoppingNetegoInStorySuggestionTypeArr;
        A02 = AbstractC12190kN.A00(shoppingNetegoInStorySuggestionTypeArr);
        ShoppingNetegoInStorySuggestionType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ShoppingNetegoInStorySuggestionType shoppingNetegoInStorySuggestionType3 : values) {
            A18.put(shoppingNetegoInStorySuggestionType3.A00, shoppingNetegoInStorySuggestionType3);
        }
        A01 = A18;
        CREATOR = new C55343Oh9(97);
    }

    public static ShoppingNetegoInStorySuggestionType valueOf(String str) {
        return (ShoppingNetegoInStorySuggestionType) Enum.valueOf(ShoppingNetegoInStorySuggestionType.class, str);
    }

    public static ShoppingNetegoInStorySuggestionType[] values() {
        return (ShoppingNetegoInStorySuggestionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ShoppingNetegoInStorySuggestionType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
