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
public final class IABLandingPageViewEndedEvent extends IABEvent {
    public final ZonedValue A00;
    public final long A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABLandingPageViewEndedEvent(ZonedValue zonedValue, String str, long j, long j2) {
        super(EnumC61218RhI.IAB_LANDING_PAGE_VIEW_ENDED, str, j, j2);
        C14360o3.A0B(str, 1);
        this.A01 = j2;
        this.A00 = zonedValue;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABLandingPageViewEndedEvent{");
        AbstractC58321PtD.A1I(this, "type=", A0s);
        AbstractC58319PtB.A18(super.A01, A0s);
        A0s.append(this.A01);
        String A0R = AbstractC167027dH.A0R(A0s);
        C14360o3.A07(A0R);
        return A0R;
    }
}
