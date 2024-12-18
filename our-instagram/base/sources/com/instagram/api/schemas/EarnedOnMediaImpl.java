package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class EarnedOnMediaImpl extends C0T6 implements Parcelable, EarnedOnMedia {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(66);
    public final EarnedOnMediaState A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public EarnedOnMediaImpl(EarnedOnMediaState earnedOnMediaState, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str4, 4);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = earnedOnMediaState;
        this.A05 = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EarnedOnMediaImpl) {
                EarnedOnMediaImpl earnedOnMediaImpl = (EarnedOnMediaImpl) obj;
                if (!C14360o3.A0K(this.A01, earnedOnMediaImpl.A01) || !C14360o3.A0K(this.A02, earnedOnMediaImpl.A02) || !C14360o3.A0K(this.A03, earnedOnMediaImpl.A03) || !C14360o3.A0K(this.A04, earnedOnMediaImpl.A04) || this.A00 != earnedOnMediaImpl.A00 || !C14360o3.A0K(this.A05, earnedOnMediaImpl.A05)) {
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
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A04, ((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A05);
    }
}
