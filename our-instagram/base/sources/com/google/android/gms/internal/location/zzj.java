package com.google.android.gms.internal.location;

import X.AbstractC128825rw;
import X.AbstractC166997dE;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C63471SlC;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzo;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class zzj extends AbstractSafeParcelable {
    public zzo A00;
    public String A01;
    public List A02;
    public static final List A04 = Collections.emptyList();
    public static final zzo A03 = new zzo();
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(33);

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        if (!SSI.A01(this.A00, zzjVar.A00) || !SSI.A01(this.A02, zzjVar.A02)) {
            return false;
        }
        return SSI.A00(this.A01, zzjVar.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A00);
        String valueOf2 = String.valueOf(this.A02);
        String str = this.A01;
        StringBuilder A15 = AbstractC58320PtC.A15(str, AbstractC58319PtB.A05(valueOf) + 77 + AbstractC58319PtB.A05(valueOf2));
        A15.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        A15.append(valueOf);
        A15.append(", clients=");
        A15.append(valueOf2);
        A15.append(", tag='");
        A15.append(str);
        return AbstractC166997dE.A0x("'}", A15);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A042 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0A(parcel, this.A00, 1, i, false);
        AbstractC128825rw.A0E(parcel, this.A02, 2, false);
        AbstractC58319PtB.A1D(parcel, this.A01, A042, false);
    }
}
