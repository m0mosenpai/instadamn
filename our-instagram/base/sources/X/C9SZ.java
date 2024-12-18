package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9SZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SZ extends Drawable implements BE6, InterfaceC25178BCb {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final Drawable A05;
    public final C22923A8t A06;
    public final Drawable A07;
    public final C89533yt A08;
    public final C23478Aar A09;
    public final C6RL A0A;
    public final C6RB A0B;

    @Override // X.BE6
    public final void APw() {
        this.A04 = true;
        invalidateSelf();
    }

    @Override // X.BE6
    public final void CMp() {
        this.A04 = false;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        float f;
        C14360o3.A0B(canvas, 0);
        C23478Aar c23478Aar = this.A09;
        if (c23478Aar.A01) {
            int A01 = (int) AbstractC70163Da.A01((float) c23478Aar.A07.A09.A00, 128.0d);
            Paint paint = c23478Aar.A03;
            paint.setAlpha(A01);
            canvas.save();
            canvas.setMatrix(c23478Aar.A02);
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
            canvas.restore();
        }
        this.A05.draw(canvas);
        C89533yt c89533yt = this.A08;
        if (c89533yt != null) {
            float f2 = 1.0f / this.A00;
            Rect A0W = AbstractC166987dD.A0W(c89533yt);
            canvas.save();
            canvas.scale(f2, f2, A0W.left, A0W.top);
            c89533yt.draw(canvas);
            canvas.restore();
        }
        C6RB c6rb = this.A0B;
        if (c6rb != null && c6rb.A0b.getAlpha() > 0) {
            c6rb.draw(canvas);
        }
        if (!c23478Aar.A01) {
            this.A0A.draw(canvas);
        }
        if (c23478Aar.A01) {
            Rect A0W2 = AbstractC166987dD.A0W(c23478Aar.A04);
            C55982hj c55982hj = c23478Aar.A07;
            double d = (float) c55982hj.A09.A00;
            int A00 = (int) AbstractC70163Da.A00(d);
            if (c55982hj.A01 == 1.0d) {
                f = (float) AbstractC70163Da.A03(d, 0.5d, 1.0d);
            } else {
                f = 1.0f;
            }
            canvas.save();
            canvas.translate(0.0f, c23478Aar.A00 * f);
            C6RB c6rb2 = c23478Aar.A09;
            c6rb2.setBounds(A0W2.centerX() - (c6rb2.A0A / 2), A0W2.bottom, A0W2.centerX() + (c6rb2.A0A / 2), A0W2.bottom + c6rb2.A06);
            c6rb2.setAlpha(A00);
            c6rb2.draw(canvas);
            canvas.restore();
        }
        if (this.A04 && (drawable = this.A07) != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A05.setBounds(rect);
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        A00(rect, this.A00);
        C6RL c6rl = this.A0A;
        c6rl.A05.A0E(rect.width());
        C23478Aar c23478Aar = this.A09;
        c23478Aar.A09.A0E(rect.width());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final void A00(Rect rect, float f) {
        C89533yt c89533yt = this.A08;
        if (c89533yt != null && f != 0.0f) {
            float f2 = 1.0f / f;
            int i = (int) (this.A01 * f2);
            int i2 = rect.left + i;
            int i3 = rect.top + i;
            int i4 = (int) (c89533yt.A01 * f2);
            int i5 = i4 + i2;
            int i6 = i4 + i3;
            c89533yt.setBounds(i2, i3, i5, i6);
            C6RB c6rb = this.A0B;
            if (c6rb != null) {
                int i7 = i5 + i;
                int i8 = rect.right - i;
                int i9 = (i3 + i6) / 2;
                c6rb.A0A(this.A03 * f2);
                c6rb.A0E(i8 - i7);
                int i10 = c6rb.A06 / 2;
                c6rb.setBounds(i7, i9 - i10, i8, i9 + i10);
            }
        }
    }

    @Override // X.BE6
    public final void APv() {
        C23478Aar c23478Aar = this.A09;
        if (!AbstractC166987dD.A1a(c23478Aar.A08.A02.invoke())) {
            this.A0A.A01();
            invalidateSelf();
            return;
        }
        c23478Aar.A01 = true;
        C55982hj c55982hj = c23478Aar.A06;
        c55982hj.A09(C23478Aar.A0A);
        c23478Aar.A07.A09(C23478Aar.A0C);
        c55982hj.A03();
    }

    @Override // X.InterfaceC25171BBr
    public final Drawable Ad0() {
        return this.A05;
    }

    @Override // X.BE6
    public final int AeQ() {
        C89533yt c89533yt = this.A08;
        if (c89533yt != null) {
            return c89533yt.A02.getAlpha();
        }
        return 0;
    }

    @Override // X.BE6
    public final float Arr() {
        Object obj = this.A05;
        if (obj instanceof C8FY) {
            return ((C8FY) obj).A00;
        }
        if (obj instanceof BD2) {
            return ((BD2) obj).Arr();
        }
        return 0.0f;
    }

    @Override // X.BE6
    public final Bitmap BQU() {
        Drawable drawable = this.A05;
        return AbstractC167027dH.A05(drawable, drawable);
    }

    @Override // X.InterfaceC25178BCb
    public final int BSK() {
        return AbstractC167007dF.A1W(this.A06) ? 1 : 0;
    }

    @Override // X.InterfaceC25178BCb
    public final List BSS() {
        User user;
        C22923A8t c22923A8t = this.A06;
        if (c22923A8t != null) {
            user = c22923A8t.A02;
        } else {
            user = null;
        }
        List A1J = AbstractC166987dD.A1J(user);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A1J) {
            if (obj != null) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    @Override // X.BE6
    public final C22923A8t BmU() {
        return this.A06;
    }

    @Override // X.BE6
    public final int CE8() {
        C6RB c6rb = this.A0B;
        if (c6rb != null) {
            return c6rb.A0b.getAlpha();
        }
        return 0;
    }

    @Override // X.BE6
    public final void CMo(boolean z) {
        C23478Aar c23478Aar = this.A09;
        C9IR.A01.A01(c23478Aar.A05);
        C55982hj c55982hj = c23478Aar.A06;
        C55942hf c55942hf = C23478Aar.A0B;
        c55982hj.A09(c55942hf);
        C55982hj c55982hj2 = c23478Aar.A07;
        c55982hj2.A09(c55942hf);
        if (z) {
            c55982hj.A06(0.0d);
            c55982hj2.A06(0.0d);
        } else {
            c55982hj.A08(0.0d, true);
            c55982hj2.A08(0.0d, true);
        }
        this.A0A.A00();
        invalidateSelf();
    }

    @Override // X.BE6
    public final void Dek(AbstractC172157lk abstractC172157lk, float f) {
        this.A00 = f;
        A00(AbstractC166987dD.A0W(this), f);
    }

    @Override // X.BE6
    public final void EQ8(int i) {
        C89533yt c89533yt = this.A08;
        if (c89533yt != null) {
            c89533yt.setAlpha(i);
        }
    }

    @Override // X.BE6
    public final void ESD(float f) {
        Object obj = this.A05;
        if (obj instanceof C8FY) {
            ((C8FY) obj).A02(f);
        } else if (obj instanceof BD2) {
            ((BD2) obj).ESD(f);
        }
        Object obj2 = this.A07;
        if (obj2 instanceof BD2) {
            ((BD2) obj2).ESD(f);
        }
    }

    @Override // X.BE6
    public final void Egd(int i) {
        C6RB c6rb = this.A0B;
        if (c6rb != null) {
            c6rb.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A05.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A05.getIntrinsicWidth();
    }

    public C9SZ(Context context, Drawable drawable, Drawable drawable2, UserSession userSession, C22923A8t c22923A8t, String str) {
        boolean A1V = AbstractC167007dF.A1V(drawable);
        this.A05 = drawable;
        this.A07 = drawable2;
        this.A06 = c22923A8t;
        this.A00 = 1.0f;
        Resources resources = context.getResources();
        this.A05.setCallback(this);
        this.A09 = new C23478Aar(context, this, this, new A88(new B5y(userSession, 27), AbstractC166997dE.A0q(resources, 2131974419), this.A05.getIntrinsicWidth()));
        C6RK c6rk = new C6RK(context, this, -1);
        c6rk.A01(2131974419);
        c6rk.A00 = this.A05.getIntrinsicWidth();
        this.A0A = c6rk.A00();
        int color = context.getColor(R.color.fds_transparent);
        C22923A8t c22923A8t2 = this.A06;
        if (c22923A8t2 != null) {
            User user = c22923A8t2.A02;
            this.A02 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            this.A01 = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            C89533yt c89533yt = new C89533yt(user.Bhu(), str, this.A02, 0, color, color);
            this.A08 = c89533yt;
            c89533yt.setCallback(this);
            this.A03 = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            Spannable spannable = C6RB.A0d;
            int intrinsicWidth = this.A05.getIntrinsicWidth();
            int i = this.A01;
            C6RB A0z = AbstractC166987dD.A0z(context, intrinsicWidth - (((this.A02 + i) + i) + i));
            this.A0B = A0z;
            A0z.A0M(user.getUsername());
            A0z.A0G(A1V ? 1 : 0, "…");
            A0z.setAlpha(0);
            AbstractC166987dD.A1U(EnumC15950qp.A0z, AbstractC15960qq.A00(context), A0z);
            A0z.setCallback(this);
            return;
        }
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = 0;
        this.A0B = null;
        this.A08 = null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AbstractC167027dH.A0j(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC167027dH.A0i(this, runnable);
    }
}
