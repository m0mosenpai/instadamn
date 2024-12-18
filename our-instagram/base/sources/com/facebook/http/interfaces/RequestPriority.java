package com.facebook.http.interfaces;

import X.AbstractC166997dE;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public enum RequestPriority implements Parcelable {
    INTERACTIVE,
    NON_INTERACTIVE,
    CAN_WAIT,
    UNNECESSARY,
    /* JADX INFO: Fake field, exist only in values array */
    UNUSED_REQUEST_PRIORITY;

    public static final RequestPriority A00 = NON_INTERACTIVE;
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(97);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC166997dE.A1I(parcel, this);
    }
}
