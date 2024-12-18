package X;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UHD extends AbstractC70653Fc implements C7LD {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A08;
    public int A09;
    public RecyclerView A0A;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final ValueAnimator A0K;
    public final Drawable A0L;
    public final Drawable A0M;
    public final StateListDrawable A0N;
    public final StateListDrawable A0O;
    public final C1I4 A0P;
    public final Runnable A0Q;
    public static final int[] A0U = {R.attr.state_pressed};
    public static final int[] A0T = new int[0];
    public int A06 = 0;
    public int A05 = 0;
    public boolean A0C = false;
    public boolean A0B = false;
    public int A07 = 0;
    public int A0D = 0;
    public final int[] A0S = new int[2];
    public final int[] A0R = new int[2];

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(int r5) {
        /*
            r4 = this;
            r2 = 2
            if (r5 != r2) goto L3b
            int r0 = r4.A07
            if (r0 == r2) goto L15
            android.graphics.drawable.StateListDrawable r1 = r4.A0O
            int[] r0 = X.UHD.A0U
            r1.setState(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0A
            java.lang.Runnable r0 = r4.A0Q
            r1.removeCallbacks(r0)
        L15:
            r4.A00()
        L18:
            int r0 = r4.A07
            if (r0 != r2) goto L35
            if (r5 == r2) goto L32
            android.graphics.drawable.StateListDrawable r1 = r4.A0O
            int[] r0 = X.UHD.A0T
            r1.setState(r0)
            r0 = 1200(0x4b0, float:1.682E-42)
        L27:
            androidx.recyclerview.widget.RecyclerView r3 = r4.A0A
            java.lang.Runnable r2 = r4.A0Q
            r3.removeCallbacks(r2)
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
        L32:
            r4.A07 = r5
            return
        L35:
            r0 = 1
            if (r5 != r0) goto L32
            r0 = 1500(0x5dc, float:2.102E-42)
            goto L27
        L3b:
            if (r5 != 0) goto L15
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0A
            r0.invalidate()
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UHD.A01(int):void");
    }

    @Override // X.C7LD
    public final void Dfm(boolean z) {
    }

    public final void A00() {
        int i = this.A02;
        if (i != 0) {
            if (i == 3) {
                this.A0K.cancel();
            } else {
                return;
            }
        }
        this.A02 = 1;
        ValueAnimator valueAnimator = this.A0K;
        MSY.A1O(valueAnimator.getAnimatedValue(), r2, 0);
        float[] fArr = {0.0f, 1.0f};
        valueAnimator.setFloatValues(fArr);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    public final boolean A02(float f, float f2) {
        if (this.A0A.getLayoutDirection() != 1 ? f >= this.A06 - this.A0I : f <= this.A0I) {
            int i = this.A08;
            int i2 = this.A09 / 2;
            if (f2 >= i - i2 && f2 <= i + i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r5 > r0) goto L10;
     */
    @Override // X.C7LD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DMd(android.view.MotionEvent r9, androidx.recyclerview.widget.RecyclerView r10) {
        /*
            r8 = this;
            int r0 = r8.A07
            r7 = 0
            r2 = 2
            r4 = 1
            if (r0 != r4) goto L60
            float r1 = r9.getX()
            float r0 = r9.getY()
            boolean r6 = r8.A02(r1, r0)
            float r5 = r9.getX()
            float r3 = r9.getY()
            int r1 = r8.A05
            int r0 = r8.A0E
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L39
            int r3 = r8.A03
            int r0 = r8.A04
            int r1 = r0 / 2
            int r0 = r3 - r1
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L39
            int r3 = r3 + r1
            float r0 = (float) r3
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L3a
        L39:
            r1 = 0
        L3a:
            int r0 = r9.getAction()
            if (r0 != 0) goto L52
            if (r6 != 0) goto L53
            if (r1 == 0) goto L52
        L44:
            r8.A0D = r4
            float r0 = r9.getX()
            int r0 = (int) r0
            float r0 = (float) r0
            r8.A00 = r0
        L4e:
            r8.A01(r2)
        L51:
            r7 = 1
        L52:
            return r7
        L53:
            if (r1 != 0) goto L44
            r8.A0D = r2
            float r0 = r9.getY()
            int r0 = (int) r0
            float r0 = (float) r0
            r8.A01 = r0
            goto L4e
        L60:
            if (r0 != r2) goto L52
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UHD.DMd(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r3 > (r2 + r1)) goto L12;
     */
    @Override // X.C7LD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Du8(android.view.MotionEvent r13, androidx.recyclerview.widget.RecyclerView r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UHD.Du8(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):void");
    }

    @Override // X.AbstractC70653Fc
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        int i2 = this.A06;
        RecyclerView recyclerView2 = this.A0A;
        if (i2 == recyclerView2.getWidth() && this.A05 == recyclerView2.getHeight()) {
            if (this.A02 != 0) {
                if (this.A0C) {
                    int i3 = this.A06;
                    int i4 = this.A0I;
                    int i5 = i3 - i4;
                    int i6 = this.A08;
                    int i7 = this.A09;
                    int i8 = i6 - (i7 / 2);
                    StateListDrawable stateListDrawable = this.A0O;
                    stateListDrawable.setBounds(0, 0, i4, i7);
                    Drawable drawable = this.A0M;
                    drawable.setBounds(0, 0, this.A0J, this.A05);
                    if (recyclerView2.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i4, i8);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        i = -i4;
                    } else {
                        canvas.translate(i5, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i8);
                        stateListDrawable.draw(canvas);
                        i = -i5;
                    }
                    canvas.translate(i, -i8);
                }
                if (this.A0B) {
                    int i9 = this.A05;
                    int i10 = this.A0E;
                    int i11 = i9 - i10;
                    int i12 = this.A03;
                    int i13 = this.A04;
                    StateListDrawable stateListDrawable2 = this.A0N;
                    stateListDrawable2.setBounds(0, 0, i13, i10);
                    Drawable drawable2 = this.A0L;
                    drawable2.setBounds(0, 0, this.A06, this.A0F);
                    canvas.translate(0.0f, i11);
                    drawable2.draw(canvas);
                    canvas.translate(i12 - (i13 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r5, -i11);
                    return;
                }
                return;
            }
            return;
        }
        this.A06 = recyclerView2.getWidth();
        this.A05 = recyclerView2.getHeight();
        A01(0);
    }

    public UHD(Drawable drawable, Drawable drawable2, StateListDrawable stateListDrawable, StateListDrawable stateListDrawable2, RecyclerView recyclerView, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0K = ofFloat;
        this.A02 = 0;
        this.A0Q = new RunnableC71228WqJ(this);
        this.A0P = new C65986Txf(this, 0);
        this.A0O = stateListDrawable;
        this.A0M = drawable;
        this.A0N = stateListDrawable2;
        this.A0L = drawable2;
        this.A0I = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.A0J = Math.max(i, drawable.getIntrinsicWidth());
        this.A0E = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.A0F = Math.max(i, drawable2.getIntrinsicWidth());
        this.A0H = i2;
        this.A0G = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C66297U7v(this));
        ofFloat.addUpdateListener(new C70205WGy(this));
        RecyclerView recyclerView2 = this.A0A;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A11(this);
                this.A0A.A13(this);
                this.A0A.A15(this.A0P);
                this.A0A.removeCallbacks(this.A0Q);
            }
            this.A0A = recyclerView;
            recyclerView.A10(this);
            RecyclerView recyclerView3 = this.A0A;
            recyclerView3.A12(this);
            recyclerView3.A14(this.A0P);
        }
    }
}
