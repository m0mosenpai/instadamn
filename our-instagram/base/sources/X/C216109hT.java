package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.9hT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216109hT extends C5RN {
    public final C6RB A00;

    public C216109hT(Context context) {
        Spannable spannable = C6RB.A0d;
        C6RB A0Y = AbstractC167007dF.A0Y(context, context.getResources(), R.dimen.imagine_sticker_width);
        AbstractC180577zl.A00(context, AbstractC167017dG.A0R(context), A0Y, C05F.A01);
        AbstractC166997dE.A1B(context.getResources(), A0Y, R.dimen.action_bar_item_spacing_right);
        AbstractC167017dG.A10(context, A0Y, R.attr.igds_color_text_on_white);
        AbstractC166987dD.A1Q(context, A0Y, 2131964301);
        AbstractC167027dH.A0b(context, this, A0Y, 1);
        this.A00 = A0Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC166987dD.A1J(this.A00);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        C6RB c6rb = this.A00;
        float f = c6rb.A0A;
        float f2 = ((i + i3) / 2.0f) + (f / 2.0f);
        AbstractC167017dG.A1M(c6rb, f2 - f, A03, f2);
    }
}
