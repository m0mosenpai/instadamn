package com.fbpay.w3c;

import X.AbstractC25235BEs;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C1LC;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public class Contact implements Parcelable, ContactSpec {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(47);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;

    public Contact(ImmutableList immutableList, ImmutableList immutableList2, String str) {
        AbstractC63311ShH.A04(immutableList, "emails");
        this.A00 = immutableList;
        this.A02 = str;
        AbstractC63311ShH.A04(immutableList2, "phones");
        this.A01 = immutableList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Contact) {
                Contact contact = (Contact) obj;
                if (!C14360o3.A0K(this.A00, contact.A00) || !C14360o3.A0K(this.A02, contact.A02) || !C14360o3.A0K(this.A01, contact.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C1LC A0d = AbstractC58322PtE.A0d(parcel, this.A00);
        while (A0d.hasNext()) {
            parcel.writeParcelable((Email) A0d.next(), i);
        }
        String str = this.A02;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        C1LC A0d2 = AbstractC58322PtE.A0d(parcel, this.A01);
        while (A0d2.hasNext()) {
            parcel.writeParcelable((Phone) A0d2.next(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Contact(Parcel parcel) {
        String readString;
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        int readInt = parcel.readInt();
        Email[] emailArr = new Email[readInt];
        for (int i = 0; i < readInt; i++) {
            emailArr[i] = parcel.readParcelable(A0g);
        }
        this.A00 = ImmutableList.copyOf(emailArr);
        if (parcel.readInt() == 0) {
            readString = null;
        } else {
            readString = parcel.readString();
        }
        this.A02 = readString;
        int readInt2 = parcel.readInt();
        Phone[] phoneArr = new Phone[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            phoneArr[i2] = parcel.readParcelable(A0g);
        }
        this.A01 = ImmutableList.copyOf(phoneArr);
    }
}
