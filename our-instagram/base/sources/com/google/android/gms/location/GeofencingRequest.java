package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes10.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(56);
    public final int A00;
    public final String A01;
    public final List A02;

    public GeofencingRequest(List list, int i, String str) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GeofencingRequest[");
        A1C.append("geofences=");
        A1C.append(this.A02);
        int i = this.A00;
        StringBuilder A0q = AbstractC58318PtA.A0q(30);
        A0q.append(", initialTrigger=");
        A0q.append(i);
        A1C.append(AbstractC166997dE.A0x(", ", A0q));
        String valueOf = String.valueOf(this.A01);
        A1C.append(AbstractC58320PtC.A0w(valueOf.length(), "tag=", valueOf));
        return AbstractC58319PtB.A0w(A1C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0E(parcel, this.A02, 1, false);
        AbstractC128825rw.A07(parcel, 2, this.A00);
        AbstractC58319PtB.A1D(parcel, this.A01, A04, false);
    }
}
