package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WNU implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public WNU(C70894Wjn c70894Wjn, int i) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A01 = c70894Wjn;
        } else {
            this.A01 = c70894Wjn;
        }
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new WNU(obj, i), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x073c, code lost:
    
        if (r1 != 3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0610, code lost:
    
        if (r4.A0B != false) goto L78;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x079b  */
    /* JADX WARN: Type inference failed for: r1v109, types: [java.lang.Object, X.5ST] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r38) {
        /*
            Method dump skipped, instructions count: 3902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WNU.onClick(android.view.View):void");
    }

    public WNU(V01 v01, int i) {
        this.A00 = i;
        this.A01 = v01;
    }

    public WNU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
