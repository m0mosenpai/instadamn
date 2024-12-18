package com.instagram.model.direct.messageid;

import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class MessageIdentifier implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(7);
    public String A00;
    public String A01;

    public MessageIdentifier(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageIdentifier)) {
            return false;
        }
        MessageIdentifier messageIdentifier = (MessageIdentifier) obj;
        return C14360o3.A0K(this.A01, messageIdentifier.A01) && C14360o3.A0K(A00(), messageIdentifier.A00());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final String A00() {
        if (this instanceof DirectMessageIdentifier) {
            return ((DirectMessageIdentifier) this).A00;
        }
        return this.A00;
    }

    public int hashCode() {
        int i;
        int hashCode = this.A01.hashCode() * 31;
        String A00 = A00();
        if (A00 != null) {
            i = A00.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
