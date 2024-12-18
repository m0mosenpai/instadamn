package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WNT implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public WNT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new WNT(obj, i), view);
    }

    public static void A01(FRW frw, Integer num, Object obj, int i) {
        frw.A00(new WNT(obj, i), num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:381:0x0f2a, code lost:
    
        if (r1.isEmpty() != false) goto L359;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:527:0x1385  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x138c  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r35) {
        /*
            Method dump skipped, instructions count: 5744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WNT.onClick(android.view.View):void");
    }
}
