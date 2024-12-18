package com.google.android.gms.internal.clearcut;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.C63471SlC;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(27);
    public final int A00;
    public final String A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzr) {
                zzr zzrVar = (zzr) obj;
                if (!SSI.A01(this.A04, zzrVar.A04) || this.A03 != zzrVar.A03 || this.A00 != zzrVar.A00 || !SSI.A01(this.A01, zzrVar.A01) || !SSI.A01(this.A05, zzrVar.A05) || !SSI.A01(this.A06, zzrVar.A06) || this.A07 != zzrVar.A07 || this.A08 != zzrVar.A08 || this.A02 != zzrVar.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, Integer.valueOf(this.A03), Integer.valueOf(this.A00), this.A01, this.A05, this.A06, Boolean.valueOf(this.A07), Boolean.valueOf(this.A08), Integer.valueOf(this.A02)});
    }

    public zzr(String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2) {
        this.A04 = str;
        this.A03 = i;
        this.A00 = i2;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = z;
        this.A01 = str4;
        this.A08 = z2;
        this.A02 = i3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PlayLoggerContext[");
        A1C.append("package=");
        A1C.append(this.A04);
        A1C.append(',');
        A1C.append("packageVersionCode=");
        A1C.append(this.A03);
        A1C.append(',');
        A1C.append("logSource=");
        A1C.append(this.A00);
        A1C.append(',');
        A1C.append("logSourceName=");
        A1C.append(this.A01);
        A1C.append(',');
        A1C.append("uploadAccount=");
        A1C.append(this.A05);
        A1C.append(',');
        A1C.append("loggingId=");
        A1C.append(this.A06);
        A1C.append(',');
        A1C.append("logAndroidId=");
        A1C.append(this.A07);
        A1C.append(',');
        A1C.append("isAnonymous=");
        A1C.append(this.A08);
        A1C.append(',');
        A1C.append("qosTier=");
        A1C.append(this.A02);
        return AbstractC58319PtB.A0w(A1C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A04);
        AbstractC128825rw.A07(parcel, 3, this.A03);
        AbstractC128825rw.A07(parcel, 4, this.A00);
        AbstractC128825rw.A0C(parcel, this.A05, 5, false);
        AbstractC128825rw.A0C(parcel, this.A06, 6, false);
        AbstractC128825rw.A09(parcel, 7, this.A07);
        AbstractC128825rw.A0C(parcel, this.A01, 8, false);
        AbstractC128825rw.A09(parcel, 9, this.A08);
        AbstractC128825rw.A07(parcel, 10, this.A02);
        AbstractC128825rw.A06(parcel, A04);
    }
}
