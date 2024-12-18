package com.facebookpay.incentives.model;

import X.C14360o3;
import X.C16930sl;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes11.dex */
public final class IncentiveCredentialList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63470SlB(9);
    public final List A00;

    public IncentiveCredentialList(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
    }

    public IncentiveCredentialList() {
        this(C16930sl.A00);
    }
}
