package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Jih, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44342Jih extends Drawable {
    public float A00;
    public RectF A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;
    public final Path A0A;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Path path = this.A0A;
        Paint paint = this.A09;
        canvas.drawPath(path, paint);
        Paint paint2 = this.A07;
        canvas.drawPath(path, paint2);
        Paint paint3 = this.A08;
        if (paint3 != null) {
            canvas.drawPath(path, paint3);
        }
        float exactCenterX = getBounds().exactCenterX();
        float f = this.A03;
        float f2 = f * 1.5f;
        float f3 = exactCenterX + f2;
        canvas.drawCircle(f3, AbstractC166987dD.A0D(this) - f2, f, paint);
        canvas.drawCircle(f3, AbstractC166987dD.A0D(this) - f2, f, paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = new RectF(rect);
        rectF.inset(10.0f, 12.0f);
        this.A01 = rectF;
        float height = ((rect.height() - this.A01.height()) / 2.0f) * 0.97f;
        this.A00 = height;
        RectF rectF2 = this.A01;
        float f = (rectF2.bottom - height) - 4.0f;
        float centerX = rectF2.centerX();
        float f2 = this.A02;
        float f3 = centerX + f2;
        Float valueOf = Float.valueOf(f);
        float f4 = f2 / 2.0f;
        float f5 = f3 - f4;
        Float valueOf2 = Float.valueOf(valueOf.floatValue() + this.A00);
        Float valueOf3 = Float.valueOf(this.A01.centerX());
        float floatValue = valueOf3.floatValue() - f2;
        float floatValue2 = (valueOf3.floatValue() - f4) - 4.0f;
        float floatValue3 = valueOf3.floatValue() - f4;
        Path A0T = AbstractC166987dD.A0T();
        A0T.addCircle(this.A01.centerX(), this.A01.centerY() - (this.A00 * 0.9f), this.A01.height() / 2.0f, Path.Direction.CW);
        Path path = this.A0A;
        path.reset();
        path.moveTo(f3, valueOf.floatValue());
        path.cubicTo(f5, valueOf.floatValue(), f5 + 4.0f, valueOf2.floatValue(), valueOf3.floatValue(), valueOf2.floatValue());
        path.cubicTo(floatValue2, valueOf2.floatValue(), floatValue3, valueOf.floatValue(), floatValue, valueOf.floatValue());
        path.close();
        path.op(A0T, Path.Op.UNION);
        float centerX2 = this.A01.centerX();
        RectF rectF3 = this.A01;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A09.setShader(new LinearGradient(centerX2, rectF3.top, rectF3.right, rectF3.bottom, new int[]{this.A05, 0}, new float[]{0.0f, 0.35f}, tileMode));
        Paint paint = this.A08;
        if (paint != null) {
            RectF rectF4 = this.A01;
            paint.setShader(new LinearGradient(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, new int[]{this.A04, 0}, new float[]{0.0f, 0.4f}, tileMode));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ C44342Jih(Context context, int i, int i2) {
        float A04 = AbstractC166987dD.A04(context.getResources(), R.dimen.iconic_note_entry_point_stroke_width);
        int color = context.getColor(R.color.facepile_inner_stroke_color);
        int color2 = context.getColor(R.color.track_background_color);
        this.A06 = context;
        this.A05 = i2;
        this.A04 = color2;
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setColor(i);
        Paint.Style style = Paint.Style.FILL;
        A0R.setStyle(style);
        A0R.setAntiAlias(true);
        A0R.setShadowLayer(10.0f, 3.0f, 3.0f, color);
        this.A07 = A0R;
        Paint A0R2 = AbstractC166987dD.A0R();
        AbstractC43592JPx.A1E(A0R2);
        A0R2.setStrokeWidth(A04);
        A0R2.setAntiAlias(true);
        this.A09 = A0R2;
        Paint A0R3 = AbstractC166987dD.A0R();
        A0R3.setStyle(style);
        A0R3.setAntiAlias(true);
        this.A08 = C1H6.A03() ? A0R3 : null;
        this.A01 = AbstractC166987dD.A0X();
        this.A03 = AbstractC167017dG.A07(context);
        this.A02 = AbstractC166987dD.A02(AbstractC167017dG.A0F(context));
        this.A0A = AbstractC166987dD.A0T();
    }
}
