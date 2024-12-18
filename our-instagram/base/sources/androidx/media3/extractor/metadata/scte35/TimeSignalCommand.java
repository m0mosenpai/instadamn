package androidx.media3.extractor.metadata.scte35;

import X.AnonymousClass001;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = Py5.A00(52);
    public final long A00;
    public final long A01;

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        return AnonymousClass001.A0t("SCTE-35 TimeSignalCommand { ptsTime=", ", playbackPositionUs= ", " }", this.A01, this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
