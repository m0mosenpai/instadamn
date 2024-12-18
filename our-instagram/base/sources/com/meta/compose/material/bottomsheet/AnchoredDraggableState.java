package com.meta.compose.material.bottomsheet;

import X.AbstractC001800i;
import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.AbstractC25231BEo;
import X.AbstractC25236BEt;
import X.AbstractC74873Yc;
import X.C0eB;
import X.C17s;
import X.C1JX;
import X.C28003CWa;
import X.C28726CmI;
import X.C29892DGg;
import X.C57F;
import X.C5Y6;
import X.CPS;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.InterfaceC30902DiF;
import X.InterfaceC74953Yl;
import X.InterfaceC74963Ym;
import X.O9R;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

/* loaded from: classes5.dex */
public final class AnchoredDraggableState {
    public final C5Y6 A00;
    public final InterfaceC74953Yl A05;
    public final InterfaceC16660sJ A0B;
    public final InterfaceC16820sZ A0D;
    public final InterfaceC16660sJ A0E;
    public final O9R A0A = new O9R();
    public final InterfaceC30902DiF A01 = new C28726CmI(this);
    public final InterfaceC74963Ym A08 = AbstractC25225BEi.A0L(null, C29892DGg.A00(this, 33));
    public final InterfaceC74963Ym A07 = AbstractC25225BEi.A0L(null, C29892DGg.A00(this, 31));
    public final C57F A03 = new ParcelableSnapshotMutableFloatState(Float.NaN);
    public final InterfaceC74963Ym A0C = AbstractC25225BEi.A0L(AbstractC74873Yc.A00(), C29892DGg.A00(this, 32));
    public final C57F A02 = new ParcelableSnapshotMutableFloatState(0.0f);
    public final InterfaceC74953Yl A06 = AbstractC25229BEm.A0R(null);
    public final InterfaceC74953Yl A04 = AbstractC25229BEm.A0R(new C28003CWa(AbstractC06930Yk.A0E()));
    public final CPS A09 = new CPS(this);

    public static C28003CWa A01(AnchoredDraggableState anchoredDraggableState) {
        return (C28003CWa) anchoredDraggableState.A04.getValue();
    }

    public final float A03() {
        C57F c57f = this.A03;
        if (!Float.isNaN(c57f.B72())) {
            return c57f.B72();
        }
        throw AbstractC166987dD.A14("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public final float A04(float f) {
        float f2;
        float f3;
        float A00 = AbstractC25236BEt.A00(this.A03) + f;
        InterfaceC74953Yl interfaceC74953Yl = this.A04;
        Float A08 = AbstractC001800i.A08(((C28003CWa) interfaceC74953Yl.getValue()).A00.values());
        if (A08 != null) {
            f2 = A08.floatValue();
        } else {
            f2 = Float.NaN;
        }
        Float A07 = AbstractC001800i.A07(((C28003CWa) interfaceC74953Yl.getValue()).A00.values());
        if (A07 != null) {
            f3 = A07.floatValue();
        } else {
            f3 = Float.NaN;
        }
        return C17s.A02(A00, f2, f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.EnumC27348C5d r19, java.lang.Object r20, X.InterfaceC23621Ds r21, X.InterfaceC16600sD r22) {
        /*
            r18 = this;
            r8 = r20
            r4 = 36
            r5 = r21
            boolean r0 = X.C57146PWy.A01(r5, r4)
            r9 = r18
            if (r0 == 0) goto L2f
            r3 = r5
            X.PWy r3 = (X.C57146PWy) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r3.A00 = r2
        L1c:
            java.lang.Object r5 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            r11 = 0
            if (r0 == 0) goto L39
            if (r0 != r1) goto L9c
            java.lang.Object r4 = r3.A01
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r4 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r4
            goto L35
        L2f:
            X.PWy r3 = new X.PWy
            r3.<init>(r9, r5, r4)
            goto L1c
        L35:
            X.AbstractC09560e7.A00(r5)     // Catch: java.lang.Throwable -> L6c
            goto La5
        L39:
            X.AbstractC09560e7.A00(r5)
            X.CWa r0 = A01(r9)
            java.util.Map r0 = r0.A00
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto La1
            X.O9R r14 = r9.A0A     // Catch: java.lang.Throwable -> L69
            r12 = 4
            X.PXN r7 = new X.PXN     // Catch: java.lang.Throwable -> L69
            r10 = r22
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L69
            r3.A01 = r9     // Catch: java.lang.Throwable -> L69
            r3.A00 = r1     // Catch: java.lang.Throwable -> L69
            r17 = 17
            X.PZo r12 = new X.PZo     // Catch: java.lang.Throwable -> L69
            r13 = r19
            r15 = r7
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = X.AnonymousClass194.A00(r3, r12)     // Catch: java.lang.Throwable -> L69
            if (r0 == r2) goto Ld5
            goto La4
        L69:
            r5 = move-exception
            r4 = r9
            goto L6d
        L6c:
            r5 = move-exception
        L6d:
            X.3Yl r0 = r4.A06
            r0.Egh(r11)
            X.3Yl r3 = r4.A04
            java.lang.Object r1 = r3.getValue()
            X.CWa r1 = (X.C28003CWa) r1
            X.57F r2 = r4.A03
            float r0 = r2.B72()
            java.lang.Object r1 = r1.A01(r0)
            if (r1 == 0) goto La0
            float r0 = A00(r2, r3, r1)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto La0
            X.0sJ r0 = r4.A0B
            boolean r0 = X.AbstractC25231BEo.A1a(r1, r0)
            if (r0 == 0) goto La0
            X.3Yl r0 = r4.A05
            r0.Egh(r1)
            throw r5
        L9c:
            java.lang.IllegalStateException r5 = X.AbstractC166987dD.A13()
        La0:
            throw r5
        La1:
            X.3Yl r0 = r9.A05
            goto Ld0
        La4:
            r4 = r9
        La5:
            X.3Yl r0 = r4.A06
            r0.Egh(r11)
            X.3Yl r3 = r4.A04
            java.lang.Object r2 = r3.getValue()
            X.CWa r2 = (X.C28003CWa) r2
            X.57F r1 = r4.A03
            float r0 = r1.B72()
            java.lang.Object r8 = r2.A01(r0)
            if (r8 == 0) goto Ld3
            float r0 = A00(r1, r3, r8)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto Ld3
            X.0sJ r0 = r4.A0B
            boolean r0 = X.AbstractC25231BEo.A1a(r8, r0)
            if (r0 == 0) goto Ld3
            X.3Yl r0 = r4.A05
        Ld0:
            r0.Egh(r8)
        Ld3:
            X.0eB r2 = X.C0eB.A00
        Ld5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.compose.material.bottomsheet.AnchoredDraggableState.A05(X.C5d, java.lang.Object, X.1Ds, X.0sD):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(X.EnumC27348C5d r14, X.InterfaceC23621Ds r15, X.InterfaceC16610sE r16) {
        /*
            r13 = this;
            r3 = 35
            boolean r0 = X.C57146PWy.A01(r15, r3)
            if (r0 == 0) goto L28
            r4 = r15
            X.PWy r4 = (X.C57146PWy) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto Lad
            java.lang.Object r4 = r4.A01
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r4 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r4
            goto L2e
        L28:
            X.PWy r4 = new X.PWy
            r4.<init>(r13, r15, r3)
            goto L16
        L2e:
            X.AbstractC09560e7.A00(r3)     // Catch: java.lang.Throwable -> L82
            goto L53
        L32:
            X.AbstractC09560e7.A00(r3)
            X.O9R r9 = r13.A0A     // Catch: java.lang.Throwable -> L7f
            r11 = 0
            r0 = 7
            X.D42 r10 = new X.D42     // Catch: java.lang.Throwable -> L7f
            r3 = r16
            r10.<init>(r13, r3, r11, r0)     // Catch: java.lang.Throwable -> L7f
            r4.A01 = r13     // Catch: java.lang.Throwable -> L7f
            r4.A00 = r1     // Catch: java.lang.Throwable -> L7f
            r12 = 17
            X.PZo r7 = new X.PZo     // Catch: java.lang.Throwable -> L7f
            r8 = r14
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = X.AnonymousClass194.A00(r4, r7)     // Catch: java.lang.Throwable -> L7f
            if (r0 == r2) goto L7e
            r4 = r13
        L53:
            X.3Yl r3 = r4.A04
            java.lang.Object r1 = r3.getValue()
            X.CWa r1 = (X.C28003CWa) r1
            X.57F r2 = r4.A03
            float r0 = r2.B72()
            java.lang.Object r1 = r1.A01(r0)
            if (r1 == 0) goto L7c
            float r0 = A00(r2, r3, r1)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L7c
            X.0sJ r0 = r4.A0B
            boolean r0 = X.AbstractC25231BEo.A1a(r1, r0)
            if (r0 == 0) goto L7c
            X.3Yl r0 = r4.A05
            r0.Egh(r1)
        L7c:
            X.0eB r2 = X.C0eB.A00
        L7e:
            return r2
        L7f:
            r5 = move-exception
            r4 = r13
            goto L83
        L82:
            r5 = move-exception
        L83:
            X.3Yl r3 = r4.A04
            java.lang.Object r1 = r3.getValue()
            X.CWa r1 = (X.C28003CWa) r1
            X.57F r2 = r4.A03
            float r0 = r2.B72()
            java.lang.Object r1 = r1.A01(r0)
            if (r1 == 0) goto Lb1
            float r0 = A00(r2, r3, r1)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto Lb1
            X.0sJ r0 = r4.A0B
            boolean r0 = X.AbstractC25231BEo.A1a(r1, r0)
            if (r0 == 0) goto Lb1
            X.3Yl r0 = r4.A05
            r0.Egh(r1)
            throw r5
        Lad:
            java.lang.IllegalStateException r5 = X.AbstractC166987dD.A13()
        Lb1:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.compose.material.bottomsheet.AnchoredDraggableState.A06(X.C5d, X.1Ds, X.0sE):java.lang.Object");
    }

    public final Object A07(InterfaceC23621Ds interfaceC23621Ds, float f) {
        Object A00;
        Object value = this.A05.getValue();
        Object A02 = A02(this, value, A03(), f);
        if (AbstractC25231BEo.A1a(A02, this.A0B)) {
            A00 = AnchoredDraggableKt.A00(this, A02, interfaceC23621Ds, f);
        } else {
            A00 = AnchoredDraggableKt.A00(this, value, interfaceC23621Ds, f);
        }
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }

    public AnchoredDraggableState(C5Y6 c5y6, Object obj, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        this.A0E = interfaceC16660sJ;
        this.A0D = interfaceC16820sZ;
        this.A00 = c5y6;
        this.A0B = interfaceC16660sJ2;
        this.A05 = AbstractC25230BEn.A0U(obj);
    }

    public static float A00(C57F c57f, InterfaceC74953Yl interfaceC74953Yl, Object obj) {
        return Math.abs(c57f.B72() - ((C28003CWa) interfaceC74953Yl.getValue()).A00(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097 A[PHI: r2
      0x0097: PHI (r2v2 java.lang.Object) = (r2v1 java.lang.Object), (r2v3 java.lang.Object) binds: [B:24:0x0094, B:13:0x008f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.meta.compose.material.bottomsheet.AnchoredDraggableState r6, java.lang.Object r7, float r8, float r9) {
        /*
            X.CWa r5 = A01(r6)
            float r3 = r5.A00(r7)
            X.0sZ r0 = r6.A0D
            java.lang.Object r0 = r0.invoke()
            float r4 = X.AbstractC166987dD.A09(r0)
            r2 = 1
            r1 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L2d
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L2d
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L2e
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 < 0) goto L38
            java.lang.Object r7 = r5.A02(r8, r2)
        L2a:
            X.C14360o3.A0A(r7)
        L2d:
            return r7
        L2e:
            float r0 = -r4
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L5f
            java.lang.Object r7 = r5.A02(r8, r1)
            goto L2a
        L38:
            java.lang.Object r2 = r5.A02(r8, r2)
            X.C14360o3.A0A(r2)
            float r0 = r5.A00(r2)
            float r0 = X.AbstractC166987dD.A01(r0, r3)
            X.0sJ r1 = r6.A0E
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            float r0 = X.AbstractC166987dD.A09(r0)
            float r0 = java.lang.Math.abs(r0)
            float r3 = r3 + r0
            float r1 = java.lang.Math.abs(r3)
            goto L8d
        L5f:
            java.lang.Object r2 = r5.A02(r8, r1)
            X.C14360o3.A0A(r2)
            float r0 = r5.A00(r2)
            float r0 = X.AbstractC166987dD.A01(r3, r0)
            X.0sJ r1 = r6.A0E
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            float r0 = X.AbstractC166987dD.A09(r0)
            float r0 = java.lang.Math.abs(r0)
            float r1 = X.AbstractC166987dD.A01(r3, r0)
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L92
            float r8 = java.lang.Math.abs(r8)
        L8d:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L97
            return r7
        L92:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L97
            return r7
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.compose.material.bottomsheet.AnchoredDraggableState.A02(com.meta.compose.material.bottomsheet.AnchoredDraggableState, java.lang.Object, float, float):java.lang.Object");
    }
}
