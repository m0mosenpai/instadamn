package com.facebookpay.msc.logging;

import X.AnonymousClass001;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class LoggingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63470SlB(15);
    public final String A00;

    public LoggingData(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LoggingData) && C14360o3.A0K(this.A00, ((LoggingData) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0S("LoggingData(sessionId=", this.A00, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }
}
