package com.instagram.rtc.analytics;

import X.AbstractC25235BEs;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.rtc.RtcCallFunnelSessionId;

/* loaded from: classes9.dex */
public final class RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString extends RtcCallFunnelSessionId {
    public static final Parcelable.Creator CREATOR = new C37324GcR(42);
    public final String A00;

    public RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString) && C14360o3.A0K(this.A00, ((RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("RtcCallFunnelLoggerImplIdFromString(id=", this.A00);
    }
}
