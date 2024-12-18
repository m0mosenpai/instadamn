package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.K5o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45355K5o extends AbstractC44367Jj6 {
    public float A00;
    public AnonymousClass693 A01;
    public final float A03;
    public boolean A02 = true;
    public final Path A04 = AbstractC166987dD.A0T();
    public final RectF A05 = AbstractC166987dD.A0X();

    public C45355K5o(C161227Kh c161227Kh, float f) {
        this.A03 = f;
        c161227Kh.A02(new C50358MLk(this, 31), new EnumC46207Kcj[]{EnumC46207Kcj.A04});
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AnonymousClass693 anonymousClass693;
        C14360o3.A0B(canvas, 0);
        if (this.A02 && (anonymousClass693 = this.A01) != null) {
            int A0H = AbstractC166997dE.A0H(this);
            int i = 600;
            if (600 < A0H) {
                i = A0H;
            }
            int intrinsicHeight = (anonymousClass693.getIntrinsicHeight() * i) / anonymousClass693.getIntrinsicWidth();
            this.A00 = AbstractC166997dE.A0F(this) - (i / 2);
            anonymousClass693.setBounds(0, 0, i, intrinsicHeight);
        }
        this.A02 = false;
        AnonymousClass693 anonymousClass6932 = this.A01;
        if (anonymousClass6932 != null && !anonymousClass6932.isPlaying()) {
            anonymousClass6932.E4S();
        }
        Path path = this.A04;
        path.rewind();
        RectF rectF = this.A05;
        float f = this.A03;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            float A0F = AbstractC166997dE.A0F(this);
            save = canvas.save();
            canvas.scale(1.5f, 1.5f, A0F, 0.0f);
            float f2 = this.A00;
            save = canvas.save();
            canvas.translate(f2, 0.0f);
            try {
                AnonymousClass693 anonymousClass6933 = this.A01;
                if (anonymousClass6933 != null) {
                    anonymousClass6933.draw(canvas);
                }
                canvas.restoreToCount(save);
                canvas.restoreToCount(save);
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A02 = true;
        AbstractC44367Jj6.A01(rect, this.A05);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (!z) {
            AnonymousClass693 anonymousClass693 = this.A01;
            if (anonymousClass693 != null) {
                anonymousClass693.stop();
            }
            AnonymousClass693 anonymousClass6932 = this.A01;
            if (anonymousClass6932 != null) {
                anonymousClass6932.EMk(0.0f);
            }
        }
        return super.setVisible(z, z2);
    }
}
