package com.google.android.gms.auth.api.proxy;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AnonymousClass001;
import X.C63474SlF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(14);
    public final int A00;
    public final int A01;
    public final long A02;
    public final Bundle A03;
    public final String A04;
    public final byte[] A05;

    public final String toString() {
        return AnonymousClass001.A09(this.A00, "ProxyRequest[ url: ", this.A04, ", method: ", " ]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A04;
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1Q = AbstractC58319PtB.A1Q(parcel, str);
        AbstractC128825rw.A07(parcel, 2, this.A00);
        AbstractC128825rw.A08(parcel, 3, this.A02);
        AbstractC128825rw.A0F(parcel, this.A05, 4, A1Q);
        AbstractC128825rw.A02(this.A03, parcel, 5);
        AbstractC58319PtB.A1C(parcel, this.A01, A04);
    }

    public ProxyRequest(Bundle bundle, String str, byte[] bArr, int i, int i2, long j) {
        this.A01 = i;
        this.A04 = str;
        this.A00 = i2;
        this.A02 = j;
        this.A05 = bArr;
        this.A03 = bundle;
    }
}
