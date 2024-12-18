package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes11.dex */
public final class UN2 extends AbstractC59202nL {
    public final /* synthetic */ UM2 A00;

    public UN2(UM2 um2) {
        this.A00 = um2;
    }

    @Override // X.AbstractC59202nL, X.InterfaceC59212nM
    public final void DGC(Drawable drawable, C59392ni c59392ni, C2nP c2nP, Throwable th, long j) {
        UM2 um2 = this.A00;
        um2.A01();
        SO3 so3 = um2.A02;
        if (so3 == null) {
            C14360o3.A0F("logger");
            throw C00O.createAndThrow();
        }
        so3.A01(VHg.ERROR, um2.A0D);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // X.AbstractC59202nL, X.InterfaceC59212nM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DH2(android.graphics.drawable.Drawable r6, X.C59392ni r7, X.C2nP r8, X.C3QB r9, int r10, long r11) {
        /*
            r5 = this;
            X.UM2 r3 = r5.A00
            X.SO3 r0 = r3.A02
            java.lang.String r4 = "logger"
            r2 = 0
            if (r0 == 0) goto L49
            r0.A00()
            java.util.Map r1 = r7.A09
            if (r1 == 0) goto L16
            java.lang.String r0 = "LOAD_SOURCE"
            java.lang.Object r2 = r1.get(r0)
        L16:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L46
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L46
            java.lang.String r0 = "network"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L32
            X.VHg r2 = X.VHg.NETWORK
        L28:
            X.SO3 r1 = r3.A02
            if (r1 == 0) goto L49
            java.lang.String r0 = r3.A0D
            r1.A01(r2, r0)
            return
        L32:
            java.lang.String r0 = "disk"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L43
            java.lang.String r1 = "memory"
            r0 = 0
            boolean r0 = X.AbstractC002300n.A0h(r2, r1, r0)
            if (r0 == 0) goto L46
        L43:
            X.VHg r2 = X.VHg.CACHE
            goto L28
        L46:
            X.VHg r2 = X.VHg.NONE
            goto L28
        L49:
            X.C14360o3.A0F(r4)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UN2.DH2(android.graphics.drawable.Drawable, X.2ni, X.2nP, X.3QB, int, long):void");
    }

    @Override // X.AbstractC59202nL, X.InterfaceC59212nM
    public final void DMv(C2nP c2nP, C3QB c3qb, long j) {
        View view;
        int width;
        if (c3qb != null && (view = this.A00.A00) != null) {
            int width2 = c3qb.getWidth();
            Integer valueOf = Integer.valueOf(width2);
            if (width2 != 0 && valueOf != null && view.getMinimumHeight() != (width = (view.getWidth() * c3qb.getHeight()) / width2)) {
                view.setMinimumHeight(width);
            }
        }
        SO3 so3 = this.A00.A02;
        if (so3 == null) {
            C14360o3.A0F("logger");
            throw C00O.createAndThrow();
        }
        so3.A00();
    }
}
