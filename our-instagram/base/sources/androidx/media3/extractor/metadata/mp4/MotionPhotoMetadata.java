package androidx.media3.extractor.metadata.mp4;

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
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(44);
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void E4j(Y15 y15) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.A02 != motionPhotoMetadata.A02 || this.A01 != motionPhotoMetadata.A01 || this.A00 != motionPhotoMetadata.A00 || this.A04 != motionPhotoMetadata.A04 || this.A03 != motionPhotoMetadata.A03) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        return AbstractC58321PtD.A08(this.A03, AbstractC167007dF.A07(this.A04, AbstractC167007dF.A07(this.A00, AbstractC167007dF.A07(this.A01, JQ0.A01((int) (j ^ (j >>> 32)))))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Motion photo metadata: photoStartPosition=");
        A1C.append(this.A02);
        A1C.append(", photoSize=");
        A1C.append(this.A01);
        A1C.append(", photoPresentationTimestampUs=");
        A1C.append(this.A00);
        A1C.append(", videoStartPosition=");
        A1C.append(this.A04);
        A1C.append(", videoSize=");
        A1C.append(this.A03);
        return A1C.toString();
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
        this.A04 = j4;
        this.A03 = j5;
    }
}
