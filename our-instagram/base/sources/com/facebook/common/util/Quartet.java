package com.facebook.common.util;

import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class Quartet extends Triplet implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(83);
    public final Object A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Quartet(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.Class<X.RtI> r0 = X.C61763RtI.class
            java.lang.Object r3 = X.AbstractC58321PtD.A0n(r5, r0)
            java.lang.Object r2 = X.AbstractC58321PtD.A0n(r5, r0)
            java.lang.Object r1 = X.AbstractC58321PtD.A0n(r5, r0)
            java.lang.Object r0 = X.AbstractC58321PtD.A0n(r5, r0)
            r4.<init>(r3, r2, r1)
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.util.Quartet.<init>(android.os.Parcel):void");
    }

    @Override // com.facebook.common.util.Triplet, com.facebook.common.util.ParcelablePair, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(this.A00);
    }
}
