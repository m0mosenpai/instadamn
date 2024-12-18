package com.facebook.iabeventlogging.model;

import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.EnumC61218RhI;
import X.RiS;
import com.facebook.privacy.zone.api.ZonedValue;

/* loaded from: classes10.dex */
public final class IABViewableEvent extends IABEvent {
    public final long A00;
    public final RiS A01;
    public final ZonedValue A02;
    public final long A03;
    public final long A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABViewableEvent(RiS riS, ZonedValue zonedValue, String str, String str2, long j, long j2, long j3) {
        super(EnumC61218RhI.IAB_VIEWABLE, str, j, j2);
        C14360o3.A0B(str, 1);
        this.A04 = j;
        this.A03 = j2;
        this.A02 = zonedValue;
        this.A00 = j3;
        this.A05 = str2;
        this.A01 = riS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (java.lang.Long.valueOf(r1) != null) goto L6;
     */
    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            super.writeToParcel(r4, r5)
            com.facebook.privacy.zone.api.ZonedValue r0 = r3.A02
            r4.writeParcelable(r0, r5)
            long r0 = r3.A00
            r4.writeLong(r0)
            java.lang.String r0 = r3.A05
            r4.writeString(r0)
            X.RiS r0 = r3.A01
            if (r0 == 0) goto L26
            long r1 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 == 0) goto L26
        L22:
            r4.writeLong(r1)
            return
        L26:
            r1 = -1
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.iabeventlogging.model.IABViewableEvent.writeToParcel(android.os.Parcel, int):void");
    }

    public final String toString() {
        Long l;
        StringBuilder A0s = AbstractC58318PtA.A0s("IABViewableEvent{");
        A0s.append("userClickTs=");
        A0s.append(this.A00);
        AbstractC58321PtD.A1I(this, ", type=", A0s);
        AbstractC58319PtB.A18(this.A04, A0s);
        A0s.append(this.A03);
        A0s.append(", clickId=");
        A0s.append(this.A05);
        A0s.append(", nvSource=");
        RiS riS = this.A01;
        if (riS != null) {
            l = Long.valueOf(riS.A00);
        } else {
            l = null;
        }
        String A11 = AbstractC58320PtC.A11(l, A0s);
        C14360o3.A07(A11);
        return A11;
    }
}
