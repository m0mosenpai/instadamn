package com.google.android.gms.signin.internal;

import X.AbstractC128825rw;
import X.AbstractC58322PtE;
import X.C61j;
import X.C63471SlC;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zaa extends AbstractSafeParcelable implements C61j {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(82);
    public int A00;
    public Intent A01;
    public final int A02;

    @Override // X.C61j
    public final Status C0F() {
        if (this.A00 == 0) {
            return Status.A08;
        }
        return Status.A04;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A02);
        AbstractC128825rw.A07(parcel, 2, this.A00);
        AbstractC128825rw.A0A(parcel, this.A01, 3, i, false);
        AbstractC128825rw.A06(parcel, A06);
    }

    public zaa(int i, int i2, Intent intent) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = intent;
    }

    public zaa() {
        this(2, 0, null);
    }
}
