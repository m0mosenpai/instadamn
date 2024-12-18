package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class LQP implements View.OnTouchListener {
    public final /* synthetic */ L5R A00;

    public LQP(L5R l5r) {
        this.A00 = l5r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r6.A08 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r4.FAE(r6.A00, r6.A01, r10.getRawY() - r6.A01) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r6.A09 != false) goto L6;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            X.L5R r6 = r8.A00
            boolean r2 = r6.A06
            r7 = 1
            if (r2 != 0) goto Lc
            boolean r0 = r6.A09
            r1 = 1
            if (r0 == 0) goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r2 == 0) goto L13
            X.8i5 r0 = r6.A05
            if (r0 != 0) goto L15
        L13:
            if (r1 == 0) goto L21
        L15:
            X.LQO r0 = r6.A0D
            r0.onTouch(r9, r10)
            if (r1 == 0) goto L21
            boolean r0 = r6.A08
            r5 = 1
            if (r0 != 0) goto L22
        L21:
            r5 = 0
        L22:
            boolean r0 = r6.A06
            if (r0 == 0) goto L40
            boolean r0 = r6.A08
            if (r0 == 0) goto L40
            X.8i5 r4 = r6.A05
            if (r4 == 0) goto L40
            float r3 = r6.A00
            float r2 = r6.A01
            float r1 = r10.getRawY()
            float r0 = r6.A01
            float r1 = r1 - r0
            boolean r1 = r4.FAE(r3, r2, r1)
            r0 = 1
            if (r1 != 0) goto L41
        L40:
            r0 = 0
        L41:
            if (r5 != 0) goto L46
            if (r0 != 0) goto L46
            r7 = 0
        L46:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LQP.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
