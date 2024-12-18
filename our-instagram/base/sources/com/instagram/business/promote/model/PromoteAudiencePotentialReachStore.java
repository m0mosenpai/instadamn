package com.instagram.business.promote.model;

import X.AbstractC166997dE;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class PromoteAudiencePotentialReachStore implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(63);
    public Map A00 = new HashMap();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00.size());
        Iterator A15 = AbstractC166997dE.A15(this.A00);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
