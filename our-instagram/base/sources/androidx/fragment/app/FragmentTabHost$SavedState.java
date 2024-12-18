package androidx.fragment.app;

import X.AnonymousClass001;
import X.C15030pJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public class FragmentTabHost$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C15030pJ(3);
    public String A00;

    public final String toString() {
        return AnonymousClass001.A11("FragmentTabHost.SavedState{", Integer.toHexString(System.identityHashCode(this)), " curTab=", this.A00, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
