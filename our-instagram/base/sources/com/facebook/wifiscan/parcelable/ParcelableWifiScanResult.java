package com.facebook.wifiscan.parcelable;

import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.AbstractC25235BEs;
import X.AbstractC31177DnL;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C63282Sgh;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelableWifiScanResult extends C63282Sgh implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(85);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r1.equals(r0) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L88
            r5 = 0
            if (r8 == 0) goto L26
            boolean r0 = r8 instanceof X.C63282Sgh
            if (r0 == 0) goto L26
            X.Sgh r8 = (X.C63282Sgh) r8
            long r3 = r7.A03
            long r1 = r8.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L26
            int r1 = r7.A02
            int r0 = r8.A02
            if (r1 != r0) goto L26
            java.lang.String r1 = r7.A07
            java.lang.String r0 = r8.A07
            if (r1 == 0) goto L27
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2a
        L26:
            return r5
        L27:
            if (r0 == 0) goto L2a
            return r5
        L2a:
            java.lang.String r1 = r7.A08
            java.lang.String r0 = r8.A08
            if (r1 == 0) goto L37
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3a
            return r5
        L37:
            if (r0 == 0) goto L3a
            return r5
        L3a:
            java.lang.Integer r1 = r7.A00
            java.lang.Integer r0 = r8.A00
            if (r1 == 0) goto L47
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4a
            return r5
        L47:
            if (r0 == 0) goto L4a
            return r5
        L4a:
            java.lang.String r1 = r7.A09
            java.lang.String r0 = r8.A09
            if (r1 == 0) goto L57
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5a
            return r5
        L57:
            if (r0 == 0) goto L5a
            return r5
        L5a:
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = r8.A0A
            if (r1 == 0) goto L67
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6a
            return r5
        L67:
            if (r0 == 0) goto L6a
            return r5
        L6a:
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = r8.A0B
            if (r1 == 0) goto L77
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7a
            return r5
        L77:
            if (r0 == 0) goto L7a
            return r5
        L7a:
            java.lang.Boolean r1 = r7.A04
            java.lang.Boolean r0 = r8.A04
            if (r1 == 0) goto L85
            boolean r6 = r1.equals(r0)
            return r6
        L85:
            if (r0 == 0) goto L88
            r6 = 0
        L88:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wifiscan.parcelable.ParcelableWifiScanResult.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Sgh, com.facebook.wifiscan.parcelable.ParcelableWifiScanResult] */
    public static ParcelableWifiScanResult A00(C63282Sgh c63282Sgh) {
        if (c63282Sgh == null) {
            return null;
        }
        long j = c63282Sgh.A03;
        String str = c63282Sgh.A07;
        int i = c63282Sgh.A02;
        String str2 = c63282Sgh.A08;
        return new C63282Sgh(c63282Sgh.A04, c63282Sgh.A00, c63282Sgh.A05, c63282Sgh.A06, str, str2, c63282Sgh.A09, c63282Sgh.A0A, c63282Sgh.A0B, i, j);
    }

    public final int hashCode() {
        int i = 0;
        int A03 = ((((((((((((((((((AbstractC25228BEl.A03(this.A03) * 31) + AbstractC31177DnL.A04(this.A07)) * 31) + this.A02) * 31) + AbstractC31177DnL.A04(this.A08)) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC31177DnL.A04(this.A09)) * 31) + AbstractC31177DnL.A04(this.A0A)) * 31) + AbstractC31177DnL.A04(this.A0B)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31;
        Integer num = this.A06;
        if (num != null) {
            i = num.hashCode();
        }
        return A03 + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A03);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A08);
        parcel.writeValue(this.A00);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeValue(this.A04);
        parcel.writeValue(this.A05);
        parcel.writeValue(this.A06);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ParcelableWifiScanResult{timestampMs=");
        A1C.append(this.A03);
        A1C.append(", BSSID='");
        char A00 = AbstractC58319PtB.A00(this.A07, A1C);
        A1C.append(", level=");
        A1C.append(this.A02);
        A1C.append(", SSID='");
        A1C.append(this.A08);
        A1C.append(A00);
        A1C.append(", frequency=");
        A1C.append(this.A00);
        A1C.append(", capabilities='");
        A1C.append(this.A09);
        A1C.append(A00);
        A1C.append(", operatorName='");
        A1C.append(this.A0A);
        A1C.append(A00);
        A1C.append(", venueName='");
        A1C.append(this.A0B);
        A1C.append(A00);
        A1C.append(", hasCaptivePortal=");
        A1C.append(this.A04);
        A1C.append(A00);
        A1C.append(", distanceMm=");
        A1C.append(this.A05);
        A1C.append(A00);
        A1C.append(", distanceStd=");
        return AbstractC58320PtC.A11(this.A06, A1C);
    }
}
