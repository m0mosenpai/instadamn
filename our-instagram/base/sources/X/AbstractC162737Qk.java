package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.shapes.Shape;
import com.facebook.R;
import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.7Qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162737Qk {
    public static final int A00(C7IM c7im, boolean z) {
        C14360o3.A0B(c7im, 0);
        if (z) {
            return c7im.A05.A04;
        }
        return c7im.A06.A05;
    }

    public static final int A01(C7IM c7im, boolean z) {
        C14360o3.A0B(c7im, 0);
        return A04(c7im, z).A04;
    }

    public static final LayerDrawable A02(C7IM c7im) {
        C14360o3.A0B(c7im, 0);
        C162817Qs c162817Qs = new C162817Qs(null, StringTreeSet.MAX_SYMBOL_COUNT);
        new Object();
        return (LayerDrawable) AbstractC162857Qw.A00(c162817Qs, true).A00;
    }

    public static final C74843Xy A03(Context context, C7IM c7im, C2EY c2ey, boolean z, boolean z2, boolean z3) {
        float f;
        float f2;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c7im, 1);
        C14360o3.A0B(c2ey, 5);
        C7II c7ii = A04(c7im, z).A0A;
        if (c2ey != C2EY.A1V && c2ey != C2EY.A1g) {
            if (c2ey == C2EY.A11) {
                C74843Xy c74843Xy = new C74843Xy();
                float f3 = c7ii.A02;
                c74843Xy.A07(f3, f3, 0.0f, 0.0f);
                return c74843Xy;
            }
            C7R2 A01 = AbstractC162807Qr.A01(z2, z3);
            boolean A02 = AbstractC13620mo.A02(context);
            if (!z ? !A02 : A02) {
                f = c7ii.A01;
                f2 = c7ii.A02;
            } else {
                f = c7ii.A02;
                f2 = c7ii.A01;
            }
            return C7II.A00(A01, c7ii, f, f2);
        }
        C7R2 c7r2 = C7R2.A05;
        float f4 = c7ii.A02;
        return C7II.A00(c7r2, c7ii, f4, f4);
    }

    public static final C7IJ A04(C7IM c7im, boolean z) {
        C14360o3.A0B(c7im, 0);
        if (z) {
            return c7im.A05;
        }
        return c7im.A06;
    }

    public static final void A05(Context context, Drawable drawable, C7IM c7im, boolean z) {
        float f;
        float f2;
        C7R2 c7r2;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c7im, 1);
        C14360o3.A0B(drawable, 3);
        C7II c7ii = c7im.A06.A0A;
        if (AbstractC13620mo.A02(context)) {
            f = c7ii.A02;
            f2 = c7ii.A01;
        } else {
            f = c7ii.A01;
            f2 = c7ii.A02;
        }
        C162247Oj c162247Oj = (C162247Oj) C162247Oj.A06.get(drawable);
        if (c162247Oj != null) {
            float f3 = c7ii.A00;
            if (f3 == 0.0f) {
                int i = c7ii.A04;
                if (i == 0) {
                    i = c7ii.A03;
                }
                c162247Oj.A01(i);
            } else {
                c162247Oj.A02(c7ii.A03, f3, true);
            }
            Shape shape = c162247Oj.A03;
            if (shape instanceof AbstractC148416mB) {
                AbstractC148416mB abstractC148416mB = (AbstractC148416mB) shape;
                if (z) {
                    c7r2 = C7R2.A02;
                } else {
                    c7r2 = C7R2.A05;
                }
                C7II.A01(abstractC148416mB, c7r2, c7ii, f, f2);
            }
        }
    }

    public static final void A06(Drawable drawable, AnonymousClass541 anonymousClass541, C7R2 c7r2, C7IM c7im, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(c7im, 0);
        C14360o3.A0B(c7r2, 1);
        A04(c7im, z).A00(drawable, anonymousClass541, c7r2, z, z2, z3, z4, z5);
    }

    public static final void A07(Drawable drawable, C7IM c7im, boolean z) {
        C14360o3.A0B(c7im, 0);
        C14360o3.A0B(drawable, 1);
        C7IJ c7ij = c7im.A06;
        C7II c7ii = c7ij.A0A;
        Context context = c7ij.A09;
        C14360o3.A0B(context, 0);
        C162247Oj c162247Oj = (C162247Oj) C162247Oj.A06.get(drawable);
        if (c162247Oj != null) {
            int i = c7ii.A04;
            int i2 = c7ii.A03;
            float f = c7ii.A00;
            if ((i == 0 || i == i2) && (!AbstractC72723Nt.A00(context) || c7ii.A0A)) {
                i = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background));
            }
            if (z) {
                i2 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_highlight_background));
                f = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
            }
            if (c7ii.A0A) {
                f = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
            }
            c162247Oj.A03(i, i2, f);
            Shape shape = c162247Oj.A03;
            if (shape instanceof AbstractC148416mB) {
                C14360o3.A0C(shape, "null cannot be cast to non-null type com.facebook.common.messagingui.roundedcornergradientdrawable.shape.RoundedRectShape");
                C7R2 c7r2 = C7R2.A05;
                float f2 = c7ii.A02;
                C7II.A01((AbstractC148416mB) shape, c7r2, c7ii, f2, f2);
            }
        }
    }
}
