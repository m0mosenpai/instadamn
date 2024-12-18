package com.instagram.business.promote.model;

import X.C00O;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class RejectionReasonRanges implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(84);
    public int A00;
    public int A01;
    public String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        String str = this.A02;
        if (str != null) {
            parcel.writeString(str);
        } else {
            C14360o3.A0F("entityUrl");
            throw C00O.createAndThrow();
        }
    }
}
