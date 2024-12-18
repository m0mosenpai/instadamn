package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jik, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44345Jik extends Drawable {
    public final int A00;
    public final Context A01;
    public final C44306Jhx A02;
    public final C6RB A03;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C44306Jhx c44306Jhx = this.A02;
        c44306Jhx.setBounds(getBounds().left, getBounds().top, getBounds().right, AbstractC166987dD.A0D(this));
        c44306Jhx.draw(canvas);
        int i = c44306Jhx.A04 + c44306Jhx.A03;
        C6RB c6rb = this.A03;
        int i2 = c6rb.A0A;
        int i3 = (i - i2) / 2;
        c6rb.setBounds(i3, i + this.A00, i2 + i3, c6rb.A06);
        c6rb.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C44306Jhx c44306Jhx = this.A02;
        return c44306Jhx.A04 + c44306Jhx.A03 + this.A00 + this.A03.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C44306Jhx c44306Jhx = this.A02;
        return c44306Jhx.A04 + c44306Jhx.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        this.A03.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        this.A03.setColorFilter(colorFilter);
    }

    public C44345Jik(Context context, UserSession userSession, String str, int i) {
        this.A01 = context;
        this.A02 = new C44306Jhx(context, null, null, str, C18U.A06(C06090Tz.A05, userSession, 36319355851578569L) ? R.dimen.audience_lists_text_in_badge_horizontal_margin_right : R.dimen.abc_button_inset_vertical_material, i, LH0.A00(context, userSession), LH0.A02(context, userSession), 1920, true);
        Spannable spannable = C6RB.A0d;
        C6RB A0z = AbstractC166987dD.A0z(context, AbstractC188878Yd.A01(context));
        A0z.A0M(A0z.A0Z.getResources().getText(2131953523));
        this.A03 = A0z;
        this.A00 = AbstractC167017dG.A0D(context);
        JQ1.A0R(context, A0z);
    }
}
