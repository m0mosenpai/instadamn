package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.71v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1567271v extends LinearLayout {
    public float A00;
    public int A01;
    public ValueAnimator A02;
    public final /* synthetic */ TabLayout A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1567271v(Context context, TabLayout tabLayout) {
        super(context);
        this.A03 = tabLayout;
        this.A01 = -1;
        setWillNotDraw(false);
    }

    public static void A00(View view, View view2, C1567271v c1567271v, float f) {
        int i;
        int round;
        float sin;
        double cos;
        if (view != null && view.getWidth() > 0) {
            TabLayout tabLayout = c1567271v.A03;
            C71y c71y = tabLayout.A0K;
            Drawable drawable = tabLayout.A0I;
            boolean z = c71y instanceof C153296uy;
            RectF A00 = C71y.A00(view, tabLayout);
            RectF A002 = C71y.A00(view2, tabLayout);
            if (z) {
                float f2 = A00.left;
                double d = (f * 3.141592653589793d) / 2.0d;
                if (f2 < A002.left) {
                    sin = (float) (1.0d - Math.cos(d));
                    cos = Math.sin(d);
                } else {
                    sin = (float) Math.sin(d);
                    cos = 1.0d - Math.cos(d);
                }
                f = (float) cos;
                i = (int) f2;
                TimeInterpolator timeInterpolator = AbstractC153306uz.A00;
                round = Math.round(sin * (((int) r9) - i));
            } else {
                i = (int) A00.left;
                int i2 = (int) A002.left;
                TimeInterpolator timeInterpolator2 = AbstractC153306uz.A00;
                round = Math.round((i2 - i) * f);
            }
            drawable.setBounds(i + round, drawable.getBounds().top, ((int) A00.right) + Math.round(f * (((int) A002.right) - r5)), drawable.getBounds().bottom);
        } else {
            TabLayout tabLayout2 = c1567271v.A03;
            Drawable drawable2 = tabLayout2.A0I;
            drawable2.setBounds(-1, drawable2.getBounds().top, -1, tabLayout2.A0I.getBounds().bottom);
        }
        c1567271v.postInvalidateOnAnimation();
    }

    public static void A01(C1567271v c1567271v) {
        View childAt = c1567271v.getChildAt(c1567271v.A01);
        TabLayout tabLayout = c1567271v.A03;
        Drawable drawable = tabLayout.A0I;
        RectF A00 = C71y.A00(childAt, tabLayout);
        drawable.setBounds((int) A00.left, drawable.getBounds().top, (int) A00.right, drawable.getBounds().bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 1470989980(0x57ad869c, float:3.815873E14)
            int r4 = X.C0f9.A03(r0)
            com.google.android.material.tabs.TabLayout r5 = r7.A03
            android.graphics.drawable.Drawable r0 = r5.A0I
            android.graphics.Rect r0 = r0.getBounds()
            int r6 = r0.height()
            if (r6 >= 0) goto L1b
            android.graphics.drawable.Drawable r0 = r5.A0I
            int r6 = r0.getIntrinsicHeight()
        L1b:
            int r3 = r5.A06
            r0 = 0
            if (r3 == 0) goto L6a
            r2 = 1
            r1 = 2
            if (r3 == r2) goto L5b
            if (r3 == r1) goto L2a
            r1 = 3
            if (r3 == r1) goto L6f
            r6 = 0
        L2a:
            android.graphics.drawable.Drawable r1 = r5.A0I
            android.graphics.Rect r1 = r1.getBounds()
            int r1 = r1.width()
            if (r1 <= 0) goto L51
            android.graphics.drawable.Drawable r1 = r5.A0I
            android.graphics.Rect r1 = r1.getBounds()
            android.graphics.drawable.Drawable r3 = r5.A0I
            int r2 = r1.left
            int r1 = r1.right
            r3.setBounds(r2, r0, r1, r6)
            android.graphics.drawable.Drawable r1 = r5.A0I
            int r0 = r5.A0C
            if (r0 == 0) goto L4e
            r1.setTint(r0)
        L4e:
            r1.draw(r8)
        L51:
            super.draw(r8)
            r0 = 190362272(0xb58b2a0, float:4.173447E-32)
            X.C0f9.A0A(r0, r4)
            return
        L5b:
            int r0 = r7.getHeight()
            int r0 = r0 - r6
            int r0 = r0 / 2
            int r1 = r7.getHeight()
            int r1 = r1 + r6
            int r6 = r1 / 2
            goto L2a
        L6a:
            int r0 = r7.getHeight()
            int r0 = r0 - r6
        L6f:
            int r6 = r7.getHeight()
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1567271v.draw(android.graphics.Canvas):void");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            int i5 = this.A01;
            View childAt = getChildAt(i5);
            View childAt2 = getChildAt(i5);
            if (childAt2 != null) {
                ANP anp = new ANP(childAt, childAt2, this);
                this.A02.removeAllUpdateListeners();
                this.A02.addUpdateListener(anp);
                return;
            }
        }
        A01(this);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            TabLayout tabLayout = this.A03;
            if (tabLayout.A03 == 1 || tabLayout.A02 == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    if (i3 * childCount <= getMeasuredWidth() - (((int) AbstractC126235nK.A00(getContext(), 16)) * 2)) {
                        boolean z = false;
                        for (int i5 = 0; i5 < childCount; i5++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                            if (((ViewGroup.LayoutParams) layoutParams).width != i3 || layoutParams.weight != 0.0f) {
                                ((ViewGroup.LayoutParams) layoutParams).width = i3;
                                layoutParams.weight = 0.0f;
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    } else {
                        tabLayout.A03 = 0;
                        tabLayout.A0G(false);
                    }
                    super.onMeasure(i, i2);
                }
            }
        }
    }
}
