package androidx.appcompat.widget;

import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ActionMenuPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(11);
    public int A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }
}
