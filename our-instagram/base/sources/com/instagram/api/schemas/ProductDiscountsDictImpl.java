package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40169Hrh;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ProductDiscountsDictImpl extends C0T6 implements Parcelable, ProductDiscountsDict {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(46);
    public final List A00;

    @Override // com.instagram.api.schemas.ProductDiscountsDict
    public final ProductDiscountsDictImpl EyN() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductDiscountsDictImpl) && C14360o3.A0K(this.A00, ((ProductDiscountsDictImpl) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        List list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
        while (A0l.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0l, i);
        }
    }

    @Override // com.instagram.api.schemas.ProductDiscountsDict
    public final List AyM() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProductDiscountsDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTProductDiscountsDict", AbstractC40169Hrh.A00(this));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public ProductDiscountsDictImpl(List list) {
        this.A00 = list;
    }
}
