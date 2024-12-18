package com.instagram.business.promote.model;

import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class PendingLocation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(58);
    public AudienceGeoLocation A01;
    public AudienceGeoLocation A02;
    public Boolean A03;
    public List A05 = new ArrayList();
    public int A00 = 5;
    public List A04 = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeList(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeList(this.A04);
        parcel.writeValue(this.A03);
    }

    public final boolean A00() {
        Boolean bool = this.A03;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }
}
