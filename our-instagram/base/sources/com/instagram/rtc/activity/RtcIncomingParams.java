package com.instagram.rtc.activity;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class RtcIncomingParams extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(40);
    public final String A00;
    public final boolean A01;
    public final String A02;
    public final boolean A03;

    public RtcIncomingParams(String str, String str2, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcIncomingParams) {
                RtcIncomingParams rtcIncomingParams = (RtcIncomingParams) obj;
                if (!C14360o3.A0K(this.A00, rtcIncomingParams.A00) || this.A03 != rtcIncomingParams.A03 || this.A01 != rtcIncomingParams.A01 || !C14360o3.A0K(this.A02, rtcIncomingParams.A02)) {
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
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A01, AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0J(this.A00))) + AbstractC167017dG.A0O(this.A02);
    }
}
