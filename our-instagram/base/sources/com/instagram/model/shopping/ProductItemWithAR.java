package com.instagram.model.shopping;

import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41856IgA;
import X.I3I;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* loaded from: classes3.dex */
public final class ProductItemWithAR extends C0T6 implements Parcelable, ProductItemWithARIntf {
    public static final Parcelable.Creator CREATOR = new C41856IgA(15);
    public final ProductArEffectMetadata A00;
    public final ProductDetailsProductItemDict A01;

    public ProductItemWithAR(ProductArEffectMetadata productArEffectMetadata, ProductDetailsProductItemDict productDetailsProductItemDict) {
        C14360o3.A0B(productArEffectMetadata, 1);
        C14360o3.A0B(productDetailsProductItemDict, 2);
        this.A00 = productArEffectMetadata;
        this.A01 = productDetailsProductItemDict;
    }

    @Override // com.instagram.model.shopping.ProductItemWithARIntf
    public final ProductItemWithARIntf EBl(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.model.shopping.ProductItemWithARIntf
    public final ProductItemWithAR F5v(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.model.shopping.ProductItemWithARIntf
    public final ProductItemWithAR F5w(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductItemWithAR) {
                ProductItemWithAR productItemWithAR = (ProductItemWithAR) obj;
                if (!C14360o3.A0K(this.A00, productItemWithAR.A00) || !C14360o3.A0K(this.A01, productItemWithAR.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.model.shopping.ProductItemWithARIntf
    public final /* bridge */ /* synthetic */ ProductArEffectMetadataIntf AcV() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.ProductItemWithARIntf
    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf BhA() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.ProductItemWithARIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProductItemWithARDict", I3I.A00(this));
    }
}
