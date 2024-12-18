package X;

import android.view.View;

/* renamed from: X.FpI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35683FpI implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC35683FpI(EnumC33519Ers enumC33519Ers, EHf eHf, int i) {
        this.A00 = i;
        if (38 - i != 0) {
            this.A02 = eHf;
            this.A01 = enumC33519Ers;
        } else {
            this.A01 = enumC33519Ers;
            this.A02 = eHf;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new ViewOnClickListenerC35683FpI(i, obj, obj2), view);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x077a, code lost:
    
        if (X.EL4.A00(r3) != X.EnumC33330EoP.A03) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (r1 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x1805, code lost:
    
        if (r0.A04.size() != 1) goto L591;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:502:0x1370  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0268  */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, X.F7k] */
    /* JADX WARN: Type inference failed for: r4v44, types: [X.1lR, X.1OW] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r25) {
        /*
            Method dump skipped, instructions count: 6570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC35683FpI.onClick(android.view.View):void");
    }

    public ViewOnClickListenerC35683FpI(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
