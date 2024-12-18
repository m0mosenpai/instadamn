package com.google.android.gms.fido.u2f.api.common;

import X.AbstractC128825rw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63471SlC;
import X.SSI;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Deprecated
/* loaded from: classes10.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(17);
    public final Uri A00;
    public final ChannelIdValue A01;
    public final Double A02;
    public final Integer A03;
    public final String A04;
    public final List A05;
    public final byte[] A06;
    public final Set A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignRequestParams) {
                SignRequestParams signRequestParams = (SignRequestParams) obj;
                if (SSI.A01(this.A03, signRequestParams.A03) && SSI.A01(this.A02, signRequestParams.A02) && SSI.A01(this.A00, signRequestParams.A00) && Arrays.equals(this.A06, signRequestParams.A06)) {
                    List list = this.A05;
                    List list2 = signRequestParams.A05;
                    if (!list.containsAll(list2) || !list2.containsAll(list) || !SSI.A01(this.A01, signRequestParams.A01) || !SSI.A01(this.A04, signRequestParams.A04)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A00, this.A02, this.A05, this.A01, this.A04, Integer.valueOf(Arrays.hashCode(this.A06))});
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r7 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SignRequestParams(android.net.Uri r7, com.google.android.gms.fido.u2f.api.common.ChannelIdValue r8, java.lang.Double r9, java.lang.Integer r10, java.lang.String r11, java.util.List r12, byte[] r13) {
        /*
            r6 = this;
            r6.<init>()
            r6.A03 = r10
            r6.A02 = r9
            r6.A00 = r7
            r6.A06 = r13
            r6.A05 = r12
            r6.A01 = r8
            java.util.HashSet r5 = X.AbstractC166987dD.A1H()
            if (r7 == 0) goto L18
            r5.add(r7)
        L18:
            r4 = 0
            if (r12 == 0) goto L42
            java.util.Iterator r3 = r12.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r3.next()
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r0 = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) r0
            java.lang.String r2 = r0.A02
            if (r2 != 0) goto L32
            r1 = 0
            if (r7 == 0) goto L33
        L32:
            r1 = 1
        L33:
            java.lang.String r0 = "registered key has null appId and no request appId is provided"
            X.C3U5.A08(r1, r0)
            if (r2 == 0) goto L1f
            android.net.Uri r0 = android.net.Uri.parse(r2)
            r5.add(r0)
            goto L1f
        L42:
            r6.A07 = r5
            if (r11 == 0) goto L4e
            int r1 = r11.length()
            r0 = 80
            if (r1 > r0) goto L4f
        L4e:
            r4 = 1
        L4f:
            java.lang.String r0 = "Display Hint cannot be longer than 80 characters"
            X.C3U5.A08(r4, r0)
            r6.A04 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.SignRequestParams.<init>(android.net.Uri, com.google.android.gms.fido.u2f.api.common.ChannelIdValue, java.lang.Double, java.lang.Integer, java.lang.String, java.util.List, byte[]):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        Integer num = this.A03;
        if (num != null) {
            parcel.writeInt(262146);
            AbstractC58318PtA.A1H(parcel, num);
        }
        Double d = this.A02;
        if (d != null) {
            AbstractC58322PtE.A1C(parcel, d, 524291);
        }
        AbstractC128825rw.A0A(parcel, this.A00, 4, i, false);
        AbstractC128825rw.A0F(parcel, this.A06, 5, false);
        AbstractC128825rw.A0E(parcel, this.A05, 6, false);
        AbstractC128825rw.A0A(parcel, this.A01, 7, i, false);
        AbstractC128825rw.A0C(parcel, this.A04, 8, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
