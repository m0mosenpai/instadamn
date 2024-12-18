package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC64537TIt;
import X.C3U5;
import X.C63471SlC;
import X.RMJ;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(1);
    public final long A00;
    public final AbstractC64537TIt A01;
    public final AbstractC64537TIt A02;
    public final AbstractC64537TIt A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        if (this.A00 != zzqVar.A00 || !SSI.A01(this.A01, zzqVar.A01) || !SSI.A01(this.A02, zzqVar.A02)) {
            return false;
        }
        return SSI.A00(this.A03, zzqVar.A03);
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0C(Long.valueOf(this.A00), this.A01, this.A02, this.A03);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.A00;
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A08(parcel, 1, j);
        boolean A1R = AbstractC58319PtB.A1R(parcel, this.A01.A03());
        AbstractC128825rw.A0F(parcel, this.A02.A03(), 3, A1R);
        AbstractC128825rw.A0F(parcel, this.A03.A03(), 4, A1R);
        AbstractC128825rw.A06(parcel, A04);
    }

    public zzq(byte[] bArr, byte[] bArr2, byte[] bArr3, long j) {
        RMJ A0f = AbstractC58321PtD.A0f(bArr);
        RMJ A0f2 = AbstractC58321PtD.A0f(bArr2);
        RMJ A0f3 = AbstractC58321PtD.A0f(bArr3);
        this.A00 = j;
        C3U5.A02(A0f);
        this.A01 = A0f;
        C3U5.A02(A0f2);
        this.A02 = A0f2;
        C3U5.A02(A0f3);
        this.A03 = A0f3;
    }
}
