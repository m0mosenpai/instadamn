package com.google.android.gms.common.internal;

import X.AbstractC128825rw;
import X.AbstractC58322PtE;
import X.AnonymousClass001;
import X.C63474SlF;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(36);
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ClientIdentity) {
                ClientIdentity clientIdentity = (ClientIdentity) obj;
                if (clientIdentity.A00 != this.A00 || !SSI.A01(clientIdentity.A01, this.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A04(this.A00, ":", this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A00);
        AbstractC128825rw.A0B(parcel, this.A01);
        AbstractC128825rw.A06(parcel, A06);
    }

    public ClientIdentity(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
