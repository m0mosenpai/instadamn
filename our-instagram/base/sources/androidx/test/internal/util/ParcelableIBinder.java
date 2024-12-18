package androidx.test.internal.util;

import X.Py5;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelableIBinder implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(66);
    public final IBinder A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeStrongBinder(this.A00);
    }

    public ParcelableIBinder(Parcel in) {
        this.A00 = in.readStrongBinder();
    }
}
