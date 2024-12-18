package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;

/* renamed from: X.Jks, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44436Jks extends LinearLayout implements InterfaceC021908q {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public float A04;
    public float A05;
    public ValueAnimator A06;
    public final Paint A07;

    public C44436Jks(Context context) {
        super(context, null, 0);
        this.A02 = -1;
        this.A00 = -1;
        setOrientation(0);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A07 = A0S;
        AbstractC43592JPx.A1E(A0S);
        A0S.setStrokeWidth(AbstractC166987dD.A04(getResources(), C14640oc.A0E() ? R.dimen.abc_control_corner_material : R.dimen.account_recs_header_image_margin));
        AbstractC166987dD.A1N(context, A0S, AbstractC53242c7.A07(context));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        if (getChildCount() > 0) {
            float f = this.A04;
            float A08 = AbstractC166987dD.A08(this);
            Paint paint = this.A07;
            canvas.drawLine(f, A08 - (paint.getStrokeWidth() / 2.0f), this.A05, AbstractC166987dD.A08(this) - (paint.getStrokeWidth() / 2.0f), paint);
        }
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
        A00(this, f, i, (int) Math.ceil(i + f));
    }

    @Override // X.InterfaceC021908q
    public final void onPageSelected(int i) {
    }

    public final void A02(int i, boolean z) {
        if (this.A02 != i && i < getChildCount()) {
            this.A02 = i;
            ValueAnimator valueAnimator = this.A06;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                valueAnimator2.setDuration(250L);
                AbstractC43592JPx.A1A(valueAnimator2);
                valueAnimator2.addUpdateListener(new LM2(this, i, 5));
                JX2.A00(valueAnimator2, this, 11);
                valueAnimator2.setIntValues(this.A01, i);
                valueAnimator2.start();
                this.A06 = valueAnimator2;
                return;
            }
            RunnableC49959M4a runnableC49959M4a = new RunnableC49959M4a(this, i);
            if (isLayoutRequested()) {
                AbstractC13880nE.A0q(this, runnableC49959M4a);
            } else {
                runnableC49959M4a.run();
            }
        }
    }

    public final int getSelectedIndex() {
        return this.A01;
    }

    public final void setForceIndicatorFullWidth(boolean z) {
        this.A03 = z;
    }

    public final void setIndicatorColor(int i) {
        this.A07.setColor(i);
    }

    public final void setIndicatorThickness(float f) {
        this.A07.setStrokeWidth(f);
    }

    public static final void A00(C44436Jks c44436Jks, float f, int i, int i2) {
        View childAt = c44436Jks.getChildAt(i);
        View childAt2 = c44436Jks.getChildAt(i2);
        if (childAt != null && childAt2 != null) {
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int left2 = childAt2.getLeft();
            int right2 = childAt2.getRight();
            if (!c44436Jks.A03 && C14640oc.A0E()) {
                int i3 = AbstractC25228BEl.A0M(c44436Jks).getDisplayMetrics().widthPixels / 5;
                int max = Math.max((right - left) - i3, 0) / 2;
                int max2 = Math.max((right2 - left2) - i3, 0) / 2;
                left += max;
                right -= max;
                left2 += max2;
                right2 -= max2;
            }
            float f2 = 1.0f - f;
            c44436Jks.A04 = (left2 * f) + (left * f2);
            float f3 = right;
            float f4 = right2;
            float f5 = (f4 * f) + (f2 * f3);
            c44436Jks.A05 = f5;
            if (AbstractC166987dD.A01(f5, f3) > AbstractC166987dD.A01(f5, f4)) {
                i = i2;
            }
            if (c44436Jks.A00 != i) {
                int childCount = c44436Jks.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt3 = c44436Jks.getChildAt(i4);
                    C14360o3.A0C(childAt3, "null cannot be cast to non-null type com.instagram.igds.components.segmentedtabs.TabView");
                    C44435Jko c44435Jko = (C44435Jko) childAt3;
                    if (i4 == i) {
                        c44435Jko.A01();
                        c44436Jks.A02 = i4;
                    } else {
                        c44435Jko.A00();
                    }
                }
                c44436Jks.A00 = i;
            }
            c44436Jks.invalidate();
        }
    }

    public final void A01() {
        if (AbstractC56862jK.A00(getContext())) {
            int i = 0;
            int childCount = getChildCount();
            while (i < childCount) {
                int i2 = this.A01;
                View childAt = getChildAt(i);
                C14360o3.A07(childAt);
                int i3 = i + 1;
                AbstractC58452m4.A00(childAt, i3, getChildCount(), AbstractC167007dF.A1P(i, i2));
                i = i3;
            }
        }
    }
}
