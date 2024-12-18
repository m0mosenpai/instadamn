package com.google.android.gms.internal.p002authapi;

import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zbp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(19);
    public final Credential A00;

    public zbp(Credential credential) {
        this.A00 = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58320PtC.A1G(parcel, this.A00, i, AbstractC58319PtB.A04(parcel));
    }
}
