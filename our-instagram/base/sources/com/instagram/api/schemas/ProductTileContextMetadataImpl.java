package com.instagram.api.schemas;

import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ProductTileContextMetadataImpl extends C0T6 implements Parcelable, ProductTileContextMetadata {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(56);
    public final List A00;

    public ProductTileContextMetadataImpl(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // com.instagram.api.schemas.ProductTileContextMetadata
    public final ProductTileContextMetadataImpl EyT(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductTileContextMetadataImpl) && C14360o3.A0K(this.A00, ((ProductTileContextMetadataImpl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A00);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
    }
}
