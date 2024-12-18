package com.instagram.model.shopping.reels;

import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41856IgA;
import X.I4C;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* loaded from: classes3.dex */
public final class ReelProductLink extends C0T6 implements Parcelable, ReelProductLinkIntf {
    public static final Parcelable.Creator CREATOR = new C41856IgA(62);
    public final ProductDetailsProductItemDict A00;

    @Override // com.instagram.model.shopping.reels.ReelProductLinkIntf
    public final ReelProductLinkIntf EBv(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.model.shopping.reels.ReelProductLinkIntf
    public final ReelProductLink F6R(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.model.shopping.reels.ReelProductLinkIntf
    public final ReelProductLink F6S(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ReelProductLink) && C14360o3.A0K(this.A00, ((ReelProductLink) obj).A00));
    }

    public final int hashCode() {
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A00;
        if (productDetailsProductItemDict == null) {
            return 0;
        }
        return productDetailsProductItemDict.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.model.shopping.reels.ReelProductLinkIntf
    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bgl() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.reels.ReelProductLinkIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryCTAProductLink", I4C.A00(this));
    }

    public ReelProductLink(ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A00 = productDetailsProductItemDict;
    }
}
