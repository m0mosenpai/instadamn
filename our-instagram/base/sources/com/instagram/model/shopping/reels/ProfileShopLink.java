package com.instagram.model.shopping.reels;

import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.I4A;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SellerShoppableFeedType;

/* loaded from: classes4.dex */
public final class ProfileShopLink extends C0T6 implements Parcelable, ProfileShopLinkIntf {
    public static final Parcelable.Creator CREATOR = new C41856IgA(60);
    public final SellerShoppableFeedType A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.model.shopping.reels.ProfileShopLinkIntf
    public final ProfileShopLink F6P() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileShopLink) {
                ProfileShopLink profileShopLink = (ProfileShopLink) obj;
                if (!C14360o3.A0K(this.A01, profileShopLink.A01) || !C14360o3.A0K(this.A02, profileShopLink.A02) || !C14360o3.A0K(this.A03, profileShopLink.A03) || this.A00 != profileShopLink.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SellerShoppableFeedType sellerShoppableFeedType = this.A00;
        return hashCode3 + (sellerShoppableFeedType != null ? sellerShoppableFeedType.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.model.shopping.reels.ProfileShopLinkIntf
    public final String Bi4() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.reels.ProfileShopLinkIntf
    public final String Bi6() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.reels.ProfileShopLinkIntf
    public final String Bi7() {
        return this.A03;
    }

    @Override // com.instagram.model.shopping.reels.ProfileShopLinkIntf
    public final SellerShoppableFeedType Bt7() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.reels.ProfileShopLinkIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryCTAProfileShopLink", I4A.A00(this));
    }

    public ProfileShopLink(SellerShoppableFeedType sellerShoppableFeedType, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = sellerShoppableFeedType;
    }
}
