package androidx.appcompat.widget;

import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes10.dex */
public class AppCompatSpinner$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = Py5.A00(12);
    public boolean A00;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
    }
}
