package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC39786Hkw;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public final class BusinessProfileDictImpl extends C0T6 implements Parcelable, BusinessProfileDict {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(82);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;

    @Override // com.instagram.api.schemas.BusinessProfileDict
    public final BusinessProfileDictImpl ErS() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BusinessProfileDictImpl) {
                BusinessProfileDictImpl businessProfileDictImpl = (BusinessProfileDictImpl) obj;
                if (!C14360o3.A0K(this.A01, businessProfileDictImpl.A01) || !C14360o3.A0K(this.A00, businessProfileDictImpl.A00) || !C14360o3.A0K(this.A02, businessProfileDictImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.BusinessProfileDict
    public final ImageUrl Bhu() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.BusinessProfileDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTBusinessProfileDict", AbstractC39786Hkw.A00(this));
    }

    @Override // com.instagram.api.schemas.BusinessProfileDict
    public final String getId() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.BusinessProfileDict
    public final String getUsername() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public BusinessProfileDictImpl(ImageUrl imageUrl, String str, String str2) {
        this.A01 = str;
        this.A00 = imageUrl;
        this.A02 = str2;
    }
}
