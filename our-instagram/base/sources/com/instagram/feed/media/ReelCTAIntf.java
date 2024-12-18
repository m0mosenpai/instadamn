package com.instagram.feed.media;

import X.AJs;
import X.C1DV;
import X.C1DY;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLinkIntf;
import java.util.List;

/* loaded from: classes2.dex */
public interface ReelCTAIntf extends Parcelable {
    public static final AJs A00 = AJs.A00;

    ShoppingSwipeUpCTATextIcon Ath();

    String Ati();

    String Atj();

    String Ats();

    EffectPreviewIntf B0a();

    String B64();

    String B65();

    Boolean BBv();

    List BNi();

    ReelMultiProductLinkIntf BVO();

    String BYV();

    List Bgp();

    ProductCollectionLinkIntf Bgs();

    ReelProductLinkIntf BhC();

    ProfileShopLinkIntf Bi5();

    ReelCTAIntf EBV(C1DY c1dy);

    ReelCTA F4r(C1DY c1dy);

    ReelCTA F4s(C1DV c1dv);

    TreeUpdaterJNI F7o();
}
