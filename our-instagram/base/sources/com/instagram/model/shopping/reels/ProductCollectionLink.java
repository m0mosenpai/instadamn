package com.instagram.model.shopping.reels;

import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.I42;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MultiProductComponentDestinationType;

/* loaded from: classes4.dex */
public final class ProductCollectionLink extends C0T6 implements ProductCollectionLinkIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(56);
    public final MultiProductComponentDestinationType A00;
    public final ShoppingDestinationMetadata A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public ProductCollectionLink(MultiProductComponentDestinationType multiProductComponentDestinationType, ShoppingDestinationMetadata shoppingDestinationMetadata, String str, String str2, String str3, String str4) {
        C14360o3.A0B(multiProductComponentDestinationType, 6);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = shoppingDestinationMetadata;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = multiProductComponentDestinationType;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final ProductCollectionLink F6H() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionLink) {
                ProductCollectionLink productCollectionLink = (ProductCollectionLink) obj;
                if (!C14360o3.A0K(this.A02, productCollectionLink.A02) || !C14360o3.A0K(this.A03, productCollectionLink.A03) || !C14360o3.A0K(this.A01, productCollectionLink.A01) || !C14360o3.A0K(this.A04, productCollectionLink.A04) || !C14360o3.A0K(this.A05, productCollectionLink.A05) || this.A00 != productCollectionLink.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A03;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShoppingDestinationMetadata shoppingDestinationMetadata = this.A01;
        int hashCode3 = (hashCode2 + (shoppingDestinationMetadata == null ? 0 : shoppingDestinationMetadata.hashCode())) * 31;
        String str3 = this.A04;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A05;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        ShoppingDestinationMetadata shoppingDestinationMetadata = this.A01;
        if (shoppingDestinationMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shoppingDestinationMetadata.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final String Aj7() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final String Ax2() {
        return this.A03;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final /* bridge */ /* synthetic */ ShoppingDestinationMetadataIntf Ax3() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final String Ax4() {
        return this.A04;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final String Ax5() {
        return this.A05;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final MultiProductComponentDestinationType Ax6() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMultiProductComponentDestination", I42.A00(this));
    }
}
