package androidx.compose.foundation.text.selection;

import X.AbstractC25225BEi;
import X.C6KW;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class SelectionGesturesKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b1 A[Catch: CancellationException -> 0x00da, TryCatch #0 {CancellationException -> 0x00da, blocks: (B:12:0x00a8, B:13:0x00ab, B:15:0x00b1, B:17:0x00c0, B:19:0x00ca, B:21:0x00cd, B:24:0x00d0, B:28:0x00d4, B:32:0x005f, B:33:0x0062, B:35:0x0066, B:37:0x0076, B:38:0x0079, B:41:0x008d, B:45:0x0046), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4 A[Catch: CancellationException -> 0x00da, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00da, blocks: (B:12:0x00a8, B:13:0x00ab, B:15:0x00b1, B:17:0x00c0, B:19:0x00ca, B:21:0x00cd, B:24:0x00d0, B:28:0x00d4, B:32:0x005f, B:33:0x0062, B:35:0x0066, B:37:0x0076, B:38:0x0079, B:41:0x008d, B:45:0x0046), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066 A[Catch: CancellationException -> 0x00da, TryCatch #0 {CancellationException -> 0x00da, blocks: (B:12:0x00a8, B:13:0x00ab, B:15:0x00b1, B:17:0x00c0, B:19:0x00ca, B:21:0x00cd, B:24:0x00d0, B:28:0x00d4, B:32:0x005f, B:33:0x0062, B:35:0x0066, B:37:0x0076, B:38:0x0079, B:41:0x008d, B:45:0x0046), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.InterfaceC31064Dl6 r9, X.C6KZ r10, X.C6KW r11, X.InterfaceC23621Ds r12) {
        /*
            r3 = 1
            boolean r0 = X.MAO.A02(r12, r3)
            if (r0 == 0) goto L2b
            r5 = r12
            X.MAO r5 = (X.MAO) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r7 = r5.A04
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 2
            if (r0 == 0) goto L43
            if (r0 == r3) goto L36
            if (r0 != r4) goto L31
            java.lang.Object r9 = r5.A02
            X.Dl6 r9 = (X.InterfaceC31064Dl6) r9
            java.lang.Object r10 = r5.A01
            X.6KZ r10 = (X.C6KZ) r10
            goto La8
        L2b:
            X.MAO r5 = new X.MAO
            r5.<init>(r12)
            goto L15
        L31:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L36:
            java.lang.Object r2 = r5.A03
            X.BFo r2 = (X.BFo) r2
            java.lang.Object r9 = r5.A02
            X.Dl6 r9 = (X.InterfaceC31064Dl6) r9
            java.lang.Object r10 = r5.A01
            X.6KZ r10 = (X.C6KZ) r10
            goto L5f
        L43:
            X.AbstractC09560e7.A00(r7)
            java.util.List r0 = r11.A03     // Catch: java.util.concurrent.CancellationException -> Lda
            java.lang.Object r2 = X.AbstractC001800i.A0I(r0)     // Catch: java.util.concurrent.CancellationException -> Lda
            X.BFo r2 = (X.BFo) r2     // Catch: java.util.concurrent.CancellationException -> Lda
            long r0 = r2.A05     // Catch: java.util.concurrent.CancellationException -> Lda
            r5.A01 = r10     // Catch: java.util.concurrent.CancellationException -> Lda
            r5.A02 = r9     // Catch: java.util.concurrent.CancellationException -> Lda
            r5.A03 = r2     // Catch: java.util.concurrent.CancellationException -> Lda
            r5.A00 = r3     // Catch: java.util.concurrent.CancellationException -> Lda
            java.lang.Object r7 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A01(r10, r5, r0)     // Catch: java.util.concurrent.CancellationException -> Lda
            if (r7 != r6) goto L62
            return r6
        L5f:
            X.AbstractC09560e7.A00(r7)     // Catch: java.util.concurrent.CancellationException -> Lda
        L62:
            X.BFo r7 = (X.BFo) r7     // Catch: java.util.concurrent.CancellationException -> Lda
            if (r7 == 0) goto Ld7
            X.59J r1 = r10.CFl()     // Catch: java.util.concurrent.CancellationException -> Lda
            int r0 = r2.A04     // Catch: java.util.concurrent.CancellationException -> Lda
            boolean r0 = X.AbstractC167007dF.A1P(r0, r4)     // Catch: java.util.concurrent.CancellationException -> Lda
            float r8 = r1.CA3()     // Catch: java.util.concurrent.CancellationException -> Lda
            if (r0 == 0) goto L79
            float r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A00     // Catch: java.util.concurrent.CancellationException -> Lda
            float r8 = r8 * r0
        L79:
            long r2 = r2.A06     // Catch: java.util.concurrent.CancellationException -> Lda
            long r0 = r7.A06     // Catch: java.util.concurrent.CancellationException -> Lda
            long r2 = X.C119365at.A06(r2, r0)     // Catch: java.util.concurrent.CancellationException -> Lda
            float r2 = X.C119365at.A00(r2)     // Catch: java.util.concurrent.CancellationException -> Lda
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            boolean r2 = X.AbstractC25230BEn.A1P(r2)
            if (r2 == 0) goto Ld7
            r9.Dnv(r0)     // Catch: java.util.concurrent.CancellationException -> Lda
            long r2 = r7.A05     // Catch: java.util.concurrent.CancellationException -> Lda
            r0 = 16
            X.DRU r1 = X.DRU.A00(r9, r0)     // Catch: java.util.concurrent.CancellationException -> Lda
            r5.A01 = r10     // Catch: java.util.concurrent.CancellationException -> Lda
            r5.A02 = r9     // Catch: java.util.concurrent.CancellationException -> Lda
            r0 = 0
            r5.A03 = r0     // Catch: java.util.concurrent.CancellationException -> Lda
            r5.A00 = r4     // Catch: java.util.concurrent.CancellationException -> Lda
            java.lang.Object r7 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(r10, r5, r1, r2)     // Catch: java.util.concurrent.CancellationException -> Lda
            if (r7 != r6) goto Lab
            return r6
        La8:
            X.AbstractC09560e7.A00(r7)     // Catch: java.util.concurrent.CancellationException -> Lda
        Lab:
            boolean r0 = X.AbstractC166987dD.A1a(r7)     // Catch: java.util.concurrent.CancellationException -> Lda
            if (r0 == 0) goto Ld4
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r10 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r10     // Catch: java.util.concurrent.CancellationException -> Lda
            X.6KL r0 = r10.A04     // Catch: java.util.concurrent.CancellationException -> Lda
            X.6KW r0 = r0.A01     // Catch: java.util.concurrent.CancellationException -> Lda
            java.util.List r4 = r0.A03     // Catch: java.util.concurrent.CancellationException -> Lda
            r3 = 0
            int r2 = r4.size()     // Catch: java.util.concurrent.CancellationException -> Lda
        Lbe:
            if (r3 >= r2) goto Ld0
            X.BFo r1 = X.AbstractC25225BEi.A0U(r4, r3)     // Catch: java.util.concurrent.CancellationException -> Lda
            boolean r0 = X.AbstractC25253BFp.A01(r1)     // Catch: java.util.concurrent.CancellationException -> Lda
            if (r0 == 0) goto Lcd
            r1.A01()     // Catch: java.util.concurrent.CancellationException -> Lda
        Lcd:
            int r3 = r3 + 1
            goto Lbe
        Ld0:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> Lda
            goto Ld7
        Ld4:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> Lda
        Ld7:
            X.0eB r6 = X.C0eB.A00
            return r6
        Lda:
            r0 = move-exception
            r9.onCancel()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.A00(X.Dl6, X.6KZ, X.6KW, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004d -> B:10:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.C6KZ r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 6
            boolean r0 = X.MAQ.A02(r10, r3)
            if (r0 == 0) goto L50
            r8 = r10
            X.MAQ r8 = (X.MAQ) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r8.A00 = r2
        L15:
            java.lang.Object r7 = r8.A02
            X.1JX r6 = X.C1JX.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L40
            if (r0 != r5) goto L57
            java.lang.Object r0 = r8.A01
            X.6KZ r9 = X.AbstractC25225BEi.A0T(r0, r7)
        L26:
            X.6KW r7 = (X.C6KW) r7
            java.util.List r4 = r7.A03
            int r3 = r4.size()
            r2 = 0
        L2f:
            if (r2 >= r3) goto L56
            X.BFo r1 = X.AbstractC25225BEi.A0U(r4, r2)
            boolean r0 = r1.A0C
            if (r0 != 0) goto L43
            boolean r0 = r1.A0B
            if (r0 == 0) goto L43
            int r2 = r2 + 1
            goto L2f
        L40:
            X.AbstractC09560e7.A00(r7)
        L43:
            X.BJd r0 = X.EnumC25334BJd.Main
            r8.A01 = r9
            r8.A00 = r5
            java.lang.Object r7 = r9.AD8(r0, r8)
            if (r7 != r6) goto L26
            return r6
        L50:
            X.MAQ r8 = new X.MAQ
            r8.<init>(r3, r10)
            goto L15
        L56:
            return r7
        L57:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.A02(X.6KZ, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.CRA r16, X.InterfaceC30782DgJ r17, X.C6KZ r18, X.C6KW r19, X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.A01(X.CRA, X.DgJ, X.6KZ, X.6KW, X.1Ds):java.lang.Object");
    }

    public static final boolean A03(C6KW c6kw) {
        List list = c6kw.A03;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC25225BEi.A0U(list, i).A04 != 2) {
                return false;
            }
        }
        return true;
    }
}
