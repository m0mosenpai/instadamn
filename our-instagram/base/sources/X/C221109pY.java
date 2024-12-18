package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.facebook.R;
import com.instagram.user.model.User;

/* renamed from: X.9pY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221109pY extends AbstractC202378xH implements InterfaceC25199BCx {
    public final Context A00;
    public final C9SA A01;
    public final User A02;
    public final String A03;

    public C221109pY(Context context, User user, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = context;
        this.A03 = str;
        this.A02 = user;
        C9SA c9sa = new C9SA(context, this.A03, AbstractC13880nE.A0A(context), context.getResources().getDimensionPixelSize(R.dimen.product_sticker_text_size), false);
        this.A01 = c9sa;
        c9sa.A05(AbstractC166997dE.A10(C1Q2.A02(), AbstractC166997dE.A0p(this.A00, 2131976887)), -1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A01.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A01.onBoundsChange(rect);
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A03;
    }

    @Override // X.InterfaceC25199BCx
    public final C190888ck C6I() {
        return this.A01.A0D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A01.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    @Override // X.InterfaceC25199BCx
    public final void setTextFormat(C190888ck c190888ck) {
        if (c190888ck != null) {
            this.A01.A04(c190888ck);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A01.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
