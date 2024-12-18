package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;

/* renamed from: X.K5n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45354K5n extends AbstractC44367Jj6 {
    public float A00;
    public int A01;
    public AnonymousClass693 A02;
    public AnonymousClass693 A03;
    public AnonymousClass693 A04;
    public boolean A05 = true;
    public final int A06;
    public final float A07;

    public C45354K5n(Context context, C161227Kh c161227Kh, float f) {
        this.A07 = f;
        this.A06 = AbstractC69815Vw1.A00(context, 125.0f);
        c161227Kh.A02(new C50358MLk(this, 32), new EnumC46207Kcj[]{EnumC46207Kcj.A07, EnumC46207Kcj.A06});
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AnonymousClass693 anonymousClass693;
        AnonymousClass693 anonymousClass6932;
        C14360o3.A0B(canvas, 0);
        if (this.A05 && (anonymousClass693 = this.A04) != null && (anonymousClass6932 = this.A03) != null) {
            if (AbstractC166997dE.A0H(this) >= this.A06) {
                anonymousClass693 = anonymousClass6932;
            }
            if (!anonymousClass693.equals(this.A02)) {
                AnonymousClass693 anonymousClass6933 = this.A02;
                if (anonymousClass6933 != null) {
                    anonymousClass6933.stop();
                }
                this.A02 = anonymousClass693;
            }
            int A0H = AbstractC166997dE.A0H(this);
            this.A01 = (anonymousClass693.getIntrinsicHeight() * A0H) / anonymousClass693.getIntrinsicWidth();
            this.A00 = AbstractC166997dE.A0F(this) - (A0H / 2);
            anonymousClass693.setBounds(0, 0, A0H, this.A01);
            anonymousClass693.E4S();
        }
        this.A05 = false;
        float f = this.A07;
        float f2 = (-f) * 0.88f;
        float f3 = (f * 2.0f) / this.A01;
        float f4 = 1.0f / f3;
        int A00 = AbstractC44367Jj6.A00(canvas, this, f3);
        try {
            float f5 = this.A00;
            float f6 = f2 * f4;
            int save = canvas.save();
            canvas.translate(f5, f6);
            try {
                AnonymousClass693 anonymousClass6934 = this.A02;
                if (anonymousClass6934 != null) {
                    anonymousClass6934.draw(canvas);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        } finally {
            canvas.restoreToCount(A00);
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
        this.A05 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
