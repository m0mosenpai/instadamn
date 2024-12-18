package com.facebook.iabeventlogging.model;

import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C14360o3;
import X.C51u;
import X.EnumC61218RhI;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class IABIPAMatchKeyEvent extends IABEvent {
    public final long A00;
    public final long A01;
    public final String A02;
    public final C51u A03;
    public final long A04;
    public final long A05;
    public final String A06;

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        C51u c51u = this.A03;
        parcel.writeString((String) c51u.A00);
        parcel.writeString((String) c51u.A01);
        parcel.writeString((String) c51u.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
    }

    public IABIPAMatchKeyEvent(String str, String str2, C51u c51u, long j, long j2, long j3, long j4) {
        super(EnumC61218RhI.IAB_IPA_MATCH_KEY, str, j, j2);
        this.A06 = str;
        this.A05 = j;
        this.A04 = j2;
        this.A03 = c51u;
        this.A01 = j3;
        this.A00 = j4;
        this.A02 = str2;
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABOpenSecureInfoPopupEvent{");
        A0s.append("type=");
        A0s.append(super.A02);
        A0s.append(", iabSessionId='");
        AbstractC58319PtB.A1K(A0s, this.A06);
        A0s.append(", eventTs=");
        AbstractC58319PtB.A18(this.A05, A0s);
        A0s.append(this.A04);
        A0s.append(", firstMatchKey=");
        C51u c51u = this.A03;
        A0s.append((String) c51u.A00);
        A0s.append(", secondMatchKey=");
        A0s.append((String) c51u.A01);
        A0s.append(", thirdMatchKey=");
        A0s.append((String) c51u.A02);
        A0s.append(", elapsedTime=");
        A0s.append(this.A01);
        A0s.append(", adId=");
        A0s.append(this.A00);
        A0s.append(", clickId=");
        A0s.append(this.A02);
        String A0R = AbstractC167027dH.A0R(A0s);
        C14360o3.A07(A0R);
        return A0R;
    }
}
