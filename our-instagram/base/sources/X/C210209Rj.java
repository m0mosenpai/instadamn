package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import com.facebook.R;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.9Rj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210209Rj extends Drawable {
    public final float A00;
    public final int A01;
    public final Paint A02;
    public final C8FY A03;

    public C210209Rj(Context context, Bitmap bitmap, float f, int i) {
        this.A00 = f;
        this.A01 = i;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A02 = A0S;
        AbstractC166987dD.A1N(context, A0S, R.color.black_15_transparent);
        A0S.setStyle(Paint.Style.STROKE);
        A0S.setStrokeWidth(AbstractC13690mv.A00(context, 1.0f));
        Resources resources = context.getResources();
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, min, min);
        C14360o3.A07(extractThumbnail);
        C8FY c8fy = new C8FY(resources, extractThumbnail);
        c8fy.A02(f);
        c8fy.A08.setAntiAlias(true);
        c8fy.invalidateSelf();
        this.A03 = c8fy;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        int A0E = AbstractC166987dD.A0E(this);
        int i = this.A01;
        int i2 = A0E + i;
        int i3 = getBounds().top + i;
        int i4 = getBounds().right - i;
        int A0D = AbstractC166987dD.A0D(this) - i;
        C8FY c8fy = this.A03;
        AbstractC166997dE.A1G(c8fy, i2, i3, i4, A0D);
        c8fy.draw(canvas);
        RectF rectF = new RectF(i2, i3, i4, A0D);
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A02);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "PixelFormat.TRANSPARENT", imports = {"android.graphics.PixelFormat"}))
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }
}
