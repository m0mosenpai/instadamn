package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C41091IHi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ProductTileMetadataImpl extends C0T6 implements Parcelable, ProductTileMetadata {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(64);
    public final ProductTileMetadataDecorations A00;
    public final List A01;
    public final ProductTileMetadataDestination A02;

    public ProductTileMetadataImpl(ProductTileMetadataDecorations productTileMetadataDecorations, ProductTileMetadataDestination productTileMetadataDestination, List list) {
        C14360o3.A0B(list, 3);
        this.A00 = productTileMetadataDecorations;
        this.A02 = productTileMetadataDestination;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileMetadataImpl) {
                ProductTileMetadataImpl productTileMetadataImpl = (ProductTileMetadataImpl) obj;
                if (!C14360o3.A0K(this.A00, productTileMetadataImpl.A00) || this.A02 != productTileMetadataImpl.A02 || !C14360o3.A0K(this.A01, productTileMetadataImpl.A01)) {
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
        parcel.writeParcelable(this.A02, i);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A01);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
    }

    @Override // com.instagram.api.schemas.ProductTileMetadata
    public final /* bridge */ /* synthetic */ C41091IHi AKT() {
        return new C41091IHi(this);
    }

    @Override // com.instagram.api.schemas.ProductTileMetadata
    public final ProductTileMetadataDecorations Aw6() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProductTileMetadata
    public final ProductTileMetadataDestination Awx() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.ProductTileMetadata
    public final List BL3() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A02)) * 31);
    }
}
