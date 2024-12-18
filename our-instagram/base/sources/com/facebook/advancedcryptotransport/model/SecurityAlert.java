package com.facebook.advancedcryptotransport.model;

import X.AbstractC166987dD;
import X.AbstractC167027dH;
import X.AbstractC25235BEs;
import X.AbstractC37302Gc3;
import X.AbstractC37304Gc5;
import X.AbstractC43591JPw;
import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C05F;
import X.C14360o3;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes10.dex */
public class SecurityAlert implements Parcelable {
    public static volatile Integer A07;
    public static volatile Integer A08;
    public static final Parcelable.Creator CREATOR = Py5.A00(88);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final Set A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SecurityAlert) {
                SecurityAlert securityAlert = (SecurityAlert) obj;
                if (!C14360o3.A0K(this.A03, securityAlert.A03) || A00() != securityAlert.A00() || !C14360o3.A0K(this.A01, securityAlert.A01) || !C14360o3.A0K(this.A04, securityAlert.A04) || !C14360o3.A0K(this.A05, securityAlert.A05) || A01() != securityAlert.A01()) {
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00() {
        if (this.A06.contains(AbstractC43591JPw.A00(907))) {
            return this.A00;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = C05F.A00;
                }
            }
        }
        return A07;
    }

    public final Integer A01() {
        if (this.A06.contains("platform")) {
            return this.A02;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = C05F.A00;
                }
            }
        }
        return A08;
    }

    public final int hashCode() {
        int intValue;
        int A02 = AbstractC63311ShH.A02(this.A03);
        int i = -1;
        if (A00() == null) {
            intValue = -1;
        } else {
            intValue = A00().intValue();
        }
        int A06 = (((((((A02 * 31) + intValue) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A05);
        if (A01() != null) {
            i = A01().intValue();
        }
        return (A06 * 31) + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58318PtA.A1G(parcel, this.A03);
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
        AbstractC58318PtA.A1H(parcel, this.A01);
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A05, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A06);
        while (A0h.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0h);
        }
    }

    public SecurityAlert(Parcel parcel) {
        AbstractC58321PtD.A1O(this);
        this.A03 = AbstractC58322PtE.A0j(parcel);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = AbstractC58322PtE.A0i(parcel, 4);
        }
        this.A01 = AbstractC37304Gc5.A0U(parcel);
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? AbstractC58322PtE.A0i(parcel, 4) : null;
        HashSet A1H = AbstractC166987dD.A1H();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A1H.add(parcel.readString());
        }
        this.A06 = Collections.unmodifiableSet(A1H);
    }
}
