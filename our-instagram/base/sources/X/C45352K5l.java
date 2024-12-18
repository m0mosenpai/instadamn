package X;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.K5l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45352K5l extends AbstractC44367Jj6 {
    public float A00;
    public AnonymousClass693 A01;
    public final float A03;
    public boolean A02 = true;
    public final Path A04 = AbstractC166987dD.A0T();
    public final RectF A05 = AbstractC166987dD.A0X();

    public C45352K5l(C161227Kh c161227Kh, float f) {
        this.A03 = f;
        c161227Kh.A02(new C50358MLk(this, 30), new EnumC46207Kcj[]{EnumC46207Kcj.A03});
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        throw r0;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            r5 = 0
            X.C14360o3.A0B(r7, r5)
            boolean r0 = r6.A02
            if (r0 == 0) goto L2f
            X.693 r4 = r6.A01
            if (r4 == 0) goto L2f
            int r0 = X.AbstractC166997dE.A0H(r6)
            r3 = 600(0x258, float:8.41E-43)
            if (r3 >= r0) goto L15
            r3 = r0
        L15:
            int r2 = r4.getIntrinsicHeight()
            int r2 = r2 * r3
            int r0 = r4.getIntrinsicWidth()
            int r2 = r2 / r0
            int r1 = X.AbstractC166997dE.A0F(r6)
            int r0 = r3 / 2
            int r1 = r1 - r0
            float r0 = (float) r1
            r6.A00 = r0
            r4.setBounds(r5, r5, r3, r2)
            r4.E4S()
        L2f:
            r6.A02 = r5
            android.graphics.Path r3 = r6.A04
            r3.rewind()
            android.graphics.RectF r2 = r6.A05
            float r1 = r6.A03
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r3.addRoundRect(r2, r1, r1, r0)
            int r4 = r7.save()
            r7.clipPath(r3)
            r1 = 1069547520(0x3fc00000, float:1.5)
            int r0 = X.AbstractC166997dE.A0F(r6)     // Catch: java.lang.Throwable -> L79
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L79
            r3 = 0
            int r2 = r7.save()     // Catch: java.lang.Throwable -> L79
            r7.scale(r1, r1, r0, r3)     // Catch: java.lang.Throwable -> L79
            float r0 = r6.A00     // Catch: java.lang.Throwable -> L74
            int r1 = r7.save()     // Catch: java.lang.Throwable -> L74
            r7.translate(r0, r3)     // Catch: java.lang.Throwable -> L74
            X.693 r0 = r6.A01     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L65
            r0.draw(r7)     // Catch: java.lang.Throwable -> L6f
        L65:
            r7.restoreToCount(r1)     // Catch: java.lang.Throwable -> L74
            r7.restoreToCount(r2)     // Catch: java.lang.Throwable -> L79
            r7.restoreToCount(r4)
            return
        L6f:
            r0 = move-exception
            r7.restoreToCount(r1)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r0 = move-exception
            r7.restoreToCount(r2)     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.Throwable -> L79
        L79:
            r0 = move-exception
            r7.restoreToCount(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45352K5l.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A02 = true;
        AbstractC44367Jj6.A01(rect, this.A05);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
