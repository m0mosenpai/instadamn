package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
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
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ProductTileMetadataDecorationsImpl extends C0T6 implements Parcelable, ProductTileMetadataDecorations {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(62);
    public final ProductTileContext A00;
    public final Boolean A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public ProductTileMetadataDecorationsImpl(ProductTileContext productTileContext, Boolean bool, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C14360o3.A0B(list, 1);
        this.A02 = list;
        this.A00 = productTileContext;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = bool;
        this.A05 = z3;
        this.A06 = z4;
        this.A07 = z5;
        this.A08 = z6;
        this.A09 = z7;
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final ProductTileMetadataDecorationsImpl EyX(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileMetadataDecorationsImpl) {
                ProductTileMetadataDecorationsImpl productTileMetadataDecorationsImpl = (ProductTileMetadataDecorationsImpl) obj;
                if (!C14360o3.A0K(this.A02, productTileMetadataDecorationsImpl.A02) || !C14360o3.A0K(this.A00, productTileMetadataDecorationsImpl.A00) || this.A03 != productTileMetadataDecorationsImpl.A03 || this.A04 != productTileMetadataDecorationsImpl.A04 || !C14360o3.A0K(this.A01, productTileMetadataDecorationsImpl.A01) || this.A05 != productTileMetadataDecorationsImpl.A05 || this.A06 != productTileMetadataDecorationsImpl.A06 || this.A07 != productTileMetadataDecorationsImpl.A07 || this.A08 != productTileMetadataDecorationsImpl.A08 || this.A09 != productTileMetadataDecorationsImpl.A09) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A02);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A01) ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final List AfW() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final boolean BCY() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final boolean BwD() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final boolean Bwk() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final boolean Bwl() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final boolean Bwp() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final ProductTileContext CIo() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final Boolean CeY() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A09, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, (AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, (AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0M(this.A00)) * 31)) + AbstractC166997dE.A0I(this.A01)) * 31)))));
    }
}
