package com.instagram.user.model;

import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C9Ay;
import X.IAA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.CommerceReviewStatisticsDict;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductArtsLabelsDict;
import com.instagram.api.schemas.ProductArtsLabelsDictIntf;
import com.instagram.api.schemas.ProductDiscountsDict;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.SellerBadgeDict;
import com.instagram.api.schemas.SellerBadgeDictIntf;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.api.schemas.UntaggableReasonIntf;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ProductDetailsProductItemDict extends C0T6 implements ProductDetailsProductItemDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(71);
    public final CheckoutStyle A00;
    public final CommerceReviewStatisticsDict A01;
    public final LoyaltyToplineInfoDict A02;
    public final ProductAffiliateInformationDict A03;
    public final ProductArtsLabelsDict A04;
    public final ProductDiscountsDict A05;
    public final ProductReviewStatus A06;
    public final ProductReviewStatus A07;
    public final SellerBadgeDict A08;
    public final UntaggableReason A09;
    public final XFBsizeCalibrationScore A0A;
    public final ProductCheckoutProperties A0B;
    public final ProductCheckoutProperties A0C;
    public final ProductImageContainer A0D;
    public final ProductImageContainer A0E;
    public final ProductLaunchInformation A0F;
    public final User A0G;
    public final Boolean A0H;
    public final Boolean A0I;
    public final Boolean A0J;
    public final Boolean A0K;
    public final Boolean A0L;
    public final Boolean A0M;
    public final Boolean A0N;
    public final Boolean A0O;
    public final Boolean A0P;
    public final Integer A0Q;
    public final Long A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final String A0i;
    public final String A0j;
    public final String A0k;
    public final List A0l;
    public final List A0m;
    public final List A0n;

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductDetailsProductItemDictIntf ECE(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductDetailsProductItemDict F7S(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductDetailsProductItemDict F7T(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDetailsProductItemDict) {
                ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) obj;
                if (!C14360o3.A0K(this.A03, productDetailsProductItemDict.A03) || !C14360o3.A0K(this.A04, productDetailsProductItemDict.A04) || !C14360o3.A0K(this.A0H, productDetailsProductItemDict.A0H) || !C14360o3.A0K(this.A0I, productDetailsProductItemDict.A0I) || !C14360o3.A0K(this.A0J, productDetailsProductItemDict.A0J) || !C14360o3.A0K(this.A0B, productDetailsProductItemDict.A0B) || !C14360o3.A0K(this.A0C, productDetailsProductItemDict.A0C) || this.A00 != productDetailsProductItemDict.A00 || !C14360o3.A0K(this.A01, productDetailsProductItemDict.A01) || !C14360o3.A0K(this.A0S, productDetailsProductItemDict.A0S) || !C14360o3.A0K(this.A0T, productDetailsProductItemDict.A0T) || !C14360o3.A0K(this.A0U, productDetailsProductItemDict.A0U) || !C14360o3.A0K(this.A0V, productDetailsProductItemDict.A0V) || !C14360o3.A0K(this.A0W, productDetailsProductItemDict.A0W) || !C14360o3.A0K(this.A0X, productDetailsProductItemDict.A0X) || !C14360o3.A0K(this.A05, productDetailsProductItemDict.A05) || !C14360o3.A0K(this.A0Y, productDetailsProductItemDict.A0Y) || !C14360o3.A0K(this.A0Z, productDetailsProductItemDict.A0Z) || !C14360o3.A0K(this.A0a, productDetailsProductItemDict.A0a) || !C14360o3.A0K(this.A0b, productDetailsProductItemDict.A0b) || !C14360o3.A0K(this.A0K, productDetailsProductItemDict.A0K) || !C14360o3.A0K(this.A0L, productDetailsProductItemDict.A0L) || !C14360o3.A0K(this.A0M, productDetailsProductItemDict.A0M) || !C14360o3.A0K(this.A0c, productDetailsProductItemDict.A0c) || !C14360o3.A0K(this.A0R, productDetailsProductItemDict.A0R) || !C14360o3.A0K(this.A0N, productDetailsProductItemDict.A0N) || !C14360o3.A0K(this.A0O, productDetailsProductItemDict.A0O) || !C14360o3.A0K(this.A0P, productDetailsProductItemDict.A0P) || !C14360o3.A0K(this.A0F, productDetailsProductItemDict.A0F) || !C14360o3.A0K(this.A02, productDetailsProductItemDict.A02) || !C14360o3.A0K(this.A0D, productDetailsProductItemDict.A0D) || !C14360o3.A0K(this.A0d, productDetailsProductItemDict.A0d) || !C14360o3.A0K(this.A0G, productDetailsProductItemDict.A0G) || !C14360o3.A0K(this.A0e, productDetailsProductItemDict.A0e) || !C14360o3.A0K(this.A0f, productDetailsProductItemDict.A0f) || !C14360o3.A0K(this.A0g, productDetailsProductItemDict.A0g) || this.A06 != productDetailsProductItemDict.A06 || !C14360o3.A0K(this.A0h, productDetailsProductItemDict.A0h) || !C14360o3.A0K(this.A0l, productDetailsProductItemDict.A0l) || !C14360o3.A0K(this.A0i, productDetailsProductItemDict.A0i) || !C14360o3.A0K(this.A0j, productDetailsProductItemDict.A0j) || this.A07 != productDetailsProductItemDict.A07 || !C14360o3.A0K(this.A0m, productDetailsProductItemDict.A0m) || !C14360o3.A0K(this.A08, productDetailsProductItemDict.A08) || this.A0A != productDetailsProductItemDict.A0A || !C14360o3.A0K(this.A0Q, productDetailsProductItemDict.A0Q) || !C14360o3.A0K(this.A0E, productDetailsProductItemDict.A0E) || !C14360o3.A0K(this.A0k, productDetailsProductItemDict.A0k) || !C14360o3.A0K(this.A09, productDetailsProductItemDict.A09) || !C14360o3.A0K(this.A0n, productDetailsProductItemDict.A0n)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ProductAffiliateInformationDict productAffiliateInformationDict = this.A03;
        int hashCode = (productAffiliateInformationDict == null ? 0 : productAffiliateInformationDict.hashCode()) * 31;
        ProductArtsLabelsDict productArtsLabelsDict = this.A04;
        int hashCode2 = (hashCode + (productArtsLabelsDict == null ? 0 : productArtsLabelsDict.hashCode())) * 31;
        Boolean bool = this.A0H;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A0I;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A0J;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ProductCheckoutProperties productCheckoutProperties = this.A0B;
        int hashCode6 = (hashCode5 + (productCheckoutProperties == null ? 0 : productCheckoutProperties.hashCode())) * 31;
        ProductCheckoutProperties productCheckoutProperties2 = this.A0C;
        int hashCode7 = (hashCode6 + (productCheckoutProperties2 == null ? 0 : productCheckoutProperties2.hashCode())) * 31;
        CheckoutStyle checkoutStyle = this.A00;
        int hashCode8 = (hashCode7 + (checkoutStyle == null ? 0 : checkoutStyle.hashCode())) * 31;
        CommerceReviewStatisticsDict commerceReviewStatisticsDict = this.A01;
        int hashCode9 = (hashCode8 + (commerceReviewStatisticsDict == null ? 0 : commerceReviewStatisticsDict.hashCode())) * 31;
        String str = this.A0S;
        int hashCode10 = (hashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A0T;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0U;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0V;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0W;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0X;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ProductDiscountsDict productDiscountsDict = this.A05;
        int hashCode16 = (hashCode15 + (productDiscountsDict == null ? 0 : productDiscountsDict.hashCode())) * 31;
        String str7 = this.A0Y;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0Z;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.A0a;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.A0b;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool4 = this.A0K;
        int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A0L;
        int hashCode22 = (hashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A0M;
        int hashCode23 = (hashCode22 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str11 = this.A0c;
        int hashCode24 = (hashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l = this.A0R;
        int hashCode25 = (hashCode24 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool7 = this.A0N;
        int hashCode26 = (hashCode25 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A0O;
        int hashCode27 = (hashCode26 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.A0P;
        int hashCode28 = (hashCode27 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        ProductLaunchInformation productLaunchInformation = this.A0F;
        int hashCode29 = (hashCode28 + (productLaunchInformation == null ? 0 : productLaunchInformation.hashCode())) * 31;
        LoyaltyToplineInfoDict loyaltyToplineInfoDict = this.A02;
        int hashCode30 = (hashCode29 + (loyaltyToplineInfoDict == null ? 0 : loyaltyToplineInfoDict.hashCode())) * 31;
        ProductImageContainer productImageContainer = this.A0D;
        int hashCode31 = (hashCode30 + (productImageContainer == null ? 0 : productImageContainer.hashCode())) * 31;
        String str12 = this.A0d;
        int hashCode32 = (hashCode31 + (str12 == null ? 0 : str12.hashCode())) * 31;
        User user = this.A0G;
        int hashCode33 = (hashCode32 + (user == null ? 0 : user.hashCode())) * 31;
        String str13 = this.A0e;
        int hashCode34 = (hashCode33 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.A0f;
        int hashCode35 = (hashCode34 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.A0g;
        int hashCode36 = (hashCode35 + (str15 == null ? 0 : str15.hashCode())) * 31;
        ProductReviewStatus productReviewStatus = this.A06;
        int hashCode37 = (hashCode36 + (productReviewStatus == null ? 0 : productReviewStatus.hashCode())) * 31;
        String str16 = this.A0h;
        int hashCode38 = (hashCode37 + (str16 == null ? 0 : str16.hashCode())) * 31;
        List list = this.A0l;
        int hashCode39 = (hashCode38 + (list == null ? 0 : list.hashCode())) * 31;
        String str17 = this.A0i;
        int hashCode40 = (hashCode39 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.A0j;
        int hashCode41 = (hashCode40 + (str18 == null ? 0 : str18.hashCode())) * 31;
        ProductReviewStatus productReviewStatus2 = this.A07;
        int hashCode42 = (hashCode41 + (productReviewStatus2 == null ? 0 : productReviewStatus2.hashCode())) * 31;
        List list2 = this.A0m;
        int hashCode43 = (hashCode42 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SellerBadgeDict sellerBadgeDict = this.A08;
        int hashCode44 = (hashCode43 + (sellerBadgeDict == null ? 0 : sellerBadgeDict.hashCode())) * 31;
        XFBsizeCalibrationScore xFBsizeCalibrationScore = this.A0A;
        int hashCode45 = (hashCode44 + (xFBsizeCalibrationScore == null ? 0 : xFBsizeCalibrationScore.hashCode())) * 31;
        Integer num = this.A0Q;
        int hashCode46 = (hashCode45 + (num == null ? 0 : num.hashCode())) * 31;
        ProductImageContainer productImageContainer2 = this.A0E;
        int hashCode47 = (hashCode46 + (productImageContainer2 == null ? 0 : productImageContainer2.hashCode())) * 31;
        String str19 = this.A0k;
        int hashCode48 = (hashCode47 + (str19 == null ? 0 : str19.hashCode())) * 31;
        UntaggableReason untaggableReason = this.A09;
        int hashCode49 = (hashCode48 + (untaggableReason == null ? 0 : untaggableReason.hashCode())) * 31;
        List list3 = this.A0n;
        return hashCode49 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        Boolean bool = this.A0H;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A0I;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.A0J;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A0B, i);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0V);
        parcel.writeString(this.A0W);
        parcel.writeString(this.A0X);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A0Y);
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0a);
        parcel.writeString(this.A0b);
        Boolean bool4 = this.A0K;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.A0L;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.A0M;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0c);
        Long l = this.A0R;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool7 = this.A0N;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.A0O;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.A0P;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A0F, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A0D, i);
        parcel.writeString(this.A0d);
        User user = this.A0G;
        if (user == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            user.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0e);
        parcel.writeString(this.A0f);
        parcel.writeString(this.A0g);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0h);
        List list = this.A0l;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
        parcel.writeString(this.A0i);
        parcel.writeString(this.A0j);
        parcel.writeParcelable(this.A07, i);
        List list2 = this.A0m;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable((Parcelable) it2.next(), i);
            }
        }
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A0A, i);
        Integer num = this.A0Q;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.A0E, i);
        parcel.writeString(this.A0k);
        parcel.writeParcelable(this.A09, i);
        List list3 = this.A0n;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable((Parcelable) it3.next(), i);
        }
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductAffiliateInformationDict AaP() {
        return this.A03;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final /* bridge */ /* synthetic */ ProductArtsLabelsDictIntf Aci() {
        return this.A04;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean Akw() {
        return this.A0H;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean AlJ() {
        return this.A0I;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean AlK() {
        return this.A0J;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final /* bridge */ /* synthetic */ ProductCheckoutPropertiesIntf AnM() {
        return this.A0B;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final /* bridge */ /* synthetic */ ProductCheckoutPropertiesIntf AnN() {
        return this.A0C;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final CheckoutStyle AnQ() {
        return this.A00;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final /* bridge */ /* synthetic */ CommerceReviewStatisticsDictIntf Apr() {
        return this.A01;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductDiscountsDict AyJ() {
        return this.A05;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean BCv() {
        return this.A0K;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean BCz() {
        return this.A0L;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean BFj() {
        return this.A0M;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String BIa() {
        return this.A0c;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Long BId() {
        return this.A0R;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductLaunchInformation BMK() {
        return this.A0F;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final LoyaltyToplineInfoDict BPP() {
        return this.A02;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductImageContainer BPX() {
        return this.A0D;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final User BSW() {
        return this.A0G;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String BcL() {
        return this.A0f;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductReviewStatus Bgm() {
        return this.A06;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final List Bh8() {
        return this.A0l;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String Bl9() {
        return this.A0i;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductReviewStatus BpF() {
        return this.A07;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final List BpM() {
        return this.A0m;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final /* bridge */ /* synthetic */ SellerBadgeDictIntf Bt4() {
        return this.A08;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final XFBsizeCalibrationScore Bxe() {
        return this.A0A;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Integer Bxf() {
        return this.A0Q;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final ProductImageContainer C85() {
        return this.A0E;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String CC7() {
        return this.A0k;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final /* bridge */ /* synthetic */ UntaggableReasonIntf CD2() {
        return this.A09;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final List CEf() {
        return this.A0n;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean CTp() {
        return this.A0N;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean CWQ() {
        return this.A0O;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final Boolean CXv() {
        return this.A0P;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProductDetailsProductItemDict", IAA.A00(this));
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getCompoundProductId() {
        return this.A0S;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getCurrentPrice() {
        return this.A0T;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getCurrentPriceAmount() {
        return this.A0U;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getCurrentPriceStripped() {
        return this.A0V;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getDebugInfo() {
        return this.A0W;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getDescription() {
        return this.A0X;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getExternalUrl() {
        return this.A0Y;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getFullPrice() {
        return this.A0Z;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getFullPriceAmount() {
        return this.A0a;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getFullPriceStripped() {
        return this.A0b;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getMainImageId() {
        return this.A0d;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getName() {
        return this.A0e;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getPrice() {
        return this.A0g;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getProductId() {
        return this.A0h;
    }

    @Override // com.instagram.user.model.ProductDetailsProductItemDictIntf
    public final String getRetailerId() {
        return this.A0j;
    }

    public ProductDetailsProductItemDict(CheckoutStyle checkoutStyle, CommerceReviewStatisticsDict commerceReviewStatisticsDict, LoyaltyToplineInfoDict loyaltyToplineInfoDict, ProductAffiliateInformationDict productAffiliateInformationDict, ProductArtsLabelsDict productArtsLabelsDict, ProductDiscountsDict productDiscountsDict, ProductReviewStatus productReviewStatus, ProductReviewStatus productReviewStatus2, SellerBadgeDict sellerBadgeDict, UntaggableReason untaggableReason, XFBsizeCalibrationScore xFBsizeCalibrationScore, ProductCheckoutProperties productCheckoutProperties, ProductCheckoutProperties productCheckoutProperties2, ProductImageContainer productImageContainer, ProductImageContainer productImageContainer2, ProductLaunchInformation productLaunchInformation, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List list, List list2, List list3) {
        this.A03 = productAffiliateInformationDict;
        this.A04 = productArtsLabelsDict;
        this.A0H = bool;
        this.A0I = bool2;
        this.A0J = bool3;
        this.A0B = productCheckoutProperties;
        this.A0C = productCheckoutProperties2;
        this.A00 = checkoutStyle;
        this.A01 = commerceReviewStatisticsDict;
        this.A0S = str;
        this.A0T = str2;
        this.A0U = str3;
        this.A0V = str4;
        this.A0W = str5;
        this.A0X = str6;
        this.A05 = productDiscountsDict;
        this.A0Y = str7;
        this.A0Z = str8;
        this.A0a = str9;
        this.A0b = str10;
        this.A0K = bool4;
        this.A0L = bool5;
        this.A0M = bool6;
        this.A0c = str11;
        this.A0R = l;
        this.A0N = bool7;
        this.A0O = bool8;
        this.A0P = bool9;
        this.A0F = productLaunchInformation;
        this.A02 = loyaltyToplineInfoDict;
        this.A0D = productImageContainer;
        this.A0d = str12;
        this.A0G = user;
        this.A0e = str13;
        this.A0f = str14;
        this.A0g = str15;
        this.A06 = productReviewStatus;
        this.A0h = str16;
        this.A0l = list;
        this.A0i = str17;
        this.A0j = str18;
        this.A07 = productReviewStatus2;
        this.A0m = list2;
        this.A08 = sellerBadgeDict;
        this.A0A = xFBsizeCalibrationScore;
        this.A0Q = num;
        this.A0E = productImageContainer2;
        this.A0k = str19;
        this.A09 = untaggableReason;
        this.A0n = list3;
    }
}
