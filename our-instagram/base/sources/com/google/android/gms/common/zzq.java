package com.google.android.gms.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(60);
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzq(int r6, int r7, java.lang.String r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.A03 = r9
            r5.A02 = r8
            r4 = 6
            int[] r3 = new int[r4]
            r3 = {x003a: FILL_ARRAY_DATA , data: [1, 2, 3, 4, 5, 6} // fill-array
            r2 = 0
        Le:
            r1 = r3[r2]
            int r0 = r1 + (-1)
            if (r1 == 0) goto L38
            if (r0 == r6) goto L1b
            int r2 = r2 + 1
            if (r2 < r4) goto Le
            r1 = 1
        L1b:
            int r0 = r1 + (-1)
            r5.A00 = r0
            r4 = 3
            int[] r3 = new int[r4]
            r3 = {x004a: FILL_ARRAY_DATA , data: [1, 2, 3} // fill-array
            r2 = 0
        L26:
            r1 = r3[r2]
            int r0 = r1 + (-1)
            if (r1 == 0) goto L38
            if (r0 == r7) goto L33
            int r2 = r2 + 1
            if (r2 < r4) goto L26
            r1 = 1
        L33:
            int r0 = r1 + (-1)
            r5.A01 = r0
            return
        L38:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzq.<init>(int, int, java.lang.String, boolean):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A09(parcel, 1, this.A03);
        AbstractC128825rw.A0B(parcel, this.A02);
        AbstractC128825rw.A07(parcel, 3, this.A00);
        AbstractC58322PtE.A1B(parcel, this.A01, A04);
    }
}
