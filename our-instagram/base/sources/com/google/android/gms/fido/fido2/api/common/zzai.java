package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC64537TIt;
import X.C63474SlF;
import X.SSI;
import X.SSJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(70);
    public final AbstractC64537TIt A00;
    public final AbstractC64537TIt A01;
    public final AbstractC64537TIt A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        if (!SSI.A01(this.A00, zzaiVar.A00) || !SSI.A01(this.A01, zzaiVar.A01) || !SSI.A01(this.A02, zzaiVar.A02) || this.A03 != zzaiVar.A03) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0C(this.A00, this.A01, this.A02, Integer.valueOf(this.A03));
    }

    public final String toString() {
        String A00 = SSJ.A00(AbstractC58322PtE.A1Z(this.A00));
        String A002 = SSJ.A00(AbstractC58322PtE.A1Z(this.A01));
        String A003 = SSJ.A00(AbstractC58322PtE.A1Z(this.A02));
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HmacSecretExtension{coseKeyAgreement=");
        A1C.append(A00);
        A1C.append(", saltEnc=");
        A1C.append(A002);
        A1C.append(", saltAuth=");
        A1C.append(A003);
        A1C.append(", getPinUvAuthProtocol=");
        A1C.append(this.A03);
        return AbstractC166997dE.A0x("}", A1C);
    }

    public zzai(AbstractC64537TIt abstractC64537TIt, AbstractC64537TIt abstractC64537TIt2, AbstractC64537TIt abstractC64537TIt3, int i) {
        this.A00 = abstractC64537TIt;
        this.A01 = abstractC64537TIt2;
        this.A02 = abstractC64537TIt3;
        this.A03 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0F(parcel, AbstractC58322PtE.A1Z(this.A00), 1, false);
        AbstractC128825rw.A0F(parcel, AbstractC58322PtE.A1Z(this.A01), 2, false);
        AbstractC128825rw.A0F(parcel, AbstractC58322PtE.A1Z(this.A02), 3, false);
        AbstractC58322PtE.A1B(parcel, this.A03, A04);
    }
}
