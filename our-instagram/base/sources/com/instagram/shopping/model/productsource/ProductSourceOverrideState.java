package com.instagram.shopping.model.productsource;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.ProductSource;

/* loaded from: classes7.dex */
public final class ProductSourceOverrideState extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(84);
    public final ProductSource A00;
    public final ProductSourceOverrideStatus A01;
    public final String A02;

    public ProductSourceOverrideState(ProductSource productSource, ProductSourceOverrideStatus productSourceOverrideStatus, String str) {
        C14360o3.A0B(productSourceOverrideStatus, 1);
        this.A01 = productSourceOverrideStatus;
        this.A02 = str;
        this.A00 = productSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductSourceOverrideState) {
                ProductSourceOverrideState productSourceOverrideState = (ProductSourceOverrideState) obj;
                if (this.A01 != productSourceOverrideState.A01 || !C14360o3.A0K(this.A02, productSourceOverrideState.A02) || !C14360o3.A0K(this.A00, productSourceOverrideState.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
