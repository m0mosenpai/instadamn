package X;

import android.view.View;

/* renamed from: X.OkC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55458OkC implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public ViewOnClickListenerC55458OkC(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public static void A01(View view, Object obj, int i, int i2) {
        C0fQ.A00(new ViewOnClickListenerC55458OkC(obj, i, i2), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0183, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0065. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC55458OkC.onClick(android.view.View):void");
    }

    public static int A00(View view, ViewOnClickListenerC55458OkC viewOnClickListenerC55458OkC, int i) {
        int A05 = C0f9.A05(i);
        OH0 oh0 = ((C51145Mio) viewOnClickListenerC55458OkC.A02).A00;
        if (oh0 != null) {
            int i2 = viewOnClickListenerC55458OkC.A01;
            C14360o3.A0A(view);
            oh0.A00(view, i2);
        }
        return A05;
    }
}
