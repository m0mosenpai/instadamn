package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.R;

/* renamed from: X.6RL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6RL extends Drawable implements Drawable.Callback, InterfaceC55932he {
    public boolean A00;
    public long A01;
    public boolean A02;
    public final Resources A03;
    public final Drawable A04;
    public final C6RB A05;
    public final Integer A06;
    public final long A07;
    public final long A08;
    public final C75C A09;
    public static final C55942hf A0B = C55942hf.A03(5.0d, 10.0d);
    public static final Interpolator A0A = new AccelerateInterpolator();

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            r9 = 0
            X.C14360o3.A0B(r13, r9)
            long r4 = java.lang.System.currentTimeMillis()
            boolean r0 = r12.A02
            if (r0 != 0) goto L10
            boolean r0 = r12.A00
            if (r0 == 0) goto Lbe
        L10:
            long r6 = r12.A01
            long r0 = r12.A08
            long r10 = r6 + r0
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 < 0) goto Lbe
            long r2 = r12.A07
            long r10 = r10 + r2
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto Lb5
            long r4 = r4 - r6
            float r7 = (float) r4
            float r6 = (float) r0
            long r0 = r0 + r2
            float r5 = (float) r0
            r4 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            float r5 = r5 - r6
            float r1 = r3 - r4
            r2 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L34
            float r7 = r7 - r6
            float r2 = r7 / r5
        L34:
            float r2 = r2 * r1
            float r2 = r2 + r4
            X.75C r0 = r12.A09
            if (r0 == 0) goto L48
            X.9pL r0 = r0.A00
            android.graphics.drawable.GradientDrawable r1 = r0.A02
            r0 = 1132396544(0x437f0000, float:255.0)
            float r0 = X.AbstractC13600mm.A02(r2, r3, r4, r3, r0)
            int r0 = (int) r0
            r1.setAlpha(r0)
        L48:
            android.view.animation.Interpolator r0 = X.C6RL.A0A
            float r2 = r0.getInterpolation(r2)
        L4e:
            android.graphics.drawable.Drawable r0 = r12.A04
            android.graphics.Rect r1 = r0.getBounds()
            X.C14360o3.A07(r1)
            r3 = 0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r0
            int r0 = java.lang.Math.round(r2)
            X.6RB r4 = r12.A05
            r4.setAlpha(r0)
            r13.save()
            java.lang.Integer r2 = r12.A06
            java.lang.Integer r0 = X.C05F.A00
            if (r2 != r0) goto L96
            r13.translate(r3, r3)
            int r5 = r1.centerX()
            int r0 = r4.A0A
            int r0 = r0 / 2
            int r5 = r5 - r0
            int r3 = r1.top
            int r0 = r4.A06
            int r3 = r3 - r0
            int r2 = r1.centerX()
            int r0 = r4.A0A
            int r0 = r0 / 2
            int r2 = r2 + r0
            int r1 = r1.top
        L89:
            r4.setBounds(r5, r3, r2, r1)
            r4.draw(r13)
            r13.restore()
            r12.invalidateSelf()
        L95:
            return
        L96:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r13.translate(r3, r0)
            int r5 = r1.centerX()
            int r0 = r4.A0A
            int r0 = r0 / 2
            int r5 = r5 - r0
            int r3 = r1.bottom
            int r2 = r1.centerX()
            int r0 = r4.A0A
            int r0 = r0 / 2
            int r2 = r2 + r0
            int r1 = r1.bottom
            int r0 = r4.A06
            int r1 = r1 + r0
            goto L89
        Lb5:
            X.75C r0 = r12.A09
            if (r0 == 0) goto L95
            X.9pL r0 = r0.A00
            r0.A00 = r9
            return
        Lbe:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6RL.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C14360o3.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public final void A00() {
        this.A01 = 0L;
        this.A02 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A05.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A05.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6RL(C6RK c6rk) {
        Context context = c6rk.A09;
        this.A03 = context.getResources();
        Drawable drawable = c6rk.A0A;
        this.A04 = drawable;
        this.A09 = c6rk.A05;
        this.A06 = c6rk.A06;
        int i = c6rk.A02;
        this.A08 = c6rk.A03;
        this.A07 = 500L;
        C6RB c6rb = new C6RB(context, c6rk.A00);
        c6rb.setCallback(this);
        c6rb.A0K(Layout.Alignment.ALIGN_CENTER);
        c6rb.A0C(0.0f, i);
        c6rb.A0F(-1);
        c6rb.A0A(c6rk.A01);
        c6rb.A0I(c6rk.A04);
        if (c6rk.A08) {
            c6rb.A0N = true;
            Context context2 = c6rb.A0Z;
            C14360o3.A07(context2);
            c6rb.A0D(AbstractC13880nE.A00(context2, 8.0f), 0.0f, 0.0f, context2.getColor(R.color.background));
        }
        String str = c6rk.A07;
        if (str != null && str.length() != 0) {
            c6rb.A0M(str);
        }
        this.A05 = c6rb;
        this.A00 = true;
        this.A02 = true;
        if (drawable instanceof Drawable.Callback) {
            setCallback((Drawable.Callback) drawable);
        }
    }

    public final void A01() {
        this.A01 = System.currentTimeMillis();
        this.A02 = false;
        invalidateSelf();
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
