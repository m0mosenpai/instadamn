package com.instagram.api.schemas;

import X.AbstractC225549xZ;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes2.dex */
public final class SubscriptionStickerDict extends C0T6 implements SubscriptionStickerDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(26);
    public final User A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final SubscriptionStickerDictIntf EAt(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final SubscriptionStickerDict F2W(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final SubscriptionStickerDict F2X(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionStickerDict) {
                SubscriptionStickerDict subscriptionStickerDict = (SubscriptionStickerDict) obj;
                if (!C14360o3.A0K(this.A00, subscriptionStickerDict.A00) || !C14360o3.A0K(this.A01, subscriptionStickerDict.A01) || !C14360o3.A0K(this.A02, subscriptionStickerDict.A02) || !C14360o3.A0K(this.A03, subscriptionStickerDict.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        User user = this.A00;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A02;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final User Asq() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final String Asv() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final String Asz() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final String At6() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSubscriptionStickerDict", AbstractC225549xZ.A00(this));
    }

    public SubscriptionStickerDict(User user, String str, String str2, String str3) {
        this.A00 = user;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }
}
