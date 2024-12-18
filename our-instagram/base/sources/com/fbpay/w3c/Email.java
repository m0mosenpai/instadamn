package com.fbpay.w3c;

import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class Email implements Parcelable, EmailSpec {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(48);
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public Email(Boolean bool, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Email) {
                Email email = (Email) obj;
                if (!C14360o3.A0K(this.A01, email.A01) || !C14360o3.A0K(this.A02, email.A02) || !C14360o3.A0K(this.A00, email.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC63311ShH.A02(this.A01) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A01, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A02, 0, 1);
        AbstractC31179DnN.A0p(parcel, this.A00);
    }

    public Email(Parcel parcel) {
        if (AbstractC58322PtE.A07(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? Boolean.valueOf(AbstractC58320PtC.A1T(parcel)) : null;
    }
}
