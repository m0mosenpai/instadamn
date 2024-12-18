package com.facebookpay.logging;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C63470SlB;
import X.EnumC61210RhA;
import X.EnumC72401Xco;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class ClientSuppressionPolicy implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(11);
    public final EnumC61210RhA A00;
    public final EnumC72401Xco A01;
    public final String A02;

    public ClientSuppressionPolicy(EnumC61210RhA enumC61210RhA, EnumC72401Xco enumC72401Xco, String str) {
        C14360o3.A0B(enumC61210RhA, 3);
        this.A02 = str;
        this.A01 = enumC72401Xco;
        this.A00 = enumC61210RhA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClientSuppressionPolicy) {
                ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) obj;
                if (!C14360o3.A0K(this.A02, clientSuppressionPolicy.A02) || this.A01 != clientSuppressionPolicy.A01 || this.A00 != clientSuppressionPolicy.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        EnumC72401Xco enumC72401Xco = this.A01;
        if (enumC72401Xco == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, enumC72401Xco);
        }
        AbstractC166997dE.A1I(parcel, this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, ((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC166997dE.A0I(this.A01)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ClientSuppressionPolicy(eventName=");
        A1C.append(this.A02);
        A1C.append(", payloadField=");
        A1C.append(this.A01);
        A1C.append(", suppressionMode=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
