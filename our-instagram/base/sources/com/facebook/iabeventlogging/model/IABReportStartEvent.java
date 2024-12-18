package com.facebook.iabeventlogging.model;

import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.EnumC61218RhI;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;

/* loaded from: classes10.dex */
public class IABReportStartEvent extends IABEvent {
    public final ZonedValue A00;
    public final String A01;
    public final String A02;

    public IABReportStartEvent(ZonedValue zonedValue, String str, String str2, String str3, long j, long j2) {
        super(EnumC61218RhI.IAB_REPORT_START, str, j, j2);
        this.A01 = str2;
        this.A00 = zonedValue;
        this.A02 = str3;
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABReportStartEvent{");
        A0s.append("targetUrl='");
        char A00 = AbstractC58319PtB.A00(this.A02, A0s);
        A0s.append(", clickSource='");
        A0s.append(this.A01);
        A0s.append(A00);
        AbstractC58321PtD.A1J(this, A0s, A00);
        AbstractC58318PtA.A1L(this, A0s);
        return AbstractC167027dH.A0R(A0s);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }
}
