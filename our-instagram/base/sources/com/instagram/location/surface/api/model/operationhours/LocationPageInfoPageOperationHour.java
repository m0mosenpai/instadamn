package com.instagram.location.surface.api.model.operationhours;

import X.C40781ul;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class LocationPageInfoPageOperationHour extends C40781ul implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(32);
    public String A00;
    public List A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        List<String> list = this.A01;
        if (list == null) {
            list = new ArrayList<>();
        }
        this.A01 = list;
        parcel.writeStringList(list);
    }
}
