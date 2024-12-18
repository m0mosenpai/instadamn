package com.facebook.iabeventlogging.model;

import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC61781Rtb;
import X.EnumC61218RhI;
import X.MSV;
import android.os.Parcel;

/* loaded from: classes10.dex */
public class IABHistoryInteractionEvent extends IABEvent {
    public final Integer A00;
    public final String A01;

    public IABHistoryInteractionEvent(Integer num, String str, String str2, long j, long j2) {
        super(EnumC61218RhI.IAB_HISTORY_UX_INTERACTION, str, j, j2);
        this.A00 = num;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABHistoryInteractionEvent{");
        A0s.append("interaction='");
        AbstractC58321PtD.A1J(this, A0s, AbstractC58319PtB.A00(AbstractC61781Rtb.A00(this.A00), A0s));
        AbstractC58318PtA.A1L(this, A0s);
        A0s.append(MSV.A00(132));
        A0s.append(this.A01);
        return AbstractC167027dH.A0R(A0s);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(AbstractC61781Rtb.A00(this.A00));
        parcel.writeString(this.A01);
    }
}
