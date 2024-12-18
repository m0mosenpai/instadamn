package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(88);
    public final int A00;
    public final short A01;
    public final short A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        if (this.A00 != uvmEntry.A00 || this.A01 != uvmEntry.A01 || this.A02 != uvmEntry.A02) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(Integer.valueOf(this.A00), Short.valueOf(this.A01), Short.valueOf(this.A02));
    }

    public UvmEntry(int i, short s, short s2) {
        this.A00 = i;
        this.A01 = s;
        this.A02 = s2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        short s = this.A01;
        parcel.writeInt(262146);
        parcel.writeInt(s);
        short s2 = this.A02;
        parcel.writeInt(262147);
        parcel.writeInt(s2);
        AbstractC128825rw.A06(parcel, A04);
    }
}
