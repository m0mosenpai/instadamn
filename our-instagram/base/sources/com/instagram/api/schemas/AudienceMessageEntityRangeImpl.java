package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class AudienceMessageEntityRangeImpl extends C0T6 implements Parcelable, AudienceMessageEntityRange {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(55);
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceMessageEntityRangeImpl) {
                AudienceMessageEntityRangeImpl audienceMessageEntityRangeImpl = (AudienceMessageEntityRangeImpl) obj;
                if (!C14360o3.A0K(this.A00, audienceMessageEntityRangeImpl.A00) || !C14360o3.A0K(this.A01, audienceMessageEntityRangeImpl.A01) || !C14360o3.A0K(this.A02, audienceMessageEntityRangeImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.AudienceMessageEntityRange
    public final Integer BN2() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.AudienceMessageEntityRange
    public final Integer BYa() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.AudienceMessageEntityRange
    public final String getUrl() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public AudienceMessageEntityRangeImpl(Integer num, Integer num2, String str) {
        this.A00 = num;
        this.A01 = num2;
        this.A02 = str;
    }
}
