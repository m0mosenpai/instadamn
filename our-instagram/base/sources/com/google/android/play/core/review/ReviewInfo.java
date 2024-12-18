package com.google.android.play.core.review;

import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zza zzaVar = (zza) this;
        parcel.writeParcelable(zzaVar.A00, 0);
        parcel.writeInt(zzaVar.A01 ? 1 : 0);
    }
}
