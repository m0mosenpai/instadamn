package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class MediaIdToBrandSafetyContentBlocklistBitmapMapImpl extends C0T6 implements Parcelable, MediaIdToBrandSafetyContentBlocklistBitmapMap {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(85);
    public final BrandSafetyContentBlocklistBitmapQLObj A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaIdToBrandSafetyContentBlocklistBitmapMapImpl) {
                MediaIdToBrandSafetyContentBlocklistBitmapMapImpl mediaIdToBrandSafetyContentBlocklistBitmapMapImpl = (MediaIdToBrandSafetyContentBlocklistBitmapMapImpl) obj;
                if (!C14360o3.A0K(this.A00, mediaIdToBrandSafetyContentBlocklistBitmapMapImpl.A00) || !C14360o3.A0K(this.A01, mediaIdToBrandSafetyContentBlocklistBitmapMapImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public MediaIdToBrandSafetyContentBlocklistBitmapMapImpl(BrandSafetyContentBlocklistBitmapQLObj brandSafetyContentBlocklistBitmapQLObj, String str) {
        this.A00 = brandSafetyContentBlocklistBitmapQLObj;
        this.A01 = str;
    }
}
