package com.instagram.model.direct;

import X.C9Ay;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class DirectShareTargetLoggingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(2);
    public Boolean A00;
    public Double A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r1 == false) goto L9;
     */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r3, int r4) {
        /*
            r2 = this;
            java.lang.Double r0 = r2.A01
            if (r0 == 0) goto L1b
            double r0 = r0.doubleValue()
        L8:
            r3.writeDouble(r0)
            java.lang.Boolean r0 = r2.A00
            if (r0 == 0) goto L16
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L17
        L16:
            r0 = 0
        L17:
            r3.writeByte(r0)
            return
        L1b:
            r0 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.direct.DirectShareTargetLoggingInfo.writeToParcel(android.os.Parcel, int):void");
    }
}
