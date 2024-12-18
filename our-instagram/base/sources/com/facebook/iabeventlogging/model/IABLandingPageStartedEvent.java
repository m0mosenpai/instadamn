package com.facebook.iabeventlogging.model;

import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.EnumC61218RhI;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;

/* loaded from: classes10.dex */
public final class IABLandingPageStartedEvent extends IABEvent {
    public final ZonedValue A00;
    public final boolean A01;
    public final long A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABLandingPageStartedEvent(ZonedValue zonedValue, String str, long j, long j2, boolean z) {
        super(EnumC61218RhI.IAB_LANDING_PAGE_STARTED, str, j, j2);
        C14360o3.A0B(str, 1);
        this.A02 = j2;
        this.A00 = zonedValue;
        this.A01 = z;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABLandingPageStartedEvent{");
        A0s.append("isCookieLoadComplete=");
        A0s.append(this.A01);
        AbstractC58321PtD.A1I(this, ", type=", A0s);
        AbstractC58319PtB.A18(super.A01, A0s);
        A0s.append(this.A02);
        String A0R = AbstractC167027dH.A0R(A0s);
        C14360o3.A07(A0R);
        return A0R;
    }
}
