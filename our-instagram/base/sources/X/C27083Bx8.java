package X;

import android.content.Context;

/* renamed from: X.Bx8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27083Bx8 extends C3Vd {
    public final int A00;
    public final boolean A01;

    public C27083Bx8(Context context) {
        this.A00 = AbstractC13690mv.A01(context, 10);
        this.A01 = AbstractC13620mo.A02(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r3 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        r1 = (r7.A00 + r9.getPageSize()) + r9.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (r11 == r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    @Override // X.C3Vd, X.InterfaceC74243Ve
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E4r(android.view.View r8, com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r9, float r10, int r11) {
        /*
            r7 = this;
            boolean r5 = X.AbstractC167017dG.A1a(r9, r8)
            int r1 = r9.getWidth()
            int r0 = r9.getPageSize()
            int r1 = r1 - r0
            int r0 = r1 / 2
            float r2 = (float) r0
            int r0 = r9.getPageSize()
            float r0 = (float) r0
            float r0 = r0 * r10
            float r2 = r2 + r0
            float r0 = r9.A00
            float r10 = r10 * r0
            float r2 = r2 + r10
            android.widget.Adapter r0 = r9.getAdapter()
            if (r0 == 0) goto Lc3
            int r0 = r0.getCount()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L29:
            boolean r6 = r7.A01
            r1 = 1
            if (r6 == 0) goto Lb5
            if (r11 != 0) goto Lc0
        L30:
            r3 = 1
        L31:
            if (r6 != 0) goto L3b
            if (r4 == 0) goto La5
            int r0 = r4.intValue()
            int r1 = r0 + (-2)
        L3b:
            if (r11 != r1) goto La5
            int r1 = r9.getWidth()
            int r0 = r9.getPageSize()
            int r1 = r1 - r0
            int r0 = r9.getPageSize()
            int r1 = r1 - r0
            float r1 = (float) r1
            float r0 = r9.A00
            float r1 = r1 - r0
        L4f:
            int r0 = r7.A00
            float r0 = (float) r0
            float r1 = r1 - r0
        L53:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L58
            r2 = r1
        L58:
            android.widget.Adapter r0 = r9.getAdapter()
            if (r0 == 0) goto La3
            int r0 = r0.getCount()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L66:
            r3 = 1
            if (r6 == 0) goto L95
            if (r4 == 0) goto L9d
            int r0 = r4.intValue()
            int r0 = r0 - r5
            boolean r1 = X.AbstractC167007dF.A1P(r11, r0)
            int r0 = r4.intValue()
            int r0 = r0 + (-2)
            if (r11 == r0) goto L7d
            r3 = 0
        L7d:
            if (r1 != 0) goto L9a
            if (r3 == 0) goto L9d
        L81:
            int r1 = r7.A00
            int r0 = r9.getPageSize()
            int r1 = r1 + r0
            float r1 = (float) r1
            float r0 = r9.A00
            float r1 = r1 + r0
        L8c:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L91
            r2 = r1
        L91:
            r8.setTranslationX(r2)
            return
        L95:
            if (r11 == 0) goto L9a
            if (r11 != r5) goto L9d
            goto L81
        L9a:
            int r0 = r7.A00
            goto La1
        L9d:
            int r0 = r9.getWidth()
        La1:
            float r1 = (float) r0
            goto L8c
        La3:
            r4 = 0
            goto L66
        La5:
            int r1 = r9.getWidth()
            if (r3 == 0) goto Lb2
            int r0 = r9.getPageSize()
            int r1 = r1 - r0
            float r1 = (float) r1
            goto L4f
        Lb2:
            float r0 = (float) r1
            float r1 = -r0
            goto L53
        Lb5:
            if (r4 == 0) goto Lc0
            int r0 = r4.intValue()
            int r0 = r0 - r5
            if (r11 != r0) goto Lc0
            goto L30
        Lc0:
            r3 = 0
            goto L31
        Lc3:
            r4 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27083Bx8.E4r(android.view.View, com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager, float, int):void");
    }
}
