package androidx.navigation;

import X.C14360o3;
import X.MSY;
import X.Py5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(54);
    public final int A00;
    public final Bundle A01;
    public final Bundle A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeBundle(this.A01);
        parcel.writeBundle(this.A02);
    }

    public NavBackStackEntryState(Parcel parcel) {
        String readString = parcel.readString();
        C14360o3.A0A(readString);
        this.A03 = readString;
        this.A00 = parcel.readInt();
        Class<?> cls = getClass();
        this.A01 = MSY.A08(parcel, cls);
        Bundle A08 = MSY.A08(parcel, cls);
        C14360o3.A0A(A08);
        this.A02 = A08;
    }
}
