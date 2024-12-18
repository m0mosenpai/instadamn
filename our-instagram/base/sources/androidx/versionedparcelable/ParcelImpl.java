package androidx.versionedparcelable;

import X.InterfaceC175987sE;
import X.Py5;
import X.Q9o;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(67);
    public final InterfaceC175987sE A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new Q9o(parcel).A08(this.A00);
    }

    public ParcelImpl(Parcel parcel) {
        this.A00 = new Q9o(parcel).A04();
    }
}
