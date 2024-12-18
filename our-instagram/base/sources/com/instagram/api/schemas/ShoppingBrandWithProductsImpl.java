package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ShoppingBrandWithProductsImpl extends C0T6 implements Parcelable, ShoppingBrandWithProducts {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(99);
    public final User A00;
    public final ProductDetailsSellerBadgeContent A01;
    public final ShoppingBrandWithProductsSubtitle A02;
    public final String A03;
    public final List A04;
    public final List A05;

    @Override // com.instagram.api.schemas.ShoppingBrandWithProducts
    public final ShoppingBrandWithProductsImpl EzU(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingBrandWithProductsImpl) {
                ShoppingBrandWithProductsImpl shoppingBrandWithProductsImpl = (ShoppingBrandWithProductsImpl) obj;
                if (!C14360o3.A0K(this.A03, shoppingBrandWithProductsImpl.A03) || !C14360o3.A0K(this.A04, shoppingBrandWithProductsImpl.A04) || !C14360o3.A0K(this.A05, shoppingBrandWithProductsImpl.A05) || !C14360o3.A0K(this.A01, shoppingBrandWithProductsImpl.A01) || !C14360o3.A0K(this.A02, shoppingBrandWithProductsImpl.A02) || !C14360o3.A0K(this.A00, shoppingBrandWithProductsImpl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A04);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        List list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l, i);
            }
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.ShoppingBrandWithProducts
    public final String ArN() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.ShoppingBrandWithProducts
    public final List BhO() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.ShoppingBrandWithProducts
    public final List BhR() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.ShoppingBrandWithProducts
    public final User CDj() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, (((((AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31);
    }

    public ShoppingBrandWithProductsImpl(ProductDetailsSellerBadgeContent productDetailsSellerBadgeContent, ShoppingBrandWithProductsSubtitle shoppingBrandWithProductsSubtitle, User user, String str, List list, List list2) {
        AbstractC167017dG.A1P(str, list);
        C14360o3.A0B(user, 6);
        this.A03 = str;
        this.A04 = list;
        this.A05 = list2;
        this.A01 = productDetailsSellerBadgeContent;
        this.A02 = shoppingBrandWithProductsSubtitle;
        this.A00 = user;
    }
}
