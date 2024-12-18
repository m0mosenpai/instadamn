package com.instagram.model.shopping.productcollection;

import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25236BEt;
import X.AbstractC31181DnP;
import X.AbstractC37300Gc1;
import X.AbstractC40730I3k;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ProductCollectionDropsMetadataImpl extends C0T6 implements Parcelable, ProductCollectionDropsMetadata {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(39);
    public final long A00;
    public final Integer A01;
    public final boolean A02;

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata
    public final ProductCollectionDropsMetadataImpl F6C() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionDropsMetadataImpl) {
                ProductCollectionDropsMetadataImpl productCollectionDropsMetadataImpl = (ProductCollectionDropsMetadataImpl) obj;
                if (this.A02 != productCollectionDropsMetadataImpl.A02 || this.A00 != productCollectionDropsMetadataImpl.A00 || !C14360o3.A0K(this.A01, productCollectionDropsMetadataImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A01));
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata
    public final boolean ApB() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata
    public final long BMI() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata
    public final Integer BXw() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTDropsCollectionMetadata", AbstractC40730I3k.A00(this));
    }

    public final int hashCode() {
        return AbstractC25236BEt.A01(this.A00, AbstractC25225BEi.A08(this.A02)) + AbstractC167017dG.A0M(this.A01);
    }

    public ProductCollectionDropsMetadataImpl(Integer num, long j, boolean z) {
        this.A02 = z;
        this.A00 = j;
        this.A01 = num;
    }
}
