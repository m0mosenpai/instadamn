package com.instagram.leadgen.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25231BEo;
import X.AbstractC50523MSb;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import X.EnumC53274NhC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class LeadGenTrustSignalsPayload extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(20);
    public final LeadGenTrustSignal A00;
    public final LeadGenTrustSignal A01;
    public final LeadGenTrustSignal A02;
    public final LeadGenTrustSignal A03;
    public final Integer A04;
    public final List A05;
    public final LeadGenTrustSignal A06;
    public final String A07;

    public LeadGenTrustSignalsPayload(LeadGenTrustSignal leadGenTrustSignal, LeadGenTrustSignal leadGenTrustSignal2, LeadGenTrustSignal leadGenTrustSignal3, LeadGenTrustSignal leadGenTrustSignal4, LeadGenTrustSignal leadGenTrustSignal5, Integer num, String str, List list) {
        AbstractC167007dF.A1I(num, 2, list);
        this.A07 = str;
        this.A04 = num;
        this.A01 = leadGenTrustSignal;
        this.A02 = leadGenTrustSignal2;
        this.A00 = leadGenTrustSignal3;
        this.A06 = leadGenTrustSignal4;
        this.A03 = leadGenTrustSignal5;
        this.A05 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenTrustSignalsPayload) {
                LeadGenTrustSignalsPayload leadGenTrustSignalsPayload = (LeadGenTrustSignalsPayload) obj;
                if (!C14360o3.A0K(this.A07, leadGenTrustSignalsPayload.A07) || this.A04 != leadGenTrustSignalsPayload.A04 || !C14360o3.A0K(this.A01, leadGenTrustSignalsPayload.A01) || !C14360o3.A0K(this.A02, leadGenTrustSignalsPayload.A02) || !C14360o3.A0K(this.A00, leadGenTrustSignalsPayload.A00) || !C14360o3.A0K(this.A06, leadGenTrustSignalsPayload.A06) || !C14360o3.A0K(this.A03, leadGenTrustSignalsPayload.A03) || !C14360o3.A0K(this.A05, leadGenTrustSignalsPayload.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A07);
        switch (this.A04.intValue()) {
            case 1:
                str = "FACEBOOK";
                break;
            case 2:
                str = "UNKNOWN";
                break;
            default:
                str = "INSTAGRAM";
                break;
        }
        parcel.writeString(str);
        AbstractC50523MSb.A0k(parcel, this.A01, i);
        AbstractC50523MSb.A0k(parcel, this.A02, i);
        AbstractC50523MSb.A0k(parcel, this.A00, i);
        AbstractC50523MSb.A0k(parcel, this.A06, i);
        AbstractC50523MSb.A0k(parcel, this.A03, i);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A05);
        while (A0u.hasNext()) {
            ((LeadGenTrustSignal) A0u.next()).writeToParcel(parcel, i);
        }
    }

    public final EnumC53274NhC A00() {
        LeadGenTrustSignal leadGenTrustSignal = this.A00;
        if (leadGenTrustSignal != null && leadGenTrustSignal.A02 != null) {
            return EnumC53274NhC.A05;
        }
        LeadGenTrustSignal leadGenTrustSignal2 = this.A02;
        if (leadGenTrustSignal2 != null && leadGenTrustSignal2.A02 != null) {
            return EnumC53274NhC.A08;
        }
        return EnumC53274NhC.A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r1 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r1 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        if (r1 == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01() {
        /*
            r5 = this;
            com.instagram.leadgen.core.model.LeadGenTrustSignal r1 = r5.A01
            r0 = 0
            if (r1 == 0) goto L7
            java.lang.String r0 = r1.A02
        L7:
            r4 = 0
            if (r0 == 0) goto L11
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L12
        L11:
            r0 = 1
        L12:
            r3 = r0 ^ 1
            com.instagram.leadgen.core.model.LeadGenTrustSignal r0 = r5.A02
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L23
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L24
        L23:
            r0 = 1
        L24:
            r2 = r0 ^ 1
            com.instagram.leadgen.core.model.LeadGenTrustSignal r0 = r5.A00
            if (r0 == 0) goto L35
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L35
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L36
        L35:
            r0 = 1
        L36:
            r1 = r0 ^ 1
            if (r3 != 0) goto L46
            java.util.List r0 = r5.A05
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 != 0) goto L46
            if (r1 == 0) goto L47
            if (r2 == 0) goto L47
        L46:
            r4 = 1
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload.A01():boolean");
    }

    public final int hashCode() {
        String str;
        int A0O = AbstractC167017dG.A0O(this.A07) * 31;
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "FACEBOOK";
                break;
            case 2:
                str = "UNKNOWN";
                break;
            default:
                str = "INSTAGRAM";
                break;
        }
        return AbstractC166987dD.A0I(this.A05, (((((((((AbstractC25231BEo.A0H(str, intValue, A0O) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31);
    }
}
