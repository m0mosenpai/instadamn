package com.google.android.gms.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes10.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(59);
    public final Context A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A01;
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC58322PtE.A1D(parcel, str);
        AbstractC128825rw.A09(parcel, 2, this.A02);
        AbstractC128825rw.A09(parcel, 3, this.A03);
        AbstractC128825rw.A03(new ObjectWrapper(this.A00), parcel, 4);
        AbstractC128825rw.A09(parcel, 5, this.A04);
        AbstractC128825rw.A09(parcel, 6, this.A05);
        AbstractC128825rw.A06(parcel, A04);
    }

    public zzo(IBinder iBinder, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = str;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = (Context) ObjectWrapper.A00(IObjectWrapper.Stub.A01(iBinder));
        this.A04 = z3;
        this.A05 = z4;
    }
}
