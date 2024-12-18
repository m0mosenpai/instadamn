package com.instagram.rtc.analytics;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import java.util.UUID;

/* loaded from: classes9.dex */
public final class RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId extends RtcCallFunnelSessionId {
    public static final Parcelable.Creator CREATOR = new C37324GcR(41);
    public final ParcelUuid A00;

    public RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId(ParcelUuid parcelUuid) {
        C14360o3.A0B(parcelUuid, 1);
        this.A00 = parcelUuid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId) && C14360o3.A0K(this.A00, ((RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallFunnelLoggerImplId(id=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId() {
        this(new ParcelUuid(UUID.randomUUID()));
    }
}
