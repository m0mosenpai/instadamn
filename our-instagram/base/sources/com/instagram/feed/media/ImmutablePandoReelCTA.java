package com.instagram.feed.media;

import X.AbstractC136426Fv;
import X.AbstractC167007dF;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.I0M;
import X.JCW;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import com.instagram.model.shopping.reels.ImmutablePandoProductCollectionLink;
import com.instagram.model.shopping.reels.ImmutablePandoProfileShopLink;
import com.instagram.model.shopping.reels.ImmutablePandoReelMultiProductLink;
import com.instagram.model.shopping.reels.ImmutablePandoReelProductLink;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ReelProductLinkIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoReelCTA extends C17T implements ReelCTAIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(36);
    public ReelMultiProductLinkIntf A00;
    public ReelProductLinkIntf A01;

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final ShoppingSwipeUpCTATextIcon Ath() {
        return (ShoppingSwipeUpCTATextIcon) A0N(1782405679, JCW.A00);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final EffectPreviewIntf B0a() {
        return (EffectPreviewIntf) A05(347677466, ImmutablePandoEffectPreview.class);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final List BNi() {
        return A08(102977465, ImmutablePandoAndroidLink.class);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final ReelMultiProductLinkIntf BVO() {
        ReelMultiProductLinkIntf reelMultiProductLinkIntf = this.A00;
        if (reelMultiProductLinkIntf == null) {
            return (ReelMultiProductLinkIntf) A05(-742264176, ImmutablePandoReelMultiProductLink.class);
        }
        return reelMultiProductLinkIntf;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final List Bgp() {
        return A08(1230535189, ImmutablePandoAndroidLink.class);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final ProductCollectionLinkIntf Bgs() {
        return (ProductCollectionLinkIntf) A05(-748711509, ImmutablePandoProductCollectionLink.class);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final ReelProductLinkIntf BhC() {
        ReelProductLinkIntf reelProductLinkIntf = this.A01;
        if (reelProductLinkIntf == null) {
            return (ReelProductLinkIntf) A05(1014323530, ImmutablePandoReelProductLink.class);
        }
        return reelProductLinkIntf;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final ProfileShopLinkIntf Bi5() {
        return (ProfileShopLinkIntf) A05(-1400226675, ImmutablePandoProfileShopLink.class);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final ReelCTA F4r(C1DY c1dy) {
        EffectPreview effectPreview;
        ArrayList arrayList;
        ReelMultiProductLink reelMultiProductLink;
        ArrayList arrayList2;
        ProductCollectionLink productCollectionLink;
        ReelProductLink reelProductLink;
        ShoppingSwipeUpCTATextIcon Ath = Ath();
        String A0i = A0i(2060973673);
        String A0i2 = A0i(1782735587);
        String A0i3 = A0i(-815886327);
        EffectPreviewIntf B0a = B0a();
        ProfileShopLink profileShopLink = null;
        if (B0a != null) {
            effectPreview = B0a.F4a();
        } else {
            effectPreview = null;
        }
        String A0i4 = A0i(-1384589206);
        String A0j = A0j(893516482);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1697623503);
        List BNi = BNi();
        if (BNi != null) {
            arrayList = AbstractC167007dF.A0i(BNi);
            Iterator it = BNi.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1V(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        ReelMultiProductLinkIntf BVO = BVO();
        if (BVO != null) {
            reelMultiProductLink = BVO.F6Q(c1dy);
        } else {
            reelMultiProductLink = null;
        }
        String A0j2 = A0j(-1489595877);
        List Bgp = Bgp();
        if (Bgp != null) {
            arrayList2 = AbstractC167007dF.A0i(Bgp);
            Iterator it2 = Bgp.iterator();
            while (it2.hasNext()) {
                AbstractC37303Gc4.A1V(arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        ProductCollectionLinkIntf Bgs = Bgs();
        if (Bgs != null) {
            productCollectionLink = Bgs.F6H();
        } else {
            productCollectionLink = null;
        }
        ReelProductLinkIntf BhC = BhC();
        if (BhC != null) {
            reelProductLink = BhC.F6R(c1dy);
        } else {
            reelProductLink = null;
        }
        ProfileShopLinkIntf Bi5 = Bi5();
        if (Bi5 != null) {
            profileShopLink = Bi5.F6P();
        }
        return new ReelCTA(Ath, effectPreview, productCollectionLink, profileShopLink, reelMultiProductLink, reelProductLink, optionalBooleanValueByHashCode, A0i, A0i2, A0i3, A0i4, A0j, A0j2, arrayList, arrayList2);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I0M.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final String Ati() {
        return A0i(2060973673);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final String Atj() {
        return A0i(1782735587);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final String Ats() {
        return A0i(-815886327);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final String B64() {
        return A0i(-1384589206);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final String B65() {
        return A0j(893516482);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final Boolean BBv() {
        return getOptionalBooleanValueByHashCode(-1697623503);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final String BYV() {
        return A0j(-1489595877);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final ReelCTAIntf EBV(C1DY c1dy) {
        ReelMultiProductLinkIntf BVO = BVO();
        ReelProductLinkIntf reelProductLinkIntf = null;
        if (BVO != null) {
            BVO.EBu(c1dy);
        } else {
            BVO = null;
        }
        this.A00 = BVO;
        ReelProductLinkIntf BhC = BhC();
        if (BhC != null) {
            BhC.EBv(c1dy);
            reelProductLinkIntf = BhC;
        }
        this.A01 = reelProductLinkIntf;
        return this;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final ReelCTA F4s(C1DV c1dv) {
        return F4r(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
