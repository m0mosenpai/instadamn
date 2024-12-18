package com.instagram.fx.igxfb;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class IgxfbNetEgoCTABannerParams extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(91);
    public final String A00;
    public final String A01;
    public final String A02;

    public IgxfbNetEgoCTABannerParams(String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgxfbNetEgoCTABannerParams) {
                IgxfbNetEgoCTABannerParams igxfbNetEgoCTABannerParams = (IgxfbNetEgoCTABannerParams) obj;
                if (!C14360o3.A0K(this.A00, igxfbNetEgoCTABannerParams.A00) || !C14360o3.A0K(this.A01, igxfbNetEgoCTABannerParams.A01) || !C14360o3.A0K(this.A02, igxfbNetEgoCTABannerParams.A02)) {
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

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }
}
