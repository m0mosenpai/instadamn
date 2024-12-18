package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class KKY extends C5RN {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Path A0C;
    public final RectF A0D;
    public final RectF A0E;
    public final RectF A0F;
    public final C6RB A0G;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.translate(0.0f, 0.0f);
        canvas.drawPath(this.A0C, this.A0B);
        RectF rectF = this.A0D;
        rectF.set(new RectF(0.0f, 0.0f, this.A00, this.A01));
        Paint paint = this.A0A;
        int i = this.A05;
        paint.setColor(i);
        float f = this.A03;
        canvas.drawRoundRect(rectF, f, 1.2f * f, paint);
        float f2 = this.A02;
        rectF.inset(f2, f2);
        Context context = this.A09;
        C14360o3.A0B(context, 1);
        AbstractC43594JPz.A14(context, paint, R.attr.igds_color_gradient_blue);
        float f3 = this.A04;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        this.A0G.draw(canvas);
        AbstractC66077TzE.A00(canvas, this.A0E, i);
    }

    public KKY(Context context) {
        this.A09 = context;
        int A01 = AbstractC13690mv.A01(context, 10);
        int A012 = AbstractC13690mv.A01(context, 34);
        int A013 = AbstractC13690mv.A01(context, 14);
        this.A06 = A013;
        int A014 = AbstractC13690mv.A01(context, 25);
        float A015 = AbstractC13690mv.A01(context, 50);
        this.A00 = A015;
        float A016 = AbstractC13690mv.A01(context, 34);
        this.A01 = A016;
        this.A02 = AbstractC13690mv.A01(context, 6);
        int A017 = AbstractC13690mv.A01(context, 4);
        this.A07 = A017;
        this.A08 = AbstractC13690mv.A01(context, 12);
        float A018 = AbstractC13690mv.A01(context, 8);
        this.A03 = A018;
        this.A04 = AbstractC13690mv.A01(context, 5);
        float f = A018 * 1.8f;
        float A019 = AbstractC13690mv.A01(context, 4);
        RectF rectF = new RectF(0.0f, 0.0f, A015, A016);
        this.A0D = rectF;
        RectF rectF2 = new RectF(A019, A019, A015 - A019, A016 - A019);
        this.A0F = rectF2;
        this.A0A = AbstractC166987dD.A0S(1);
        RectF A0X = AbstractC166987dD.A0X();
        this.A0E = A0X;
        C6RB A0z = AbstractC166987dD.A0z(context, A012);
        Context context2 = A0z.A0Z;
        C14360o3.A07(context2);
        A0z.A0I(AbstractC15960qq.A00(context2).A02(EnumC15950qp.A0T));
        A0z.A0A(A01);
        AbstractC167017dG.A10(context2, A0z, R.attr.igds_color_text_on_color);
        A0z.A0M(context2.getString(2131956543));
        this.A0G = A0z;
        Path A0T = AbstractC166987dD.A0T();
        A0T.setFillType(Path.FillType.WINDING);
        A0T.addRoundRect(rectF2, f, f, Path.Direction.CW);
        this.A0C = A0T;
        Paint A0S = AbstractC166987dD.A0S(1);
        A0S.setColor(0);
        A0S.setShadowLayer(f, 2.0f, 8.0f, context.getColor(R.color.black_30_transparent));
        this.A0B = A0S;
        this.A05 = C1H6.A03() ? AbstractC167007dF.A09(context, R.attr.igds_color_elevated_background) : AbstractC167007dF.A09(context, R.attr.igds_color_primary_background);
        setBounds(0, 0, (int) this.A00, getIntrinsicHeight());
        float f2 = A014;
        float centerX = rectF.centerX() - (f2 / 2.0f);
        float f3 = rectF.bottom - A017;
        A0X.set(centerX, f3, f2 + centerX, A013 + f3);
        int i = A0z.A0A;
        int i2 = A0z.A06;
        A0z.setBounds(C1H4.A01((A015 / 2.0f) - (i / 2.0f)), C1H4.A01((A016 / 2.0f) - (i2 / 2.0f)), i, i2);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1N(this.A0G);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((((int) this.A01) + this.A06) - this.A07) + this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.A00;
    }
}
