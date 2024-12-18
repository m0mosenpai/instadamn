package X;

import com.meta.compose.material.bottomsheet.AnchoredDraggableKt;
import com.meta.compose.material.bottomsheet.AnchoredDraggableState;

/* renamed from: X.CUk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27964CUk {
    public Float A00;
    public final InterfaceC74963Ym A01;
    public final AnchoredDraggableState A02;
    public final C5Y6 A03;

    public C27964CUk(C5Y6 c5y6, InterfaceC74963Ym interfaceC74963Ym, InterfaceC1128957x interfaceC1128957x, C6Y c6y, Float f, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167027dH.A0a(1, c6y, interfaceC1128957x, interfaceC74963Ym, interfaceC16660sJ);
        C14360o3.A0B(c5y6, 5);
        this.A01 = interfaceC74963Ym;
        this.A03 = c5y6;
        this.A00 = f;
        this.A02 = new AnchoredDraggableState(c5y6, c6y, C29892DGg.A00(interfaceC1128957x, 35), C30179DRk.A01(interfaceC1128957x, 37), interfaceC16660sJ);
        if (this.A00 != null && c6y == C6Y.A03) {
            throw AbstractC166987dD.A12("The initial value must not be set to HalfExpanded if an initial height is set.");
        }
    }

    public final Object A00(InterfaceC23621Ds interfaceC23621Ds) {
        C6Y c6y = C6Y.A04;
        AnchoredDraggableState anchoredDraggableState = this.A02;
        Object A00 = AnchoredDraggableKt.A00(anchoredDraggableState, c6y, interfaceC23621Ds, anchoredDraggableState.A02.B72());
        C1JX c1jx = C1JX.A02;
        if (A00 != c1jx) {
            A00 = C0eB.A00;
        }
        if (A00 != c1jx) {
            return C0eB.A00;
        }
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r0.A00.containsKey(r1) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r4 = r6.A02
            X.3Yl r5 = r4.A04
            java.lang.Object r0 = r5.getValue()
            X.CWa r0 = (X.C28003CWa) r0
            X.C6Y r3 = X.C6Y.A02
            java.util.Map r0 = r0.A00
            boolean r2 = r0.containsKey(r3)
            X.3Yl r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            X.C6Y r0 = (X.C6Y) r0
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 != r0) goto L47
            java.lang.Object r0 = r5.getValue()
            X.CWa r0 = (X.C28003CWa) r0
            X.C6Y r1 = X.C6Y.A03
            java.util.Map r0 = r0.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L32
        L31:
            r1 = r3
        L32:
            X.57F r0 = r4.A02
            float r0 = r0.B72()
            java.lang.Object r1 = com.meta.compose.material.bottomsheet.AnchoredDraggableKt.A00(r4, r1, r7, r0)
            X.1JX r0 = X.C1JX.A02
            if (r1 == r0) goto L42
            X.0eB r1 = X.C0eB.A00
        L42:
            if (r1 == r0) goto L46
            X.0eB r1 = X.C0eB.A00
        L46:
            return r1
        L47:
            if (r2 != 0) goto L31
            X.C6Y r1 = X.C6Y.A04
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27964CUk.A01(X.1Ds):java.lang.Object");
    }
}
