package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Jiv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44356Jiv extends Drawable {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final Context A05;
    public final Drawable A06;
    public final TextPaint A07;
    public final UserSession A08;
    public final C45030JwL A09;
    public final C45017Jw8 A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Path A0T = AbstractC166987dD.A0T();
        float f = this.A02;
        A0T.addArc(new RectF(0.0f, 0.0f, f, f), 90.0f, 180.0f);
        float A00 = A00();
        float f2 = f / 2.0f;
        A0T.addRect(new RectF(f2, 0.0f, f2 + A00, f), Path.Direction.CW);
        A0T.addArc(new RectF(A00, 0.0f, A00 + f, f), 270.0f, 180.0f);
        canvas.drawPath(A0T, this.A0A.A00);
        TextPaint textPaint = this.A07;
        String str = this.A0C;
        int measureText = (int) textPaint.measureText(str);
        float descent = textPaint.descent() - textPaint.ascent();
        StaticLayout staticLayout = new StaticLayout(str, textPaint, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        canvas.save();
        float f3 = this.A03;
        canvas.translate(((f3 + A00()) - textPaint.measureText(str)) + (f2 - f3), (f - descent) / 2.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        Drawable drawable = this.A06;
        int intrinsicHeight = (int) ((f - drawable.getIntrinsicHeight()) / 2.0f);
        int i = (int) f3;
        drawable.setBounds(i, intrinsicHeight, drawable.getIntrinsicWidth() + i, drawable.getIntrinsicHeight() + intrinsicHeight);
        drawable.draw(canvas);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final float A00() {
        float measureText = this.A07.measureText(this.A0C);
        if (!this.A0D.isEmpty()) {
            measureText = measureText + this.A04 + this.A06.getIntrinsicWidth();
        }
        return measureText - 6.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.A02 + A00());
    }

    public /* synthetic */ C44356Jiv(UserSession userSession, String str, List list) {
        Context A0F = AbstractC25225BEi.A0F(userSession);
        C45030JwL c45030JwL = new C45030JwL(A0F.getColor(R.color.primary_text_disabled_material_dark), A0F.getColor(R.color.black), A0F.getColor(R.color.design_dark_default_color_on_background), A0F.getColor(R.color.design_dark_default_color_on_background));
        Paint A0S = AbstractC166987dD.A0S(1);
        A0S.setColor(c45030JwL.A00);
        Paint.Style style = Paint.Style.FILL;
        A0S.setStyle(style);
        Paint A0S2 = AbstractC166987dD.A0S(3);
        A0S2.setColor(c45030JwL.A01);
        A0S2.setStyle(style);
        C45017Jw8 c45017Jw8 = new C45017Jw8(A0S, A0S2);
        C14360o3.A0B(str, 3);
        this.A08 = userSession;
        this.A0D = list;
        this.A0B = str;
        this.A09 = c45030JwL;
        this.A0A = c45017Jw8;
        Context A0F2 = AbstractC25225BEi.A0F(userSession);
        this.A05 = A0F2;
        this.A0C = "Friends";
        this.A00 = AbstractC13880nE.A00(A0F2, 20.0f);
        this.A01 = AbstractC13880nE.A00(A0F2, 1.0f);
        this.A02 = AbstractC13880nE.A00(A0F2, 30.0f);
        this.A03 = AbstractC13880nE.A00(A0F2, 12.0f);
        float A00 = AbstractC13880nE.A00(A0F2, 14.0f);
        this.A04 = AbstractC13880nE.A00(A0F2, 5.0f);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(A00);
        textPaint.setColor(c45030JwL.A03);
        textPaint.setTypeface(AbstractC15960qq.A00(A0F2).A02(EnumC15950qp.A0X));
        this.A07 = textPaint;
        L9I l9i = new L9I(this.A05, this.A0B, this.A0D, (int) this.A00);
        l9i.A0B = true;
        l9i.A07 = C05F.A00;
        l9i.A0D = true;
        l9i.A08 = Integer.valueOf(this.A09.A02);
        l9i.A01((int) this.A01);
        l9i.A0G = true;
        this.A06 = l9i.A00();
    }
}
