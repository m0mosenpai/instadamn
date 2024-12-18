package com.instagram.model.shopping.reels;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41856IgA;
import X.I49;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ProductSticker extends C0T6 implements ProductStickerIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(59);
    public final DropsEventPageNavigationMetadata A00;
    public final TextReviewStatus A01;
    public final DropsLaunchAnimation A02;
    public final ProductDetailsProductItemDict A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final ProductSticker F6N(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final ProductSticker F6O(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductSticker) {
                ProductSticker productSticker = (ProductSticker) obj;
                if (!C14360o3.A0K(this.A07, productSticker.A07) || !C14360o3.A0K(this.A02, productSticker.A02) || !C14360o3.A0K(this.A00, productSticker.A00) || !C14360o3.A0K(this.A08, productSticker.A08) || !C14360o3.A0K(this.A04, productSticker.A04) || !C14360o3.A0K(this.A05, productSticker.A05) || !C14360o3.A0K(this.A09, productSticker.A09) || !C14360o3.A0K(this.A03, productSticker.A03) || !C14360o3.A0K(this.A0E, productSticker.A0E) || !C14360o3.A0K(this.A0A, productSticker.A0A) || !C14360o3.A0K(this.A0B, productSticker.A0B) || this.A01 != productSticker.A01 || !C14360o3.A0K(this.A0C, productSticker.A0C) || !C14360o3.A0K(this.A0D, productSticker.A0D) || !C14360o3.A0K(this.A06, productSticker.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A08);
        AbstractC31179DnN.A0p(parcel, this.A04);
        AbstractC31179DnN.A0p(parcel, this.A05);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A03, i);
        List list = this.A0E;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l, i);
            }
        }
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        AbstractC31179DnN.A0p(parcel, this.A06);
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String Asf() {
        return this.A07;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final /* bridge */ /* synthetic */ DropsLaunchAnimationIntf Azc() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final DropsEventPageNavigationMetadata B2m() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf BhA() {
        return this.A03;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final List C0p() {
        return this.A0E;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String C6J() {
        return this.A0B;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final TextReviewStatus C6h() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String CEu() {
        return this.A0D;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final Boolean CHE() {
        return this.A06;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final Boolean CZo() {
        return this.A04;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final Boolean Cct() {
        return this.A05;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryProductItemTappableData", I49.A00(this));
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String getId() {
        return this.A08;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String getMediaId() {
        return this.A09;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String getText() {
        return this.A0A;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final String getUserId() {
        return this.A0C;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((AbstractC167017dG.A0O(this.A07) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC166997dE.A0I(this.A06);
    }

    public ProductSticker(DropsEventPageNavigationMetadata dropsEventPageNavigationMetadata, TextReviewStatus textReviewStatus, DropsLaunchAnimation dropsLaunchAnimation, ProductDetailsProductItemDict productDetailsProductItemDict, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        this.A07 = str;
        this.A02 = dropsLaunchAnimation;
        this.A00 = dropsEventPageNavigationMetadata;
        this.A08 = str2;
        this.A04 = bool;
        this.A05 = bool2;
        this.A09 = str3;
        this.A03 = productDetailsProductItemDict;
        this.A0E = list;
        this.A0A = str4;
        this.A0B = str5;
        this.A01 = textReviewStatus;
        this.A0C = str6;
        this.A0D = str7;
        this.A06 = bool3;
    }

    @Override // com.instagram.model.shopping.reels.ProductStickerIntf
    public final ProductStickerIntf EBt(C1DY c1dy) {
        return this;
    }
}
