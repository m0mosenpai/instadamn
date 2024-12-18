package com.instagram.model.business;

import X.AbstractC167017dG;
import X.AbstractC31177DnL;
import X.AbstractC31179DnN;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Address implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(52);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            Address address = (Address) obj;
            if (!C14360o3.A0K(this.A03, address.A03) || !C14360o3.A0K(this.A01, address.A01) || !C14360o3.A0K(this.A04, address.A04) || !C14360o3.A0K(this.A00, address.A00) || !C14360o3.A0K(this.A02, address.A02)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A01, this.A04, this.A00, this.A02});
    }

    public Address(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7 = null;
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean A1b = AbstractC31179DnN.A1b(str, z ? length : i);
                if (!z) {
                    if (!A1b) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!A1b) {
                    break;
                } else {
                    length--;
                }
            }
            str6 = AbstractC31177DnL.A0g(str, length, i);
        } else {
            str6 = null;
        }
        this.A04 = str6;
        this.A01 = str2;
        if (str4 != null) {
            int length2 = str4.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length2) {
                boolean A1b2 = AbstractC31179DnN.A1b(str4, z2 ? length2 : i2);
                if (!z2) {
                    if (!A1b2) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!A1b2) {
                    break;
                } else {
                    length2--;
                }
            }
            str7 = AbstractC31177DnL.A0g(str4, length2, i2);
        }
        this.A02 = str7;
        this.A00 = str3;
        this.A03 = str5;
    }

    public Address() {
    }
}
