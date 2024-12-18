package com.facebook.advancedcryptotransport.model;

import X.AbstractC166987dD;
import X.AbstractC167027dH;
import X.AbstractC25235BEs;
import X.AbstractC37302Gc3;
import X.AbstractC43593JPy;
import X.AbstractC58318PtA;
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
public class PeerDevice implements Parcelable {
    public static volatile Integer A0E;
    public static final Parcelable.Creator CREATOR = Py5.A00(87);
    public final Double A00;
    public final Double A01;
    public final Integer A02;
    public final Long A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final Set A0C;
    public final boolean A0D;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerDevice) {
                PeerDevice peerDevice = (PeerDevice) obj;
                if (!C14360o3.A0K(this.A06, peerDevice.A06) || !C14360o3.A0K(this.A03, peerDevice.A03) || !C14360o3.A0K(this.A07, peerDevice.A07) || !C14360o3.A0K(this.A08, peerDevice.A08) || this.A0D != peerDevice.A0D || !C14360o3.A0K(this.A04, peerDevice.A04) || !C14360o3.A0K(this.A00, peerDevice.A00) || !C14360o3.A0K(this.A09, peerDevice.A09) || !C14360o3.A0K(this.A01, peerDevice.A01) || !C14360o3.A0K(this.A0A, peerDevice.A0A) || !C14360o3.A0K(this.A0B, peerDevice.A0B) || A00() != peerDevice.A00() || !C14360o3.A0K(this.A05, peerDevice.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00() {
        if (this.A0C.contains("platform")) {
            return this.A02;
        }
        if (A0E == null) {
            synchronized (this) {
                if (A0E == null) {
                    A0E = C05F.A00;
                }
            }
        }
        return A0E;
    }

    public final int hashCode() {
        int intValue;
        int A02 = (((((((((((((((((((AbstractC63311ShH.A02(this.A06) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A07)) * 31) + AbstractC25235BEs.A06(this.A08)) * 31) + AbstractC58322PtE.A02(this.A0D ? 1 : 0)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC25235BEs.A06(this.A09)) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A0A)) * 31) + AbstractC25235BEs.A06(this.A0B);
        if (A00() == null) {
            intValue = -1;
        } else {
            intValue = A00().intValue();
        }
        return (((A02 * 31) + intValue) * 31) + AbstractC25235BEs.A06(this.A05);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A06, 0, 1);
        AbstractC58318PtA.A1G(parcel, this.A03);
        parcel.writeString(this.A07);
        AbstractC58322PtE.A1E(parcel, this.A08, 0, 1);
        parcel.writeInt(this.A0D ? 1 : 0);
        AbstractC58318PtA.A1G(parcel, this.A04);
        Double d = this.A00;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            AbstractC58322PtE.A1C(parcel, d, 1);
        }
        AbstractC58322PtE.A1E(parcel, this.A09, 0, 1);
        Double d2 = this.A01;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            AbstractC58322PtE.A1C(parcel, d2, 1);
        }
        AbstractC58322PtE.A1E(parcel, this.A0A, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A0B, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        AbstractC58318PtA.A1G(parcel, this.A05);
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A0C);
        while (A0h.hasNext()) {
            AbstractC37302Gc3.A0p(parcel, A0h);
        }
    }

    public PeerDevice(Parcel parcel) {
        if (AbstractC58322PtE.A07(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A03 = AbstractC58322PtE.A0j(parcel);
        this.A07 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A0D = AbstractC43593JPy.A1Y(parcel.readInt());
        this.A04 = AbstractC58322PtE.A0j(parcel);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? AbstractC58322PtE.A0i(parcel, 4) : null;
        this.A05 = AbstractC58322PtE.A0j(parcel);
        HashSet A1H = AbstractC166987dD.A1H();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A1H.add(parcel.readString());
        }
        this.A0C = Collections.unmodifiableSet(A1H);
    }
}
