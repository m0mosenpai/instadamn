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
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(14);
    public Set A00;
    public final Uri A01;
    public final ChannelIdValue A02;
    public final Double A03;
    public final Integer A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RegisterRequestParams) {
                RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
                if (SSI.A01(this.A04, registerRequestParams.A04) && SSI.A01(this.A03, registerRequestParams.A03) && SSI.A01(this.A01, registerRequestParams.A01) && SSI.A01(this.A06, registerRequestParams.A06)) {
                    List list = this.A07;
                    List list2 = registerRequestParams.A07;
                    if (list != null ? !(list2 == null || !list.containsAll(list2) || !list2.containsAll(list)) : list2 == null) {
                        if (!SSI.A01(this.A02, registerRequestParams.A02) || !SSI.A01(this.A05, registerRequestParams.A05)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A01, this.A03, this.A06, this.A07, this.A02, this.A05});
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r2.A01 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r2.A02 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r12.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RegisterRequestParams(android.net.Uri r7, com.google.android.gms.fido.u2f.api.common.ChannelIdValue r8, java.lang.Double r9, java.lang.Integer r10, java.lang.String r11, java.util.List r12, java.util.List r13) {
        /*
            r6 = this;
            r6.<init>()
            r6.A04 = r10
            r6.A03 = r9
            r6.A01 = r7
            r3 = 0
            if (r12 == 0) goto L13
            boolean r0 = r12.isEmpty()
            r1 = 1
            if (r0 == 0) goto L14
        L13:
            r1 = 0
        L14:
            java.lang.String r0 = "empty list of register requests is provided"
            X.C3U5.A08(r1, r0)
            r6.A06 = r12
            r6.A07 = r13
            r6.A02 = r8
            java.util.HashSet r5 = X.AbstractC166987dD.A1H()
            if (r7 == 0) goto L28
            r5.add(r7)
        L28:
            java.util.Iterator r4 = r12.iterator()
        L2c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r2 = r4.next()
            com.google.android.gms.fido.u2f.api.common.RegisterRequest r2 = (com.google.android.gms.fido.u2f.api.common.RegisterRequest) r2
            if (r7 != 0) goto L3f
            java.lang.String r0 = r2.A01
            r1 = 0
            if (r0 == 0) goto L40
        L3f:
            r1 = 1
        L40:
            java.lang.String r0 = "register request has null appId and no request appId is provided"
            X.C3U5.A08(r1, r0)
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L2c
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r5.add(r0)
            goto L2c
        L51:
            java.util.Iterator r4 = r13.iterator()
        L55:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r2 = r4.next()
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r2 = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) r2
            if (r7 != 0) goto L68
            java.lang.String r0 = r2.A02
            r1 = 0
            if (r0 == 0) goto L69
        L68:
            r1 = 1
        L69:
            java.lang.String r0 = "registered key has null appId and no request appId is provided"
            X.C3U5.A08(r1, r0)
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L55
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r5.add(r0)
            goto L55
        L7a:
            r6.A00 = r5
            if (r11 == 0) goto L86
            int r1 = r11.length()
            r0 = 80
            if (r1 > r0) goto L87
        L86:
            r3 = 1
        L87:
            java.lang.String r0 = "Display Hint cannot be longer than 80 characters"
            X.C3U5.A08(r3, r0)
            r6.A05 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.<init>(android.net.Uri, com.google.android.gms.fido.u2f.api.common.ChannelIdValue, java.lang.Double, java.lang.Integer, java.lang.String, java.util.List, java.util.List):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        Integer num = this.A04;
        if (num != null) {
            parcel.writeInt(262146);
            AbstractC58318PtA.A1H(parcel, num);
        }
        Double d = this.A03;
        if (d != null) {
            AbstractC58322PtE.A1C(parcel, d, 524291);
        }
        AbstractC128825rw.A0A(parcel, this.A01, 4, i, false);
        AbstractC128825rw.A0E(parcel, this.A06, 5, false);
        AbstractC128825rw.A0E(parcel, this.A07, 6, false);
        AbstractC128825rw.A0A(parcel, this.A02, 7, i, false);
        AbstractC128825rw.A0C(parcel, this.A05, 8, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
