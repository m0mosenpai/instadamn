package com.facebook.iabeventlogging.model;

import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.EnumC61218RhI;
import android.os.Parcel;

/* loaded from: classes10.dex */
public class IABRefreshEvent extends IABEvent {
    public final String A00;

    public IABRefreshEvent(long j, String str, long j2, String str2) {
        super(EnumC61218RhI.IAB_REFRESH, str, j, j2);
        this.A00 = str2;
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABRefreshEvent{");
        A0s.append("refreshFromType='");
        AbstractC58321PtD.A1J(this, A0s, AbstractC58319PtB.A00(this.A00, A0s));
        AbstractC58318PtA.A1L(this, A0s);
        return AbstractC167027dH.A0R(A0s);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
