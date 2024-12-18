package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC37301Gc2;
import X.AbstractC58319PtB;
import X.AbstractC64537TIt;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(92);
    public final AbstractC64537TIt A00;
    public final AbstractC64537TIt A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        if (!SSI.A01(this.A00, zzfVar.A00)) {
            return false;
        }
        return SSI.A00(this.A01, zzfVar.A01);
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A00, this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] A03;
        AbstractC64537TIt abstractC64537TIt = this.A00;
        int A04 = AbstractC58319PtB.A04(parcel);
        byte[] bArr = null;
        if (abstractC64537TIt == null) {
            A03 = null;
        } else {
            A03 = abstractC64537TIt.A03();
        }
        AbstractC128825rw.A0F(parcel, A03, 1, false);
        AbstractC64537TIt abstractC64537TIt2 = this.A01;
        if (abstractC64537TIt2 != null) {
            bArr = abstractC64537TIt2.A03();
        }
        AbstractC128825rw.A0F(parcel, bArr, 2, false);
        AbstractC128825rw.A06(parcel, A04);
    }

    public zzf(AbstractC64537TIt abstractC64537TIt, AbstractC64537TIt abstractC64537TIt2) {
        this.A00 = abstractC64537TIt;
        this.A01 = abstractC64537TIt2;
    }
}
