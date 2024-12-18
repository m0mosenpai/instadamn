package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.facebook.R;
import java.util.regex.Pattern;

/* renamed from: X.9Sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210379Sc extends Drawable implements C5RQ {
    public int A00;
    public final Paint A01;
    public final Rect A02;
    public final Drawable A03;
    public final C68024V6s A04;

    public C210379Sc(Context context, Drawable drawable, C68024V6s c68024V6s) {
        this.A04 = c68024V6s;
        this.A03 = drawable;
        Rect A0U = AbstractC166987dD.A0U();
        this.A02 = A0U;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(context.getResources().getDimension(R.dimen.achievements_only_you_top_margin));
        AbstractC166987dD.A1N(context, textPaint, R.color.audio_bar_action_color_enabled);
        textPaint.setShadowLayer(5.0f, 0.0f, 0.0f, AbstractC166997dE.A02(context));
        textPaint.setTypeface(AbstractC167017dG.A0R(context));
        String A00 = A00();
        String A002 = A00();
        Pattern pattern = AbstractC13670mt.A00;
        textPaint.getTextBounds(A00, 0, A002.length(), A0U);
        this.A01 = textPaint;
    }

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
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

    private final String A00() {
        Long l = this.A04.A06;
        if (l != null) {
            return C23831Eq.A02(l.longValue() - this.A00);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A04;
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        Long l = this.A04.A06;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 15000) {
                longValue = 15000;
            }
            return (int) longValue;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        Drawable drawable = this.A03;
        if (drawable != null) {
            AbstractC167017dG.A12(canvas, drawable);
        }
        String A00 = A00();
        C68024V6s c68024V6s = this.A04;
        float width = (c68024V6s.A04 - c68024V6s.A01) - r1.width();
        float A02 = c68024V6s.A02 + AbstractC166987dD.A02(this.A02.height());
        Paint paint = this.A01;
        canvas.drawText(A00, width, A02 - paint.getFontMetrics().ascent, paint);
        canvas.restore();
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        this.A00 = i;
    }
}
