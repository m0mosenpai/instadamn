package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63471SlC;
import X.SSI;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes10.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(66);
    public int A00;
    public long A01;
    public long A02;
    public Bundle A03;
    public List A04;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0009, code lost:
    
        if (r10 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(android.os.Bundle r9, android.os.Bundle r10) {
        /*
            r8 = 1
            if (r9 != 0) goto L6
            if (r10 != 0) goto L6
        L5:
            return r8
        L6:
            r7 = 0
            if (r9 != 0) goto La2
            if (r10 != 0) goto L35
        Lb:
            int r1 = r9.size()
            int r0 = r10.size()
            if (r1 != r0) goto L35
            java.util.Iterator r6 = X.AbstractC58319PtB.A14(r9)
        L19:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5
            java.lang.String r2 = X.AbstractC166987dD.A1B(r6)
            boolean r0 = r10.containsKey(r2)
            if (r0 == 0) goto L35
            java.lang.Object r0 = r9.get(r2)
            if (r0 != 0) goto L36
            java.lang.Object r0 = r10.get(r2)
            if (r0 == 0) goto L19
        L35:
            return r7
        L36:
            java.lang.Object r0 = r9.get(r2)
            boolean r0 = r0 instanceof android.os.Bundle
            if (r0 == 0) goto L4d
            android.os.Bundle r1 = r9.getBundle(r2)
            android.os.Bundle r0 = r10.getBundle(r2)
            boolean r0 = A00(r1, r0)
        L4a:
            if (r0 != 0) goto L19
            return r7
        L4d:
            java.lang.Object r0 = r9.get(r2)
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r10.get(r2)
            if (r0 == 0) goto L35
            java.lang.Object r0 = r10.get(r2)
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L35
            java.lang.Object r5 = r9.get(r2)
            java.lang.Object r4 = r10.get(r2)
            int r3 = java.lang.reflect.Array.getLength(r5)
            int r0 = java.lang.reflect.Array.getLength(r4)
            if (r3 != r0) goto L35
            r2 = 0
        L82:
            if (r2 >= r3) goto L19
            java.lang.Object r1 = java.lang.reflect.Array.get(r5, r2)
            java.lang.Object r0 = java.lang.reflect.Array.get(r4, r2)
            boolean r0 = X.SSI.A01(r1, r0)
            if (r0 == 0) goto L35
            int r2 = r2 + 1
            goto L82
        L95:
            java.lang.Object r1 = r9.get(r2)
            java.lang.Object r0 = r10.get(r2)
            boolean r0 = r1.equals(r0)
            goto L4a
        La2:
            if (r10 != 0) goto Lb
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.A00(android.os.Bundle, android.os.Bundle):boolean");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
                if (this.A01 != activityRecognitionResult.A01 || this.A02 != activityRecognitionResult.A02 || this.A00 != activityRecognitionResult.A00 || !SSI.A01(this.A04, activityRecognitionResult.A04) || !A00(this.A03, activityRecognitionResult.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(Long.valueOf(this.A01), Long.valueOf(this.A02), Integer.valueOf(this.A00), this.A04, this.A03);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A04);
        long j = this.A01;
        long j2 = this.A02;
        StringBuilder A0q = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 124);
        A0q.append("ActivityRecognitionResult [probableActivities=");
        A0q.append(valueOf);
        A0q.append(", timeMillis=");
        A0q.append(j);
        A0q.append(", elapsedRealtimeMillis=");
        A0q.append(j2);
        return AbstractC58319PtB.A0w(A0q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0E(parcel, this.A04, 1, false);
        AbstractC128825rw.A08(parcel, 2, this.A01);
        AbstractC128825rw.A08(parcel, 3, this.A02);
        AbstractC128825rw.A07(parcel, 4, this.A00);
        AbstractC128825rw.A02(this.A03, parcel, 5);
        AbstractC128825rw.A06(parcel, A04);
    }
}
