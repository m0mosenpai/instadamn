package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.KMw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45743KMw extends AbstractC44335Jia {
    public Integer A00;
    public final Paint A01;
    public final RectF A02;

    @Override // X.AbstractC44335Jia, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int intValue = this.A00.intValue();
        RectF rectF = this.A02;
        Paint paint = this.A01;
        if (intValue != 0) {
            canvas.drawOval(rectF, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        super.draw(canvas);
    }

    public C45743KMw(Resources resources, Drawable drawable, Integer num) {
        super(drawable);
        this.A02 = AbstractC166987dD.A0X();
        Paint A0P = AbstractC166997dE.A0P();
        this.A01 = A0P;
        A0P.setColor(resources.getColor(R.color.grey_2));
        A0P.setStrokeWidth(resources.getDimensionPixelOffset(R.dimen.account_recs_header_image_margin));
        AbstractC43592JPx.A1E(A0P);
        drawable.getClass();
        AbstractC166997dE.A1F(drawable, resources.getColor(R.color.grey_9));
        AbstractC43594JPz.A15(drawable);
        this.A00 = num;
    }

    @Override // X.AbstractC44335Jia, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A02.set(rect);
    }
}
