package com.facebook.iabeventlogging.model;

import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.EnumC61218RhI;
import android.os.Parcel;

/* loaded from: classes10.dex */
public class IABOpenSecureInfoPopupEvent extends IABEvent {
    public final boolean A00;

    public IABOpenSecureInfoPopupEvent(long j, String str, boolean z, long j2) {
        super(EnumC61218RhI.IAB_OPEN_SECURE_INFO_POPUP, str, j, j2);
        this.A00 = z;
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABOpenSecureInfoPopupEvent{");
        AbstractC58321PtD.A1I(this, "type=", A0s);
        AbstractC58319PtB.A18(this.A01, A0s);
        AbstractC58318PtA.A1L(this, A0s);
        A0s.append(", isSecure=");
        A0s.append(this.A00);
        return AbstractC167027dH.A0R(A0s);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
    }
}
