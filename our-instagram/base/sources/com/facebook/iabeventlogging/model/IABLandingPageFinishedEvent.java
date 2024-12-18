package com.facebook.iabeventlogging.model;

import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.EnumC61218RhI;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;
import java.util.List;

/* loaded from: classes10.dex */
public final class IABLandingPageFinishedEvent extends IABEvent {
    public final ZonedValue A00;
    public final String A01;
    public final long A02;
    public final List A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABLandingPageFinishedEvent(ZonedValue zonedValue, String str, String str2, List list, long j, long j2) {
        super(EnumC61218RhI.IAB_LANDING_PAGE_FINISHED, str, j, j2);
        C14360o3.A0B(str, 1);
        this.A02 = j2;
        this.A00 = zonedValue;
        this.A01 = str2;
        this.A03 = list;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeList(this.A03);
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABLandingPageFinishedEvent{");
        A0s.append("zonedInitialUrl='");
        char A00 = AbstractC58319PtB.A00("--zone_wrapped_value--", A0s);
        A0s.append(", initialLandUrl='");
        A0s.append(this.A01);
        A0s.append(A00);
        AbstractC58321PtD.A1J(this, A0s, A00);
        A0s.append(this.A02);
        A0s.append(", postClickEligibleExperienceTypes=");
        String A11 = AbstractC58320PtC.A11(this.A03, A0s);
        C14360o3.A07(A11);
        return A11;
    }
}
