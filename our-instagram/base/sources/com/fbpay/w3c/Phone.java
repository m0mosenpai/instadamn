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
public class Phone implements Parcelable, PhoneSpec {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(49);
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public Phone(Boolean bool, String str, String str2) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Phone) {
                Phone phone = (Phone) obj;
                if (!C14360o3.A0K(this.A01, phone.A01) || !C14360o3.A0K(this.A00, phone.A00) || !C14360o3.A0K(this.A02, phone.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC63311ShH.A02(this.A01) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC25235BEs.A06(this.A02);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A01, 0, 1);
        AbstractC31179DnN.A0p(parcel, this.A00);
        AbstractC58322PtE.A1E(parcel, this.A02, 0, 1);
    }

    public Phone(Parcel parcel) {
        if (AbstractC58322PtE.A07(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? Boolean.valueOf(AbstractC58320PtC.A1T(parcel)) : null;
        this.A02 = AbstractC58322PtE.A0n(parcel);
    }
}
