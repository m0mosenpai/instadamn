package androidx.work.multiprocess.parcelable;

import X.AbstractC166987dD;
import X.AnonymousClass001;
import X.C14360o3;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class ParcelableInterruptRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(71);
    public final int A00;
    public final String A01;

    public ParcelableInterruptRequest(String str, int i) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ParcelableInterruptRequest) {
                ParcelableInterruptRequest parcelableInterruptRequest = (ParcelableInterruptRequest) obj;
                if (!C14360o3.A0K(this.A01, parcelableInterruptRequest.A01) || this.A00 != parcelableInterruptRequest.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0l("ParcelableInterruptRequest(id=", this.A01, ", stopReason=", ')', this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + this.A00;
    }
}
