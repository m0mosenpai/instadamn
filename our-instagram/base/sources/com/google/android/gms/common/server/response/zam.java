package com.google.android.gms.common.server.response;

import X.AbstractC128825rw;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(53);
    public final int A00;
    public final FastJsonResponse$Field A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A00);
        AbstractC128825rw.A0B(parcel, this.A02);
        AbstractC128825rw.A0A(parcel, this.A01, 3, i, false);
        AbstractC128825rw.A06(parcel, A06);
    }

    public zam(FastJsonResponse$Field fastJsonResponse$Field, String str) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = fastJsonResponse$Field;
    }

    public zam(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = fastJsonResponse$Field;
    }
}
