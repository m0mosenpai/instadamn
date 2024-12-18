package com.instagram.model.shopping.reels;

import X.AbstractC136426Fv;
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
import X.I49;
import X.JDK;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.DropsEventPageNavigationMetadataImpl;
import com.instagram.api.schemas.ImmutablePandoDropsEventPageNavigationMetadata;
import com.instagram.api.schemas.ImmutablePandoStoryProductItemStickerTappableData;
import com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.model.shopping.drops.ImmutablePandoDropsLaunchAnimation;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductSticker extends C17T implements ProductStickerIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(68);
    public ProductDetailsProductItemDictIntf A00;

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final DropsLaunchAnimationIntf Azc() {
        return (DropsLaunchAnimationIntf) A05(461462899, ImmutablePandoDropsLaunchAnimation.class);
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final DropsEventPageNavigationMetadata B2m() {
        return (DropsEventPageNavigationMetadata) A05(935996751, ImmutablePandoDropsEventPageNavigationMetadata.class);
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final ProductDetailsProductItemDictIntf BhA() {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = this.A00;
        if (productDetailsProductItemDictIntf == null) {
            return (ProductDetailsProductItemDictIntf) A05(1014244451, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return productDetailsProductItemDictIntf;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final List C0p() {
        return A08(1531715286, ImmutablePandoStoryProductItemStickerTappableData.class);
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final TextReviewStatus C6h() {
        return (TextReviewStatus) A0N(1914398503, JDK.A00);
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I49.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String Asf() {
        return A0i(1342355009);
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String C6J() {
        return A0i(-1064897719);
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String CEu() {
        return A0i(1595179052);
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final Boolean CHE() {
        return getOptionalBooleanValueByHashCode(402861861);
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final Boolean CZo() {
        return getOptionalBooleanValueByHashCode(-1403186180);
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final Boolean Cct() {
        return getOptionalBooleanValueByHashCode(-1801354193);
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final ProductStickerIntf EBt(C1DY c1dy) {
        this.A00 = AbstractC37304Gc5.A0Q(c1dy, BhA());
        return this;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final ProductSticker F6N(C1DY c1dy) {
        DropsLaunchAnimation dropsLaunchAnimation;
        DropsEventPageNavigationMetadataImpl dropsEventPageNavigationMetadataImpl;
        ProductDetailsProductItemDict productDetailsProductItemDict;
        String A0i = A0i(1342355009);
        DropsLaunchAnimationIntf Azc = Azc();
        ArrayList arrayList = null;
        if (Azc != null) {
            dropsLaunchAnimation = Azc.F62();
        } else {
            dropsLaunchAnimation = null;
        }
        DropsEventPageNavigationMetadata B2m = B2m();
        if (B2m != null) {
            dropsEventPageNavigationMetadataImpl = B2m.Et9();
        } else {
            dropsEventPageNavigationMetadataImpl = null;
        }
        String A0e = A0e();
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1403186180);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1801354193);
        String A0f = A0f();
        ProductDetailsProductItemDictIntf BhA = BhA();
        if (BhA != null) {
            productDetailsProductItemDict = BhA.F7S(c1dy);
        } else {
            productDetailsProductItemDict = null;
        }
        List C0p = C0p();
        if (C0p != null) {
            arrayList = AbstractC167017dG.A0q(C0p);
            Iterator it = C0p.iterator();
            while (it.hasNext()) {
                arrayList.add(((StoryProductItemStickerTappableDataIntf) it.next()).F1E());
            }
        }
        return new ProductSticker(dropsEventPageNavigationMetadataImpl, C6h(), dropsLaunchAnimation, productDetailsProductItemDict, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, getOptionalBooleanValueByHashCode(402861861), A0i, A0e, A0f, A0X(), A0i(-1064897719), AbstractC37303Gc4.A0V(this), A0i(1595179052), arrayList);
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final ProductSticker F6O(C1DV c1dv) {
        return F6N(AbstractC25235BEs.A0b(AbstractC37301Gc2.A08()));
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String getId() {
        return A0e();
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String getMediaId() {
        return A0f();
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String getText() {
        return A0X();
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String getUserId() {
        return AbstractC37303Gc4.A0V(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
