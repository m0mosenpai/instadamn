package com.instagram.model.shopping.reels;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DY;
import X.C39305HXw;
import X.I4B;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoReelMultiProductLink extends C17T implements ReelMultiProductLinkIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(70);
    public List A00;

    @Override // com.instagram.model.shopping.reels.ReelMultiProductLinkIntf
    public final List BhR() {
        List list = this.A00;
        if (list == null) {
            return A08(-1003761308, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return list;
    }

    @Override // com.instagram.model.shopping.reels.ReelMultiProductLinkIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I4B.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.reels.ReelMultiProductLinkIntf
    public final ReelMultiProductLinkIntf EBu(C1DY c1dy) {
        ArrayList arrayList;
        List<ProductDetailsProductItemDictIntf> BhR = BhR();
        if (BhR != null) {
            arrayList = AbstractC167017dG.A0q(BhR);
            for (ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf : BhR) {
                productDetailsProductItemDictIntf.ECE(c1dy);
                arrayList.add(productDetailsProductItemDictIntf);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // com.instagram.model.shopping.reels.ReelMultiProductLinkIntf
    public final ReelMultiProductLink F6Q(C1DY c1dy) {
        ArrayList arrayList;
        List BhR = BhR();
        if (BhR != null) {
            arrayList = AbstractC167017dG.A0q(BhR);
            Iterator it = BhR.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1D(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        return new ReelMultiProductLink(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
