package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.facebook.R;

/* renamed from: X.82P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C82P {
    public Rect A00;
    public C131515wl A01;
    public Path A02;
    public final Context A03;
    public final Paint A04;
    public final Rect A05;
    public final View A06;
    public final int A07;
    public final int A08;

    public C82P(View view, Integer num, Integer num2) {
        int color;
        int color2;
        this.A06 = view;
        Paint paint = new Paint(1);
        this.A04 = paint;
        this.A05 = new Rect();
        Context context = view.getContext();
        C14360o3.A07(context);
        this.A03 = context;
        if (num != null) {
            color = num.intValue();
        } else {
            color = context.getColor(AbstractC53242c7.A0H(context, R.attr.backgroundColorSecondary));
        }
        this.A08 = color;
        if (num2 != null) {
            color2 = num2.intValue();
        } else {
            color2 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background));
        }
        this.A07 = color2;
        paint.setColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.cropHighlightBackground)));
        paint.setAlpha(204);
    }

    public final void A01(RectF rectF, boolean z, boolean z2) {
        float max = Math.max(C1H4.A01(rectF.left), 0);
        float max2 = Math.max(C1H4.A01(rectF.top), 0);
        int A01 = C1H4.A01(rectF.right);
        View view = this.A06;
        RectF rectF2 = new RectF(max, max2, Math.min(A01, view.getWidth()), Math.min(C1H4.A01(rectF.bottom), view.getHeight()));
        this.A00 = MX2.A04(rectF2);
        if (z) {
            Path path = new Path();
            this.A02 = path;
            path.setFillType(Path.FillType.EVEN_ODD);
            RectF rectF3 = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
            Path path2 = this.A02;
            if (path2 != null) {
                path2.addRect(rectF3, Path.Direction.CW);
            }
            Path path3 = this.A02;
            if (path3 != null) {
                path3.addOval(rectF2, Path.Direction.CCW);
            }
            this.A01 = null;
            return;
        }
        this.A02 = null;
        int i = 1;
        if (view.getResources().getDisplayMetrics().density >= 1.5d) {
            i = 2;
        }
        C131515wl c131515wl = new C131515wl(i, 3, 3, this.A08, this.A07, z2);
        this.A01 = c131515wl;
        Rect rect = this.A00;
        if (rect != null) {
            c131515wl.A03(rect);
        }
        C131515wl c131515wl2 = this.A01;
        if (c131515wl2 == null) {
            return;
        }
        c131515wl2.A04(0.0f);
    }

    public final void A00(Canvas canvas) {
        Path path = this.A02;
        if (path != null) {
            canvas.drawPath(path, this.A04);
        } else {
            Rect rect = this.A00;
            if (rect != null) {
                View view = this.A06;
                Rect rect2 = this.A05;
                view.getDrawingRect(rect2);
                rect2.bottom = C1H4.A01(rect.top);
                Paint paint = this.A04;
                canvas.drawRect(rect2, paint);
                view.getDrawingRect(rect2);
                rect2.top = C1H4.A01(rect.bottom);
                canvas.drawRect(rect2, paint);
                boolean z = true;
                boolean z2 = false;
                if (rect2.left < rect.left) {
                    z2 = true;
                }
                if (rect2.right <= rect.right) {
                    z = false;
                }
                if (z2) {
                    view.getDrawingRect(rect2);
                    rect2.top = C1H4.A01(rect.top);
                    rect2.bottom = C1H4.A01(rect.bottom);
                    rect2.right = C1H4.A01(rect.left);
                    canvas.drawRect(rect2, paint);
                }
                if (z) {
                    view.getDrawingRect(rect2);
                    rect2.top = C1H4.A01(rect.top);
                    rect2.bottom = C1H4.A01(rect.bottom);
                    rect2.left = C1H4.A01(rect.right);
                    canvas.drawRect(rect2, paint);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C131515wl c131515wl = this.A01;
        if (c131515wl != null) {
            c131515wl.A02(canvas);
        }
    }
}
