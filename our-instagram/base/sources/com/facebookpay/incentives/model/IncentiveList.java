package com.facebookpay.incentives.model;

import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.C14360o3;
import X.C16930sl;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class IncentiveList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63470SlB(10);
    public final List A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A00);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
    }

    public IncentiveList(List list) {
        this.A00 = list;
    }

    public IncentiveList() {
        this(C16930sl.A00);
    }
}
