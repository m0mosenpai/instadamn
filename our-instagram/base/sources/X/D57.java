package X;

import com.instagram.barcelona.common.ui.toast.ToastDragDismissState;

/* loaded from: classes5.dex */
public final class D57 extends AbstractC23611Dp implements InterfaceC16610sE {
    public float A00;
    public int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D57(ToastDragDismissState toastDragDismissState, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = toastDragDismissState;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A02;
        float A09 = AbstractC166987dD.A09(obj2);
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        ToastDragDismissState toastDragDismissState = (ToastDragDismissState) this.A03;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        D57 d57 = new D57(toastDragDismissState, interfaceC23621Ds, i);
        d57.A00 = A09;
        return d57.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A01
            r3 = 1
            if (r1 == 0) goto L1f
            if (r0 != 0) goto L2d
            X.AbstractC09560e7.A00(r6)
            float r2 = r5.A00
            java.lang.Object r1 = r5.A03
            com.instagram.barcelona.common.ui.toast.ToastDragDismissState r1 = (com.instagram.barcelona.common.ui.toast.ToastDragDismissState) r1
            X.3Yl r0 = r1.A04
        L16:
            r5.A01 = r3
            java.lang.Object r0 = r1.A00(r0, r5, r2)
            if (r0 != r4) goto L30
            return r4
        L1f:
            if (r0 != 0) goto L2d
            X.AbstractC09560e7.A00(r6)
            float r2 = r5.A00
            java.lang.Object r1 = r5.A03
            com.instagram.barcelona.common.ui.toast.ToastDragDismissState r1 = (com.instagram.barcelona.common.ui.toast.ToastDragDismissState) r1
            X.3Yl r0 = r1.A03
            goto L16
        L2d:
            X.AbstractC09560e7.A00(r6)
        L30:
            X.0eB r4 = X.C0eB.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D57.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
