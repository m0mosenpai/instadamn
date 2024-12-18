package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Fo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC70763Fo {
    public int A00 = Integer.MIN_VALUE;
    public final Rect A01 = new Rect();
    public final AbstractC70663Fe A02;

    public abstract int A02();

    public abstract int A03();

    public abstract int A04();

    public abstract int A05();

    public abstract int A06();

    public abstract int A07();

    public abstract int A0B(View view);

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract void A0E(int i);

    public static AbstractC70763Fo A00(AbstractC70663Fe abstractC70663Fe, int i) {
        if (i != 0) {
            if (i == 1) {
                return new C3H6(abstractC70663Fe);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C70773Fp(abstractC70663Fe);
    }

    public final int A01() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A07() - this.A00;
    }

    public final int A09(View view) {
        boolean z = this instanceof C70773Fp;
        AbstractC70663Fe abstractC70663Fe = this.A02;
        if (z) {
            Rect rect = this.A01;
            abstractC70663Fe.A0m(rect, view);
            return rect.right;
        }
        Rect rect2 = this.A01;
        abstractC70663Fe.A0m(rect2, view);
        return rect2.bottom;
    }

    public final int A0A(View view) {
        boolean z = this instanceof C3H6;
        AbstractC70663Fe abstractC70663Fe = this.A02;
        if (z) {
            Rect rect = this.A01;
            abstractC70663Fe.A0m(rect, view);
            return rect.top;
        }
        Rect rect2 = this.A01;
        abstractC70663Fe.A0m(rect2, view);
        return rect2.left;
    }

    public AbstractC70763Fo(AbstractC70663Fe abstractC70663Fe) {
        this.A02 = abstractC70663Fe;
    }

    public int A08(View view) {
        return this.A02.A0V(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }
}
