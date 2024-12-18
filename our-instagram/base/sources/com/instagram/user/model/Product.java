package com.instagram.user.model;

import X.AbstractC12990ll;
import X.AbstractC25651Mw;
import X.AbstractC41215IMe;
import X.C05F;
import X.C0T6;
import X.C14360o3;
import X.C16930sl;
import X.C3HW;
import X.C9Ay;
import X.EnumC77213d7;
import X.InterfaceC76653cC;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProductVariantPossibleValueDict;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.tagging.model.TaggableModel;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.Deprecated;

/* loaded from: classes2.dex */
public final class Product extends C0T6 implements InterfaceC76653cC, TaggableModel {
    public static final Parcelable.Creator CREATOR = new C9Ay(70);
    public TaggingFeedSessionInformation A00;
    public ProductDetailsProductItemDict A01;
    public final CommerceReviewStatisticsDictIntf A02;
    public final LoyaltyToplineInfoDict A03;
    public final ProductAffiliateInformationDict A04;
    public final ProductReviewStatus A05;
    public final UntaggableReason A06;
    public final ImageInfo A07;
    public final ImageInfo A08;
    public final ProductImageContainer A09;
    public final ProductImageContainer A0A;
    public final User A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final List A0N;
    public final List A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final ProductImageContainer A0R;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        if ((r1 != null ? r1.A00 : null) == com.instagram.api.schemas.InstagramProductTaggabilityState.A04) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Product(com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation r7, com.instagram.user.model.ProductDetailsProductItemDict r8) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.model.Product.<init>(com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation, com.instagram.user.model.ProductDetailsProductItemDict):void");
    }

    @Override // X.InterfaceC38391qT
    public final void AEH(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        AbstractC25651Mw.A00(abstractC12990ll).E4s(new C3HW(this));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Product) {
                Product product = (Product) obj;
                if (!C14360o3.A0K(this.A01, product.A01) || !C14360o3.A0K(this.A00, product.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        TaggingFeedSessionInformation taggingFeedSessionInformation = this.A00;
        return hashCode + (taggingFeedSessionInformation == null ? 0 : taggingFeedSessionInformation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final boolean A02() {
        List list = this.A01.A0n;
        if (list != null) {
            for (Object obj : list) {
                if (((ProductVariantPossibleValueDict) obj).A00 == ProductVariantVisualStyle.A05) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean A03() {
        return C14360o3.A0K(this.A01.A0K, true);
    }

    public final boolean A04() {
        return "native_checkout".equals(String.valueOf(this.A01.A00));
    }

    public final boolean A05() {
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A01;
        String str = productDetailsProductItemDict.A0V;
        if (str == null) {
            str = productDetailsProductItemDict.A0T;
        }
        String str2 = this.A0G;
        if (str == null) {
            if (str2 != null) {
                return true;
            }
            return false;
        }
        if (!str.equals(str2)) {
            return true;
        }
        return false;
    }

    public final boolean A06() {
        Long l;
        ProductCheckoutProperties productCheckoutProperties = this.A01.A0C;
        if (productCheckoutProperties != null) {
            l = productCheckoutProperties.A0F;
        } else {
            l = null;
        }
        if (A04() && l != null) {
            long longValue = l.longValue() * 1000;
            if (longValue > 0) {
                return new Date(System.currentTimeMillis()).before(new Date(longValue));
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC76653cC
    public final String BIa() {
        return this.A01.A0c;
    }

    @Override // X.InterfaceC76653cC
    public final long BIc() {
        Long l = this.A01.A0R;
        if (l != null) {
            return l.longValue();
        }
        return System.currentTimeMillis();
    }

    @Override // X.InterfaceC38391qT
    public final EnumC77213d7 BqJ() {
        if (C14360o3.A0K(this.A01.A0L, true)) {
            return EnumC77213d7.A04;
        }
        return EnumC77213d7.A03;
    }

    @Override // X.InterfaceC38391qT
    public final String BqK() {
        return this.A0H;
    }

    @Override // X.InterfaceC38391qT
    public final /* bridge */ /* synthetic */ Collection BqL() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC38391qT
    public final Integer BqO() {
        return C05F.A01;
    }

    @Override // X.InterfaceC38391qT
    @Deprecated(message = "Please use SavedProductStore.isSaved() instead")
    public final boolean CcN() {
        Boolean bool = this.A01.A0L;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC38391qT
    public final void Ed3(EnumC77213d7 enumC77213d7) {
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A01;
        C14360o3.A0B(productDetailsProductItemDict, 1);
        AbstractC41215IMe abstractC41215IMe = new AbstractC41215IMe(productDetailsProductItemDict);
        boolean z = false;
        if (enumC77213d7 == EnumC77213d7.A04) {
            z = true;
        }
        abstractC41215IMe.A0L = Boolean.valueOf(z);
        this.A01 = abstractC41215IMe.A00();
    }

    @Override // com.instagram.tagging.model.TaggableModel
    public final String getId() {
        return this.A0H;
    }

    public final void A00(String str) {
        A00(str);
        throw null;
    }

    public final void A01(String str) {
        A01(str);
        throw null;
    }
}
