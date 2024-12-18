package com.facebookpay.expresscheckout.logging;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

/* loaded from: classes11.dex */
public final class ComponentLoggingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(34);
    public final String A00;
    public final String A01;
    public final ImmutableMap A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ComponentLoggingData) {
                ComponentLoggingData componentLoggingData = (ComponentLoggingData) obj;
                if (!C14360o3.A0K(this.A00, componentLoggingData.A00) || !C14360o3.A0K(this.A01, componentLoggingData.A01) || !C14360o3.A0K(this.A02, componentLoggingData.A02)) {
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
        parcel.writeSerializable(this.A02);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, this.A00.hashCode() * 31) + AbstractC167017dG.A0M(this.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComponentLoggingData(contextComponentName=");
        sb.append(this.A00);
        sb.append(", targetName=");
        sb.append(this.A01);
        sb.append(", extraPayload=");
        return AbstractC167017dG.A0o(this.A02, sb);
    }

    public ComponentLoggingData(ImmutableMap immutableMap, String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = immutableMap;
    }
}
