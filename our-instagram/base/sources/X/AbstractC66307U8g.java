package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.List;

/* renamed from: X.U8g */
/* loaded from: classes11.dex */
public abstract class AbstractC66307U8g extends Drawable implements Animatable {
    public static final Property A0A = new C66041Tyd(11);
    public float A00;
    public int A01;
    public ValueAnimator A02;
    public ValueAnimator A03;
    public List A05;
    public boolean A06;
    public final Context A07;
    public final AbstractC69617VsK A09;
    public final Paint A08 = new Paint();
    public C68355VNp A04 = new Object();

    public static /* synthetic */ void A00(AbstractC66307U8g abstractC66307U8g) {
        super.setVisible(false, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return A01(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        A02(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        A02(false, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r1 <= 0.0f) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(boolean r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            android.content.Context r0 = r3.A07
            android.content.ContentResolver r2 = r0.getContentResolver()
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = "animator_duration_scale"
            float r1 = android.provider.Settings.Global.getFloat(r2, r0, r1)
            if (r6 == 0) goto L16
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L17
        L16:
            r0 = 0
        L17:
            boolean r0 = r3.A02(r4, r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66307U8g.A01(boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r6 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (super.setVisible(r6, false) != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A02(boolean r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            android.animation.ValueAnimator r2 = r5.A03
            r0 = 500(0x1f4, double:2.47E-321)
            r4 = 2
            if (r2 != 0) goto L37
            android.util.Property r3 = X.AbstractC66307U8g.A0A
            float[] r2 = new float[r4]
            r2 = {x00d6: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r5, r3, r2)
            r5.A03 = r2
            r2.setDuration(r0)
            android.animation.ValueAnimator r3 = r5.A03
            android.animation.TimeInterpolator r2 = X.AbstractC153306uz.A02
            r3.setInterpolator(r2)
            android.animation.ValueAnimator r3 = r5.A03
            if (r3 == 0) goto L30
            boolean r2 = r3.isRunning()
            if (r2 == 0) goto L30
            java.lang.String r1 = "Cannot set showAnimator while the current showAnimator is running."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L30:
            r5.A03 = r3
            r2 = 10
            X.U5Q.A00(r3, r5, r2)
        L37:
            android.animation.ValueAnimator r2 = r5.A02
            if (r2 != 0) goto L6b
            android.util.Property r3 = X.AbstractC66307U8g.A0A
            float[] r2 = new float[r4]
            r2 = {x00de: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r5, r3, r2)
            r5.A02 = r2
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r5.A02
            android.animation.TimeInterpolator r0 = X.AbstractC153306uz.A02
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r5.A02
            if (r1 == 0) goto L64
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L64
            java.lang.String r1 = "Cannot set hideAnimator while the current hideAnimator is running."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L64:
            r5.A02 = r1
            r0 = 11
            X.U5Q.A00(r1, r5, r0)
        L6b:
            boolean r0 = r5.isVisible()
            r3 = 0
            if (r0 != 0) goto L75
            if (r6 != 0) goto L9a
        L74:
            return r3
        L75:
            if (r6 != 0) goto L9a
            android.animation.ValueAnimator r1 = r5.A02
        L79:
            r4 = 1
            boolean r0 = r1.isRunning()
            if (r8 != 0) goto L9d
            if (r0 == 0) goto L8a
            r1.end()
        L85:
            boolean r2 = super.setVisible(r6, r3)
            return r2
        L8a:
            android.animation.ValueAnimator[] r0 = new android.animation.ValueAnimator[]{r1}
            boolean r1 = r5.A06
            r5.A06 = r4
            r0 = r0[r3]
            r0.end()
            r5.A06 = r1
            goto L85
        L9a:
            android.animation.ValueAnimator r1 = r5.A03
            goto L79
        L9d:
            if (r0 != 0) goto L74
            if (r6 == 0) goto La8
            boolean r0 = super.setVisible(r6, r3)
            r2 = 0
            if (r0 == 0) goto Lbd
        La8:
            r2 = 1
            if (r6 != 0) goto Lbd
            X.VsK r0 = r5.A09
            int r0 = r0.A00
        Laf:
            if (r0 == 0) goto Lc6
            if (r7 != 0) goto Lc2
            boolean r0 = r1.isPaused()
            if (r0 == 0) goto Lc2
            r1.resume()
            return r2
        Lbd:
            X.VsK r0 = r5.A09
            int r0 = r0.A01
            goto Laf
        Lc2:
            r1.start()
            return r2
        Lc6:
            android.animation.ValueAnimator[] r0 = new android.animation.ValueAnimator[]{r1}
            boolean r1 = r5.A06
            r5.A06 = r4
            r0 = r0[r3]
            r0.end()
            r5.A06 = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66307U8g.A02(boolean, boolean, boolean):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.A02;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.VNp] */
    public AbstractC66307U8g(Context context, AbstractC69617VsK abstractC69617VsK) {
        this.A07 = context;
        this.A09 = abstractC69617VsK;
        setAlpha(255);
    }
}
