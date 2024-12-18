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
public final class SellerBadgeSurfaces implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SellerBadgeSurfaces[] A03;
    public static final SellerBadgeSurfaces A04;
    public static final SellerBadgeSurfaces A05;
    public static final SellerBadgeSurfaces A06;
    public static final SellerBadgeSurfaces A07;
    public static final SellerBadgeSurfaces A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        SellerBadgeSurfaces sellerBadgeSurfaces = new SellerBadgeSurfaces("UNRECOGNIZED", 0, "SellerBadgeSurfaces_unspecified");
        A08 = sellerBadgeSurfaces;
        SellerBadgeSurfaces sellerBadgeSurfaces2 = new SellerBadgeSurfaces("PDP_ABOUT_THIS_SHOP", 1, "PDP_ABOUT_THIS_SHOP");
        A04 = sellerBadgeSurfaces2;
        SellerBadgeSurfaces sellerBadgeSurfaces3 = new SellerBadgeSurfaces("PRODUCT_DESCRIPTION_PAGE", 2, "PRODUCT_DESCRIPTION_PAGE");
        A05 = sellerBadgeSurfaces3;
        SellerBadgeSurfaces sellerBadgeSurfaces4 = new SellerBadgeSurfaces("SHOPS_DIRECTORY", 3, "SHOPS_DIRECTORY");
        A06 = sellerBadgeSurfaces4;
        SellerBadgeSurfaces sellerBadgeSurfaces5 = new SellerBadgeSurfaces("SHOP_TAB", 4, "SHOP_TAB");
        A07 = sellerBadgeSurfaces5;
        SellerBadgeSurfaces[] sellerBadgeSurfacesArr = {sellerBadgeSurfaces, sellerBadgeSurfaces2, sellerBadgeSurfaces3, sellerBadgeSurfaces4, sellerBadgeSurfaces5, new SellerBadgeSurfaces("STOREFRONT", 5, "STOREFRONT")};
        A03 = sellerBadgeSurfacesArr;
        A02 = AbstractC12190kN.A00(sellerBadgeSurfacesArr);
        SellerBadgeSurfaces[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (SellerBadgeSurfaces sellerBadgeSurfaces6 : values) {
            A18.put(sellerBadgeSurfaces6.A00, sellerBadgeSurfaces6);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(96);
    }

    public static SellerBadgeSurfaces valueOf(String str) {
        return (SellerBadgeSurfaces) Enum.valueOf(SellerBadgeSurfaces.class, str);
    }

    public static SellerBadgeSurfaces[] values() {
        return (SellerBadgeSurfaces[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public SellerBadgeSurfaces(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
