package com.instagram.business.promote.model;

import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.XIGIGBoostDestination;
import java.util.List;

/* loaded from: classes11.dex */
public final class IGBoostPackagesFlowInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(54);
    public XIGIGBoostDestination A00;
    public PromoteAudience A01;
    public String A02;
    public String A03;
    public List A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(1);
    }
}
