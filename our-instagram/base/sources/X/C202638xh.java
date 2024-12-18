package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.8xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202638xh extends AbstractC202648xi {
    public C210419Sg A00;
    public User A01;
    public final float A02;
    public final Context A03;
    public final C6RL A04;
    public final C38321qM A05;
    public final String A06;
    public final float A07;
    public final float A08 = 0.67f;
    public final float A09;
    public final Drawable A0A;
    public final UserSession A0B;
    public final C83o A0C;
    public final C6RB A0D;
    public final boolean A0E;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C14360o3.A07(getBounds());
        int save = canvas.save();
        float f = this.A08;
        float f2 = 1.0f / f;
        canvas.translate(r6.left, r6.top);
        canvas.scale(f2, f2);
        float f3 = this.A07 * f;
        canvas.save();
        float f4 = this.A09;
        Drawable drawable = this.A0A;
        canvas.translate(f4 - (drawable.getIntrinsicWidth() / 4.0f), f4 - (drawable.getIntrinsicHeight() / 4.0f));
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        float f5 = f3 + f4;
        canvas.translate(f4, f5);
        C6RB c6rb = this.A0D;
        c6rb.A0M(AbstractC226839zf.A00(this.A03, this.A0B, this.A0C));
        c6rb.draw(canvas);
        canvas.restore();
        canvas.restoreToCount(save);
        C210419Sg c210419Sg = this.A00;
        if (c210419Sg != null) {
            c210419Sg.A00(canvas, (f * r6.left) + f4 + c6rb.A0A, (f * r6.top) + f5, f2);
        }
        if (this.A0E) {
            canvas.save();
            this.A04.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean A00() {
        C38321qM c38321qM = this.A0C.A03;
        if (c38321qM != null && c38321qM.A34() != null) {
            if (C18U.A06(C06090Tz.A05, this.A0B, 36319145398180874L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A0C;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return AnonymousClass001.A0R("story-reels-metadata-sticker-", this.A06);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return C1H4.A01(this.A07);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return C1H4.A01(this.A02);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0D.setAlpha(i);
        C210419Sg c210419Sg = this.A00;
        if (c210419Sg != null) {
            c210419Sg.setAlpha(i);
        }
        this.A0A.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        C210419Sg c210419Sg = this.A00;
        if (c210419Sg != null) {
            c210419Sg.setColorFilter(colorFilter);
        }
        this.A0A.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C202638xh(Context context, UserSession userSession, C83o c83o) {
        int i;
        this.A0B = userSession;
        this.A03 = context;
        this.A0C = c83o;
        User user = c83o.A0A;
        this.A01 = user == null ? c83o.A0B : user;
        this.A05 = c83o.A03;
        this.A06 = c83o.A0C;
        this.A07 = c83o.A01;
        float f = c83o.A02;
        this.A02 = f;
        Resources resources = context.getResources();
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        this.A09 = dimensionPixelSize;
        int color = context.getColor(AbstractC53242c7.A0A(context));
        int color2 = context.getColor(R.color.audio_bar_action_color_enabled);
        int color3 = context.getColor(R.color.black_50_transparent);
        this.A0E = C14360o3.A0K(C20Y.A00(userSession).A01.A00, C125535lz.A00);
        C6RB c6rb = new C6RB(context, (int) f);
        this.A0D = c6rb;
        c6rb.A0A(resources.getDimension(R.dimen.action_bar_item_spacing_right));
        c6rb.A0F(color);
        c6rb.A0D(5.0f, 0.0f, 0.0f, color3);
        c6rb.A0N("…", 1, true);
        C6RK c6rk = new C6RK(context, this, -1);
        Integer num = C05F.A00;
        C14360o3.A0B(num, 0);
        c6rk.A06 = num;
        c6rk.A01(2131953521);
        c6rk.A02(R.dimen.abc_dialog_padding_material);
        c6rk.A03 = 2000L;
        this.A04 = c6rk.A00();
        if (A00()) {
            Context context2 = this.A03;
            String string = context2.getString(2131976844);
            C14360o3.A07(string);
            C210419Sg c210419Sg = new C210419Sg(context2, string, (int) this.A02);
            this.A00 = c210419Sg;
            int color4 = context2.getColor(AbstractC53242c7.A0H(context2, R.attr.igds_color_secondary_text_on_media));
            c210419Sg.A01.A0F(color4);
            c210419Sg.A02.A0F(color4);
        }
        int i2 = (int) ((0.67f * f) - (2.0f * dimensionPixelSize));
        C210419Sg c210419Sg2 = this.A00;
        if (c210419Sg2 != null) {
            i = c210419Sg2.getIntrinsicWidth();
        } else {
            i = 0;
        }
        c6rb.A0E(i2 - i);
        Drawable A05 = C3LQ.A05(context, R.drawable.instagram_reels_pano_filled_24, color2);
        this.A0A = A05;
        A05.setBounds(0, 0, A05.getIntrinsicWidth(), A05.getIntrinsicHeight());
    }
}
