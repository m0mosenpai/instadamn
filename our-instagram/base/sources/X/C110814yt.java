package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.4yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C110814yt extends AbstractC110824yu {
    public float A00;
    public PointF A03;
    public final DisplayMetrics A05;
    public final LinearInterpolator A07 = new LinearInterpolator();
    public final DecelerateInterpolator A06 = new DecelerateInterpolator();
    public boolean A04 = false;
    public int A01 = 0;
    public int A02 = 0;

    @Override // X.AbstractC110824yu
    public void A02() {
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = null;
    }

    public int A0B(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 <= 0) {
                int i7 = i4 - i2;
                if (i7 < 0) {
                    return i7;
                }
                return 0;
            }
            return i6;
        }
        return i3 - i;
    }

    public int A0C(View view, int i) {
        AbstractC70663Fe abstractC70663Fe = super.A02;
        if (abstractC70663Fe != null && abstractC70663Fe.A1X()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            return A0B((view.getLeft() - AbstractC70663Fe.A0B(view)) - marginLayoutParams.leftMargin, view.getRight() + AbstractC70663Fe.A0D(view) + marginLayoutParams.rightMargin, abstractC70663Fe.Bau(), abstractC70663Fe.A03 - abstractC70663Fe.Baw(), i);
        }
        return 0;
    }

    public int A0D(View view, int i) {
        AbstractC70663Fe abstractC70663Fe = super.A02;
        if (abstractC70663Fe != null && abstractC70663Fe.A1Y()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            return A0B(abstractC70663Fe.A0W(view) - marginLayoutParams.topMargin, abstractC70663Fe.A0V(view) + marginLayoutParams.bottomMargin, abstractC70663Fe.Bax(), abstractC70663Fe.A00 - abstractC70663Fe.Bat(), i);
        }
        return 0;
    }

    @Override // X.AbstractC110824yu
    public void A05(C110834yv c110834yv, C3F5 c3f5, int i, int i2) {
        if (super.A03.A0D.A0T() != 0) {
            int i3 = this.A01;
            int i4 = i3 - i;
            if (i3 * i4 <= 0) {
                i4 = 0;
            }
            this.A01 = i4;
            int i5 = this.A02;
            int i6 = i5 - i2;
            if (i5 * i6 <= 0) {
                i6 = 0;
            }
            this.A02 = i6;
            if (i4 == 0 && i6 == 0) {
                PointF A00 = A00(super.A00);
                if (A00 != null) {
                    float f = A00.x;
                    if (f != 0.0f || A00.y != 0.0f) {
                        float f2 = A00.y;
                        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
                        float f3 = f / sqrt;
                        A00.x = f3;
                        float f4 = f2 / sqrt;
                        A00.y = f4;
                        this.A03 = A00;
                        this.A01 = (int) (f3 * 10000.0f);
                        this.A02 = (int) (f4 * 10000.0f);
                        c110834yv.A00(this.A07, (int) (this.A01 * 1.2f), (int) (this.A02 * 1.2f), (int) (A0A(10000) * 1.2f));
                        return;
                    }
                }
                c110834yv.A04 = super.A00;
            } else {
                return;
            }
        }
        A01();
    }

    public float A06(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A07() {
        PointF pointF = this.A03;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                if (f <= 0.0f) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public int A08() {
        PointF pointF = this.A03;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                if (f <= 0.0f) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public C110814yt(Context context) {
        this.A05 = context.getResources().getDisplayMetrics();
    }

    @Override // X.AbstractC110824yu
    public void A04(View view, C110834yv c110834yv, C3F5 c3f5) {
        int A0C = A0C(view, A07());
        int A0D = A0D(view, A08());
        int A09 = A09((int) Math.sqrt((A0C * A0C) + (A0D * A0D)));
        if (A09 > 0) {
            c110834yv.A00(this.A06, -A0C, -A0D, A09);
        }
    }

    public int A09(int i) {
        return (int) Math.ceil(A0A(i) / 0.3356d);
    }

    public int A0A(int i) {
        float abs = Math.abs(i);
        if (!this.A04) {
            this.A00 = A06(this.A05);
            this.A04 = true;
        }
        return (int) Math.ceil(abs * this.A00);
    }
}
