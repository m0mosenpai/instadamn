package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.PaintDrawable;
import com.facebook.R;

/* renamed from: X.JXh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43768JXh extends PaintDrawable {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;

    public C43768JXh(Context context) {
        C14360o3.A0B(context, 1);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Paint paint = getPaint();
        Rect A0W = AbstractC166987dD.A0W(this);
        int centerX = A0W.centerX();
        int centerY = A0W.centerY();
        int height = A0W.height() / 2;
        int i = this.A04;
        int i2 = height - i;
        if (this.A03) {
            paint.setColor(this.A01);
            int i3 = 0;
            do {
                double d = i3 * 0.5235987755982988d;
                double d2 = i2;
                canvas.drawCircle((int) (centerX + (Math.cos(d) * d2)), (int) (centerY + (d2 * Math.sin(d))), i, paint);
                i3++;
            } while (i3 < 12);
        }
        if (this.A02) {
            paint.setColor(this.A00);
            canvas.drawCircle(centerX, centerY, this.A05, paint);
        }
    }
}
