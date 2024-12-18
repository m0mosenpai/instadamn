package X;

import android.view.View;

/* renamed from: X.9iC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216559iC extends C3PD {
    public final int A00;
    public final Object A01;

    public static Object A01(View view, C216559iC c216559iC) {
        view.performHapticFeedback(3);
        return c216559iC.A01;
    }

    public static boolean A03(View view) {
        C14360o3.A0B(view, 0);
        return view.isEnabled();
    }

    public C216559iC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C3PF A00(C3P9 c3p9, Object obj, int i) {
        c3p9.A04 = new C216559iC(obj, i);
        return c3p9.A00();
    }

    public static void A02(C3P9 c3p9, Object obj, int i) {
        c3p9.A04 = new C216559iC(obj, i);
        c3p9.A00();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // X.C3PD, X.C3PE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQY(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L10;
                case 2: goto L5;
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            super.DQY(r4)
        L8:
            return
        L9:
            java.lang.Object r0 = r3.A01
            X.AAE r0 = (X.AAE) r0
            X.A9O r0 = r0.A00
            goto L16
        L10:
            java.lang.Object r0 = r3.A01
            X.9Us r0 = (X.C210959Us) r0
            X.A9O r0 = r0.A00
        L16:
            if (r0 == 0) goto L8
            X.8Nb r2 = r0.A01
            X.6lx r1 = r0.A03
            X.9Us r0 = r0.A02
            goto L2d
        L1f:
            java.lang.Object r0 = r3.A01
            X.9Ur r0 = (X.C210949Ur) r0
            X.A9N r0 = r0.A00
            if (r0 == 0) goto L8
            X.8Nb r2 = r0.A02
            X.6lx r1 = r0.A03
            X.9Ur r0 = r0.A01
        L2d:
            android.view.View r0 = r0.itemView
            X.C14360o3.A06(r0)
            r2.DoY(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216559iC.DQY(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x026b, code lost:
    
        if (r1 == r2) goto L99;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    @Override // X.C3PD, X.C3PE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DsE(android.view.View r24) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216559iC.DsE(android.view.View):boolean");
    }
}
