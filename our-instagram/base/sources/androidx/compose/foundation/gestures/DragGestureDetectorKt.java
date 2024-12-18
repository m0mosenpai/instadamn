package androidx.compose.foundation.gestures;

import X.BFo;
import X.C0eB;
import X.C1JX;
import X.C29635D3v;
import X.C30712DfA;
import X.C6KN;
import X.C6KW;
import X.D9f;
import X.DRS;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class DragGestureDetectorKt {
    public static final float A00 = 0.125f / 18.0f;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        if (X.C119365at.A06(r8.A06, r8.A07) == 0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a5 -> B:10:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C6KZ r14, X.InterfaceC23621Ds r15, long r16) {
        /*
            r6 = 1
            boolean r0 = X.MAN.A02(r15, r6)
            if (r0 == 0) goto La8
            r5 = r15
            X.MAN r5 = (X.MAN) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La8
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r13 = 0
            if (r0 == 0) goto L76
            if (r0 != r6) goto Laf
            java.lang.Object r7 = r5.A02
            X.0pT r7 = (X.C15130pT) r7
            java.lang.Object r0 = r5.A01
            X.6KZ r14 = X.AbstractC25225BEi.A0T(r0, r1)
        L2a:
            X.6KW r1 = (X.C6KW) r1
            java.util.List r9 = r1.A03
            int r12 = r9.size()
            r11 = 0
        L33:
            if (r11 >= r12) goto L47
            java.lang.Object r8 = r9.get(r11)
            r0 = r8
            X.BFo r0 = (X.BFo) r0
            long r2 = r0.A05
            long r0 = r7.A00
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L48
            int r11 = r11 + 1
            goto L33
        L47:
            r8 = r13
        L48:
            X.BFo r8 = (X.BFo) r8
            if (r8 == 0) goto Lbb
            boolean r0 = X.AbstractC25253BFp.A02(r8)
            if (r0 == 0) goto L67
            int r3 = r9.size()
            r2 = 0
        L57:
            if (r2 >= r3) goto L90
            java.lang.Object r1 = r9.get(r2)
            r0 = r1
            X.BFo r0 = (X.BFo) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L91
            int r2 = r2 + 1
            goto L57
        L67:
            long r2 = r8.A07
            long r0 = r8.A06
            long r9 = X.C119365at.A06(r0, r2)
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb4
            goto L99
        L76:
            X.AbstractC09560e7.A00(r1)
            r0 = r14
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.6KL r0 = r0.A04
            X.6KW r0 = r0.A01
            r1 = r16
            boolean r0 = A09(r0, r1)
            if (r0 != 0) goto Lbb
            X.0pT r7 = new X.0pT
            r7.<init>()
            r7.A00 = r1
            goto L99
        L90:
            r1 = r13
        L91:
            X.BFo r1 = (X.BFo) r1
            if (r1 == 0) goto Lb4
            long r0 = r1.A05
            r7.A00 = r0
        L99:
            r5.A01 = r14
            r5.A02 = r7
            r5.A00 = r6
            X.BJd r0 = X.EnumC25334BJd.Main
            java.lang.Object r1 = r14.AD8(r0, r5)
            if (r1 != r4) goto L2a
            return r4
        La8:
            X.MAN r5 = new X.MAN
            r5.<init>(r6, r15)
            goto L15
        Laf:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lb4:
            boolean r0 = r8.A02()
            if (r0 != 0) goto Lbb
            return r8
        Lbb:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A00(X.6KZ, X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(3:10|11|12)(2:14|15))(3:16|(3:18|(1:(2:20|(1:22)(1:23))(2:29|30))|(3:25|26|(1:28)))|31)))|35|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        r0 = r9.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        return r5;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0091: RETURN (r5 I:java.lang.Object) (LINE:145), block:B:34:0x0091 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x008d: IGET (r0 I:java.lang.Object) = (r9 I:X.0ps) (LINE:141) X.0ps.A00 java.lang.Object, block:B:32:0x008d */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0ps] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C6KZ r11, X.InterfaceC23621Ds r12, long r13) {
        /*
            r3 = 2
            boolean r0 = X.MAN.A02(r12, r3)
            if (r0 == 0) goto L28
            r7 = r12
            X.MAN r7 = (X.MAN) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.A00 = r2
        L15:
            java.lang.Object r2 = r7.A03
            X.1JX r6 = X.C1JX.A02
            int r1 = r7.A00
            r8 = 1
            r0 = 0
            if (r1 == 0) goto L37
            if (r1 != r8) goto L32
            java.lang.Object r9 = r7.A02
            X.0ps r9 = (X.C15370ps) r9
            java.lang.Object r5 = r7.A01
            goto L2e
        L28:
            X.MAN r7 = new X.MAN
            r7.<init>(r3, r12)
            goto L15
        L2e:
            X.AbstractC09560e7.A00(r2)     // Catch: X.X2B -> L8d
            return r0
        L32:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L37:
            X.AbstractC09560e7.A00(r2)
            r1 = r11
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r1 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r1
            X.6KL r2 = r1.A04
            X.6KW r1 = r2.A01
            boolean r1 = A09(r1, r13)
            if (r1 != 0) goto L92
            X.6KW r1 = r2.A01
            java.util.List r10 = r1.A03
            r9 = 0
            int r4 = r10.size()
        L50:
            if (r9 >= r4) goto L66
            java.lang.Object r5 = r10.get(r9)
            r1 = r5
            X.BFo r1 = (X.BFo) r1
            long r1 = r1.A05
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            boolean r1 = X.AbstractC167007dF.A1N(r3)
            if (r1 != 0) goto L67
            int r9 = r9 + 1
            goto L50
        L66:
            r5 = r0
        L67:
            if (r5 == 0) goto L92
            X.0ps r9 = X.AbstractC25225BEi.A1F()
            X.0ps r4 = X.AbstractC25225BEi.A1F()
            r4.A00 = r5
            X.59J r1 = r11.CFl()
            long r2 = r1.BPB()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: X.X2B -> L8d
            r1.<init>(r0, r4, r9)     // Catch: X.X2B -> L8d
            r7.A01 = r5     // Catch: X.X2B -> L8d
            r7.A02 = r9     // Catch: X.X2B -> L8d
            r7.A00 = r8     // Catch: X.X2B -> L8d
            java.lang.Object r1 = r11.FEC(r7, r1, r2)     // Catch: X.X2B -> L8d
            if (r1 != r6) goto L92
            return r6
        L8d:
            java.lang.Object r0 = r9.A00
            if (r0 != 0) goto L92
            return r5
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A01(X.6KZ, X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004d -> B:10:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.C6KZ r5, X.InterfaceC23621Ds r6, X.InterfaceC16660sJ r7, long r8) {
        /*
            r3 = 3
            boolean r0 = X.MAN.A02(r6, r3)
            if (r0 == 0) goto L50
            r4 = r6
            X.MAN r4 = (X.MAN) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A03
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L40
            if (r0 != r1) goto L56
            java.lang.Object r7 = r4.A02
            X.0sJ r7 = (X.InterfaceC16660sJ) r7
            java.lang.Object r0 = r4.A01
            X.6KZ r5 = X.AbstractC25225BEi.A0T(r0, r3)
        L2a:
            X.BFo r3 = (X.BFo) r3
            if (r3 != 0) goto L34
            r1 = 0
        L2f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L34:
            boolean r0 = X.AbstractC25253BFp.A02(r3)
            if (r0 != 0) goto L2f
            r7.invoke(r3)
            long r8 = r3.A05
            goto L43
        L40:
            X.AbstractC09560e7.A00(r3)
        L43:
            r4.A01 = r5
            r4.A02 = r7
            r4.A00 = r1
            java.lang.Object r3 = A00(r5, r4, r8)
            if (r3 != r2) goto L2a
            return r2
        L50:
            X.MAN r4 = new X.MAN
            r4.<init>(r3, r6)
            goto L15
        L56:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(X.6KZ, X.1Ds, X.0sJ, long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
    
        if (r2 == 0.0f) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a8, code lost:
    
        if (A09(((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r6).A04.A01, r1) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e2 -> B:10:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.C6KZ r12, X.InterfaceC23621Ds r13, X.InterfaceC16660sJ r14, long r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A03(X.6KZ, X.1Ds, X.0sJ, long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0086, code lost:
    
        if (r1 == 0.0f) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:
    
        if (A09(((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r6).A04.A01, r0) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e1 -> B:10:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(X.C6KZ r12, X.InterfaceC23621Ds r13, X.InterfaceC16660sJ r14, long r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A04(X.6KZ, X.1Ds, X.0sJ, long):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0pT, java.lang.Object] */
    public static final Object A07(C6KN c6kn, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        C30712DfA A002 = C30712DfA.A00(interfaceC16660sJ, 3);
        Object A01 = ForEachGestureKt.A01(c6kn, interfaceC23621Ds, new DragGestureDetectorKt$detectDragGestures$9(null, null, D9f.A00, interfaceC16820sZ2, DRS.A00(interfaceC16820sZ, 20), interfaceC16620sF, A002, new Object()));
        C1JX c1jx = C1JX.A02;
        if (A01 != c1jx) {
            A01 = C0eB.A00;
        }
        if (A01 != c1jx) {
            return C0eB.A00;
        }
        return A01;
    }

    public static final Object A08(C6KN c6kn, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        Object A01 = ForEachGestureKt.A01(c6kn, interfaceC23621Ds, new C29635D3v((InterfaceC23621Ds) null, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16620sF, 0));
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r13.A02() == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004f  */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fa -> B:18:0x0082). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0119 -> B:18:0x0082). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0133 -> B:14:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(X.C6KZ r16, X.InterfaceC23621Ds r17, X.InterfaceC16620sF r18, int r19, long r20) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A05(X.6KZ, X.1Ds, X.0sF, int, long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r13.A02() == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004c  */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f7 -> B:17:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0116 -> B:17:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0130 -> B:13:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(X.C6KZ r16, X.InterfaceC23621Ds r17, X.InterfaceC16620sF r18, int r19, long r20) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A06(X.6KZ, X.1Ds, X.0sF, int, long):java.lang.Object");
    }

    public static final boolean A09(C6KW c6kw, long j) {
        Object obj;
        List list = c6kw.A03;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (((BFo) obj).A05 == j) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        BFo bFo = (BFo) obj;
        if (bFo != null && bFo.A0B) {
            z = true;
        }
        return !z;
    }
}
