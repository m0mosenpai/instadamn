package com.facebookpay.logging;

import X.AbstractC166987dD;
import X.AbstractC25235BEs;
import X.AbstractC37302Gc3;
import X.AbstractC58322PtE;
import X.AbstractC58442PvL;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C62697SMl;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes10.dex */
public class FBPayLoggerData implements Parcelable {
    public static volatile String A09;
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(12);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Set A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayLoggerData) {
                FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) obj;
                if (!C14360o3.A0K(this.A05, fBPayLoggerData.A05) || !C14360o3.A0K(this.A00, fBPayLoggerData.A00) || !C14360o3.A0K(this.A01, fBPayLoggerData.A01) || !C14360o3.A0K(this.A06, fBPayLoggerData.A06) || !C14360o3.A0K(this.A02, fBPayLoggerData.A02) || !C14360o3.A0K(this.A03, fBPayLoggerData.A03) || !C14360o3.A0K(A00(), fBPayLoggerData.A00()) || !C14360o3.A0K(this.A04, fBPayLoggerData.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        if (this.A08.contains("sessionId")) {
            return this.A07;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = AbstractC58442PvL.A02();
                }
            }
        }
        return A09;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC63311ShH.A02(this.A05) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A06)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(A00())) * 31) + AbstractC25235BEs.A06(this.A04);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A05, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A00, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A01, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A06, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A02, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A03, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A07, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A08);
        while (A0h.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0h);
        }
    }

    public FBPayLoggerData(Parcel parcel) {
        if (AbstractC58322PtE.A07(parcel, this) == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A07 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A04 = AbstractC58322PtE.A0n(parcel);
        HashSet A1H = AbstractC166987dD.A1H();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A1H.add(parcel.readString());
        }
        this.A08 = Collections.unmodifiableSet(A1H);
    }

    public FBPayLoggerData(C62697SMl c62697SMl) {
        this.A05 = null;
        this.A00 = c62697SMl.A00;
        this.A01 = c62697SMl.A01;
        this.A06 = null;
        this.A02 = c62697SMl.A02;
        this.A03 = c62697SMl.A03;
        this.A07 = c62697SMl.A04;
        this.A04 = c62697SMl.A05;
        this.A08 = Collections.unmodifiableSet(c62697SMl.A06);
    }
}
