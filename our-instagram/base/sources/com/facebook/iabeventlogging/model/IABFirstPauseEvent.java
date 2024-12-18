package com.facebook.iabeventlogging.model;

import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.EnumC61218RhI;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class IABFirstPauseEvent extends IABEvent {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final ZonedValue A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final ArrayList A0J;
    public final boolean A0K;
    public final boolean A0L;

    public IABFirstPauseEvent(ZonedValue zonedValue, String str, String str2, String str3, String str4, ArrayList arrayList, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z, boolean z2) {
        super(EnumC61218RhI.IAB_FIRST_PAUSE, str, j, j2);
        this.A07 = j10;
        this.A08 = j11;
        this.A0D = j3;
        this.A0E = j4;
        this.A05 = j5;
        this.A0C = j6;
        this.A06 = j7;
        this.A09 = j8;
        this.A0A = j9;
        this.A04 = j;
        this.A0J = arrayList;
        this.A0F = zonedValue == null ? new ZonedValue(ZonePolicy.A05, "") : zonedValue;
        this.A0I = str2;
        this.A0G = str3;
        this.A00 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A0K = z;
        this.A0H = str4;
        this.A0L = z2;
        this.A0B = j12;
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABFirstPauseEvent{");
        A0s.append("userClickTs=");
        A0s.append(this.A0D);
        A0s.append(", webRequestStartedTs=");
        A0s.append(this.A0E);
        A0s.append(", browserOpenTs=");
        A0s.append(this.A05);
        A0s.append(", scrollReadyTs=");
        A0s.append(this.A0C);
        A0s.append(", landingPageDomContentLoadedTs=");
        A0s.append(this.A06);
        A0s.append(", landingPageLoadedTs=");
        A0s.append(this.A09);
        A0s.append(", landingPageViewEndedTs=");
        A0s.append(this.A0A);
        A0s.append(", browserCloseTs=");
        A0s.append(this.A04);
        A0s.append(", backgroundTimePairs=");
        A0s.append(this.A0J);
        A0s.append(", initialLandUrl='");
        char A00 = AbstractC58319PtB.A00(this.A0I, A0s);
        A0s.append(", clickSource='");
        A0s.append(this.A0G);
        A0s.append(A00);
        A0s.append(", dismissMethod=");
        A0s.append(this.A00);
        A0s.append(", landingPageStatusCode=");
        A0s.append(this.A02);
        A0s.append(", sslErrorCode=");
        A0s.append(this.A03);
        A0s.append(", interactionCount=");
        A0s.append(this.A01);
        AbstractC58321PtD.A1J(this, A0s, A00);
        AbstractC58318PtA.A1L(this, A0s);
        A0s.append(", isInitialUrlIsOpenApp=");
        A0s.append(this.A0K);
        A0s.append(", deepLinkUrl=");
        A0s.append(this.A0H);
        A0s.append(", shouldUseLEDesign=");
        A0s.append(this.A0L);
        A0s.append(", landingPageFirstContentfulPaintTs=");
        A0s.append(this.A07);
        A0s.append(", landingPageLargestContentfulPaintTs=");
        A0s.append(this.A08);
        A0s.append(", maxInteractionDelayMs=");
        A0s.append(this.A0B);
        return AbstractC167027dH.A0R(A0s);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A0D);
        parcel.writeLong(this.A0E);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A0C);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A09);
        parcel.writeLong(this.A0A);
        parcel.writeList(this.A0J);
        parcel.writeParcelable(this.A0F, i);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A0K ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0H);
        parcel.writeByte(this.A0L ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A0B);
    }
}
