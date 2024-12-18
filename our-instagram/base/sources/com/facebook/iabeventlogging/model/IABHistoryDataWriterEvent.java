package com.facebook.iabeventlogging.model;

import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.EnumC61218RhI;
import android.os.Parcel;

/* loaded from: classes10.dex */
public class IABHistoryDataWriterEvent extends IABEvent {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public IABHistoryDataWriterEvent(String str, String str2, String str3, long j, long j2, long j3, long j4) {
        super(EnumC61218RhI.IAB_HISTORY_SAVE_URL, str, j, j2);
        this.A03 = str2;
        this.A01 = j3;
        this.A00 = j4;
        this.A02 = str3;
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABDropPixelsEvent{");
        A0s.append("url='");
        char A00 = AbstractC58319PtB.A00(this.A03, A0s);
        A0s.append(", startTs='");
        A0s.append(this.A01);
        A0s.append(A00);
        A0s.append(", endTs='");
        A0s.append(this.A00);
        A0s.append(A00);
        A0s.append(", title='");
        A0s.append(this.A02);
        A0s.append(A00);
        AbstractC58321PtD.A1J(this, A0s, A00);
        AbstractC58318PtA.A1L(this, A0s);
        return AbstractC167027dH.A0R(A0s);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
    }
}
