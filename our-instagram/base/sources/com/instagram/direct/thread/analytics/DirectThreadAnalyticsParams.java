package com.instagram.direct.thread.analytics;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.EnumC1579076z;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class DirectThreadAnalyticsParams extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(89);
    public final long A00;
    public final long A01;
    public final EnumC1579076z A02;

    public DirectThreadAnalyticsParams(EnumC1579076z enumC1579076z, long j, long j2) {
        C14360o3.A0B(enumC1579076z, 2);
        this.A01 = j;
        this.A02 = enumC1579076z;
        this.A00 = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectThreadAnalyticsParams) {
                DirectThreadAnalyticsParams directThreadAnalyticsParams = (DirectThreadAnalyticsParams) obj;
                if (this.A01 != directThreadAnalyticsParams.A01 || this.A02 != directThreadAnalyticsParams.A02 || this.A00 != directThreadAnalyticsParams.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectThreadAnalyticsParams(threadSize=");
        sb.append(this.A01);
        sb.append(", directSource=");
        sb.append(this.A02);
        sb.append(", consistentThreadFbId=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A02.name());
        parcel.writeLong(this.A00);
    }

    public final int hashCode() {
        long j = this.A01;
        int hashCode = ((((int) (j ^ (j >>> 32))) * 31) + this.A02.hashCode()) * 31;
        long j2 = this.A00;
        return hashCode + ((int) (j2 ^ (j2 >>> 32)));
    }
}
