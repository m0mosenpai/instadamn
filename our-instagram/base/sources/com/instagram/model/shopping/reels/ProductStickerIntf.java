package com.instagram.model.shopping.reels;

import X.C1DV;
import X.C1DY;
import X.C41535IZk;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.List;

/* loaded from: classes7.dex */
public interface ProductStickerIntf extends Parcelable {
    public static final C41535IZk A00 = C41535IZk.A00;

    String Asf();

    DropsLaunchAnimationIntf Azc();

    DropsEventPageNavigationMetadata B2m();

    ProductDetailsProductItemDictIntf BhA();

    List C0p();

    String C6J();

    TextReviewStatus C6h();

    String CEu();

    Boolean CHE();

    Boolean CZo();

    Boolean Cct();

    ProductStickerIntf EBt(C1DY c1dy);

    ProductSticker F6N(C1DY c1dy);

    ProductSticker F6O(C1DV c1dv);

    TreeUpdaterJNI F7o();

    String getId();

    String getMediaId();

    String getText();

    String getUserId();
}
