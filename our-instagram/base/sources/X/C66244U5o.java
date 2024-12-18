package X;

import android.view.View;

/* renamed from: X.U5o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66244U5o implements InterfaceC71941XBq {
    public final /* synthetic */ DialogC51582Yg A03;
    public boolean A02 = false;
    public int A01 = 0;
    public int A00 = -1;

    public C66244U5o(DialogC51582Yg dialogC51582Yg) {
        this.A03 = dialogC51582Yg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r3 == r9.getHeight()) goto L9;
     */
    @Override // X.InterfaceC71941XBq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DZj(android.view.View r9, int r10) {
        /*
            r8 = this;
            android.view.ViewParent r1 = r9.getParent()
            boolean r0 = r1 instanceof android.view.View
            r5 = 0
            if (r0 == 0) goto L8c
            android.view.View r1 = (android.view.View) r1
            int r4 = r1.getPaddingBottom()
        Lf:
            int r3 = r8.A00
            r2 = 1
            if (r3 <= 0) goto L1b
            int r0 = r9.getHeight()
            r1 = 1
            if (r3 != r0) goto L1c
        L1b:
            r1 = 0
        L1c:
            int r0 = r8.A01
            if (r0 == r4) goto L21
            r5 = 1
        L21:
            boolean r0 = r8.A02
            if (r0 != 0) goto L8e
            if (r1 != 0) goto L8e
            if (r5 != 0) goto L8e
            int r2 = r9.getTop()
            int r10 = r10 - r4
            X.2Yg r5 = r8.A03
            boolean r0 = r5.A0H
            if (r0 == 0) goto L87
            r1 = r10
        L35:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L84
            if (r1 == 0) goto L84
            int r10 = r10 - r2
            float r7 = (float) r10
            float r0 = (float) r1
            float r7 = r7 / r0
        L3f:
            r5.A00 = r7
            X.VZr r0 = r5.A05
            if (r0 == 0) goto L76
            X.U4a r0 = r0.A00
            X.U4d r0 = r0.A08
            if (r0 == 0) goto L76
            X.U4a r0 = X.C66207U4d.A01(r0)
            X.U4c r6 = r0.A03
            if (r6 == 0) goto L76
            X.U4b r4 = r6.A08
            if (r4 == 0) goto L76
            r0 = 0
            r3 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L80
            int r2 = r6.A02
            int r0 = r6.A01
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r7, r0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r0 = X.AbstractC56842jH.A06(r2, r0)
            if (r0 == 0) goto L80
            r4.A01(r0)
            r6.setForeground(r4)
        L76:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L7f
            float r0 = r5.A00
            X.DialogC51582Yg.A01(r5, r0)
        L7f:
            return
        L80:
            r6.setForeground(r3)
            goto L76
        L84:
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L3f
        L87:
            int r1 = r9.getHeight()
            goto L35
        L8c:
            r4 = 0
            goto Lf
        L8e:
            r8.A01 = r4
            r8.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66244U5o.DZj(android.view.View, int):void");
    }

    @Override // X.InterfaceC71941XBq
    public final void DZo(View view, InterfaceC51602Yi interfaceC51602Yi) {
        this.A00 = view.getHeight();
        this.A02 = false;
        DialogC51582Yg dialogC51582Yg = this.A03;
        dialogC51582Yg.A09.A05.A09();
        if (interfaceC51602Yi == DialogC51582Yg.A0M) {
            if (!dialogC51582Yg.A0F) {
                dialogC51582Yg.A06(C05F.A00);
            }
            dialogC51582Yg.A03();
        }
    }
}
