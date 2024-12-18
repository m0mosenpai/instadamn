package com.instagram.api.schemas;

import X.AbstractC40232Hsv;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class SellerBadgeDict extends C0T6 implements Parcelable, SellerBadgeDictIntf {
    public static final Parcelable.Creator CREATOR = new C41855Ig9(95);
    public final SellerBadgeType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    @Override // com.instagram.api.schemas.SellerBadgeDictIntf
    public final SellerBadgeDict EzO() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SellerBadgeDict) {
                SellerBadgeDict sellerBadgeDict = (SellerBadgeDict) obj;
                if (!C14360o3.A0K(this.A01, sellerBadgeDict.A01) || !C14360o3.A0K(this.A02, sellerBadgeDict.A02) || !C14360o3.A0K(this.A03, sellerBadgeDict.A03) || this.A00 != sellerBadgeDict.A00) {
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
        List list = this.A03;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SellerBadgeType sellerBadgeType = this.A00;
        return hashCode3 + (sellerBadgeType != null ? sellerBadgeType.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        List list = this.A03;
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
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.SellerBadgeDictIntf
    public final List C4T() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.SellerBadgeDictIntf
    public final SellerBadgeType CBZ() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.SellerBadgeDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSellerBadgeDict", AbstractC40232Hsv.A00(this));
    }

    @Override // com.instagram.api.schemas.SellerBadgeDictIntf
    public final String getDescription() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.SellerBadgeDictIntf
    public final String getName() {
        return this.A02;
    }

    public SellerBadgeDict(SellerBadgeType sellerBadgeType, String str, String str2, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = sellerBadgeType;
    }
}
