package com.instagram.location.surface.api.model.operationhours;

import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class LocationPageInfoPageOperationHourResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(33);
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        List list = this.A04;
        if (list == null) {
            list = new ArrayList();
        }
        parcel.writeList(list);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00.booleanValue() ? 1 : 0);
    }
}
