package androidx.work.multiprocess.parcelable;

import X.AbstractC37304Gc5;
import X.Py5;
import X.Q0Z;
import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelableForegroundRequestInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(70);
    public final Q0Z A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        Q0Z q0z = this.A00;
        parcel.writeInt(q0z.A01);
        parcel.writeInt(q0z.A00);
        parcel.writeParcelable(q0z.A02, i);
    }

    public ParcelableForegroundRequestInfo(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = new Q0Z(parcel.readInt(), (Notification) AbstractC37304Gc5.A04(parcel, getClass()), parcel.readInt());
    }
}
