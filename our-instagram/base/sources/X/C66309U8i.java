package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.U8i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66309U8i extends Drawable implements Animatable, Drawable.Callback {
    public int A00;
    public boolean A01 = true;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnimationDrawable A05;
    public final AnimationDrawable A06;

    public C66309U8i(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.ig_msgr_power_ups_fire);
        C14360o3.A0A(drawable);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        XDA A00 = AbstractC46577KjG.A00(resources, drawable, 18);
        int A05 = AbstractC50712Us.A01.A05(18);
        int[] iArr = new int[18];
        int i = 0;
        do {
            iArr[i] = (A05 + i) % 18;
            i++;
        } while (i < 18);
        AnimationDrawable animationDrawable = new AnimationDrawable();
        int i2 = 0;
        do {
            int i3 = iArr[i2];
            U8P u8p = new U8P(A00);
            if (u8p.A00 != i3) {
                u8p.A00 = i3;
                u8p.invalidateSelf();
            }
            animationDrawable.addFrame(u8p, 42);
            i2++;
        } while (i2 < 18);
        AbstractC167017dG.A14(animationDrawable);
        animationDrawable.setCallback(this);
        this.A05 = animationDrawable;
        int[] iArr2 = new int[18];
        int i4 = 0;
        do {
            iArr2[i4] = ((A05 + 9) + i4) % 18;
            i4++;
        } while (i4 < 18);
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        int i5 = 0;
        do {
            int i6 = iArr2[i5];
            U8P u8p2 = new U8P(A00);
            if (u8p2.A00 != i6) {
                u8p2.A00 = i6;
                u8p2.invalidateSelf();
            }
            animationDrawable2.addFrame(u8p2, 42);
            i5++;
        } while (i5 < 18);
        AbstractC167017dG.A14(animationDrawable2);
        animationDrawable2.setCallback(this);
        this.A06 = animationDrawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save;
        C14360o3.A0B(canvas, 0);
        if (this.A01) {
            this.A01 = false;
            int i = (this.A00 * 9) / 10;
            AnimationDrawable animationDrawable = this.A05;
            int A0H = (getBounds().left + i) - AbstractC166997dE.A0H(animationDrawable);
            int i2 = getBounds().bottom;
            animationDrawable.setBounds(A0H, i2 - AbstractC166997dE.A0G(animationDrawable), AbstractC166997dE.A0H(animationDrawable) + A0H, i2);
            AnimationDrawable animationDrawable2 = this.A06;
            int i3 = getBounds().right - i;
            int i4 = getBounds().bottom;
            animationDrawable2.setBounds(i3, i4 - AbstractC166997dE.A0G(animationDrawable2), AbstractC166997dE.A0H(animationDrawable2) + i3, i4);
        }
        if (!this.A02) {
            save = canvas.save();
            try {
                AnimationDrawable animationDrawable3 = this.A05;
                C14360o3.A07(animationDrawable3.getBounds());
                canvas.scale(0.95f, 0.95f, r1.right, r1.bottom);
                animationDrawable3.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        if (!this.A04) {
            save = canvas.save();
            AnimationDrawable animationDrawable4 = this.A06;
            C14360o3.A07(animationDrawable4.getBounds());
            canvas.scale(0.85f, 0.85f, r4.left, r4.bottom);
            canvas.scale(-1.0f, 1.0f, r4.centerX(), r4.bottom);
            animationDrawable4.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        if (A00(drawable)) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A01 = true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.A03 = true;
        if (!this.A02) {
            this.A05.start();
        }
        if (!this.A04) {
            this.A06.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A03 = false;
        this.A05.stop();
        this.A06.stop();
    }

    private final boolean A00(Drawable drawable) {
        if (this.A02 || !drawable.equals(this.A05)) {
            if (!this.A04 && drawable.equals(this.A06)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void A01(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            if (!z && this.A03) {
                this.A06.start();
            } else {
                this.A06.stop();
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A06.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A06.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AbstractC167017dG.A1N(drawable, runnable);
        if (A00(drawable)) {
            scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC167017dG.A1N(drawable, runnable);
        if (A00(drawable)) {
            unscheduleSelf(runnable);
        }
    }
}
