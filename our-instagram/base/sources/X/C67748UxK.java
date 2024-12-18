package X;

import android.view.View;

/* renamed from: X.UxK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67748UxK extends VK4 {
    public final C011504d A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r4 <= 0.5d) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C67748UxK(android.view.View r7, X.C011504d r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.A00 = r8
            int r0 = r7.getSystemUiVisibility()
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            boolean r1 = X.AbstractC167007dF.A1M(r0)
            r6.A02 = r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.A01(r7)
            X.65O r0 = r0.A0K
            if (r0 == 0) goto L47
            X.65W r0 = r0.A00
            android.content.res.ColorStateList r0 = r0.A0B
        L1d:
            if (r0 == 0) goto L34
            int r0 = r0.getDefaultColor()
        L23:
            if (r0 == 0) goto L30
            double r4 = X.AbstractC56842jH.A00(r0)
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L31
        L30:
            r0 = 0
        L31:
            r6.A01 = r0
            return
        L34:
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L4c
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            goto L23
        L47:
            android.content.res.ColorStateList r0 = r7.getBackgroundTintList()
            goto L1d
        L4c:
            r6.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67748UxK.<init>(android.view.View, X.04d):void");
    }

    public static void A00(View view, C67748UxK c67748UxK) {
        int paddingLeft;
        int i;
        int top = view.getTop();
        C011504d c011504d = c67748UxK.A00;
        if (top < c011504d.A03()) {
            boolean z = c67748UxK.A01;
            int systemUiVisibility = view.getSystemUiVisibility();
            int i2 = systemUiVisibility & (-8193);
            if (z) {
                i2 = systemUiVisibility | 8192;
            }
            view.setSystemUiVisibility(i2);
            paddingLeft = view.getPaddingLeft();
            i = c011504d.A03() - view.getTop();
        } else {
            if (view.getTop() == 0) {
                return;
            }
            boolean z2 = c67748UxK.A02;
            int systemUiVisibility2 = view.getSystemUiVisibility();
            int i3 = systemUiVisibility2 & (-8193);
            if (z2) {
                i3 = systemUiVisibility2 | 8192;
            }
            view.setSystemUiVisibility(i3);
            paddingLeft = view.getPaddingLeft();
            i = 0;
        }
        AbstractC31177DnL.A0x(view, paddingLeft, i);
    }
}
