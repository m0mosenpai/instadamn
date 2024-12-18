package androidx.media3.extractor.metadata.mp4;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.JQ0;
import X.Py5;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

/* loaded from: classes10.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(47);
    public final float A00;
    public final int A01;

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
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            if (this.A00 != smtaMetadataEntry.A00 || this.A01 != smtaMetadataEntry.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return JQ0.A01(Float.valueOf(this.A00).hashCode()) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }

    public SmtaMetadataEntry(float f, int i) {
        this.A00 = f;
        this.A01 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("smta: captureFrameRate=");
        A1C.append(this.A00);
        A1C.append(", svcTemporalLayerCount=");
        return AbstractC58318PtA.A0l(A1C, this.A01);
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }
}
