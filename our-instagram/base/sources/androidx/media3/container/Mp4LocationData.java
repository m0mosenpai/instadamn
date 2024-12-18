package androidx.media3.container;

import X.AbstractC166987dD;
import X.AnonymousClass001;
import X.JQ0;
import X.Py5;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

/* loaded from: classes10.dex */
public final class Mp4LocationData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(21);
    public final float A00;
    public final float A01;

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
            Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
            if (this.A00 != mp4LocationData.A00 || this.A01 != mp4LocationData.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(Float.valueOf(this.A01), JQ0.A01(Float.valueOf(this.A00).hashCode()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r4 > 180.0f) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Mp4LocationData(float r3, float r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L1c
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L1c
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L1c
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L1d
        L1c:
            r1 = 0
        L1d:
            java.lang.String r0 = "Invalid latitude or longitude"
            X.WDn.A03(r1, r0)
            r2.A00 = r3
            r2.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.Mp4LocationData.<init>(float, float):void");
    }

    public final String toString() {
        return AnonymousClass001.A0a("xyz: latitude=", ", longitude=", this.A00, this.A01);
    }

    public Mp4LocationData(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
    }
}
