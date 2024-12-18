package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220749oy extends AbstractC130945vi {
    public final int A00;
    public final int A01;
    public final Path A02;
    public final C24012Akq A03;
    public final C6RB A04;
    public final C124385ju A05;
    public final int A06;
    public final Paint A07;
    public final UserSession A08;

    public C220749oy(Context context, UserSession userSession, C24012Akq c24012Akq) {
        this.A08 = userSession;
        this.A03 = c24012Akq;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.chat_sticker_width);
        int A03 = AbstractC167017dG.A03(context);
        int A0B = AbstractC166997dE.A0B(context.getResources());
        this.A06 = A0B;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        this.A01 = AbstractC167017dG.A0E(context);
        this.A02 = AbstractC166987dD.A0T();
        Paint A0S = AbstractC166987dD.A0S(1);
        AbstractC166987dD.A1N(context, A0S, R.color.audio_bar_action_color_enabled);
        this.A07 = A0S;
        C6RB A0z = AbstractC166987dD.A0z(context, dimensionPixelSize - (A03 * 2));
        A0z.A0J(Typeface.SANS_SERIF, 1);
        A0z.A0A(dimensionPixelSize2);
        AbstractC167017dG.A10(context, A0z, R.attr.igds_color_controls);
        A0z.A0M(c24012Akq.A03(context, userSession));
        this.A04 = A0z;
        this.A05 = new C124385ju(context, A0B, R.color.chat_sticker_button_divider_color, 1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.drawPath(this.A02, this.A07);
        this.A05.draw(canvas);
        this.A04.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.setBounds(rect);
        C124385ju c124385ju = this.A05;
        int i = rect.left;
        int i2 = rect.top;
        AbstractC166997dE.A1G(c124385ju, i, i2, rect.right, this.A06 + i2);
        this.A04.setBounds(A00(AbstractC166987dD.A0W(c124385ju), this, rect.centerX()));
        Path path = this.A02;
        path.reset();
        RectF rectF = new RectF(rect);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        AbstractC167017dG.A1X(fArr, this.A01);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public static final Rect A00(Rect rect, C220749oy c220749oy, float f) {
        int i = rect.bottom;
        float f2 = (i + (c220749oy.A00 + i)) / 2.0f;
        C6RB c6rb = c220749oy.A04;
        float f3 = c6rb.A0A / 2.0f;
        float f4 = c6rb.A06 / 2.0f;
        return AbstractC166987dD.A0V((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A04, this.A05);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }
}
