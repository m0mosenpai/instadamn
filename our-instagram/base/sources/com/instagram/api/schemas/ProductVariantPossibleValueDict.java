package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC40188Hs2;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;

/* loaded from: classes7.dex */
public final class ProductVariantPossibleValueDict extends C0T6 implements ProductVariantPossibleValueDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(71);
    public final ProductVariantVisualStyle A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final ProductVariantPossibleValueDict Eya() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductVariantPossibleValueDict) {
                ProductVariantPossibleValueDict productVariantPossibleValueDict = (ProductVariantPossibleValueDict) obj;
                if (!C14360o3.A0K(this.A01, productVariantPossibleValueDict.A01) || this.A05 != productVariantPossibleValueDict.A05 || !C14360o3.A0K(this.A02, productVariantPossibleValueDict.A02) || !C14360o3.A0K(this.A03, productVariantPossibleValueDict.A03) || !C14360o3.A0K(this.A04, productVariantPossibleValueDict.A04) || this.A00 != productVariantPossibleValueDict.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final ProductVariantVisualStyle CGx() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTProductVariantPossibleValueDict", AbstractC40188Hs2.A00(this));
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final String getId() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final String getName() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final String getNormalizedValue() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final String getValue() {
        return this.A04;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A04, (AbstractC166997dE.A0K(this.A02, AbstractC167007dF.A0D(this.A05, AbstractC166987dD.A0J(this.A01))) + AbstractC167017dG.A0O(this.A03)) * 31));
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final boolean isPreselected() {
        return this.A05;
    }

    public ProductVariantPossibleValueDict(ProductVariantVisualStyle productVariantVisualStyle, String str, String str2, String str3, String str4, boolean z) {
        AbstractC167017dG.A1Q(str, str2);
        AbstractC167017dG.A1T(str4, productVariantVisualStyle);
        this.A01 = str;
        this.A05 = z;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = productVariantVisualStyle;
    }
}
