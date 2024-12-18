package com.google.android.gms.auth.api.signin.internal;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63474SlF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(16);
    public int A00;
    public Bundle A01;
    public final int A02;

    public GoogleSignInOptionsExtensionParcelable(Bundle bundle, int i, int i2) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A02);
        AbstractC128825rw.A07(parcel, 2, this.A00);
        AbstractC128825rw.A02(this.A01, parcel, 3);
        AbstractC128825rw.A06(parcel, A04);
    }
}
