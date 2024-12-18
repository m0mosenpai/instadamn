package com.google.android.gms.location.places;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C62715SNe;
import X.C63471SlC;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* loaded from: classes10.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(55);
    public final String A00;
    public final String A01;
    public final int A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        if (!SSI.A01(this.A01, placeReport.A01) || !SSI.A01(this.A00, placeReport.A00)) {
            return false;
        }
        return SSI.A00(this.A03, placeReport.A03);
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(this.A01, this.A00, this.A03);
    }

    public final String toString() {
        C62715SNe c62715SNe = new C62715SNe(this);
        c62715SNe.A00(this.A01, "placeId");
        c62715SNe.A00(this.A00, "tag");
        String str = this.A03;
        if (!"unknown".equals(str)) {
            c62715SNe.A00(str, CacheBehaviorLogger.SOURCE);
        }
        return c62715SNe.toString();
    }

    public PlaceReport(int i, String str, String str2, String str3) {
        this.A02 = i;
        this.A01 = str;
        this.A00 = str2;
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A02);
        AbstractC128825rw.A0B(parcel, this.A01);
        AbstractC128825rw.A0C(parcel, this.A00, 3, false);
        AbstractC58322PtE.A1F(parcel, this.A03, A04, false);
    }
}
