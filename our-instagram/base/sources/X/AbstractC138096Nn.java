package X;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* renamed from: X.6Nn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC138096Nn {
    public static final Class[] A00 = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r2 == r1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(java.lang.Object r6) {
        /*
            boolean r0 = r6 instanceof X.InterfaceC74943Yk
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L37
            X.3Yk r6 = (X.InterfaceC74943Yk) r6
            X.3Ye r2 = r6.BeD()
            X.6M9 r1 = X.C6M9.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>"
            X.C14360o3.A0C(r1, r0)
            if (r2 == r1) goto L2c
            X.3Ye r1 = r6.BeD()
            X.3Yd r0 = X.AbstractC74873Yc.A00()
            if (r1 == r0) goto L2c
            X.3Ye r2 = r6.BeD()
            X.58H r1 = X.C58H.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>"
            X.C14360o3.A0C(r1, r0)
            if (r2 != r1) goto L3f
        L2c:
            java.lang.Object r0 = r6.getValue()
            if (r0 == 0) goto L36
            boolean r5 = A00(r0)
        L36:
            return r5
        L37:
            boolean r0 = r6 instanceof X.InterfaceC09250da
            if (r0 == 0) goto L40
            boolean r0 = r6 instanceof java.io.Serializable
            if (r0 == 0) goto L40
        L3f:
            return r4
        L40:
            java.lang.Class[] r3 = X.AbstractC138096Nn.A00
            r2 = 7
            r1 = 0
        L44:
            r0 = r3[r1]
            boolean r0 = r0.isInstance(r6)
            if (r0 != 0) goto L36
            int r1 = r1 + 1
            if (r1 >= r2) goto L3f
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC138096Nn.A00(java.lang.Object):boolean");
    }
}
