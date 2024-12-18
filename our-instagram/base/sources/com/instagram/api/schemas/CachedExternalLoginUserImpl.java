package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class CachedExternalLoginUserImpl extends C0T6 implements Parcelable, CachedExternalLoginUser {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(89);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public CachedExternalLoginUserImpl(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5) {
        AbstractC25229BEm.A1I(str3, 3, str5);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = imageUrl;
        this.A04 = str4;
        this.A05 = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CachedExternalLoginUserImpl) {
                CachedExternalLoginUserImpl cachedExternalLoginUserImpl = (CachedExternalLoginUserImpl) obj;
                if (!C14360o3.A0K(this.A01, cachedExternalLoginUserImpl.A01) || !C14360o3.A0K(this.A02, cachedExternalLoginUserImpl.A02) || !C14360o3.A0K(this.A03, cachedExternalLoginUserImpl.A03) || !C14360o3.A0K(this.A00, cachedExternalLoginUserImpl.A00) || !C14360o3.A0K(this.A04, cachedExternalLoginUserImpl.A04) || !C14360o3.A0K(this.A05, cachedExternalLoginUserImpl.A05)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A05, (((AbstractC166997dE.A0K(this.A03, ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A04)) * 31);
    }
}
