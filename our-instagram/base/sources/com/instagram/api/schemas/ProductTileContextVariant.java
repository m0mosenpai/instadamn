package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProductTileContextVariant implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductTileContextVariant[] A03;
    public static final ProductTileContextVariant A04;
    public static final ProductTileContextVariant A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductTileContextVariant productTileContextVariant = new ProductTileContextVariant("UNRECOGNIZED", 0, "ProductTileContextVariant_unspecified");
        A05 = productTileContextVariant;
        ProductTileContextVariant productTileContextVariant2 = new ProductTileContextVariant("FOLLOWED_BY_SOCIAL_CONTEXT", 1, "followed_by_social_context");
        A04 = productTileContextVariant2;
        ProductTileContextVariant[] productTileContextVariantArr = {productTileContextVariant, productTileContextVariant2, new ProductTileContextVariant(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2, NetInfoModule.CONNECTION_TYPE_NONE)};
        A03 = productTileContextVariantArr;
        A02 = AbstractC12190kN.A00(productTileContextVariantArr);
        ProductTileContextVariant[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProductTileContextVariant productTileContextVariant3 : values) {
            A18.put(productTileContextVariant3.A00, productTileContextVariant3);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(57);
    }

    public static ProductTileContextVariant valueOf(String str) {
        return (ProductTileContextVariant) Enum.valueOf(ProductTileContextVariant.class, str);
    }

    public static ProductTileContextVariant[] values() {
        return (ProductTileContextVariant[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductTileContextVariant(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
