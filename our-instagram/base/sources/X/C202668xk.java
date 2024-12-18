package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202668xk extends Drawable implements Drawable.Callback, C1NJ, InterfaceC25178BCb, InterfaceC133125ze {
    public String A00;
    public Drawable A01;
    public final int A02;
    public final C210419Sg A03;
    public final User A04;
    public final String A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Drawable A0C;
    public final C6RB A0D;
    public final C6RB A0E;

    @Override // X.InterfaceC25178BCb
    public final int BSK() {
        return 1;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            C73053Pg c73053Pg = new C73053Pg(bitmap, false);
            c73053Pg.setCallback(this);
            c73053Pg.setAlpha(getAlpha());
            c73053Pg.setColorFilter(getColorFilter());
            c73053Pg.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.A01 = c73053Pg;
            invalidateSelf();
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int save;
        C14360o3.A0B(canvas, 0);
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        float f = bounds.left + this.A06;
        float f2 = bounds.top + this.A0A;
        canvas.save();
        canvas.translate(f, f2);
        Drawable drawable = this.A01;
        if (drawable != null) {
            save = canvas.save();
            try {
                float intrinsicWidth = this.A07 / drawable.getIntrinsicWidth();
                canvas.scale(intrinsicWidth, intrinsicWidth);
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        C6RB c6rb = this.A0D;
        if (c6rb != null) {
            i = c6rb.A06;
        } else {
            i = 0;
        }
        float f3 = this.A07;
        int i2 = this.A08;
        float f4 = (f3 / 2.0f) - ((i2 + i) / 2.0f);
        canvas.translate(f3, f4);
        C6RB c6rb2 = this.A0E;
        c6rb2.draw(canvas);
        Drawable drawable2 = this.A0C;
        if (drawable2 != null) {
            int save2 = canvas.save();
            canvas.translate(c6rb2.A0A - c6rb2.A00, (drawable2.getIntrinsicHeight() - c6rb2.A06) / 2.0f);
            drawable2.draw(canvas);
            canvas.restoreToCount(save2);
        }
        float f5 = 0.0f;
        if (c6rb != null) {
            save = canvas.save();
            canvas.translate(0.0f, i2 + c6rb.A0b.getFontMetrics().descent);
            c6rb.draw(canvas);
        }
        canvas.restore();
        C210419Sg c210419Sg = this.A03;
        if (c210419Sg != null) {
            float f6 = f + f3 + c6rb2.A0A;
            if (this.A04.isVerified()) {
                f5 = this.A09;
            }
            c210419Sg.A00(canvas, f6 + f5, f2 + f4 + (i / 2.0f), 1.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C14360o3.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public C202668xk(Context context, Drawable drawable, EnumC15950qp enumC15950qp, User user, String str, String str2, int i, int i2, int i3, int i4, int i5, boolean z) {
        float f;
        BitmapDrawable bitmapDrawable;
        int i6;
        this.A04 = user;
        this.A05 = str2;
        this.A07 = i3;
        this.A0A = i5;
        this.A06 = i;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A09 = dimensionPixelSize;
        this.A00 = "";
        float f2 = i4;
        int A01 = AbstractC188878Yd.A01(context);
        if (drawable != null) {
            drawable.setBounds(0, 0, i3, i3);
            this.A01 = drawable;
        } else {
            C1OG A0J = C25821No.A00().A0J(user.Bhu(), "ProfileAttributionDrawable");
            A0J.A02(this);
            A0J.A01();
        }
        C6RB c6rb = new C6RB(context, A01);
        this.A0E = c6rb;
        c6rb.setCallback(this);
        c6rb.A0M(user.getUsername());
        c6rb.A0N("…", 1, true);
        if (enumC15950qp != null) {
            f = i2;
            c6rb.A0I(AbstractC15960qq.A00(context).A02(enumC15950qp));
            c6rb.A09();
            c6rb.A0A(f2);
            c6rb.A0C(f, 0.0f);
        } else {
            f = i2;
            AMr.A07(context, c6rb, f2, f);
        }
        if (str != null) {
            C6RB c6rb2 = new C6RB(context, A01);
            this.A0D = c6rb2;
            c6rb2.setCallback(this);
            c6rb2.A0M(str);
            c6rb2.A0N("…", 1, true);
            c6rb2.A0A(context.getResources().getDimension(R.dimen.account_discovery_bottom_gap));
            c6rb2.A0C(f, 0.0f);
        } else {
            this.A0D = null;
        }
        if (z) {
            String string = context.getString(2131976886);
            C14360o3.A07(string);
            C210419Sg c210419Sg = new C210419Sg(context, string, A01);
            this.A03 = c210419Sg;
            C6RB c6rb3 = c210419Sg.A01;
            c6rb3.A0A(f2);
            C6RB c6rb4 = c210419Sg.A02;
            c6rb4.A0A(f2);
            int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text_on_media));
            c6rb3.A0F(color);
            c6rb4.A0F(color);
            c6rb3.A0b.setFakeBoldText(true);
            float f3 = i;
            if (Float.valueOf(f3) != null) {
                c6rb4.A0L(new SpannableString("•"));
                c6rb3.A0C(f3, 0.0f);
            } else {
                c6rb4.A0L(new SpannableString("  •  "));
                c6rb3.A0C(0.0f, 0.0f);
            }
            bitmapDrawable = null;
        } else {
            bitmapDrawable = null;
            this.A03 = null;
        }
        if (user.isVerified()) {
            bitmapDrawable = C85963sQ.A00(context);
            bitmapDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        this.A0C = bitmapDrawable;
        C210419Sg c210419Sg2 = this.A03;
        if (c210419Sg2 != null) {
            i6 = c210419Sg2.getIntrinsicWidth();
        } else {
            i6 = 0;
        }
        int i7 = ((((A01 - i) - i3) - (i2 * 2)) - i6) - (user.isVerified() ? dimensionPixelSize : 0);
        c6rb.A0E(i7);
        C6RB c6rb5 = this.A0D;
        if (c6rb5 != null) {
            c6rb5.A0E(i7);
        }
        this.A08 = c6rb.A06;
        this.A0B = i + i3 + c6rb.A0A + i6;
        this.A02 = i5 + i3 + i5;
    }

    @Override // X.InterfaceC25178BCb
    public final List BSS() {
        List singletonList = Collections.singletonList(this.A04);
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0B;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable mutate;
        Drawable drawable = this.A01;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable mutate;
        Drawable drawable = this.A01;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
