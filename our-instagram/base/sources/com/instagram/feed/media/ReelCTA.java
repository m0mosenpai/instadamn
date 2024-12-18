package com.instagram.feed.media;

import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C206139Av;
import X.I0M;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ReelProductLinkIntf;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ReelCTA extends C0T6 implements ReelCTAIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(97);
    public final ShoppingSwipeUpCTATextIcon A00;
    public final EffectPreview A01;
    public final ProductCollectionLink A02;
    public final ProfileShopLink A03;
    public final ReelMultiProductLink A04;
    public final ReelProductLink A05;
    public final Boolean A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final List A0E;

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final ReelCTAIntf EBV(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final ReelCTA F4r(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final ReelCTA F4s(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReelCTA) {
                ReelCTA reelCTA = (ReelCTA) obj;
                if (this.A00 != reelCTA.A00 || !C14360o3.A0K(this.A07, reelCTA.A07) || !C14360o3.A0K(this.A08, reelCTA.A08) || !C14360o3.A0K(this.A09, reelCTA.A09) || !C14360o3.A0K(this.A01, reelCTA.A01) || !C14360o3.A0K(this.A0A, reelCTA.A0A) || !C14360o3.A0K(this.A0B, reelCTA.A0B) || !C14360o3.A0K(this.A06, reelCTA.A06) || !C14360o3.A0K(this.A0D, reelCTA.A0D) || !C14360o3.A0K(this.A04, reelCTA.A04) || !C14360o3.A0K(this.A0C, reelCTA.A0C) || !C14360o3.A0K(this.A0E, reelCTA.A0E) || !C14360o3.A0K(this.A02, reelCTA.A02) || !C14360o3.A0K(this.A05, reelCTA.A05) || !C14360o3.A0K(this.A03, reelCTA.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon = this.A00;
        int hashCode = (shoppingSwipeUpCTATextIcon == null ? 0 : shoppingSwipeUpCTATextIcon.hashCode()) * 31;
        String str = this.A07;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EffectPreview effectPreview = this.A01;
        int hashCode5 = (hashCode4 + (effectPreview == null ? 0 : effectPreview.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0B;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.A06;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.A0D;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        ReelMultiProductLink reelMultiProductLink = this.A04;
        int hashCode10 = (hashCode9 + (reelMultiProductLink == null ? 0 : reelMultiProductLink.hashCode())) * 31;
        String str6 = this.A0C;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list2 = this.A0E;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ProductCollectionLink productCollectionLink = this.A02;
        int hashCode13 = (hashCode12 + (productCollectionLink == null ? 0 : productCollectionLink.hashCode())) * 31;
        ReelProductLink reelProductLink = this.A05;
        int hashCode14 = (hashCode13 + (reelProductLink == null ? 0 : reelProductLink.hashCode())) * 31;
        ProfileShopLink profileShopLink = this.A03;
        return hashCode14 + (profileShopLink != null ? profileShopLink.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        EffectPreview effectPreview = this.A01;
        if (effectPreview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            effectPreview.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        Boolean bool = this.A06;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List list = this.A0D;
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
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0C);
        List list2 = this.A0E;
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
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A03, i);
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final ShoppingSwipeUpCTATextIcon Ath() {
        return this.A00;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final String Ati() {
        return this.A07;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final String Atj() {
        return this.A08;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final String Ats() {
        return this.A09;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final /* bridge */ /* synthetic */ EffectPreviewIntf B0a() {
        return this.A01;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final String B64() {
        return this.A0A;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final String B65() {
        return this.A0B;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final Boolean BBv() {
        return this.A06;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final List BNi() {
        return this.A0D;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final /* bridge */ /* synthetic */ ReelMultiProductLinkIntf BVO() {
        return this.A04;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final String BYV() {
        return this.A0C;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final List Bgp() {
        return this.A0E;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final /* bridge */ /* synthetic */ ProductCollectionLinkIntf Bgs() {
        return this.A02;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final /* bridge */ /* synthetic */ ReelProductLinkIntf BhC() {
        return this.A05;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final /* bridge */ /* synthetic */ ProfileShopLinkIntf Bi5() {
        return this.A03;
    }

    @Override // com.instagram.feed.media.ReelCTAIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryCTADict", I0M.A00(this));
    }

    public ReelCTA(ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon, EffectPreview effectPreview, ProductCollectionLink productCollectionLink, ProfileShopLink profileShopLink, ReelMultiProductLink reelMultiProductLink, ReelProductLink reelProductLink, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2) {
        this.A00 = shoppingSwipeUpCTATextIcon;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A01 = effectPreview;
        this.A0A = str4;
        this.A0B = str5;
        this.A06 = bool;
        this.A0D = list;
        this.A04 = reelMultiProductLink;
        this.A0C = str6;
        this.A0E = list2;
        this.A02 = productCollectionLink;
        this.A05 = reelProductLink;
        this.A03 = profileShopLink;
    }
}
