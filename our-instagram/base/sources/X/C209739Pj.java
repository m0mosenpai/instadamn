package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.9Pj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209739Pj extends Drawable {
    public List A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final Paint A05;
    public final Paint A06;
    public final Paint A07;
    public final RectF A08;
    public final BUU A09;
    public final float[] A0A;
    public final int[] A0B;

    public C209739Pj(Context context, boolean z) {
        BUU buu;
        C14360o3.A0B(context, 1);
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC166987dD.A1N(context, A0R, AbstractC53242c7.A0H(context, R.attr.fastScrubberLineColor));
        A0R.setAntiAlias(true);
        this.A07 = A0R;
        Paint A0R2 = AbstractC166987dD.A0R();
        AbstractC166987dD.A1N(context, A0R2, AbstractC53242c7.A0H(context, R.attr.fastScrubberDotColor));
        A0R2.setAntiAlias(true);
        AbstractC166987dD.A1N(context, A0R2, AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink));
        A0R2.setStrokeWidth(AbstractC166997dE.A0B(context.getResources()));
        A0R2.setStyle(Paint.Style.STROKE);
        this.A06 = A0R2;
        this.A08 = AbstractC166987dD.A0X();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A04 = dimensionPixelSize;
        float A02 = AbstractC166987dD.A02(dimensionPixelSize);
        this.A01 = A02;
        float A04 = AbstractC166997dE.A04(context, R.dimen.abc_control_corner_material);
        this.A02 = A04;
        float dimension = context.getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
        this.A03 = dimension;
        int[] iArr = {AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_pink), AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_pink)};
        this.A0B = iArr;
        float[] fArr = {0.0f, 1.0f};
        this.A0A = fArr;
        Paint A0R3 = AbstractC166987dD.A0R();
        float f = -A04;
        A0R3.setShader(new LinearGradient(f, f, A04, f, iArr, fArr, Shader.TileMode.CLAMP));
        this.A05 = A0R3;
        this.A00 = C16930sl.A00;
        if (z) {
            buu = BUU.A00(context, dimension, A02);
        } else {
            buu = null;
        }
        this.A09 = buu;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        BUU buu = this.A09;
        if (buu != null) {
            buu.draw(canvas);
        }
        RectF rectF = this.A08;
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, this.A07);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            canvas.save();
            float A04 = AbstractC167007dF.A04(this.A00, i) * rectF.width();
            float f2 = this.A02;
            canvas.translate(A04 - f2, rectF.centerY());
            canvas.drawCircle(0.0f, 0.0f, f2, this.A06);
            canvas.drawCircle(0.0f, 0.0f, f2, this.A05);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A08;
        float f = rect.left;
        float centerY = rect.centerY();
        float A02 = AbstractC166987dD.A02(this.A04);
        rectF.set(f, centerY - A02, rect.right, rect.centerY() + A02);
        BUU buu = this.A09;
        if (buu != null) {
            float f2 = rectF.left;
            float f3 = this.A03;
            AbstractC167027dH.A0f(rectF, buu, f2, f3, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        this.A06.setColorFilter(colorFilter);
        AbstractC167017dG.A13(colorFilter, this.A09);
        invalidateSelf();
    }
}
