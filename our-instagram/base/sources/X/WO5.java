package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WO5 implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public WO5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        view.setOnTouchListener(new WO5(obj, i));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01ff, code lost:
    
        if (r3 != 3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0324, code lost:
    
        if (java.lang.Float.isNaN(r2.A01) != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        if (r1 == 0) goto L42;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0005 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Type inference failed for: r0v167, types: [X.8Ux, java.lang.Object] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WO5.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
