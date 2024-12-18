package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class KKp extends C3PD {
    public final int A00;
    public final Object A01;

    public static C45999KXn A00(View view, KKp kKp) {
        view.performHapticFeedback(3);
        return (C45999KXn) ((KCU) kKp.A01).A0p.getValue();
    }

    public KKp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A01(C3P9 c3p9, Object obj, int i) {
        c3p9.A04 = new KKp(obj, i);
        c3p9.A00();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04cf, code lost:
    
        if (r0 != null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f5, code lost:
    
        if (X.C18U.A06(r3, r10, 36321722379020013L) != false) goto L74;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0439  */
    @Override // X.C3PD, X.C3PE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DsE(android.view.View r22) {
        /*
            Method dump skipped, instructions count: 1754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KKp.DsE(android.view.View):boolean");
    }
}
