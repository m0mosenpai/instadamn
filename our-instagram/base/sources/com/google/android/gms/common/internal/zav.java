package com.google.android.gms.common.internal;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63474SlF;
import X.SSI;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(40);
    public final int A00;
    public final IBinder A01;
    public final ConnectionResult A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        IAccountAccessor A00;
        IAccountAccessor A002;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof zav) {
                    zav zavVar = (zav) obj;
                    if (this.A02.equals(zavVar.A02)) {
                        IBinder iBinder = this.A01;
                        if (iBinder == null) {
                            A00 = null;
                        } else {
                            A00 = AccountAccessor.A00(iBinder);
                        }
                        IBinder iBinder2 = zavVar.A01;
                        if (iBinder2 == null) {
                            A002 = null;
                        } else {
                            A002 = AccountAccessor.A00(iBinder2);
                        }
                        if (SSI.A01(A00, A002)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public zav(IBinder iBinder, ConnectionResult connectionResult, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = iBinder;
        this.A02 = connectionResult;
        this.A03 = z;
        this.A04 = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A03(this.A01, parcel, 2);
        AbstractC128825rw.A0A(parcel, this.A02, 3, i, false);
        AbstractC128825rw.A09(parcel, 4, this.A03);
        AbstractC128825rw.A09(parcel, 5, this.A04);
        AbstractC128825rw.A06(parcel, A04);
    }
}
