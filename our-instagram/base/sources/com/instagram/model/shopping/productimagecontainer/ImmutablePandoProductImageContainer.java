package com.instagram.model.shopping.productimagecontainer;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40742I3w;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductImageContainer extends C17T implements ProductImageContainer {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(63);

    @Override // com.instagram.model.shopping.productimagecontainer.ProductImageContainer
    public final ImageInfo BGx() {
        return (ImageInfo) A04(-1876344045, ImmutablePandoImageInfo.class);
    }

    @Override // com.instagram.model.shopping.productimagecontainer.ProductImageContainer
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40742I3w.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.productimagecontainer.ProductImageContainer
    public final ProductImageContainerImpl F6D() {
        return new ProductImageContainerImpl(BGx().F5B(), A0i(-318184504));
    }

    @Override // com.instagram.model.shopping.productimagecontainer.ProductImageContainer
    public final String getPreview() {
        return A0i(-318184504);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
