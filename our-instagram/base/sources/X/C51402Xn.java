package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import com.facebook.litho.ComponentHost;

/* renamed from: X.2Xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51402Xn extends TouchDelegate {
    public static final Rect A02 = new Rect();
    public C005101q A00;
    public final C005101q A01;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r0.contains(r12, r11) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r15.getAction() == 1) goto L16;
     */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            r5 = 0
            X.C14360o3.A0B(r15, r5)
            X.01q r4 = r14.A01
            int r3 = r4.A00()
            r2 = 1
            int r3 = r3 - r2
        Lc:
            r0 = -1
            if (r0 >= r3) goto Lb7
            java.lang.Object r10 = r4.A04(r3)
            X.3uA r10 = (X.C86943uA) r10
            if (r10 == 0) goto Lb3
            float r0 = r15.getX()
            int r12 = (int) r0
            float r0 = r15.getY()
            int r11 = (int) r0
            X.3h4 r0 = r10.A02
            com.facebook.rendercore.RenderTreeNode r1 = r0.A01
            java.lang.Object r0 = r1.A07
            X.2WE r0 = X.C78993g5.A00(r0)
            android.graphics.Rect r9 = r0.A04
            if (r9 == 0) goto Lb3
            android.graphics.Rect r1 = r1.A03
            int r8 = r1.left
            int r0 = r9.left
            int r8 = r8 - r0
            int r7 = r1.top
            int r0 = r9.top
            int r7 = r7 - r0
            int r6 = r1.right
            int r0 = r9.right
            int r6 = r6 + r0
            int r1 = r1.bottom
            int r0 = r9.bottom
            int r1 = r1 + r0
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>(r8, r7, r6, r1)
            android.view.View r6 = r10.A01
            android.content.Context r0 = r6.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r9 = r0.getScaledTouchSlop()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r0.set(r13)
            int r1 = -r9
            r0.inset(r1, r1)
            int r7 = r15.getAction()
            r1 = 1
            r8 = 2
            if (r7 == 0) goto Lac
            if (r7 == r2) goto L99
            if (r7 == r8) goto L99
            r0 = 3
            if (r7 != r0) goto Lb3
            boolean r7 = r10.A00
        L75:
            r10.A00 = r5
        L77:
            if (r7 == 0) goto Lb3
            if (r1 == 0) goto L91
            int r0 = r6.getWidth()
            int r0 = r0 / r8
            float r1 = (float) r0
            int r0 = r6.getHeight()
            int r0 = r0 / r8
            float r0 = (float) r0
            r15.setLocation(r1, r0)
        L8a:
            boolean r0 = r6.dispatchTouchEvent(r15)
            if (r0 != r2) goto Lb3
            return r2
        L91:
            int r0 = r9 * 2
            float r0 = (float) r0
            float r0 = -r0
            r15.setLocation(r0, r0)
            goto L8a
        L99:
            boolean r7 = r10.A00
            if (r7 == 0) goto La4
            boolean r0 = r0.contains(r12, r11)
            r1 = 0
            if (r0 == 0) goto La5
        La4:
            r1 = 1
        La5:
            int r0 = r15.getAction()
            if (r0 != r2) goto L77
            goto L75
        Lac:
            boolean r7 = r13.contains(r12, r11)
            r10.A00 = r7
            goto L77
        Lb3:
            int r3 = r3 + (-1)
            goto Lc
        Lb7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51402Xn.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C51402Xn(ComponentHost componentHost) {
        super(A02, componentHost);
        this.A01 = new C005101q(10);
    }
}
