package com.instagram.shopping.intf;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC25236BEt;
import X.AbstractC31180DnO;
import X.AbstractC43591JPw;
import X.AbstractC58317Pt9;
import X.AbstractC76433bn;
import X.C14360o3;
import X.C37324GcR;
import X.MSV;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.TimeZone;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ProductDetailsPageArguments implements Parcelable {
    public static final C37324GcR CREATOR = C37324GcR.A00(68);
    public final long A00;
    public final Bundle A01;
    public final RankingInfo A02;
    public final ProductTileMedia A03;
    public final ShoppingGuideLoggingInfo A04;
    public final ShoppingSearchLoggingInfo A05;
    public final Product A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
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
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final JSONObject A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0R);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeValue(this.A08);
        parcel.writeValue(this.A07);
        parcel.writeString(this.A0V);
        parcel.writeByte(this.A0b ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0M);
        parcel.writeValue(this.A09);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0N);
        parcel.writeByte(this.A0d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0I);
        parcel.writeParcelable(this.A05, i);
        parcel.writeByte(this.A0e ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0W);
        parcel.writeLong(this.A00);
        parcel.writeBundle(this.A01);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0Y);
        parcel.writeByte(this.A0a ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0T);
        parcel.writeString(AbstractC31180DnO.A0k(this.A0Z));
        parcel.writeByte(this.A0c ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0J);
        String str = this.A0X;
        if (str == null) {
            str = TimeZone.getDefault().getID();
        }
        parcel.writeString(str);
        parcel.writeString(this.A0L);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProductDetailsPageArguments(entryPoint='");
        A1C.append(this.A0H);
        A1C.append("', priorModule='");
        A1C.append(this.A0Q);
        A1C.append("', priorSubmodule=");
        A1C.append(this.A0R);
        A1C.append(", heroCarouselPinnedMedia=");
        A1C.append(this.A03);
        A1C.append(", heroCarouselPinnedMediaId=");
        A1C.append(this.A0K);
        A1C.append(", callSiteOverridePinnedMediaId=");
        A1C.append(this.A0E);
        A1C.append(", callSiteOverridePinnedMediaUrl=");
        A1C.append(this.A0F);
        A1C.append(", callSiteOverridePinnedMediaWidth=");
        A1C.append(this.A08);
        A1C.append(", callSiteOverridePinnedMediaHeight=");
        A1C.append(this.A07);
        A1C.append(", referencePrice=");
        A1C.append(this.A0V);
        A1C.append(", shouldShowAllCatalogImagesLast=");
        A1C.append(this.A0b);
        A1C.append(", mediaId=");
        A1C.append(this.A0M);
        A1C.append(", mediaCarouselIndex=");
        A1C.append(this.A09);
        A1C.append(AbstractC58317Pt9.A00(153));
        A1C.append(this.A06);
        A1C.append(AbstractC43591JPw.A00(514));
        A1C.append(this.A0O);
        A1C.append(", isLastSavedItem=");
        A1C.append(this.A0d);
        A1C.append(", featuredProductPermissionId=");
        A1C.append(this.A0I);
        A1C.append(", shoppingSearchLoggingInfo=");
        A1C.append(this.A05);
        A1C.append(", isShowingAsSwipeUp=");
        A1C.append(this.A0e);
        A1C.append(", shoppingGuideLoggingInfo=");
        A1C.append(this.A04);
        A1C.append(", shopsFirstEntryPoint=");
        A1C.append(this.A0W);
        A1C.append(", shopsProfileEntryIgId=");
        A1C.append(this.A00);
        A1C.append(", analyticsExtras=");
        A1C.append(this.A01);
        A1C.append(", shoppingRankingLoggingInfo=");
        A1C.append(this.A02);
        A1C.append(", navBar=");
        A1C.append(this.A0P);
        A1C.append(", upcomingEventId=");
        A1C.append(this.A0Y);
        A1C.append(", isFromAd=");
        A1C.append(this.A0a);
        A1C.append(", collectionPageId=");
        A1C.append(this.A0G);
        A1C.append(", affiliateMarketerId=");
        A1C.append(this.A0D);
        A1C.append(AbstractC58317Pt9.A00(150));
        A1C.append(this.A0A);
        A1C.append(AbstractC111324zv.A00(1391));
        A1C.append(this.A0C);
        A1C.append(", adMediaId=");
        A1C.append(this.A0B);
        A1C.append(MSV.A00(292));
        A1C.append(this.A0N);
        A1C.append(AbstractC43591JPw.A00(59));
        A1C.append(this.A0U);
        A1C.append(", isCpdpDisabled=");
        A1C.append(this.A0c);
        A1C.append(", giftRecipientId=");
        A1C.append(this.A0J);
        A1C.append(", timezone=");
        A1C.append(this.A0X);
        A1C.append(", layoutType=");
        return AbstractC25236BEt.A0Y(this.A0L, A1C);
    }

    public ProductDetailsPageArguments(Bundle bundle, RankingInfo rankingInfo, ProductTileMedia productTileMedia, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo, ShoppingSearchLoggingInfo shoppingSearchLoggingInfo, Product product, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, JSONObject jSONObject, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        User user;
        String str26 = str11;
        this.A0H = str;
        this.A0Q = str2;
        this.A0R = str3;
        this.A03 = productTileMedia;
        this.A0K = str4;
        this.A0E = str5;
        this.A0F = str6;
        this.A08 = num;
        this.A07 = num2;
        this.A0V = str7;
        this.A0b = z;
        this.A0M = str8;
        this.A09 = num3;
        this.A06 = product;
        this.A0O = str10;
        this.A0d = z2;
        this.A0I = str12;
        this.A05 = shoppingSearchLoggingInfo;
        this.A0e = z3;
        this.A04 = shoppingGuideLoggingInfo;
        this.A0W = str13;
        this.A00 = j;
        this.A01 = bundle;
        this.A02 = rankingInfo;
        this.A0P = str14;
        this.A0Y = str15;
        this.A0a = z4;
        this.A0G = str16;
        this.A0D = str17;
        this.A0A = str18;
        this.A0C = str19;
        this.A0B = str20;
        this.A0S = str21;
        this.A0T = str22;
        this.A0Z = jSONObject;
        this.A0c = z5;
        this.A0J = str23;
        this.A0X = str24;
        this.A0L = str25;
        String str27 = null;
        this.A0N = str11 == null ? (product == null || (user = product.A0B) == null) ? null : AbstractC76433bn.A00(user) : str26;
        if (str9 != null) {
            str27 = str9;
        } else if (product != null) {
            str27 = product.A0H;
        }
        this.A0U = str27;
    }
}
