package com.facebookpay.logging;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class LoggingPolicy implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(14);
    public final String A00;
    public final ArrayList A01;

    public LoggingPolicy(String str, ArrayList arrayList) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoggingPolicy) {
                LoggingPolicy loggingPolicy = (LoggingPolicy) obj;
                if (!C14360o3.A0K(this.A00, loggingPolicy.A00) || !C14360o3.A0K(this.A01, loggingPolicy.A01)) {
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
        ArrayList arrayList = this.A01;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ClientSuppressionPolicy) it.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LoggingPolicy(loggingPolicyProduct=");
        A1C.append(this.A00);
        A1C.append(", clientSuppressionPolicy=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
