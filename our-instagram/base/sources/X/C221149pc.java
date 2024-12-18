package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.9pc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221149pc extends AbstractC216079hQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Drawable A05;
    public final C6RB A06;
    public final User A07;

    public C221149pc(Context context, User user, String str) {
        this.A07 = user;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height);
        this.A03 = dimensionPixelSize;
        int A03 = AbstractC167017dG.A03(context);
        int A0C = AbstractC167017dG.A0C(context);
        this.A02 = A0C;
        this.A04 = AbstractC167017dG.A0D(context);
        C89533yt c89533yt = new C89533yt(user.Bhu(), str, A0C, AbstractC167017dG.A07(context), context.getColor(AbstractC53242c7.A05(context)), context.getColor(AbstractC53242c7.A0B(context)));
        c89533yt.setCallback(this);
        this.A05 = c89533yt;
        C6RB A0X = AbstractC167007dF.A0X(context, A03, dimensionPixelSize);
        AbstractC166997dE.A1B(context.getResources(), A0X, R.dimen.account_discovery_bottom_gap);
        AbstractC166997dE.A1A(context, A0X, AbstractC53242c7.A09(context));
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.prompt_sticker_title_text_line_spacing_multiplier, typedValue, true);
        A0X.A0B(0.0f, typedValue.getFloat());
        A0X.A0M(user.getUsername());
        A0X.setCallback(this);
        this.A06 = A0X;
        int i = A0C / 2;
        this.A00 = i;
        this.A01 = getIntrinsicHeight() - i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A05.draw(canvas);
        this.A06.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A05, this.A06);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A02 + this.A06.A06 + (this.A04 * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A01 = AbstractC167007dF.A01(this, AbstractC166987dD.A03(i2, i4, 2.0f));
        Drawable drawable = this.A05;
        drawable.setBounds((int) AbstractC167007dF.A03(drawable, f), (int) A01, (int) ((drawable.getIntrinsicWidth() / 2.0f) + f), (int) (A01 + AbstractC166987dD.A06(drawable)));
        C6RB c6rb = this.A06;
        int A0D = AbstractC166987dD.A0D(drawable);
        int i5 = this.A04;
        c6rb.setBounds((int) (f - (c6rb.A0A / 2.0f)), A0D + i5, (int) (f + (c6rb.A0A / 2.0f)), AbstractC166987dD.A0D(drawable) + i5 + c6rb.A06);
    }
}
