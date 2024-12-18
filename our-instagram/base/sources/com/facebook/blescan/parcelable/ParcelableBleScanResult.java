package com.facebook.blescan.parcelable;

import X.AbstractC167007dF;
import X.AbstractC31177DnL;
import X.AbstractC58321PtD;
import X.C63475SlG;
import X.SI9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelableBleScanResult extends SI9 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r1.equals(r0) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L40
            r5 = 0
            if (r8 == 0) goto L2e
            boolean r0 = r8 instanceof X.SI9
            if (r0 == 0) goto L2e
            X.SI9 r8 = (X.SI9) r8
            long r3 = r7.A01
            long r1 = r8.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2e
            long r3 = r7.A02
            long r1 = r8.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2e
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 != r0) goto L2e
            java.lang.String r1 = r7.A03
            java.lang.String r0 = r8.A03
            if (r1 == 0) goto L2f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L32
        L2e:
            return r5
        L2f:
            if (r0 == 0) goto L32
            return r5
        L32:
            java.lang.String r1 = r7.A04
            java.lang.String r0 = r8.A04
            if (r1 == 0) goto L3d
            boolean r6 = r1.equals(r0)
            return r6
        L3d:
            if (r0 == 0) goto L40
            r6 = 0
        L40:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.blescan.parcelable.ParcelableBleScanResult.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j = this.A01;
        return ((((AbstractC167007dF.A07(this.A02, ((int) (j ^ (j >>> 32))) * 31) + AbstractC31177DnL.A04(this.A03)) * 31) + this.A00) * 31) + AbstractC58321PtD.A0D(this.A04);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
    }
}
