package com.facebook.iabeventlogging.model;

import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import X.EnumC61218RhI;
import android.os.Parcel;

/* loaded from: classes10.dex */
public class IABHistoryEvent extends IABEvent {
    public final Long A00;
    public final Long A01;
    public final Long A02;
    public final boolean A03;
    public final String[] A04;

    public IABHistoryEvent(Long l, Long l2, Long l3, String str, String[] strArr, long j, long j2, boolean z) {
        super(EnumC61218RhI.IAB_HISTORY, str, j, j2);
        this.A04 = strArr;
        this.A02 = l;
        this.A01 = l2;
        this.A00 = l3;
        this.A03 = z;
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABDropPixelsEvent{");
        A0s.append("urls='");
        A0s.append(this.A04);
        A0s.append('\'');
        A0s.append(", startTs='");
        A0s.append(this.A02);
        A0s.append('\'');
        A0s.append(", fullyLoadedTs='");
        A0s.append(this.A00);
        A0s.append('\'');
        A0s.append(", interactiveTs='");
        A0s.append(this.A01);
        A0s.append('\'');
        A0s.append(", isJsNavigation='");
        A0s.append(this.A03);
        A0s.append('\'');
        AbstractC58321PtD.A1J(this, A0s, '\'');
        AbstractC58318PtA.A1L(this, A0s);
        return AbstractC167027dH.A0R(A0s);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long longValue;
        long longValue2;
        super.writeToParcel(parcel, i);
        parcel.writeStringArray(this.A04);
        Long l = this.A02;
        long j = -1;
        if (l == null) {
            longValue = -1;
        } else {
            longValue = l.longValue();
        }
        parcel.writeLong(longValue);
        Long l2 = this.A01;
        if (l2 == null) {
            longValue2 = -1;
        } else {
            longValue2 = l2.longValue();
        }
        parcel.writeLong(longValue2);
        Long l3 = this.A00;
        if (l3 != null) {
            j = l3.longValue();
        }
        parcel.writeLong(j);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
