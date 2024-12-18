package androidx.work.multiprocess.parcelable;

import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelableUpdateRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(75);
    public final ParcelableData A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        this.A00.writeToParcel(parcel, i);
    }

    public ParcelableUpdateRequest(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = new ParcelableData(parcel);
    }
}
