package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.user.model.User;

/* renamed from: X.9SY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SY extends Drawable implements BE6 {
    public int A00;
    public int A01;
    public float A02 = 1.0f;
    public float A03;
    public int A04;
    public final int A05;
    public final int A06;
    public final Drawable A07;
    public final C22923A8t A08;
    public final C6RB A09;

    public C9SY(Context context, Drawable drawable, C22923A8t c22923A8t, int i, int i2) {
        int intrinsicHeight;
        User user;
        int i3;
        this.A07 = drawable;
        this.A08 = c22923A8t;
        this.A06 = i;
        this.A05 = i2;
        drawable.setCallback(this);
        Resources resources = context.getResources();
        int i4 = this.A06;
        if (i4 != 0 && (i3 = this.A05) != 0) {
            this.A01 = (int) (i4 * 0.5f);
            intrinsicHeight = (int) (i3 * 0.5f);
        } else {
            Drawable drawable2 = this.A07;
            this.A01 = drawable2.getIntrinsicWidth();
            intrinsicHeight = drawable2.getIntrinsicHeight();
        }
        this.A00 = intrinsicHeight;
        C22923A8t c22923A8t2 = this.A08;
        if (c22923A8t2 != null) {
            user = c22923A8t2.A02;
        } else {
            user = null;
        }
        if (user != null) {
            this.A04 = AbstractC166997dE.A0C(resources);
            this.A03 = AbstractC13880nE.A04(context, 12);
            Spannable spannable = C6RB.A0d;
            C6RB A0z = AbstractC166987dD.A0z(context, this.A07.getIntrinsicWidth());
            AbstractC166997dE.A1Q(A0z, user.getUsername());
            A0z.A0A(this.A03);
            A0z.A0F(-1);
            A0z.setAlpha(255);
            A0z.A0N("…", 1, true);
            A0z.A0D(1.0f, 0.0f, 0.5f, -16777216);
            this.A09 = A0z;
            AbstractC166987dD.A1U(EnumC15950qp.A0z, AbstractC15960qq.A00(context), A0z);
            A0z.setCallback(this);
            return;
        }
        this.A04 = 0;
        this.A03 = 0.0f;
        this.A09 = null;
    }

    private final void A00(Rect rect, float f) {
        C6RB c6rb;
        if (f != 0.0f && (c6rb = this.A09) != null) {
            float f2 = 1.0f / f;
            int i = (int) (this.A04 * f2);
            int i2 = rect.left + (i * 2);
            int i3 = rect.right - i;
            int i4 = rect.bottom - i;
            c6rb.A0A(this.A03 * f2);
            c6rb.A0E(Math.max(0, i3 - i2));
            c6rb.setBounds(i2, i4 - ((int) (c6rb.A06 * f2)), i3, i4);
        }
    }

    @Override // X.BE6
    public final void APv() {
    }

    @Override // X.BE6
    public final void APw() {
    }

    @Override // X.BE6
    public final int AeQ() {
        return 0;
    }

    @Override // X.BE6
    public final void CMo(boolean z) {
    }

    @Override // X.BE6
    public final void CMp() {
    }

    @Override // X.BE6
    public final void EQ8(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A07.draw(canvas);
        C6RB c6rb = this.A09;
        if (c6rb != null && c6rb.A0b.getAlpha() > 0) {
            c6rb.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A07.setBounds(rect);
        A00(rect, this.A02);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // X.InterfaceC25171BBr
    public final Drawable Ad0() {
        return this.A07;
    }

    @Override // X.BE6
    public final float Arr() {
        Object obj = this.A07;
        if (obj instanceof C8FY) {
            return ((C8FY) obj).A00;
        }
        if (obj instanceof BD2) {
            return ((BD2) obj).Arr();
        }
        if (obj instanceof BBH) {
            C206169Az c206169Az = ((C210399Se) ((BBH) obj)).A03;
            float f = c206169Az.A02;
            float[] fArr = {c206169Az.A03, c206169Az.A00, c206169Az.A01};
            int i = 0;
            do {
                f = Math.max(f, fArr[i]);
                i++;
            } while (i < 3);
            return f;
        }
        return 0.0f;
    }

    @Override // X.BE6
    public final Bitmap BQU() {
        Drawable drawable = this.A07;
        return AbstractC167027dH.A05(drawable, drawable);
    }

    @Override // X.BE6
    public final C22923A8t BmU() {
        return this.A08;
    }

    @Override // X.BE6
    public final int CE8() {
        C6RB c6rb = this.A09;
        if (c6rb != null) {
            return c6rb.A0b.getAlpha();
        }
        return 0;
    }

    @Override // X.BE6
    public final void Dek(AbstractC172157lk abstractC172157lk, float f) {
        this.A02 = f;
        A00(AbstractC166987dD.A0W(this), f);
    }

    @Override // X.BE6
    public final void ESD(float f) {
        Object obj = this.A07;
        if (obj instanceof C8FY) {
            ((C8FY) obj).A02(f);
        } else if (obj instanceof BD2) {
            ((BD2) obj).ESD(f);
        } else {
            if (!(obj instanceof BBH)) {
                return;
            }
            ((C210399Se) ((BBH) obj)).A03 = new C206169Az(f);
        }
    }

    @Override // X.BE6
    public final void Egd(int i) {
        C6RB c6rb = this.A09;
        if (c6rb != null) {
            c6rb.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
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
