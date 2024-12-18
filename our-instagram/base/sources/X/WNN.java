package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WNN implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public WNN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new WNN(obj, i), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:378:0x0a8c, code lost:
    
        if (r1 != 3) goto L344;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r26) {
        /*
            Method dump skipped, instructions count: 3954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WNN.onClick(android.view.View):void");
    }
}
