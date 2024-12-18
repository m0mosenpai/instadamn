package com.instagram.user.model;

import X.C1DV;
import X.C1DY;
import X.C41681IdA;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductArtsLabelsDictIntf;
import com.instagram.api.schemas.ProductDiscountsDict;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.SellerBadgeDictIntf;
import com.instagram.api.schemas.UntaggableReasonIntf;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import java.util.List;

/* loaded from: classes2.dex */
public interface ProductDetailsProductItemDictIntf extends Parcelable {
    public static final C41681IdA A00 = C41681IdA.A00;

    ProductAffiliateInformationDict AaP();

    ProductArtsLabelsDictIntf Aci();

    Boolean Akw();

    Boolean AlJ();

    Boolean AlK();

    ProductCheckoutPropertiesIntf AnM();

    ProductCheckoutPropertiesIntf AnN();

    CheckoutStyle AnQ();

    CommerceReviewStatisticsDictIntf Apr();

    ProductDiscountsDict AyJ();

    Boolean BCv();

    Boolean BCz();

    Boolean BFj();

    String BIa();

    Long BId();

    ProductLaunchInformation BMK();

    LoyaltyToplineInfoDict BPP();

    ProductImageContainer BPX();

    User BSW();

    String BcL();

    ProductReviewStatus Bgm();

    List Bh8();

    String Bl9();

    ProductReviewStatus BpF();

    List BpM();

    SellerBadgeDictIntf Bt4();

    XFBsizeCalibrationScore Bxe();

    Integer Bxf();

    ProductImageContainer C85();

    String CC7();

    UntaggableReasonIntf CD2();

    List CEf();

    Boolean CTp();

    Boolean CWQ();

    Boolean CXv();

    ProductDetailsProductItemDictIntf ECE(C1DY c1dy);

    ProductDetailsProductItemDict F7S(C1DY c1dy);

    ProductDetailsProductItemDict F7T(C1DV c1dv);

    TreeUpdaterJNI F7o();

    String getCompoundProductId();

    String getCurrentPrice();

    String getCurrentPriceAmount();

    String getCurrentPriceStripped();

    String getDebugInfo();

    String getDescription();

    String getExternalUrl();

    String getFullPrice();

    String getFullPriceAmount();

    String getFullPriceStripped();

    String getMainImageId();

    String getName();

    String getPrice();

    String getProductId();

    String getRetailerId();
}
