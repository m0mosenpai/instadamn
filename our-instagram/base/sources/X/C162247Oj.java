package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: X.7Oj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162247Oj extends C0T6 {
    public static final WeakHashMap A06 = new WeakHashMap();
    public final ShapeDrawable A00;
    public final ShapeDrawable A01;
    public final ShapeDrawable A02;
    public final Shape A03;
    public final C162867Qx A04;
    public final WeakReference A05;

    public final boolean A05(C74843Xy c74843Xy, Integer num, float f) {
        Integer num2;
        Shape shape = this.A03;
        if (!(shape instanceof C162817Qs)) {
            return false;
        }
        C162817Qs c162817Qs = (C162817Qs) shape;
        C74843Xy c74843Xy2 = c162817Qs.A09;
        if (c74843Xy.equals(c74843Xy2)) {
            return false;
        }
        C74843Xy c74843Xy3 = c162817Qs.A0A;
        if (c74843Xy3 != C74843Xy.A02) {
            switch (num.intValue()) {
                case 1:
                case 3:
                    num2 = C05F.A0N;
                    break;
                case 2:
                    num2 = C05F.A01;
                    break;
                case 4:
                case 5:
                default:
                    num2 = C05F.A15;
                    break;
                case 6:
                    num2 = C05F.A0j;
                    break;
            }
            int A00 = C7R3.A00(num2) + 1;
            for (int A002 = C74843Xy.A00(num); A002 < A00; A002++) {
                c74843Xy3.A01[A002] = (1.0f - f) * (c74843Xy.A01[A002] - c74843Xy2.A01[A002]);
            }
            C74843Xy.A01(c74843Xy3);
        }
        c162817Qs.A03 = true;
        Drawable drawable = (Drawable) this.A05.get();
        if (drawable != null) {
            drawable.invalidateSelf();
        }
        return true;
    }

    public final C162817Qs A00() {
        Shape shape = this.A03;
        if (shape instanceof C162817Qs) {
            return (C162817Qs) shape;
        }
        return null;
    }

    public final void A01(int i) {
        AbstractC148406mA.A02(Paint.Style.FILL, this.A01, this.A03, 0.0f, i);
        this.A00.getPaint().setAlpha(0);
    }

    public final void A02(int i, float f, boolean z) {
        AbstractC148406mA.A03(this.A00, this.A03, f, i);
        Paint paint = this.A01.getPaint();
        int i2 = 255;
        if (z) {
            i2 = 0;
        }
        paint.setAlpha(i2);
    }

    public final void A03(int i, int i2, float f) {
        ShapeDrawable shapeDrawable = this.A01;
        Shape shape = this.A03;
        AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shape, 0.0f, i);
        AbstractC148406mA.A03(this.A00, shape, f, i2);
    }

    public final void A04(Integer num) {
        Integer num2;
        Shape shape = this.A03;
        if (shape instanceof C162817Qs) {
            C162817Qs c162817Qs = (C162817Qs) shape;
            C74843Xy c74843Xy = c162817Qs.A0A;
            if (c74843Xy.A00 == C05F.A00 && c74843Xy.A01[0] == 0.0f) {
                return;
            }
            int A00 = C74843Xy.A00(num);
            switch (num.intValue()) {
                case 1:
                case 3:
                    num2 = C05F.A0N;
                    break;
                case 2:
                    num2 = C05F.A01;
                    break;
                case 4:
                case 5:
                default:
                    num2 = C05F.A15;
                    break;
                case 6:
                    num2 = C05F.A0j;
                    break;
            }
            Arrays.fill(c74843Xy.A01, A00, C7R3.A00(num2) + 1, 0.0f);
            C74843Xy.A01(c74843Xy);
            c162817Qs.A03 = true;
            Drawable drawable = (Drawable) this.A05.get();
            if (drawable == null) {
                return;
            }
            drawable.invalidateSelf();
        }
    }

    public C162247Oj(ShapeDrawable shapeDrawable, ShapeDrawable shapeDrawable2, ShapeDrawable shapeDrawable3, Shape shape, C162867Qx c162867Qx, WeakReference weakReference) {
        this.A03 = shape;
        this.A01 = shapeDrawable;
        this.A00 = shapeDrawable2;
        this.A04 = c162867Qx;
        this.A02 = shapeDrawable3;
        this.A05 = weakReference;
    }
}
