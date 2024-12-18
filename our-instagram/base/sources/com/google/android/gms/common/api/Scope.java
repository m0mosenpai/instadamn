package com.google.android.gms.common.api;

import X.AbstractC128825rw;
import X.C3U5;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes3.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C63474SlF(32);
    public final int A00;
    public final String A01;

    public final String toString() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.A01.equals(((Scope) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A01 = AbstractC128825rw.A01(parcel, 20293);
        AbstractC128825rw.A05(parcel, i2);
        AbstractC128825rw.A0B(parcel, this.A01);
        AbstractC128825rw.A06(parcel, A01);
    }

    public Scope(int i, String str) {
        C3U5.A06(str, "scopeUri must not be null or empty");
        this.A00 = i;
        this.A01 = str;
    }
}
