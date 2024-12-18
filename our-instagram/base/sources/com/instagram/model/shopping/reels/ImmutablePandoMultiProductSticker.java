package com.instagram.model.shopping.reels;

import X.AbstractC136426Fv;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.I41;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoStoryMultiProductStickerLinkData;
import com.instagram.api.schemas.ImmutablePandoStoryProductItemStickerTappableData;
import com.instagram.api.schemas.StoryMultiProductStickerLinkData;
import com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoMultiProductSticker extends C17T implements MultiProductStickerIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(65);
    public List A00;

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final List BNi() {
        return A08(102977465, ImmutablePandoStoryMultiProductStickerLinkData.class);
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final List BVN() {
        List list = this.A00;
        if (list == null) {
            return A08(-1537804310, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return list;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final List C0p() {
        return A08(1531715286, ImmutablePandoStoryProductItemStickerTappableData.class);
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I41.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String C6J() {
        return A0i(-1064897719);
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String C6i() {
        return A0i(1914398503);
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String CEu() {
        return A0i(1595179052);
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final Boolean CZo() {
        return getOptionalBooleanValueByHashCode(-1403186180);
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final MultiProductStickerIntf EBq(C1DY c1dy) {
        ArrayList arrayList;
        List<ProductDetailsProductItemDictIntf> BVN = BVN();
        if (BVN != null) {
            arrayList = AbstractC167017dG.A0q(BVN);
            for (ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf : BVN) {
                productDetailsProductItemDictIntf.ECE(c1dy);
                arrayList.add(productDetailsProductItemDictIntf);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final MultiProductSticker F6F(C1DY c1dy) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String A0e = A0e();
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1403186180);
        List BNi = BNi();
        ArrayList arrayList3 = null;
        if (BNi != null) {
            arrayList = AbstractC167007dF.A0i(BNi);
            Iterator it = BNi.iterator();
            while (it.hasNext()) {
                arrayList.add(((StoryMultiProductStickerLinkData) it.next()).F0y());
            }
        } else {
            arrayList = null;
        }
        String A0f = A0f();
        List BVN = BVN();
        if (BVN != null) {
            arrayList2 = AbstractC167007dF.A0i(BVN);
            Iterator it2 = BVN.iterator();
            while (it2.hasNext()) {
                AbstractC37304Gc5.A1D(c1dy, arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        List C0p = C0p();
        if (C0p != null) {
            arrayList3 = AbstractC167007dF.A0i(C0p);
            Iterator it3 = C0p.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((StoryProductItemStickerTappableDataIntf) it3.next()).F1E());
            }
        }
        return new MultiProductSticker(optionalBooleanValueByHashCode, A0e, A0f, A0X(), A0i(-1064897719), A0i(1914398503), AbstractC37303Gc4.A0V(this), A0i(1595179052), arrayList, arrayList2, arrayList3);
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final MultiProductSticker F6G(C1DV c1dv) {
        return F6F(AbstractC25235BEs.A0b(AbstractC37301Gc2.A08()));
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String getId() {
        return A0e();
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String getMediaId() {
        return A0f();
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String getText() {
        return A0X();
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String getUserId() {
        return AbstractC37303Gc4.A0V(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
