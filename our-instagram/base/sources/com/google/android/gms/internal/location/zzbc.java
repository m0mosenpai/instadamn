package com.google.android.gms.internal.location;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.C63471SlC;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final List A0B = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(30);
    public long A00;
    public LocationRequest A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbc)) {
            return false;
        }
        zzbc zzbcVar = (zzbc) obj;
        if (!SSI.A01(this.A01, zzbcVar.A01) || !SSI.A01(this.A05, zzbcVar.A05) || !SSI.A01(this.A02, zzbcVar.A02) || this.A06 != zzbcVar.A06 || this.A07 != zzbcVar.A07 || this.A08 != zzbcVar.A08 || !SSI.A01(this.A03, zzbcVar.A03) || this.A09 != zzbcVar.A09 || this.A0A != zzbcVar.A0A) {
            return false;
        }
        return SSI.A00(this.A04, zzbcVar.A04);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A01);
        String str = this.A02;
        if (str != null) {
            A1C.append(" tag=");
            A1C.append(str);
        }
        String str2 = this.A03;
        if (str2 != null) {
            A1C.append(" moduleId=");
            A1C.append(str2);
        }
        String str3 = this.A04;
        if (str3 != null) {
            A1C.append(" contextAttributionTag=");
            A1C.append(str3);
        }
        A1C.append(" hideAppOps=");
        A1C.append(this.A06);
        A1C.append(" clients=");
        A1C.append(this.A05);
        A1C.append(" forceCoarseLocation=");
        A1C.append(this.A07);
        if (this.A08) {
            A1C.append(" exemptFromBackgroundThrottle");
        }
        if (this.A09) {
            A1C.append(" locationSettingsIgnored");
        }
        if (this.A0A) {
            A1C.append(" inaccurateLocationsDelayed");
        }
        return A1C.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0A(parcel, this.A01, 1, i, false);
        AbstractC128825rw.A0E(parcel, this.A05, 5, false);
        AbstractC128825rw.A0C(parcel, this.A02, 6, false);
        AbstractC128825rw.A09(parcel, 7, this.A06);
        AbstractC128825rw.A09(parcel, 8, this.A07);
        AbstractC128825rw.A09(parcel, 9, this.A08);
        AbstractC128825rw.A0C(parcel, this.A03, 10, false);
        AbstractC128825rw.A09(parcel, 11, this.A09);
        AbstractC128825rw.A09(parcel, 12, this.A0A);
        AbstractC128825rw.A0C(parcel, this.A04, 13, false);
        AbstractC128825rw.A08(parcel, 14, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }
}
