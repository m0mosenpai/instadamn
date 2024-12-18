package com.google.android.gms.internal.location;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(32);
    public final String A00;
    public final double A01;
    public final double A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final short A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof zzbg)) {
                zzbg zzbgVar = (zzbg) obj;
                if (this.A03 != zzbgVar.A03 || this.A01 != zzbgVar.A01 || this.A02 != zzbgVar.A02 || this.A08 != zzbgVar.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A01);
        return ((AbstractC166997dE.A00(AbstractC167007dF.A07(Double.doubleToLongBits(this.A02), (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31), this.A03) + this.A08) * 31) + this.A04;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        if (this.A08 != 1) {
            str = null;
        } else {
            str = "CIRCLE";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.A00.replaceAll("\\p{C}", "?"), Integer.valueOf(this.A04), Double.valueOf(this.A01), Double.valueOf(this.A02), Float.valueOf(this.A03), Integer.valueOf(this.A05 / 1000), Integer.valueOf(this.A06), Long.valueOf(this.A07));
    }

    public zzbg(String str, double d, double d2, float f, int i, int i2, int i3, long j, short s) {
        if (str != null && str.length() <= 100) {
            if (f > 0.0f) {
                if (d <= 90.0d && d >= -90.0d) {
                    if (d2 <= 180.0d && d2 >= -180.0d) {
                        int i4 = i & 7;
                        if (i4 != 0) {
                            this.A08 = s;
                            this.A00 = str;
                            this.A01 = d;
                            this.A02 = d2;
                            this.A03 = f;
                            this.A07 = j;
                            this.A04 = i4;
                            this.A05 = i2;
                            this.A06 = i3;
                            return;
                        }
                        throw AbstractC166987dD.A12(AbstractC58320PtC.A12("No supported transition specified: ", AbstractC58318PtA.A0q(46), i));
                    }
                    StringBuilder A0q = AbstractC58318PtA.A0q(43);
                    A0q.append("invalid longitude: ");
                    A0q.append(d2);
                    throw AbstractC166987dD.A12(A0q.toString());
                }
                StringBuilder A0q2 = AbstractC58318PtA.A0q(42);
                A0q2.append("invalid latitude: ");
                A0q2.append(d);
                throw AbstractC166987dD.A12(A0q2.toString());
            }
            StringBuilder A0q3 = AbstractC58318PtA.A0q(31);
            A0q3.append("invalid radius: ");
            A0q3.append(f);
            throw AbstractC166987dD.A12(A0q3.toString());
        }
        throw AbstractC166987dD.A12(AbstractC58321PtD.A0w("requestId is null or too long: ", str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC58322PtE.A1D(parcel, this.A00);
        AbstractC128825rw.A08(parcel, 2, this.A07);
        short s = this.A08;
        parcel.writeInt(262147);
        parcel.writeInt(s);
        double d = this.A01;
        parcel.writeInt(524292);
        parcel.writeDouble(d);
        double d2 = this.A02;
        parcel.writeInt(524293);
        parcel.writeDouble(d2);
        AbstractC128825rw.A04(parcel, this.A03, 6);
        AbstractC128825rw.A07(parcel, 7, this.A04);
        AbstractC128825rw.A07(parcel, 8, this.A05);
        AbstractC128825rw.A07(parcel, 9, this.A06);
        AbstractC128825rw.A06(parcel, A04);
    }
}
