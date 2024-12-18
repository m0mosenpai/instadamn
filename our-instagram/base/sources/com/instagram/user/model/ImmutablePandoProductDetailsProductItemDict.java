package com.instagram.user.model;

import X.AbstractC136426Fv;
import X.AbstractC167007dF;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.IAA;
import X.JEA;
import X.JEB;
import X.JEC;
import X.JED;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.CommerceReviewStatisticsDict;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
import com.instagram.api.schemas.ImmutablePandoCommerceReviewStatisticsDict;
import com.instagram.api.schemas.ImmutablePandoLoyaltyToplineInfoDict;
import com.instagram.api.schemas.ImmutablePandoProductAffiliateInformationDict;
import com.instagram.api.schemas.ImmutablePandoProductArtsLabelsDict;
import com.instagram.api.schemas.ImmutablePandoProductDiscountsDict;
import com.instagram.api.schemas.ImmutablePandoProductVariantPossibleValueDict;
import com.instagram.api.schemas.ImmutablePandoSellerBadgeDict;
import com.instagram.api.schemas.ImmutablePandoTextWithEntitiesBlockDict;
import com.instagram.api.schemas.ImmutablePandoUntaggableReason;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.LoyaltyToplineInfoDictImpl;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductAffiliateInformationDictImpl;
import com.instagram.api.schemas.ProductArtsLabelsDict;
import com.instagram.api.schemas.ProductArtsLabelsDictIntf;
import com.instagram.api.schemas.ProductDiscountsDict;
import com.instagram.api.schemas.ProductDiscountsDictImpl;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.api.schemas.SellerBadgeDict;
import com.instagram.api.schemas.SellerBadgeDictIntf;
import com.instagram.api.schemas.TextWithEntitiesBlockDictIntf;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.api.schemas.UntaggableReasonIntf;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.shopping.productlaunchinformation.ImmutablePandoProductLaunchInformation;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductDetailsProductItemDict extends C17T implements ProductDetailsProductItemDictIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(93);
    public User A00;

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductAffiliateInformationDict AaP() {
        return (ProductAffiliateInformationDict) A05(-46281414, ImmutablePandoProductAffiliateInformationDict.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductArtsLabelsDictIntf Aci() {
        return (ProductArtsLabelsDictIntf) A05(1808133294, ImmutablePandoProductArtsLabelsDict.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductCheckoutPropertiesIntf AnM() {
        return (ProductCheckoutPropertiesIntf) A05(-1890833401, ImmutablePandoProductCheckoutProperties.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductCheckoutPropertiesIntf AnN() {
        return (ProductCheckoutPropertiesIntf) A05(2021764556, ImmutablePandoProductCheckoutProperties.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final CheckoutStyle AnQ() {
        return (CheckoutStyle) A0N(1523138936, JEA.A00);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final CommerceReviewStatisticsDictIntf Apr() {
        return (CommerceReviewStatisticsDictIntf) A05(643988486, ImmutablePandoCommerceReviewStatisticsDict.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductDiscountsDict AyJ() {
        return (ProductDiscountsDict) A05(-1513590994, ImmutablePandoProductDiscountsDict.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductLaunchInformation BMK() {
        return (ProductLaunchInformation) A05(-1071840608, ImmutablePandoProductLaunchInformation.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final LoyaltyToplineInfoDict BPP() {
        return (LoyaltyToplineInfoDict) A05(301470983, ImmutablePandoLoyaltyToplineInfoDict.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductImageContainer BPX() {
        return (ProductImageContainer) A05(798171989, ImmutablePandoProductImageContainer.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final User BSW() {
        return this.A00;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductReviewStatus Bgm() {
        return (ProductReviewStatus) A0N(-593451687, JEB.A00);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final List Bh8() {
        return A08(-275245112, ImmutablePandoProductImageContainer.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductReviewStatus BpF() {
        return (ProductReviewStatus) A0N(1206018745, JEC.A00);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final List BpM() {
        return A08(30415085, ImmutablePandoTextWithEntitiesBlockDict.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final SellerBadgeDictIntf Bt4() {
        return (SellerBadgeDictIntf) A05(15626979, ImmutablePandoSellerBadgeDict.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final XFBsizeCalibrationScore Bxe() {
        return (XFBsizeCalibrationScore) A0N(1581109055, JED.A00);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductImageContainer C85() {
        return (ProductImageContainer) A05(2074606664, ImmutablePandoProductImageContainer.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final UntaggableReasonIntf CD2() {
        return (UntaggableReasonIntf) A05(119971555, ImmutablePandoUntaggableReason.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final List CEf() {
        return A08(-1033709028, ImmutablePandoProductVariantPossibleValueDict.class);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductDetailsProductItemDict F7S(C1DY c1dy) {
        ProductAffiliateInformationDictImpl productAffiliateInformationDictImpl;
        ProductArtsLabelsDict productArtsLabelsDict;
        ProductCheckoutProperties productCheckoutProperties;
        ProductCheckoutProperties productCheckoutProperties2;
        CommerceReviewStatisticsDict commerceReviewStatisticsDict;
        ProductDiscountsDictImpl productDiscountsDictImpl;
        ProductLaunchInformationImpl productLaunchInformationImpl;
        LoyaltyToplineInfoDictImpl loyaltyToplineInfoDictImpl;
        ProductImageContainerImpl productImageContainerImpl;
        User user;
        ArrayList arrayList;
        ArrayList arrayList2;
        SellerBadgeDict sellerBadgeDict;
        ProductImageContainerImpl productImageContainerImpl2;
        UntaggableReason untaggableReason;
        ArrayList arrayList3;
        User A0N;
        ProductAffiliateInformationDict AaP = AaP();
        if (AaP != null) {
            productAffiliateInformationDictImpl = AaP.EyG();
        } else {
            productAffiliateInformationDictImpl = null;
        }
        ProductArtsLabelsDictIntf Aci = Aci();
        if (Aci != null) {
            productArtsLabelsDict = Aci.EyI();
        } else {
            productArtsLabelsDict = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(2126971616);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(1925463788);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(2039092411);
        ProductCheckoutPropertiesIntf AnM = AnM();
        if (AnM != null) {
            productCheckoutProperties = AnM.F69();
        } else {
            productCheckoutProperties = null;
        }
        ProductCheckoutPropertiesIntf AnN = AnN();
        if (AnN != null) {
            productCheckoutProperties2 = AnN.F69();
        } else {
            productCheckoutProperties2 = null;
        }
        CheckoutStyle AnQ = AnQ();
        CommerceReviewStatisticsDictIntf Apr = Apr();
        if (Apr != null) {
            commerceReviewStatisticsDict = Apr.EsV();
        } else {
            commerceReviewStatisticsDict = null;
        }
        String A0j = A0j(601238911);
        String A0i = A0i(-1711795453);
        String A0i2 = A0i(-97885932);
        String A0i3 = A0i(-575829837);
        String A0i4 = A0i(-1840544998);
        String A0T = A0T();
        ProductDiscountsDict AyJ = AyJ();
        if (AyJ != null) {
            productDiscountsDictImpl = AyJ.EyN();
        } else {
            productDiscountsDictImpl = null;
        }
        String A0i5 = A0i(-1385596165);
        String A0i6 = A0i(-450506855);
        String A0i7 = A0i(1833004990);
        String A0i8 = A0i(-415525667);
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(45804691);
        Boolean optionalBooleanValueByHashCode5 = getOptionalBooleanValueByHashCode(-971305057);
        Boolean optionalBooleanValueByHashCode6 = getOptionalBooleanValueByHashCode(-1699805941);
        String A0i9 = A0i(-2101995259);
        Long A0L = A0L(-2095434588);
        Boolean optionalBooleanValueByHashCode7 = getOptionalBooleanValueByHashCode(-467471393);
        Boolean optionalBooleanValueByHashCode8 = getOptionalBooleanValueByHashCode(-752841999);
        Boolean optionalBooleanValueByHashCode9 = getOptionalBooleanValueByHashCode(-1995945578);
        ProductLaunchInformation BMK = BMK();
        if (BMK != null) {
            productLaunchInformationImpl = BMK.F6E();
        } else {
            productLaunchInformationImpl = null;
        }
        LoyaltyToplineInfoDict BPP = BPP();
        if (BPP != null) {
            loyaltyToplineInfoDictImpl = BPP.Ew8();
        } else {
            loyaltyToplineInfoDictImpl = null;
        }
        ProductImageContainer BPX = BPX();
        if (BPX != null) {
            productImageContainerImpl = BPX.F6D();
        } else {
            productImageContainerImpl = null;
        }
        String A0j2 = A0j(1402868293);
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, -505296440);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        String A0W = A0W();
        String A0i10 = A0i(802585392);
        String A0i11 = A0i(106934601);
        ProductReviewStatus Bgm = Bgm();
        String A0j3 = A0j(1753008747);
        List Bh8 = Bh8();
        if (Bh8 != null) {
            arrayList = AbstractC167007dF.A0i(Bh8);
            Iterator it = Bh8.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductImageContainer) it.next()).F6D());
            }
        } else {
            arrayList = null;
        }
        String A0i12 = A0i(-1889567899);
        String A0j4 = A0j(-1432108342);
        ProductReviewStatus BpF = BpF();
        List BpM = BpM();
        if (BpM != null) {
            arrayList2 = AbstractC167007dF.A0i(BpM);
            Iterator it2 = BpM.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((TextWithEntitiesBlockDictIntf) it2.next()).F3K());
            }
        } else {
            arrayList2 = null;
        }
        SellerBadgeDictIntf Bt4 = Bt4();
        if (Bt4 != null) {
            sellerBadgeDict = Bt4.EzO();
        } else {
            sellerBadgeDict = null;
        }
        XFBsizeCalibrationScore Bxe = Bxe();
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-113072286);
        ProductImageContainer C85 = C85();
        if (C85 != null) {
            productImageContainerImpl2 = C85.F6D();
        } else {
            productImageContainerImpl2 = null;
        }
        String A0i13 = A0i(-1599733110);
        UntaggableReasonIntf CD2 = CD2();
        if (CD2 != null) {
            untaggableReason = CD2.F3T();
        } else {
            untaggableReason = null;
        }
        List CEf = CEf();
        if (CEf != null) {
            arrayList3 = AbstractC167007dF.A0i(CEf);
            Iterator it3 = CEf.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((ProductVariantPossibleValueDictIntf) it3.next()).Eya());
            }
        } else {
            arrayList3 = null;
        }
        return new ProductDetailsProductItemDict(AnQ, commerceReviewStatisticsDict, loyaltyToplineInfoDictImpl, productAffiliateInformationDictImpl, productArtsLabelsDict, productDiscountsDictImpl, Bgm, BpF, sellerBadgeDict, untaggableReason, Bxe, productCheckoutProperties, productCheckoutProperties2, productImageContainerImpl, productImageContainerImpl2, productLaunchInformationImpl, user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, optionalBooleanValueByHashCode5, optionalBooleanValueByHashCode6, optionalBooleanValueByHashCode7, optionalBooleanValueByHashCode8, optionalBooleanValueByHashCode9, optionalIntValueByHashCode, A0L, A0j, A0i, A0i2, A0i3, A0i4, A0T, A0i5, A0i6, A0i7, A0i8, A0i9, A0j2, A0W, A0i10, A0i11, A0j3, A0i12, A0j4, A0i13, arrayList, arrayList2, arrayList3);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, IAA.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean Akw() {
        return getOptionalBooleanValueByHashCode(2126971616);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean AlJ() {
        return getOptionalBooleanValueByHashCode(1925463788);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean AlK() {
        return getOptionalBooleanValueByHashCode(2039092411);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean BCv() {
        return getOptionalBooleanValueByHashCode(45804691);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean BCz() {
        return getOptionalBooleanValueByHashCode(-971305057);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean BFj() {
        return getOptionalBooleanValueByHashCode(-1699805941);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String BIa() {
        return A0i(-2101995259);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Long BId() {
        return A0L(-2095434588);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String BcL() {
        return A0i(802585392);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String Bl9() {
        return A0i(-1889567899);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Integer Bxf() {
        return getOptionalIntValueByHashCode(-113072286);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String CC7() {
        return A0i(-1599733110);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean CTp() {
        return getOptionalBooleanValueByHashCode(-467471393);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean CWQ() {
        return getOptionalBooleanValueByHashCode(-752841999);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean CXv() {
        return getOptionalBooleanValueByHashCode(-1995945578);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductDetailsProductItemDictIntf ECE(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -505296440);
        return this;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductDetailsProductItemDict F7T(C1DV c1dv) {
        return F7S(AbstractC25235BEs.A0b(AbstractC37301Gc2.A08()));
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getCompoundProductId() {
        return A0j(601238911);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getCurrentPrice() {
        return A0i(-1711795453);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getCurrentPriceAmount() {
        return A0i(-97885932);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getCurrentPriceStripped() {
        return A0i(-575829837);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getDebugInfo() {
        return A0i(-1840544998);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getDescription() {
        return A0T();
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getExternalUrl() {
        return A0i(-1385596165);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getFullPrice() {
        return A0i(-450506855);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getFullPriceAmount() {
        return A0i(1833004990);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getFullPriceStripped() {
        return A0i(-415525667);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getMainImageId() {
        return A0j(1402868293);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getName() {
        return A0W();
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getPrice() {
        return A0i(106934601);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getProductId() {
        return A0j(1753008747);
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getRetailerId() {
        return A0j(-1432108342);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
