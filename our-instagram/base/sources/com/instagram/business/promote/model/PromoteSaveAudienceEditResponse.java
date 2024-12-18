package com.instagram.business.promote.model;

import X.C14360o3;
import X.C40781ul;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class PromoteSaveAudienceEditResponse extends C40781ul implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(79);
    public boolean A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
    }
}
