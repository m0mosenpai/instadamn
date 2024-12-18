package com.instagram.model.shopping.productcheckoutproperties;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.AbstractC40726I3g;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.DeliveryWindowInfo;

/* loaded from: classes7.dex */
public final class ShippingAndReturnsMetadata extends C0T6 implements Parcelable, ShippingAndReturnsMetadataIntf {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(37);
    public final CurrencyAmountInfo A00;
    public final CurrencyAmountInfo A01;
    public final DeliveryWindowInfo A02;
    public final Boolean A03;
    public final Integer A04;
    public final String A05;

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final ShippingAndReturnsMetadata F6A() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShippingAndReturnsMetadata) {
                ShippingAndReturnsMetadata shippingAndReturnsMetadata = (ShippingAndReturnsMetadata) obj;
                if (!C14360o3.A0K(this.A02, shippingAndReturnsMetadata.A02) || !C14360o3.A0K(this.A03, shippingAndReturnsMetadata.A03) || !C14360o3.A0K(this.A00, shippingAndReturnsMetadata.A00) || !C14360o3.A0K(this.A04, shippingAndReturnsMetadata.A04) || !C14360o3.A0K(this.A01, shippingAndReturnsMetadata.A01) || !C14360o3.A0K(this.A05, shippingAndReturnsMetadata.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        AbstractC31179DnN.A0p(parcel, this.A03);
        parcel.writeParcelable(this.A00, i);
        AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final DeliveryWindowInfo B2c() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final CurrencyAmountInfo Bp1() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final Integer Bp3() {
        return this.A04;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final CurrencyAmountInfo Buc() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final Boolean CUn() {
        return this.A03;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTShippingAndReturnDict", AbstractC40726I3g.A00(this));
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf
    public final String getShippingCostStripped() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public ShippingAndReturnsMetadata(CurrencyAmountInfo currencyAmountInfo, CurrencyAmountInfo currencyAmountInfo2, DeliveryWindowInfo deliveryWindowInfo, Boolean bool, Integer num, String str) {
        this.A02 = deliveryWindowInfo;
        this.A03 = bool;
        this.A00 = currencyAmountInfo;
        this.A04 = num;
        this.A01 = currencyAmountInfo2;
        this.A05 = str;
    }
}
