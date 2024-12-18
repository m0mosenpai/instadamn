package com.facebook.base.activity.parcel;

import X.C14360o3;
import X.C15030pJ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class OpaqueParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C15030pJ(4);
    public final byte[] A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        byte[] bArr = this.A00;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    public OpaqueParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        C14360o3.A07(obtain);
        try {
            parcelable.writeToParcel(obtain, 0);
            this.A00 = obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public OpaqueParcelable(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.A00 = bArr;
        parcel.readByteArray(bArr);
    }
}
