package androidx.media3.common;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class StreamKey implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(19);
    public final int A00;
    public final int A01;
    public final int A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            StreamKey streamKey = (StreamKey) obj;
            if (this.A01 != streamKey.A01 || this.A00 != streamKey.A00 || this.A02 != streamKey.A02) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        StreamKey streamKey = (StreamKey) obj;
        int i = this.A01 - streamKey.A01;
        if (i == 0) {
            int i2 = this.A00 - streamKey.A00;
            if (i2 == 0) {
                return this.A02 - streamKey.A02;
            }
            return i2;
        }
        return i;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
    }

    public StreamKey(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A01);
        A1C.append(".");
        A1C.append(this.A00);
        A1C.append(".");
        return AbstractC58318PtA.A0l(A1C, this.A02);
    }
}
