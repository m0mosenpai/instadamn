package androidx.media3.container;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58321PtD;
import X.JQ0;
import X.Py5;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

/* loaded from: classes10.dex */
public final class Mp4TimestampData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(23);
    public final long A00;
    public final long A01;
    public final long A02;

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void E4j(Y15 y15) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mp4TimestampData)) {
            return false;
        }
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj;
        return this.A00 == mp4TimestampData.A00 && this.A01 == mp4TimestampData.A01 && this.A02 == mp4TimestampData.A02;
    }

    public final int hashCode() {
        long j = this.A00;
        return AbstractC58321PtD.A08(this.A02, AbstractC167007dF.A07(this.A01, JQ0.A01((int) (j ^ (j >>> 32)))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
    }

    public Mp4TimestampData(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = -1L;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Mp4Timestamp: creation time=");
        A1C.append(this.A00);
        A1C.append(", modification time=");
        A1C.append(this.A01);
        A1C.append(", timescale=");
        A1C.append(this.A02);
        return A1C.toString();
    }

    public Mp4TimestampData(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }

    public Mp4TimestampData(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
    }
}
