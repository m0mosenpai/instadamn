package com.instagram.model.shopping;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProductImpl;

/* loaded from: classes7.dex */
public final class ProductContainer extends C0T6 implements Parcelable {
    public static final C41856IgA CREATOR = C41856IgA.A00(12);
    public ProductDetailsProductItemDict A00 = null;
    public UnavailableProductImpl A01 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductContainer) {
                ProductContainer productContainer = (ProductContainer) obj;
                if (!C14360o3.A0K(this.A00, productContainer.A00) || !C14360o3.A0K(this.A01, productContainer.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProductContainer(product=");
        A1C.append(this.A00);
        A1C.append(", unavailableProduct=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
