package com.facebook.iabeventlogging.model;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25233BEq;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C14360o3;
import X.EnumC223299tM;
import X.EnumC61218RhI;
import X.VHa;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class IABChangeViewModeEvent extends IABEvent {
    public final EnumC223299tM A00;
    public final VHa A01;
    public final VHa A02;
    public final String A03;
    public final long A04;
    public final long A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABChangeViewModeEvent(EnumC223299tM enumC223299tM, VHa vHa, VHa vHa2, String str, String str2, long j, long j2) {
        super(EnumC61218RhI.IAB_CHANGE_VIEW_MODE, str, j, j2);
        AbstractC25233BEq.A0x(1, str, vHa, vHa2);
        C14360o3.A0B(enumC223299tM, 6);
        this.A05 = j;
        this.A04 = j2;
        this.A01 = vHa;
        this.A02 = vHa2;
        this.A00 = enumC223299tM;
        this.A03 = str2;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        AbstractC166997dE.A1I(parcel, this.A01);
        AbstractC166997dE.A1I(parcel, this.A02);
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeString(this.A03);
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABChangeViewModeEvent{");
        A0s.append("fromMode='");
        char A00 = AbstractC58319PtB.A00(this.A01.toString(), A0s);
        A0s.append(", toMode='");
        AbstractC58318PtA.A1V(A0s, this.A02);
        A0s.append(A00);
        A0s.append(", reason='");
        AbstractC58318PtA.A1V(A0s, this.A00);
        A0s.append(A00);
        A0s.append(", type=");
        A0s.append(super.A02);
        A0s.append(", iabSessionId='");
        A0s.append(super.A03);
        A0s.append(A00);
        A0s.append(", eventTs=");
        AbstractC58319PtB.A18(this.A05, A0s);
        A0s.append(this.A04);
        A0s.append(", clickSource='");
        A0s.append(this.A03);
        A0s.append(A00);
        String A0R = AbstractC167027dH.A0R(A0s);
        C14360o3.A07(A0R);
        return A0R;
    }
}
