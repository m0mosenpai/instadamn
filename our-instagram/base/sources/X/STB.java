package X;

/* loaded from: classes10.dex */
public abstract class STB {
    public static final InterfaceC65571Tn4 A00 = new QBG();

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C63791Stl A00(android.graphics.drawable.Drawable r6, X.InterfaceC65571Tn4 r7, int r8, int r9) {
        /*
            android.graphics.drawable.Drawable r4 = r6.getCurrent()
            boolean r0 = r4 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L18
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            android.graphics.Bitmap r2 = r4.getBitmap()
        Le:
            X.Tn4 r7 = X.STB.A00
        L10:
            if (r2 == 0) goto L3e
            X.Stl r0 = new X.Stl
            r0.<init>(r2, r7)
            return r0
        L18:
            boolean r0 = r4 instanceof android.graphics.drawable.Animatable
            if (r0 != 0) goto L8a
            java.lang.String r6 = "Unable to draw "
            r3 = 5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            java.lang.String r2 = "DrawableToBitmap"
            if (r8 != r1) goto L40
            int r0 = r4.getIntrinsicWidth()
            if (r0 > 0) goto L40
            boolean r0 = android.util.Log.isLoggable(r2, r3)
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r1 = X.AbstractC166997dE.A11(r6)
            r1.append(r4)
            java.lang.String r0 = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width"
        L3b:
            X.AbstractC58320PtC.A1O(r0, r2, r1)
        L3e:
            r0 = 0
            return r0
        L40:
            if (r9 != r1) goto L58
            int r0 = r4.getIntrinsicHeight()
            if (r0 > 0) goto L58
            boolean r0 = android.util.Log.isLoggable(r2, r3)
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r1 = X.AbstractC166997dE.A11(r6)
            r1.append(r4)
            java.lang.String r0 = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height"
            goto L3b
        L58:
            int r0 = r4.getIntrinsicWidth()
            if (r0 <= 0) goto L62
            int r8 = r4.getIntrinsicWidth()
        L62:
            int r0 = r4.getIntrinsicHeight()
            if (r0 <= 0) goto L6c
            int r9 = r4.getIntrinsicHeight()
        L6c:
            java.util.concurrent.locks.Lock r3 = X.AbstractC63265SgP.A02
            r3.lock()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = r7.AXA(r8, r9, r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L8c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            r0 = 0
            r4.setBounds(r0, r0, r8, r9)     // Catch: java.lang.Throwable -> L8c
            r4.draw(r1)     // Catch: java.lang.Throwable -> L8c
            r1.setBitmap(r5)     // Catch: java.lang.Throwable -> L8c
            r3.unlock()
            goto L10
        L8a:
            r2 = 0
            goto Le
        L8c:
            r0 = move-exception
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STB.A00(android.graphics.drawable.Drawable, X.Tn4, int, int):X.Stl");
    }
}
