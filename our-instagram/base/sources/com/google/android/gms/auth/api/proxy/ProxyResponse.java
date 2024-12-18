package com.google.android.gms.auth.api.proxy;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(15);
    public final int A00;
    public final int A01;
    public final int A02;
    public final PendingIntent A03;
    public final Bundle A04;
    public final byte[] A05;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A00);
        boolean A1U = AbstractC58322PtE.A1U(parcel, this.A03, i);
        AbstractC128825rw.A07(parcel, 3, this.A01);
        AbstractC128825rw.A02(this.A04, parcel, 4);
        AbstractC128825rw.A0F(parcel, this.A05, 5, A1U);
        AbstractC58319PtB.A1C(parcel, this.A02, A06);
    }

    public ProxyResponse(PendingIntent pendingIntent, Bundle bundle, byte[] bArr, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = bundle;
        this.A05 = bArr;
        this.A03 = pendingIntent;
    }
}
