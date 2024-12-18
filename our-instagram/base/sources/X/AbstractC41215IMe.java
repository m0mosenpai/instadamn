package X;

import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.CommerceReviewStatisticsDict;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
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
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IMe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41215IMe {
    public CheckoutStyle A00;
    public CommerceReviewStatisticsDictIntf A01;
    public LoyaltyToplineInfoDict A02;
    public ProductAffiliateInformationDict A03;
    public ProductArtsLabelsDictIntf A04;
    public ProductDiscountsDict A05;
    public ProductReviewStatus A06;
    public ProductReviewStatus A07;
    public SellerBadgeDictIntf A08;
    public UntaggableReasonIntf A09;
    public XFBsizeCalibrationScore A0A;
    public ProductCheckoutPropertiesIntf A0B;
    public ProductCheckoutPropertiesIntf A0C;
    public ProductImageContainer A0D;
    public ProductImageContainer A0E;
    public ProductLaunchInformation A0F;
    public User A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Boolean A0O;
    public Boolean A0P;
    public Integer A0Q;
    public Long A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public List A0l;
    public List A0m;
    public List A0n;
    public final ProductDetailsProductItemDictIntf A0o;

    public final ProductDetailsProductItemDict A00() {
        ProductAffiliateInformationDictImpl productAffiliateInformationDictImpl;
        ProductArtsLabelsDict productArtsLabelsDict;
        ProductCheckoutProperties productCheckoutProperties;
        ProductCheckoutProperties productCheckoutProperties2;
        ProductDiscountsDictImpl productDiscountsDictImpl;
        ProductLaunchInformationImpl productLaunchInformationImpl;
        LoyaltyToplineInfoDictImpl loyaltyToplineInfoDictImpl;
        ProductImageContainerImpl productImageContainerImpl;
        ArrayList arrayList;
        ArrayList arrayList2;
        SellerBadgeDict sellerBadgeDict;
        ProductImageContainerImpl productImageContainerImpl2;
        UntaggableReason untaggableReason;
        ArrayList arrayList3;
        AbstractC167017dG.A0x();
        ProductAffiliateInformationDict productAffiliateInformationDict = this.A03;
        if (productAffiliateInformationDict != null) {
            productAffiliateInformationDictImpl = productAffiliateInformationDict.EyG();
        } else {
            productAffiliateInformationDictImpl = null;
        }
        ProductArtsLabelsDictIntf productArtsLabelsDictIntf = this.A04;
        if (productArtsLabelsDictIntf != null) {
            productArtsLabelsDict = productArtsLabelsDictIntf.EyI();
        } else {
            productArtsLabelsDict = null;
        }
        Boolean bool = this.A0H;
        Boolean bool2 = this.A0I;
        Boolean bool3 = this.A0J;
        ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf = this.A0B;
        if (productCheckoutPropertiesIntf != null) {
            productCheckoutProperties = productCheckoutPropertiesIntf.F69();
        } else {
            productCheckoutProperties = null;
        }
        ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf2 = this.A0C;
        if (productCheckoutPropertiesIntf2 != null) {
            productCheckoutProperties2 = productCheckoutPropertiesIntf2.F69();
        } else {
            productCheckoutProperties2 = null;
        }
        CheckoutStyle checkoutStyle = this.A00;
        CommerceReviewStatisticsDictIntf commerceReviewStatisticsDictIntf = this.A01;
        CommerceReviewStatisticsDict EsV = commerceReviewStatisticsDictIntf != null ? commerceReviewStatisticsDictIntf.EsV() : null;
        String str = this.A0S;
        String str2 = this.A0T;
        String str3 = this.A0U;
        String str4 = this.A0V;
        String str5 = this.A0W;
        String str6 = this.A0X;
        ProductDiscountsDict productDiscountsDict = this.A05;
        if (productDiscountsDict != null) {
            productDiscountsDictImpl = productDiscountsDict.EyN();
        } else {
            productDiscountsDictImpl = null;
        }
        String str7 = this.A0Y;
        String str8 = this.A0Z;
        String str9 = this.A0a;
        String str10 = this.A0b;
        Boolean bool4 = this.A0K;
        Boolean bool5 = this.A0L;
        Boolean bool6 = this.A0M;
        String str11 = this.A0c;
        Long l = this.A0R;
        Boolean bool7 = this.A0N;
        Boolean bool8 = this.A0O;
        Boolean bool9 = this.A0P;
        ProductLaunchInformation productLaunchInformation = this.A0F;
        if (productLaunchInformation != null) {
            productLaunchInformationImpl = productLaunchInformation.F6E();
        } else {
            productLaunchInformationImpl = null;
        }
        LoyaltyToplineInfoDict loyaltyToplineInfoDict = this.A02;
        if (loyaltyToplineInfoDict != null) {
            loyaltyToplineInfoDictImpl = loyaltyToplineInfoDict.Ew8();
        } else {
            loyaltyToplineInfoDictImpl = null;
        }
        ProductImageContainer productImageContainer = this.A0D;
        if (productImageContainer != null) {
            productImageContainerImpl = productImageContainer.F6D();
        } else {
            productImageContainerImpl = null;
        }
        String str12 = this.A0d;
        User user = this.A0G;
        String str13 = this.A0e;
        String str14 = this.A0f;
        String str15 = this.A0g;
        ProductReviewStatus productReviewStatus = this.A06;
        String str16 = this.A0h;
        List list = this.A0l;
        if (list != null) {
            arrayList = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductImageContainer) it.next()).F6D());
            }
        } else {
            arrayList = null;
        }
        String str17 = this.A0i;
        String str18 = this.A0j;
        ProductReviewStatus productReviewStatus2 = this.A07;
        List list2 = this.A0m;
        if (list2 != null) {
            arrayList2 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((TextWithEntitiesBlockDictIntf) it2.next()).F3K());
            }
        } else {
            arrayList2 = null;
        }
        SellerBadgeDictIntf sellerBadgeDictIntf = this.A08;
        if (sellerBadgeDictIntf != null) {
            sellerBadgeDict = sellerBadgeDictIntf.EzO();
        } else {
            sellerBadgeDict = null;
        }
        XFBsizeCalibrationScore xFBsizeCalibrationScore = this.A0A;
        Integer num = this.A0Q;
        ProductImageContainer productImageContainer2 = this.A0E;
        if (productImageContainer2 != null) {
            productImageContainerImpl2 = productImageContainer2.F6D();
        } else {
            productImageContainerImpl2 = null;
        }
        String str19 = this.A0k;
        UntaggableReasonIntf untaggableReasonIntf = this.A09;
        if (untaggableReasonIntf != null) {
            untaggableReason = untaggableReasonIntf.F3T();
        } else {
            untaggableReason = null;
        }
        List list3 = this.A0n;
        if (list3 != null) {
            arrayList3 = AbstractC167007dF.A0i(list3);
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((ProductVariantPossibleValueDictIntf) it3.next()).Eya());
            }
        } else {
            arrayList3 = null;
        }
        return new ProductDetailsProductItemDict(checkoutStyle, EsV, loyaltyToplineInfoDictImpl, productAffiliateInformationDictImpl, productArtsLabelsDict, productDiscountsDictImpl, productReviewStatus, productReviewStatus2, sellerBadgeDict, untaggableReason, xFBsizeCalibrationScore, productCheckoutProperties, productCheckoutProperties2, productImageContainerImpl, productImageContainerImpl2, productLaunchInformationImpl, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, arrayList, arrayList2, arrayList3);
    }

    public AbstractC41215IMe(ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        this.A0o = productDetailsProductItemDictIntf;
        this.A03 = productDetailsProductItemDictIntf.AaP();
        this.A04 = productDetailsProductItemDictIntf.Aci();
        this.A0H = productDetailsProductItemDictIntf.Akw();
        this.A0I = productDetailsProductItemDictIntf.AlJ();
        this.A0J = productDetailsProductItemDictIntf.AlK();
        this.A0B = productDetailsProductItemDictIntf.AnM();
        this.A0C = productDetailsProductItemDictIntf.AnN();
        this.A00 = productDetailsProductItemDictIntf.AnQ();
        this.A01 = productDetailsProductItemDictIntf.Apr();
        this.A0S = productDetailsProductItemDictIntf.getCompoundProductId();
        this.A0T = productDetailsProductItemDictIntf.getCurrentPrice();
        this.A0U = productDetailsProductItemDictIntf.getCurrentPriceAmount();
        this.A0V = productDetailsProductItemDictIntf.getCurrentPriceStripped();
        this.A0W = productDetailsProductItemDictIntf.getDebugInfo();
        this.A0X = productDetailsProductItemDictIntf.getDescription();
        this.A05 = productDetailsProductItemDictIntf.AyJ();
        this.A0Y = productDetailsProductItemDictIntf.getExternalUrl();
        this.A0Z = productDetailsProductItemDictIntf.getFullPrice();
        this.A0a = productDetailsProductItemDictIntf.getFullPriceAmount();
        this.A0b = productDetailsProductItemDictIntf.getFullPriceStripped();
        this.A0K = productDetailsProductItemDictIntf.BCv();
        this.A0L = productDetailsProductItemDictIntf.BCz();
        this.A0M = productDetailsProductItemDictIntf.BFj();
        this.A0c = productDetailsProductItemDictIntf.BIa();
        this.A0R = productDetailsProductItemDictIntf.BId();
        this.A0N = productDetailsProductItemDictIntf.CTp();
        this.A0O = productDetailsProductItemDictIntf.CWQ();
        this.A0P = productDetailsProductItemDictIntf.CXv();
        this.A0F = productDetailsProductItemDictIntf.BMK();
        this.A02 = productDetailsProductItemDictIntf.BPP();
        this.A0D = productDetailsProductItemDictIntf.BPX();
        this.A0d = productDetailsProductItemDictIntf.getMainImageId();
        this.A0G = productDetailsProductItemDictIntf.BSW();
        this.A0e = productDetailsProductItemDictIntf.getName();
        this.A0f = productDetailsProductItemDictIntf.BcL();
        this.A0g = productDetailsProductItemDictIntf.getPrice();
        this.A06 = productDetailsProductItemDictIntf.Bgm();
        this.A0h = productDetailsProductItemDictIntf.getProductId();
        this.A0l = productDetailsProductItemDictIntf.Bh8();
        this.A0i = productDetailsProductItemDictIntf.Bl9();
        this.A0j = productDetailsProductItemDictIntf.getRetailerId();
        this.A07 = productDetailsProductItemDictIntf.BpF();
        this.A0m = productDetailsProductItemDictIntf.BpM();
        this.A08 = productDetailsProductItemDictIntf.Bt4();
        this.A0A = productDetailsProductItemDictIntf.Bxe();
        this.A0Q = productDetailsProductItemDictIntf.Bxf();
        this.A0E = productDetailsProductItemDictIntf.C85();
        this.A0k = productDetailsProductItemDictIntf.CC7();
        this.A09 = productDetailsProductItemDictIntf.CD2();
        this.A0n = productDetailsProductItemDictIntf.CEf();
    }
}
