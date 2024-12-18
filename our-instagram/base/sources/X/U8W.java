package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;

/* loaded from: classes11.dex */
public final class U8W extends Drawable {
    public static final Handler A09 = AbstractC167007dF.A0J();
    public float A00;
    public int A01;
    public boolean A04;
    public RectF A05;
    public final Paint A06;
    public final Runnable A08 = new RunnableC71324Wrs(this);
    public final Runnable A07 = new RunnableC71325Wrt(this);
    public long A03 = -1;
    public int A02 = 128;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            long r6 = r8.A03
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L46
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r6
            r1 = 400(0x190, double:1.976E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L46
            float r3 = (float) r4
            r2 = 1128792064(0x43480000, float:200.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            float r0 = X.AbstractC13600mm.A01(r3, r1, r2, r0, r1)
            r8.A00 = r0
            float r0 = java.lang.Math.max(r0, r1)
            r8.A00 = r0
            r3 = 1
        L26:
            android.graphics.Paint r2 = r8.A06
            int r0 = r8.A02
            float r1 = (float) r0
            float r0 = r8.A00
            float r1 = r1 * r0
            int r1 = (int) r1
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            int r1 = r1 * r0
            r2.setColor(r1)
            android.graphics.RectF r1 = r8.A05
            X.AbstractC65702TsY.A0x(r1, r8)
            int r0 = r8.A01
            float r0 = (float) r0
            r9.drawRoundRect(r1, r0, r0, r2)
            if (r3 == 0) goto L45
            r8.invalidateSelf()
        L45:
            return
        L46:
            r3 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U8W.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    public U8W() {
        Paint paint = new Paint();
        this.A06 = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-65536);
        this.A05 = new RectF();
    }

    public final void A00(MotionEvent motionEvent) {
        Handler handler;
        Runnable runnable;
        long j;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    if (this.A04) {
                        this.A04 = false;
                        A09.removeCallbacks(this.A08);
                        return;
                    }
                } else {
                    return;
                }
            } else if (this.A04) {
                handler = A09;
                runnable = this.A07;
                j = 200;
            }
            this.A03 = System.currentTimeMillis();
            this.A04 = false;
            invalidateSelf();
            return;
        }
        handler = A09;
        handler.removeCallbacks(this.A07);
        this.A04 = true;
        runnable = this.A08;
        j = 75;
        handler.postDelayed(runnable, j);
    }
}
