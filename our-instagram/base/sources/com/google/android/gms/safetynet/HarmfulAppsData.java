package com.google.android.gms.safetynet;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(77);
    public final int A00;
    public final String A01;
    public final byte[] A02;

    public HarmfulAppsData(byte[] bArr, int i, String str) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A01);
        AbstractC128825rw.A0F(parcel, this.A02, 3, false);
        AbstractC58322PtE.A1B(parcel, this.A00, A04);
    }
}
