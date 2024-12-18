package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(58);
    public int A01 = 102;
    public long A03 = 3600000;
    public long A04 = 600000;
    public boolean A07 = false;
    public long A05 = Long.MAX_VALUE;
    public int A02 = Integer.MAX_VALUE;
    public float A00 = 0.0f;
    public long A06 = 0;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationRequest) {
                LocationRequest locationRequest = (LocationRequest) obj;
                if (this.A01 == locationRequest.A01) {
                    long j = this.A03;
                    long j2 = locationRequest.A03;
                    if (j == j2 && this.A04 == locationRequest.A04 && this.A07 == locationRequest.A07 && this.A05 == locationRequest.A05 && this.A02 == locationRequest.A02 && this.A00 == locationRequest.A00) {
                        long j3 = this.A06;
                        if (j3 < j) {
                            j3 = j;
                        }
                        long j4 = locationRequest.A06;
                        if (j4 < j2) {
                            j4 = j2;
                        }
                        if (j3 == j4) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void A00(long j) {
        if (j >= 0) {
            this.A03 = j;
            if (!this.A07) {
                this.A04 = (long) (j / 6.0d);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A12(AbstractC58320PtC.A13("invalid interval: ", AbstractC58318PtA.A0q(38), j));
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0C(Integer.valueOf(this.A01), Long.valueOf(this.A03), Float.valueOf(this.A00), Long.valueOf(this.A06));
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Request[");
        int i = this.A01;
        if (i != 100) {
            if (i != 102) {
                if (i != 104) {
                    if (i != 105) {
                        str = "???";
                    } else {
                        str = "PRIORITY_NO_POWER";
                    }
                } else {
                    str = "PRIORITY_LOW_POWER";
                }
            } else {
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
            }
        } else {
            str = "PRIORITY_HIGH_ACCURACY";
        }
        A1C.append(str);
        if (i != 105) {
            A1C.append(" requested=");
            A1C.append(this.A03);
            A1C.append("ms");
        }
        A1C.append(" fastest=");
        A1C.append(this.A04);
        A1C.append("ms");
        long j = this.A06;
        if (j > this.A03) {
            A1C.append(" maxWait=");
            A1C.append(j);
            A1C.append("ms");
        }
        float f = this.A00;
        if (f > 0.0f) {
            A1C.append(" smallestDisplacement=");
            A1C.append(f);
            A1C.append("m");
        }
        long j2 = this.A05;
        if (j2 != Long.MAX_VALUE) {
            long elapsedRealtime = j2 - SystemClock.elapsedRealtime();
            A1C.append(" expireIn=");
            A1C.append(elapsedRealtime);
            A1C.append("ms");
        }
        int i2 = this.A02;
        if (i2 != Integer.MAX_VALUE) {
            A1C.append(" num=");
            A1C.append(i2);
        }
        return AbstractC58320PtC.A14(A1C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A01);
        AbstractC128825rw.A08(parcel, 2, this.A03);
        AbstractC128825rw.A08(parcel, 3, this.A04);
        AbstractC128825rw.A09(parcel, 4, this.A07);
        AbstractC128825rw.A08(parcel, 5, this.A05);
        AbstractC128825rw.A07(parcel, 6, this.A02);
        AbstractC128825rw.A04(parcel, this.A00, 7);
        AbstractC128825rw.A08(parcel, 8, this.A06);
        AbstractC128825rw.A06(parcel, A04);
    }
}
