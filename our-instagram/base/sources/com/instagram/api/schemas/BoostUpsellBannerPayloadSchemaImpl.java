package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC39775Hkl;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class BoostUpsellBannerPayloadSchemaImpl extends C0T6 implements Parcelable, BoostUpsellBannerPayloadSchema {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(73);
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // com.instagram.api.schemas.BoostUpsellBannerPayloadSchema
    public final BoostUpsellBannerPayloadSchemaImpl ErK() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BoostUpsellBannerPayloadSchemaImpl) {
                BoostUpsellBannerPayloadSchemaImpl boostUpsellBannerPayloadSchemaImpl = (BoostUpsellBannerPayloadSchemaImpl) obj;
                if (!C14360o3.A0K(this.A00, boostUpsellBannerPayloadSchemaImpl.A00) || !C14360o3.A0K(this.A01, boostUpsellBannerPayloadSchemaImpl.A01) || !C14360o3.A0K(this.A02, boostUpsellBannerPayloadSchemaImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.BoostUpsellBannerPayloadSchema
    public final String Ah2() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.BoostUpsellBannerPayloadSchema
    public final String Anr() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.BoostUpsellBannerPayloadSchema
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTBoostUpsellBannerPayloadSchema", AbstractC39775Hkl.A00(this));
    }

    @Override // com.instagram.api.schemas.BoostUpsellBannerPayloadSchema
    public final String getActionUrl() {
        return this.A00;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public BoostUpsellBannerPayloadSchemaImpl(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
