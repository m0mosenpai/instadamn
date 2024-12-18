package X;

import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.CommerceReviewStatisticsDict;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.LoyaltyToplineInfoDictImpl;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductAffiliateInformationDictImpl;
import com.instagram.api.schemas.ProductArtsLabelsDict;
import com.instagram.api.schemas.ProductDiscountsDict;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.SellerBadgeDict;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.IeK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41746IeK {
    public CheckoutStyle A00;
    public CommerceReviewStatisticsDict A01;
    public LoyaltyToplineInfoDict A02;
    public ProductAffiliateInformationDict A03;
    public ProductArtsLabelsDict A04;
    public ProductDiscountsDict A05;
    public ProductReviewStatus A06;
    public SellerBadgeDict A07;
    public UntaggableReason A08;
    public XFBsizeCalibrationScore A09;
    public ProductCheckoutProperties A0A;
    public ProductImageContainer A0B;
    public ProductImageContainer A0C;
    public TaggingFeedSessionInformation A0D;
    public ProductLaunchInformation A0E;
    public User A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Long A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public List A0b;
    public List A0c;

    public static Product A01(ProductReviewStatus productReviewStatus, ProductCheckoutProperties productCheckoutProperties, ProductImageContainer productImageContainer, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return A00(null, null, productReviewStatus, productCheckoutProperties, productImageContainer, null, null, user, null, bool, bool2, bool3, bool4, bool5, str, null, str2, str3, null, str4, null, str5, str6, null, str7, null);
    }

    public static Product A02(String str) {
        return A00(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null);
    }

    public C41746IeK(Product product) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        ProductDiscountsDict productDiscountsDict;
        Boolean bool4;
        List list;
        User user;
        ProductCheckoutProperties productCheckoutProperties;
        ProductLaunchInformation productLaunchInformation;
        ProductImageContainer productImageContainer;
        ProductImageContainer productImageContainer2;
        ProductReviewStatus productReviewStatus;
        CheckoutStyle checkoutStyle;
        String str;
        String str2;
        String str3;
        String str4;
        List list2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        UntaggableReason untaggableReason;
        ProductAffiliateInformationDict productAffiliateInformationDict;
        LoyaltyToplineInfoDict loyaltyToplineInfoDict;
        CommerceReviewStatisticsDict commerceReviewStatisticsDict;
        Boolean bool5;
        Boolean bool6;
        SellerBadgeDict sellerBadgeDict;
        ProductArtsLabelsDict productArtsLabelsDict;
        XFBsizeCalibrationScore xFBsizeCalibrationScore;
        Long l;
        String str14;
        ProductDetailsProductItemDict productDetailsProductItemDict;
        ProductDetailsProductItemDict productDetailsProductItemDict2;
        ProductDetailsProductItemDict productDetailsProductItemDict3;
        ProductDetailsProductItemDict productDetailsProductItemDict4;
        ProductDetailsProductItemDict productDetailsProductItemDict5;
        ProductDetailsProductItemDict productDetailsProductItemDict6;
        ProductDetailsProductItemDict productDetailsProductItemDict7;
        ProductDetailsProductItemDict productDetailsProductItemDict8;
        ProductDetailsProductItemDict productDetailsProductItemDict9;
        ProductDetailsProductItemDict productDetailsProductItemDict10;
        ProductDetailsProductItemDict productDetailsProductItemDict11;
        ProductDetailsProductItemDict productDetailsProductItemDict12;
        ProductDetailsProductItemDict productDetailsProductItemDict13;
        ProductDetailsProductItemDict productDetailsProductItemDict14;
        ProductDetailsProductItemDict productDetailsProductItemDict15;
        ProductDetailsProductItemDict productDetailsProductItemDict16;
        ProductDetailsProductItemDict productDetailsProductItemDict17;
        ProductDetailsProductItemDict productDetailsProductItemDict18;
        ProductDetailsProductItemDict productDetailsProductItemDict19;
        ProductDetailsProductItemDict productDetailsProductItemDict20;
        ProductDetailsProductItemDict productDetailsProductItemDict21;
        ProductDetailsProductItemDict productDetailsProductItemDict22;
        ProductDetailsProductItemDict productDetailsProductItemDict23;
        ProductDetailsProductItemDict productDetailsProductItemDict24;
        ProductDetailsProductItemDict productDetailsProductItemDict25;
        ProductDetailsProductItemDict productDetailsProductItemDict26;
        ProductDetailsProductItemDict productDetailsProductItemDict27;
        ProductDetailsProductItemDict productDetailsProductItemDict28;
        ProductDetailsProductItemDict productDetailsProductItemDict29;
        ProductDetailsProductItemDict productDetailsProductItemDict30;
        ProductDetailsProductItemDict productDetailsProductItemDict31;
        ProductDetailsProductItemDict productDetailsProductItemDict32;
        ProductDetailsProductItemDict productDetailsProductItemDict33;
        ProductDetailsProductItemDict productDetailsProductItemDict34;
        ProductDetailsProductItemDict productDetailsProductItemDict35;
        ProductDetailsProductItemDict productDetailsProductItemDict36;
        ProductDetailsProductItemDict productDetailsProductItemDict37;
        ProductDetailsProductItemDict productDetailsProductItemDict38;
        if (product != null && (productDetailsProductItemDict38 = product.A01) != null) {
            bool = productDetailsProductItemDict38.A0L;
        } else {
            bool = null;
        }
        this.A0J = bool;
        if (product != null && (productDetailsProductItemDict37 = product.A01) != null) {
            bool2 = productDetailsProductItemDict37.A0H;
        } else {
            bool2 = null;
        }
        this.A0G = bool2;
        if (product != null && (productDetailsProductItemDict36 = product.A01) != null) {
            bool3 = productDetailsProductItemDict36.A0M;
        } else {
            bool3 = null;
        }
        this.A0K = bool3;
        if (product != null && (productDetailsProductItemDict35 = product.A01) != null) {
            productDiscountsDict = productDetailsProductItemDict35.A05;
        } else {
            productDiscountsDict = null;
        }
        this.A05 = productDiscountsDict;
        if (product != null && (productDetailsProductItemDict34 = product.A01) != null) {
            bool4 = productDetailsProductItemDict34.A0K;
        } else {
            bool4 = null;
        }
        this.A0I = bool4;
        if (product != null && (productDetailsProductItemDict33 = product.A01) != null) {
            list = productDetailsProductItemDict33.A0n;
        } else {
            list = null;
        }
        this.A0c = list;
        if (product != null && (productDetailsProductItemDict32 = product.A01) != null) {
            user = productDetailsProductItemDict32.A0G;
        } else {
            user = null;
        }
        this.A0F = user;
        if (product != null && (productDetailsProductItemDict31 = product.A01) != null) {
            productCheckoutProperties = productDetailsProductItemDict31.A0C;
        } else {
            productCheckoutProperties = null;
        }
        this.A0A = productCheckoutProperties;
        if (product != null && (productDetailsProductItemDict30 = product.A01) != null) {
            productLaunchInformation = productDetailsProductItemDict30.A0F;
        } else {
            productLaunchInformation = null;
        }
        this.A0E = productLaunchInformation;
        if (product != null && (productDetailsProductItemDict29 = product.A01) != null) {
            productImageContainer = productDetailsProductItemDict29.A0D;
        } else {
            productImageContainer = null;
        }
        this.A0B = productImageContainer;
        if (product != null && (productDetailsProductItemDict28 = product.A01) != null) {
            productImageContainer2 = productDetailsProductItemDict28.A0E;
        } else {
            productImageContainer2 = null;
        }
        this.A0C = productImageContainer2;
        if (product != null && (productDetailsProductItemDict27 = product.A01) != null) {
            productReviewStatus = productDetailsProductItemDict27.A07;
        } else {
            productReviewStatus = null;
        }
        this.A06 = productReviewStatus;
        if (product != null && (productDetailsProductItemDict26 = product.A01) != null) {
            checkoutStyle = productDetailsProductItemDict26.A00;
        } else {
            checkoutStyle = null;
        }
        this.A00 = checkoutStyle;
        if (product != null && (productDetailsProductItemDict25 = product.A01) != null) {
            str = productDetailsProductItemDict25.A0T;
        } else {
            str = null;
        }
        this.A0O = str;
        if (product != null && (productDetailsProductItemDict24 = product.A01) != null) {
            str2 = productDetailsProductItemDict24.A0f;
        } else {
            str2 = null;
        }
        this.A0Z = str2;
        if (product != null && (productDetailsProductItemDict23 = product.A01) != null) {
            str3 = productDetailsProductItemDict23.A0W;
        } else {
            str3 = null;
        }
        this.A0R = str3;
        if (product != null && (productDetailsProductItemDict22 = product.A01) != null) {
            str4 = productDetailsProductItemDict22.A0X;
        } else {
            str4 = null;
        }
        this.A0S = str4;
        if (product != null && (productDetailsProductItemDict21 = product.A01) != null) {
            list2 = productDetailsProductItemDict21.A0m;
        } else {
            list2 = null;
        }
        this.A0b = list2;
        if (product != null && (productDetailsProductItemDict20 = product.A01) != null) {
            str5 = productDetailsProductItemDict20.A0Y;
        } else {
            str5 = null;
        }
        this.A0T = str5;
        if (product != null && (productDetailsProductItemDict19 = product.A01) != null) {
            str6 = productDetailsProductItemDict19.A0Z;
        } else {
            str6 = null;
        }
        this.A0U = str6;
        if (product != null && (productDetailsProductItemDict18 = product.A01) != null) {
            str7 = productDetailsProductItemDict18.A0V;
        } else {
            str7 = null;
        }
        this.A0Q = str7;
        if (product != null && (productDetailsProductItemDict17 = product.A01) != null) {
            str8 = productDetailsProductItemDict17.A0b;
        } else {
            str8 = null;
        }
        this.A0W = str8;
        if (product != null && (productDetailsProductItemDict16 = product.A01) != null) {
            str9 = productDetailsProductItemDict16.A0U;
        } else {
            str9 = null;
        }
        this.A0P = str9;
        if (product != null && (productDetailsProductItemDict15 = product.A01) != null) {
            str10 = productDetailsProductItemDict15.A0a;
        } else {
            str10 = null;
        }
        this.A0V = str10;
        if (product != null && (productDetailsProductItemDict14 = product.A01) != null) {
            str11 = productDetailsProductItemDict14.A0e;
        } else {
            str11 = null;
        }
        this.A0Y = str11;
        if (product != null && (productDetailsProductItemDict13 = product.A01) != null) {
            str12 = productDetailsProductItemDict13.A0S;
        } else {
            str12 = null;
        }
        this.A0N = str12;
        if (product != null && (productDetailsProductItemDict12 = product.A01) != null) {
            str13 = productDetailsProductItemDict12.A0j;
        } else {
            str13 = null;
        }
        this.A0a = str13;
        if (product != null && (productDetailsProductItemDict11 = product.A01) != null) {
            untaggableReason = productDetailsProductItemDict11.A09;
        } else {
            untaggableReason = null;
        }
        this.A08 = untaggableReason;
        if (product != null && (productDetailsProductItemDict10 = product.A01) != null) {
            productAffiliateInformationDict = productDetailsProductItemDict10.A03;
        } else {
            productAffiliateInformationDict = null;
        }
        this.A03 = productAffiliateInformationDict;
        if (product != null && (productDetailsProductItemDict9 = product.A01) != null) {
            loyaltyToplineInfoDict = productDetailsProductItemDict9.A02;
        } else {
            loyaltyToplineInfoDict = null;
        }
        this.A02 = loyaltyToplineInfoDict;
        if (product != null && (productDetailsProductItemDict8 = product.A01) != null) {
            commerceReviewStatisticsDict = productDetailsProductItemDict8.A01;
        } else {
            commerceReviewStatisticsDict = null;
        }
        this.A01 = commerceReviewStatisticsDict;
        if (product != null && (productDetailsProductItemDict7 = product.A01) != null) {
            bool5 = productDetailsProductItemDict7.A0I;
        } else {
            bool5 = null;
        }
        this.A0H = bool5;
        if (product != null && (productDetailsProductItemDict6 = product.A01) != null) {
            bool6 = productDetailsProductItemDict6.A0O;
        } else {
            bool6 = null;
        }
        this.A0L = bool6;
        if (product != null && (productDetailsProductItemDict5 = product.A01) != null) {
            sellerBadgeDict = productDetailsProductItemDict5.A08;
        } else {
            sellerBadgeDict = null;
        }
        this.A07 = sellerBadgeDict;
        if (product != null && (productDetailsProductItemDict4 = product.A01) != null) {
            productArtsLabelsDict = productDetailsProductItemDict4.A04;
        } else {
            productArtsLabelsDict = null;
        }
        this.A04 = productArtsLabelsDict;
        if (product != null && (productDetailsProductItemDict3 = product.A01) != null) {
            xFBsizeCalibrationScore = productDetailsProductItemDict3.A0A;
        } else {
            xFBsizeCalibrationScore = null;
        }
        this.A09 = xFBsizeCalibrationScore;
        if (product != null && (productDetailsProductItemDict2 = product.A01) != null) {
            l = productDetailsProductItemDict2.A0R;
        } else {
            l = null;
        }
        this.A0M = l;
        if (product != null && (productDetailsProductItemDict = product.A01) != null) {
            str14 = productDetailsProductItemDict.A0c;
        } else {
            str14 = null;
        }
        this.A0X = str14;
        this.A0D = product != null ? product.A00 : null;
    }

    public final Product A03(String str) {
        ProductAffiliateInformationDictImpl productAffiliateInformationDictImpl;
        ProductLaunchInformationImpl productLaunchInformationImpl;
        LoyaltyToplineInfoDictImpl loyaltyToplineInfoDictImpl;
        ProductDetailsProductItemDict A00 = C41681IdA.A00();
        C14360o3.A0B(A00, 1);
        AbstractC41215IMe abstractC41215IMe = new AbstractC41215IMe(A00);
        ProductAffiliateInformationDict productAffiliateInformationDict = this.A03;
        if (productAffiliateInformationDict != null) {
            productAffiliateInformationDictImpl = productAffiliateInformationDict.EyG();
        } else {
            productAffiliateInformationDictImpl = null;
        }
        abstractC41215IMe.A03 = productAffiliateInformationDictImpl;
        abstractC41215IMe.A04 = this.A04;
        abstractC41215IMe.A0H = this.A0G;
        abstractC41215IMe.A0I = this.A0H;
        abstractC41215IMe.A0J = null;
        abstractC41215IMe.A0B = null;
        abstractC41215IMe.A0C = this.A0A;
        abstractC41215IMe.A00 = this.A00;
        abstractC41215IMe.A01 = this.A01;
        abstractC41215IMe.A0S = this.A0N;
        abstractC41215IMe.A0T = this.A0O;
        abstractC41215IMe.A0U = this.A0P;
        abstractC41215IMe.A0V = this.A0Q;
        abstractC41215IMe.A0W = this.A0R;
        abstractC41215IMe.A0X = this.A0S;
        abstractC41215IMe.A05 = this.A05;
        abstractC41215IMe.A0Y = this.A0T;
        abstractC41215IMe.A0Z = this.A0U;
        abstractC41215IMe.A0a = this.A0V;
        abstractC41215IMe.A0b = this.A0W;
        abstractC41215IMe.A0K = this.A0I;
        abstractC41215IMe.A0L = this.A0J;
        abstractC41215IMe.A0M = this.A0K;
        abstractC41215IMe.A0N = null;
        abstractC41215IMe.A0O = this.A0L;
        ProductLaunchInformation productLaunchInformation = this.A0E;
        if (productLaunchInformation != null) {
            productLaunchInformationImpl = productLaunchInformation.F6E();
        } else {
            productLaunchInformationImpl = null;
        }
        abstractC41215IMe.A0F = productLaunchInformationImpl;
        LoyaltyToplineInfoDict loyaltyToplineInfoDict = this.A02;
        if (loyaltyToplineInfoDict != null) {
            loyaltyToplineInfoDictImpl = loyaltyToplineInfoDict.Ew8();
        } else {
            loyaltyToplineInfoDictImpl = null;
        }
        abstractC41215IMe.A02 = loyaltyToplineInfoDictImpl;
        abstractC41215IMe.A0D = this.A0B;
        abstractC41215IMe.A0d = null;
        abstractC41215IMe.A0G = this.A0F;
        abstractC41215IMe.A0e = this.A0Y;
        abstractC41215IMe.A0f = this.A0Z;
        abstractC41215IMe.A0g = null;
        abstractC41215IMe.A06 = null;
        abstractC41215IMe.A0h = str;
        abstractC41215IMe.A0l = null;
        abstractC41215IMe.A0i = null;
        abstractC41215IMe.A0j = this.A0a;
        abstractC41215IMe.A07 = this.A06;
        abstractC41215IMe.A0m = this.A0b;
        abstractC41215IMe.A08 = this.A07;
        abstractC41215IMe.A0A = this.A09;
        abstractC41215IMe.A0Q = null;
        abstractC41215IMe.A0E = this.A0C;
        abstractC41215IMe.A0k = null;
        abstractC41215IMe.A09 = this.A08;
        abstractC41215IMe.A0n = this.A0c;
        abstractC41215IMe.A0P = null;
        abstractC41215IMe.A0R = this.A0M;
        abstractC41215IMe.A0c = this.A0X;
        return new Product(this.A0D, abstractC41215IMe.A00());
    }

    public static Product A00(CheckoutStyle checkoutStyle, CommerceReviewStatisticsDict commerceReviewStatisticsDict, ProductReviewStatus productReviewStatus, ProductCheckoutProperties productCheckoutProperties, ProductImageContainer productImageContainer, ProductImageContainer productImageContainer2, ProductLaunchInformation productLaunchInformation, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        ProductDetailsProductItemDict A00 = C41681IdA.A00();
        C14360o3.A0B(A00, 1);
        AbstractC41215IMe abstractC41215IMe = new AbstractC41215IMe(A00);
        abstractC41215IMe.A03 = null;
        abstractC41215IMe.A04 = null;
        abstractC41215IMe.A0H = bool;
        abstractC41215IMe.A0I = bool2;
        abstractC41215IMe.A0J = null;
        abstractC41215IMe.A0B = null;
        abstractC41215IMe.A0C = productCheckoutProperties;
        abstractC41215IMe.A00 = checkoutStyle;
        abstractC41215IMe.A01 = commerceReviewStatisticsDict;
        abstractC41215IMe.A0S = null;
        abstractC41215IMe.A0T = str;
        abstractC41215IMe.A0U = str2;
        abstractC41215IMe.A0V = str3;
        abstractC41215IMe.A0W = null;
        abstractC41215IMe.A0X = str4;
        abstractC41215IMe.A05 = null;
        abstractC41215IMe.A0Y = str5;
        abstractC41215IMe.A0Z = str6;
        abstractC41215IMe.A0a = str7;
        abstractC41215IMe.A0b = str8;
        abstractC41215IMe.A0K = bool3;
        abstractC41215IMe.A0L = bool4;
        abstractC41215IMe.A0M = bool5;
        abstractC41215IMe.A0N = null;
        abstractC41215IMe.A0O = bool6;
        abstractC41215IMe.A0F = productLaunchInformation != null ? productLaunchInformation.F6E() : null;
        abstractC41215IMe.A02 = null;
        abstractC41215IMe.A0D = productImageContainer;
        abstractC41215IMe.A0d = null;
        abstractC41215IMe.A0G = user;
        abstractC41215IMe.A0e = str9;
        abstractC41215IMe.A0f = str10;
        abstractC41215IMe.A0g = null;
        abstractC41215IMe.A06 = null;
        abstractC41215IMe.A0h = str11;
        abstractC41215IMe.A0l = null;
        abstractC41215IMe.A0i = null;
        abstractC41215IMe.A0j = null;
        abstractC41215IMe.A07 = productReviewStatus;
        abstractC41215IMe.A0m = null;
        abstractC41215IMe.A08 = null;
        abstractC41215IMe.A0A = null;
        abstractC41215IMe.A0Q = null;
        abstractC41215IMe.A0E = productImageContainer2;
        abstractC41215IMe.A0k = null;
        abstractC41215IMe.A09 = null;
        abstractC41215IMe.A0n = list;
        abstractC41215IMe.A0P = null;
        abstractC41215IMe.A0R = null;
        abstractC41215IMe.A0c = null;
        return new Product(null, abstractC41215IMe.A00());
    }

    public C41746IeK() {
        this(null);
    }
}
