package androidx.paging.compose;

import X.AnonymousClass001;
import X.C14360o3;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class PagingPlaceholderKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(55);
    public final int A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof PagingPlaceholderKey) && this.A00 == ((PagingPlaceholderKey) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0I("PagingPlaceholderKey(index=", ')', this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public PagingPlaceholderKey(int i) {
        this.A00 = i;
    }
}
