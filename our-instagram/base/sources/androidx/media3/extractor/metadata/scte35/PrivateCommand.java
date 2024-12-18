package androidx.media3.extractor.metadata.scte35;

import X.AnonymousClass001;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = Py5.A00(48);
    public final long A00;
    public final long A01;
    public final byte[] A02;

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        return AnonymousClass001.A0t("SCTE-35 PrivateCommand { ptsAdjustment=", ", identifier= ", " }", this.A01, this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeByteArray(this.A02);
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = parcel.createByteArray();
    }
}
