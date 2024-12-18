package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import com.facebook.R;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Bww, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27072Bww extends C5RN {
    public final C6RB A00;
    public final C6RB A01;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.translate(getBounds().left, getBounds().top);
        this.A00.draw(canvas);
        C6RB c6rb = this.A01;
        canvas.translate(getBounds().centerX() - (c6rb.A0A / 2.0f), getBounds().centerY() - (c6rb.A06 / 2.0f));
        c6rb.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1N(this.A00, this.A01);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.A0A;
    }

    public C27072Bww(Context context, String str) {
        int A04 = AbstractC166997dE.A04(context, R.dimen.abc_list_item_height_material);
        int A042 = AbstractC166997dE.A04(context, R.dimen.friend_map_city_outline_text_size);
        C6RB c6rb = new C6RB(context, A04);
        C15980qs A00 = AbstractC15960qq.A00(context);
        EnumC15950qp enumC15950qp = EnumC15950qp.A0T;
        c6rb.A0I(A00.A02(enumC15950qp));
        TextPaint textPaint = c6rb.A0b;
        float f = A042;
        textPaint.setStrokeWidth(0.65f * f);
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        textPaint.setStyle(Paint.Style.STROKE);
        AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background));
        c6rb.A0A(f);
        Locale locale = Locale.ROOT;
        c6rb.A0M(AbstractC166997dE.A10(locale, str));
        c6rb.A0G(1, "…");
        this.A00 = c6rb;
        C6RB c6rb2 = new C6RB(context, A04);
        c6rb2.A0I(AbstractC15960qq.A00(context).A02(enumC15950qp));
        c6rb2.A0A(f);
        c6rb2.A0F(AbstractC167007dF.A09(context, R.attr.igds_color_primary_text));
        c6rb2.A0M(AbstractC166997dE.A10(locale, str));
        c6rb2.A0G(1, "…");
        this.A01 = c6rb2;
        C6RB c6rb3 = this.A00;
        setBounds(0, 0, c6rb3.A0A, c6rb3.A06);
    }
}
