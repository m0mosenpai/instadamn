package androidx.media3.extractor.metadata.mp4;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25230BEn;
import X.AbstractC58319PtB;
import X.Py5;
import X.WDn;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.List;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(45);
    public final List A00;

    /* loaded from: classes10.dex */
    public final class Segment implements Parcelable {
        public static final Parcelable.Creator CREATOR = Py5.A00(46);
        public final int A00;
        public final long A01;
        public final long A02;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Segment segment = (Segment) obj;
                if (this.A02 != segment.A02 || this.A01 != segment.A01 || this.A00 != segment.A00) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return AbstractC58319PtB.A06(Long.valueOf(this.A02), Long.valueOf(this.A01), Integer.valueOf(this.A00));
        }

        public final String toString() {
            return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.A02), Long.valueOf(this.A01), Integer.valueOf(this.A00));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.A02);
            parcel.writeLong(this.A01);
            parcel.writeInt(this.A00);
        }

        public Segment(long j, long j2, int i) {
            WDn.A01(AbstractC25230BEn.A1P((j > j2 ? 1 : (j == j2 ? 0 : -1))));
            this.A02 = j;
            this.A01 = j2;
            this.A00 = i;
        }
    }

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
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((SlowMotionData) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
    }

    public SlowMotionData(List list) {
        boolean z;
        this.A00 = list;
        if (!list.isEmpty()) {
            long j = ((Segment) list.get(0)).A01;
            for (int i = 1; i < list.size(); i++) {
                if (((Segment) list.get(i)).A02 < j) {
                    z = true;
                    break;
                }
                j = ((Segment) list.get(i)).A01;
            }
        }
        z = false;
        WDn.A01(!z);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SlowMotion: segments=");
        return AbstractC166997dE.A0v(this.A00, A1C);
    }
}
