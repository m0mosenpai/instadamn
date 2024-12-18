package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class RIXUTextLinkImpl extends C0T6 implements Parcelable, RIXUTextLink {
    public static final Parcelable.Creator CREATOR = new C41855Ig9(84);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.RIXUTextLink
    public final RIXUTextLinkImpl Eyx() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RIXUTextLinkImpl) {
                RIXUTextLinkImpl rIXUTextLinkImpl = (RIXUTextLinkImpl) obj;
                if (!C14360o3.A0K(this.A00, rIXUTextLinkImpl.A00) || !C14360o3.A0K(this.A02, rIXUTextLinkImpl.A02) || !C14360o3.A0K(this.A01, rIXUTextLinkImpl.A01) || !C14360o3.A0K(this.A03, rIXUTextLinkImpl.A03)) {
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
        parcel.writeString(this.A02);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public RIXUTextLinkImpl(Integer num, Integer num2, String str, String str2) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
        this.A03 = str2;
    }
}
