package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class StatusStyleResponseInfoImpl extends C0T6 implements Parcelable, StatusStyleResponseInfo {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(9);
    public final MusicStatusStyleResponseInfo A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof StatusStyleResponseInfoImpl) && C14360o3.A0K(this.A00, ((StatusStyleResponseInfoImpl) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public StatusStyleResponseInfoImpl(MusicStatusStyleResponseInfo musicStatusStyleResponseInfo) {
        this.A00 = musicStatusStyleResponseInfo;
    }
}
