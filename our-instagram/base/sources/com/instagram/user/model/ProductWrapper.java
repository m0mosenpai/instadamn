package com.instagram.user.model;

import X.AbstractC06930Yk;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC37302Gc3;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ProductWrapper extends C0T6 implements Parcelable, ProductWrapperIntf {
    public static final Parcelable.Creator CREATOR = new C55344OhA(19);
    public final ProductDetailsProductItemDict A00;

    @Override // com.instagram.user.model.ProductWrapperIntf
    public final ProductWrapper F7U(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductWrapper) && C14360o3.A0K(this.A00, ((ProductWrapper) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A00;
        if (productDetailsProductItemDict == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productDetailsProductItemDict.writeToParcel(parcel, i);
        }
    }

    @Override // com.instagram.user.model.ProductWrapperIntf
    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bgw() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public ProductWrapper(ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A00 = productDetailsProductItemDict;
    }

    @Override // com.instagram.user.model.ProductWrapperIntf
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (Bgw() != null) {
            A0X.put("product_details", AbstractC37302Gc3.A0B(Bgw()));
        }
        return AbstractC37300Gc1.A05("XDTProductWrapper", AbstractC06930Yk.A0B(A0X));
    }

    @Override // com.instagram.user.model.ProductWrapperIntf
    public final ProductWrapperIntf ECF(C1DY c1dy) {
        return this;
    }
}
