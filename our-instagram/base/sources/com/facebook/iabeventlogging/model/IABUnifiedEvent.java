package com.facebook.iabeventlogging.model;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC61782Rtc;
import X.C14360o3;
import X.EnumC223219t5;
import X.EnumC61218RhI;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class IABUnifiedEvent extends IABEvent {
    public final EnumC223219t5 A00;
    public final Integer A01;
    public final String A02;
    public final long A03;
    public final long A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABUnifiedEvent(EnumC223219t5 enumC223219t5, Integer num, String str, String str2, long j, long j2) {
        super(EnumC61218RhI.IAB_UNIFIED, str, j, j2);
        AbstractC167007dF.A1G(str, 1, num);
        this.A05 = str;
        this.A04 = j;
        this.A03 = j2;
        this.A00 = enumC223219t5;
        this.A01 = num;
        this.A02 = str2;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeString(AbstractC61782Rtc.A00(this.A01));
        parcel.writeString(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABUnifiedEvent{");
        A0s.append(", type=");
        A0s.append(super.A02);
        A0s.append(", iabSessionId='");
        AbstractC58319PtB.A1K(A0s, this.A05);
        A0s.append(", eventTs=");
        AbstractC58319PtB.A18(this.A04, A0s);
        A0s.append(this.A03);
        A0s.append(", unifiedEventName=");
        A0s.append(this.A00);
        A0s.append(", unifiedEventCategory=");
        A0s.append(AbstractC61782Rtc.A00(this.A01));
        A0s.append(", reason=");
        A0s.append(this.A02);
        String A0R = AbstractC167027dH.A0R(A0s);
        C14360o3.A07(A0R);
        return A0R;
    }
}
