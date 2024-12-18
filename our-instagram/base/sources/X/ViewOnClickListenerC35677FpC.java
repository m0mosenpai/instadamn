package X;

import android.view.View;

/* renamed from: X.FpC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35677FpC implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC35677FpC(C32369ENt c32369ENt, int i) {
        this.A00 = i;
        switch (i) {
            case 21:
            case 22:
                this.A01 = c32369ENt;
                return;
            default:
                this.A01 = c32369ENt;
                return;
        }
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC35677FpC(obj, i), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x0c90, code lost:
    
        if (r1.A01 == null) goto L247;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.2pq, androidx.fragment.app.Fragment, X.Ekp] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r16) {
        /*
            Method dump skipped, instructions count: 4294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC35677FpC.onClick(android.view.View):void");
    }

    public ViewOnClickListenerC35677FpC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
