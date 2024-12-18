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
public final class IABLandingPageInteractiveEvent extends IABEvent {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final ZonedValue A04;
    public final String A05;
    public final String A06;
    public final long A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABLandingPageInteractiveEvent(ZonedValue zonedValue, String str, String str2, String str3, int i, int i2, long j, long j2, long j3, boolean z) {
        super(EnumC61218RhI.IAB_LANDING_PAGE_INTERACTIVE, str, j, j2);
        C14360o3.A0B(str, 1);
        this.A02 = j;
        this.A07 = j2;
        this.A04 = zonedValue;
        this.A06 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A08 = z;
        this.A05 = str3;
        this.A03 = j3;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A03);
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABLandingPageInteractiveEvent{");
        A0s.append(", initialLandUrl='");
        char A00 = AbstractC58319PtB.A00(this.A06, A0s);
        A0s.append(", screenWidth=");
        A0s.append(this.A01);
        A0s.append(", pageContentWidth=");
        A0s.append(this.A00);
        A0s.append(", isCookieLoadComplete=");
        A0s.append(this.A08);
        AbstractC58321PtD.A1J(this, A0s, A00);
        A0s.append(this.A07);
        A0s.append(", clickSource=");
        A0s.append(this.A05);
        A0s.append(", userClickTs=");
        A0s.append(this.A03);
        String A0R = AbstractC167027dH.A0R(A0s);
        C14360o3.A07(A0R);
        return A0R;
    }
}
