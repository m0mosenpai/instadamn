package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Mav, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50741Mav extends Drawable {
    public String A00;
    public Drawable A01;
    public final Paint A02 = new Paint(3);
    public final float A03;
    public final float A04;
    public final Context A05;
    public final Paint A06;
    public final Rect A07;
    public final RectF A08;
    public final boolean A09;

    public C50741Mav(Context context, float f, boolean z, boolean z2) {
        this.A05 = context;
        this.A03 = f;
        this.A09 = z2;
        Paint paint = new Paint(3);
        this.A06 = paint;
        float A04 = AbstractC13880nE.A04(context, 1);
        this.A04 = A04;
        this.A08 = AbstractC166987dD.A0X();
        this.A07 = AbstractC166987dD.A0U();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(A04);
        paint.setColor(Color.argb(Math.round(25.5f), 255, 255, 255));
        if (z) {
            this.A01 = C3LQ.A05(context, R.drawable.instagram_my_week_story_pano_outline_24, context.getColor(R.color.igds_icon_on_color));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Context context = this.A05;
        int width = getBounds().width();
        int height = getBounds().height();
        String A01 = AnonymousClass001.A01('x', width, height);
        if (width != 0 && height != 0 && !C14360o3.A0K(this.A00, A01)) {
            int i = R.drawable.lately_placeholder_card;
            if (width == height) {
                i = R.drawable.lately_placeholder_default;
            }
            Drawable drawable = context.getDrawable(i);
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                C14360o3.A07(bitmap);
                this.A00 = A01;
                Paint paint = this.A02;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                invalidateSelf();
            } else if (drawable instanceof C3PR) {
                ((C3PR) drawable).A01(new C56169Owc(A01, this, 0));
            }
        }
        if (this.A00 != null) {
            if (this.A09) {
                canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), getBounds().width() / 2.0f, this.A02);
            } else {
                RectF rectF = this.A08;
                rectF.set(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
                float f = this.A03;
                canvas.drawRoundRect(rectF, f, f, this.A02);
                float f2 = this.A04 / 2.0f;
                rectF.inset(f2, f2);
                canvas.drawRoundRect(rectF, f, f, this.A06);
            }
            Drawable drawable2 = this.A01;
            if (drawable2 != null) {
                Rect rect = this.A07;
                rect.left = 0;
                rect.top = 0;
                rect.right = drawable2.getIntrinsicWidth();
                rect.bottom = drawable2.getIntrinsicHeight();
                drawable2.setBounds(rect);
                canvas.save();
                canvas.translate((getBounds().width() / 2.0f) - (drawable2.getBounds().width() / 2.0f), (getBounds().height() / 2.0f) - (drawable2.getBounds().height() / 2.0f));
                drawable2.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
