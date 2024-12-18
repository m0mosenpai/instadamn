package com.google.android.gms.common.server.response;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC25230BEn;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC62860SUh;
import X.C3U5;
import X.C63474SlF;
import X.S2Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(56);
    public int A00;
    public int A01;
    public final Parcel A02;
    public final zan A03;
    public final String A04;
    public final int A05;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public static final void A01(Object obj, StringBuilder sb, int i) {
        String A00;
        byte[] bArr;
        int i2;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                C3U5.A02(obj);
                A00 = AbstractC62860SUh.A00(obj.toString());
                sb.append(A00);
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                bArr = (byte[]) obj;
                if (bArr != null) {
                    i2 = 0;
                    A00 = Base64.encodeToString(bArr, i2);
                    sb.append(A00);
                    sb.append("\"");
                    return;
                }
                A00 = null;
                sb.append(A00);
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                bArr = (byte[]) obj;
                if (bArr != null) {
                    i2 = 10;
                    A00 = Base64.encodeToString(bArr, i2);
                    sb.append(A00);
                    sb.append("\"");
                    return;
                }
                A00 = null;
                sb.append(A00);
                sb.append("\"");
                return;
            case 10:
                C3U5.A02(obj);
                S2Q.A00(sb, (HashMap) obj);
                return;
            case 11:
                throw AbstractC166987dD.A12("Method does not accept concrete type.");
            default:
                throw AbstractC25230BEn.A0n("Unknown type = ", i);
        }
    }

    @Override // X.AbstractC63007SaV
    public final String toString() {
        Parcel parcel;
        int A04;
        zan zanVar = this.A03;
        C3U5.A03(zanVar, "Cannot convert to JSON on client side.");
        int i = this.A00;
        if (i != 0) {
            if (i == 1) {
                parcel = this.A02;
                A04 = this.A01;
            }
            Parcel parcel2 = this.A02;
            parcel2.setDataPosition(0);
            StringBuilder A0q = AbstractC58318PtA.A0q(100);
            String str = this.A04;
            C3U5.A02(str);
            Map map = (Map) zanVar.A02.get(str);
            C3U5.A02(map);
            A00(parcel2, A0q, map);
            return A0q.toString();
        }
        parcel = this.A02;
        A04 = AbstractC58319PtB.A04(parcel);
        this.A01 = A04;
        AbstractC128825rw.A06(parcel, A04);
        this.A00 = 2;
        Parcel parcel22 = this.A02;
        parcel22.setDataPosition(0);
        StringBuilder A0q2 = AbstractC58318PtA.A0q(100);
        String str2 = this.A04;
        C3U5.A02(str2);
        Map map2 = (Map) zanVar.A02.get(str2);
        C3U5.A02(map2);
        A00(parcel22, A0q2, map2);
        return A0q2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.A05
            r2 = 20293(0x4f45, float:2.8437E-41)
            int r5 = X.AbstractC128825rw.A01(r7, r2)
            r1 = 1
            X.AbstractC128825rw.A07(r7, r1, r0)
            int r0 = r6.A00
            r4 = 2
            if (r0 == 0) goto L39
            if (r0 != r1) goto L1c
            android.os.Parcel r1 = r6.A02
            int r0 = r6.A01
        L17:
            X.AbstractC128825rw.A06(r1, r0)
            r6.A00 = r4
        L1c:
            android.os.Parcel r3 = r6.A02
            r2 = 0
            if (r3 == 0) goto L2f
            int r1 = X.AbstractC128825rw.A01(r7, r4)
            int r0 = r3.dataSize()
            r7.appendFrom(r3, r2, r0)
            X.AbstractC128825rw.A06(r7, r1)
        L2f:
            com.google.android.gms.common.server.response.zan r1 = r6.A03
            r0 = 3
            X.AbstractC128825rw.A0A(r7, r1, r0, r8, r2)
            X.AbstractC128825rw.A06(r7, r5)
            return
        L39:
            android.os.Parcel r1 = r6.A02
            int r0 = X.AbstractC128825rw.A01(r1, r2)
            r6.A01 = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.writeToParcel(android.os.Parcel, int):void");
    }

    public SafeParcelResponse(Parcel parcel, zan zanVar, int i) {
        String str;
        this.A05 = i;
        C3U5.A02(parcel);
        this.A02 = parcel;
        this.A03 = zanVar;
        if (zanVar == null) {
            str = null;
        } else {
            str = zanVar.A01;
        }
        this.A04 = str;
        this.A00 = 2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0064. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:191:0x02e8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0407  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(android.os.Parcel r18, java.lang.StringBuilder r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.A00(android.os.Parcel, java.lang.StringBuilder, java.util.Map):void");
    }
}
