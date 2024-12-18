package com.instagram.appreciation.analytics;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class LoggingFanData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(5);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public LoggingFanData(String str, String str2, String str3, String str4) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A01 = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoggingFanData) {
                LoggingFanData loggingFanData = (LoggingFanData) obj;
                if (!C14360o3.A0K(this.A03, loggingFanData.A03) || !C14360o3.A0K(this.A02, loggingFanData.A02) || !C14360o3.A0K(this.A00, loggingFanData.A00) || !C14360o3.A0K(this.A01, loggingFanData.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A03))));
    }
}
