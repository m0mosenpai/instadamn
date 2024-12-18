package androidx.compose.foundation.gestures;

import X.C0eB;
import X.C1JX;
import X.C25250BFk;
import X.C6KN;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;

/* loaded from: classes5.dex */
public abstract class ForEachGestureKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:10:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C6KZ r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = 1
            boolean r0 = X.MAQ.A02(r8, r5)
            if (r0 == 0) goto L6b
            r4 = r8
            X.MAQ r4 = (X.MAQ) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A02
            X.1JX r6 = X.C1JX.A02
            int r0 = r4.A00
            if (r0 == 0) goto L3e
            if (r0 != r5) goto L71
            java.lang.Object r7 = r4.A01
            X.6KZ r7 = (X.C6KZ) r7
            X.AbstractC09560e7.A00(r1)
        L26:
            X.6KW r1 = (X.C6KW) r1
            java.util.List r3 = r1.A03
            int r2 = r3.size()
            r1 = 0
        L2f:
            if (r1 >= r2) goto L79
            java.lang.Object r0 = r3.get(r1)
            X.BFo r0 = (X.BFo) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L5e
            int r1 = r1 + 1
            goto L2f
        L3e:
            X.AbstractC09560e7.A00(r1)
            r0 = r7
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.6KL r0 = r0.A04
            X.6KW r0 = r0.A01
            java.util.List r3 = r0.A03
            int r2 = r3.size()
            r1 = 0
        L4f:
            if (r1 >= r2) goto L79
            java.lang.Object r0 = r3.get(r1)
            X.BFo r0 = (X.BFo) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L5e
            int r1 = r1 + 1
            goto L4f
        L5e:
            X.BJd r0 = X.EnumC25334BJd.Final
            r4.A01 = r7
            r4.A00 = r5
            java.lang.Object r1 = r7.AD8(r0, r4)
            if (r1 != r6) goto L26
            return r6
        L6b:
            X.MAQ r4 = new X.MAQ
            r4.<init>(r5, r8)
            goto L15
        L71:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L79:
            X.0eB r6 = X.C0eB.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.A00(X.6KZ, X.1Ds):java.lang.Object");
    }

    public static final Object A01(C6KN c6kn, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        Object AD9 = c6kn.AD9(interfaceC23621Ds, new C25250BFk(null, interfaceC23621Ds.getContext(), interfaceC16620sF));
        if (AD9 != C1JX.A02) {
            return C0eB.A00;
        }
        return AD9;
    }
}
