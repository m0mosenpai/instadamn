package com.facebook.iabadscontext;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes10.dex */
public final class ReceiverInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(18);
    public final List A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReceiverInfo) {
                ReceiverInfo receiverInfo = (ReceiverInfo) obj;
                if (!C14360o3.A0K(this.A01, receiverInfo.A01) || !C14360o3.A0K(this.A02, receiverInfo.A02) || !C14360o3.A0K(this.A00, receiverInfo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeStringList(this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)));
    }

    public ReceiverInfo(String str, String str2, List list) {
        AbstractC167027dH.A13(str, str2, list);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ReceiverInfo(id=");
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(1438));
        A1C.append(this.A02);
        A1C.append(", validOrigins=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
