package com.instagram.model.shopping.reels;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.I4C;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* loaded from: classes7.dex */
public final class ImmutablePandoReelProductLink extends C17T implements ReelProductLinkIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(71);
    public ProductDetailsProductItemDictIntf A00;

    @Override // com.instagram.model.shopping.reels.ReelProductLinkIntf
    public final ProductDetailsProductItemDictIntf Bgl() {
        return AbstractC37303Gc4.A0I(this, this.A00);
    }

    @Override // com.instagram.model.shopping.reels.ReelProductLinkIntf
    public final ReelProductLinkIntf EBv(C1DY c1dy) {
        this.A00 = AbstractC37304Gc5.A0Q(c1dy, AbstractC37303Gc4.A0I(this, this.A00));
        return this;
    }

    @Override // com.instagram.model.shopping.reels.ReelProductLinkIntf
    public final ReelProductLink F6R(C1DY c1dy) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        ProductDetailsProductItemDictIntf A0I = AbstractC37303Gc4.A0I(this, this.A00);
        if (A0I != null) {
            productDetailsProductItemDict = A0I.F7S(c1dy);
        } else {
            productDetailsProductItemDict = null;
        }
        return new ReelProductLink(productDetailsProductItemDict);
    }

    @Override // com.instagram.model.shopping.reels.ReelProductLinkIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I4C.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.reels.ReelProductLinkIntf
    public final ReelProductLink F6S(C1DV c1dv) {
        return F6R(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
