package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class W4O {
    public final UserSession A00;
    public final Activity A01;
    public final Rect A03 = new Rect();
    public final Rect A02 = new Rect();

    public static final void A00(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = i + view.getWidth();
        rect.bottom = iArr[1] + view.getHeight();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r7 > r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r7 > r1.bottom) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(float r6, float r7) {
        /*
            r5 = this;
            android.graphics.Rect r2 = r5.A03
            boolean r0 = r2.isEmpty()
            r4 = 0
            if (r0 == 0) goto L17
            android.app.Activity r1 = r5.A01
            r0 = 2131430060(0x7f0b0aac, float:1.848181E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L6e
            A00(r0, r2)
        L17:
            android.graphics.Rect r1 = r5.A02
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L2d
            android.app.Activity r3 = r5.A01
            r0 = 2131430058(0x7f0b0aaa, float:1.8481806E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L6e
            A00(r0, r1)
        L2d:
            int r0 = r2.left
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L4a
            int r0 = r2.right
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L4a
            int r0 = r2.top
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L4a
            int r0 = r2.bottom
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r2 = 1
            if (r0 <= 0) goto L4b
        L4a:
            r2 = 0
        L4b:
            int r0 = r1.left
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L68
            int r0 = r1.right
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L68
            int r0 = r1.top
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L68
            int r0 = r1.bottom
            float r0 = (float) r0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L69
        L68:
            r0 = 0
        L69:
            if (r2 != 0) goto L6d
            if (r0 == 0) goto L6e
        L6d:
            r4 = 1
        L6e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W4O.A01(float, float):boolean");
    }

    public W4O(Activity activity, UserSession userSession) {
        this.A01 = activity;
        this.A00 = userSession;
    }
}
