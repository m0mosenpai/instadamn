package androidx.media3.container;

import X.AnonymousClass001;
import X.Py5;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

/* loaded from: classes10.dex */
public final class Mp4OrientationData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(22);
    public final int A00;

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void E4j(Y15 y15) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Mp4OrientationData) && this.A00 == ((Mp4OrientationData) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        return 527 + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0O("Orientation= ", this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r3 == 270) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Mp4OrientationData(int r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L12
            r0 = 90
            if (r3 == r0) goto L12
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 == r0) goto L12
            r0 = 270(0x10e, float:3.78E-43)
            r1 = 0
            if (r3 != r0) goto L13
        L12:
            r1 = 1
        L13:
            java.lang.String r0 = "Unsupported orientation"
            X.WDn.A03(r1, r0)
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.Mp4OrientationData.<init>(int):void");
    }

    public Mp4OrientationData(Parcel parcel) {
        this.A00 = parcel.readInt();
    }
}
