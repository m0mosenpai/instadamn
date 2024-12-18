package X;

import android.content.Context;

/* renamed from: X.Cta, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29169Cta implements InterfaceC59142nF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C40971v4 A02;

    public C29169Cta(Context context, C40971v4 c40971v4, int i) {
        this.A00 = i;
        this.A02 = c40971v4;
        this.A01 = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        if (r8 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        if (X.C14360o3.A0K(r8.A0C, true) == false) goto L11;
     */
    @Override // X.InterfaceC59142nF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap renderImage(android.graphics.Bitmap r17) {
        /*
            r16 = this;
            r6 = 0
            r7 = r17
            X.C14360o3.A0B(r7, r6)
            r10 = r16
            int r5 = r10.A00
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5, r5, r0)
            X.C14360o3.A07(r4)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r4)
            X.1v4 r0 = r10.A02
            X.5G3 r8 = r0.A0F
            r9 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            if (r8 == 0) goto Lb2
            java.lang.Boolean r0 = r8.A06
            boolean r0 = X.C14360o3.A0K(r0, r2)
            if (r0 == 0) goto Lb2
            r15 = 9
            r1 = 1090519040(0x41000000, float:8.0)
            android.content.Context r0 = r10.A01
            float r10 = X.AbstractC13690mv.A00(r0, r1)
        L35:
            java.lang.Boolean r0 = r8.A06
            boolean r0 = X.C14360o3.A0K(r0, r2)
            if (r0 == 0) goto L46
            java.lang.Boolean r0 = r8.A0C
            boolean r0 = X.C14360o3.A0K(r0, r2)
            r1 = 1
            if (r0 != 0) goto L47
        L46:
            r1 = 0
        L47:
            android.graphics.Paint r8 = X.AbstractC166987dD.A0S(r9)
            r0 = -256(0xffffffffffffff00, float:NaN)
            r8.setColor(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto Laf
            r11 = 1073741824(0x40000000, float:2.0)
            float r13 = (float) r5
            float r13 = r13 - r0
        L58:
            r12 = r11
            r14 = r13
            android.graphics.Path r0 = X.AbstractC225989yH.A00(r10, r11, r12, r13, r14, r15)
            r0.close()
            r3.drawPath(r0, r8)
            int r1 = r7.getWidth()
            int r0 = r7.getHeight()
            if (r1 < r0) goto L95
            int r1 = r7.getWidth()
            int r0 = r7.getHeight()
            int r1 = r1 - r0
            int r2 = r1 / 2
            int r1 = r7.getWidth()
            int r1 = r1 - r2
            int r0 = r7.getHeight()
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>(r2, r6, r1, r0)
        L87:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.AbstractC166997dE.A1D(r8, r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6, r6, r5, r5)
            r3.drawBitmap(r7, r9, r0, r8)
            return r4
        L95:
            int r1 = r7.getHeight()
            int r0 = r7.getWidth()
            int r1 = r1 - r0
            int r2 = r1 / 2
            int r1 = r7.getWidth()
            int r0 = r7.getHeight()
            int r0 = r0 - r2
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>(r6, r2, r1, r0)
            goto L87
        Laf:
            r11 = 0
            float r13 = (float) r5
            goto L58
        Lb2:
            r15 = 15
            android.content.Context r0 = r10.A01
            int r0 = X.AbstractC167017dG.A04(r0)
            float r10 = (float) r0
            if (r8 == 0) goto L46
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29169Cta.renderImage(android.graphics.Bitmap):android.graphics.Bitmap");
    }
}
