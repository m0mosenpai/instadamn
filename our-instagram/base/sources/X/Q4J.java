package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes10.dex */
public final class Q4J extends TouchDelegate {
    public boolean A00;
    public final int A01;
    public final Rect A02;
    public final Rect A03;
    public final Rect A04;
    public final View A05;

    public Q4J(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.A01 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.A04 = AbstractC166987dD.A0U();
        this.A03 = AbstractC166987dD.A0U();
        this.A02 = AbstractC166987dD.A0U();
        this.A04.set(rect);
        Rect rect3 = this.A03;
        rect3.set(rect);
        int i = -this.A01;
        rect3.inset(i, i);
        this.A02.set(rect2);
        this.A05 = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r7.A03.contains(r3, r2) == false) goto L19;
     */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.getX()
            int r3 = (int) r0
            float r0 = r8.getY()
            int r2 = (int) r0
            int r6 = r8.getAction()
            r4 = 2
            r5 = 1
            r1 = 0
            if (r6 == 0) goto L56
            if (r6 == r5) goto L40
            if (r6 == r4) goto L40
            r0 = 3
            if (r6 != r0) goto L3f
            boolean r0 = r7.A00
            r7.A00 = r1
            if (r0 == 0) goto L3f
        L20:
            android.graphics.Rect r0 = r7.A02
            boolean r0 = r0.contains(r3, r2)
            if (r0 != 0) goto L4c
            android.view.View r1 = r7.A05
            int r0 = r1.getWidth()
            int r0 = r0 / r4
            float r3 = (float) r0
            int r2 = r1.getHeight()
            int r2 = r2 / r4
        L35:
            float r0 = (float) r2
            r8.setLocation(r3, r0)
            android.view.View r0 = r7.A05
            boolean r1 = r0.dispatchTouchEvent(r8)
        L3f:
            return r1
        L40:
            boolean r0 = r7.A00
            if (r0 == 0) goto L3f
            android.graphics.Rect r0 = r7.A03
            boolean r0 = r0.contains(r3, r2)
            if (r0 != 0) goto L20
        L4c:
            android.graphics.Rect r1 = r7.A02
            int r0 = r1.left
            int r3 = r3 - r0
            float r3 = (float) r3
            int r0 = r1.top
            int r2 = r2 - r0
            goto L35
        L56:
            android.graphics.Rect r0 = r7.A04
            boolean r0 = r0.contains(r3, r2)
            if (r0 == 0) goto L3f
            r7.A00 = r5
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q4J.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
