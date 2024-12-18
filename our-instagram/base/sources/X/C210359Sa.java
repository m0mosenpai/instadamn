package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.facebook.R;

/* renamed from: X.9Sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210359Sa extends Drawable implements C5RQ {
    public final Drawable A00;
    public final Drawable A01;
    public final C210379Sc A02;
    public final C68024V6s A03;
    public final C210249Rn A04;

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A00;
        if (drawable != null) {
            canvas.save();
            Drawable drawable2 = this.A01;
            if (drawable2 != null) {
                AbstractC167017dG.A12(canvas, drawable2);
            }
            C68024V6s c68024V6s = this.A03;
            AbstractC167007dF.A0u(canvas, drawable, c68024V6s.A01, c68024V6s.A02);
        }
        this.A02.draw(canvas);
        draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A03;
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        this.A02.A00 = i;
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return this.A02.getDurationInMs();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C68024V6s c68024V6s = this.A03;
        return AbstractC166987dD.A0F(this.A04, c68024V6s.A00 + c68024V6s.A02);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        setAlpha(i);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        setColorFilter(colorFilter);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.9Rn] */
    public C210359Sa(final Context context, final Drawable drawable, final C68024V6s c68024V6s) {
        Drawable drawable2;
        AbstractC167017dG.A1P(context, c68024V6s);
        this.A03 = c68024V6s;
        this.A01 = drawable;
        this.A02 = new C210379Sc(context, drawable, c68024V6s);
        this.A04 = new Drawable(context, drawable, c68024V6s) { // from class: X.9Rn
            public final Rect A00;
            public final Drawable A01;
            public final C68024V6s A02;
            public final C6RB A03;

            {
                this.A02 = c68024V6s;
                this.A01 = drawable;
                Rect A0U = AbstractC166987dD.A0U();
                this.A00 = A0U;
                C6RB A0z = AbstractC166987dD.A0z(context, c68024V6s.A04);
                AbstractC166997dE.A1Q(A0z, AnonymousClass001.A0D(c68024V6s.A0I, '@'));
                A0z.A0A(context.getResources().getDimension(R.dimen.achievements_only_you_top_margin));
                AbstractC166997dE.A1A(context, A0z, R.color.audio_bar_action_color_enabled);
                A0z.A0D(1.0f, 0.0f, 1.0f, context.getColor(R.color.clips_remix_camera_outer_container_default_background));
                TextPaint textPaint = A0z.A0b;
                textPaint.setFakeBoldText(true);
                A0z.A0N("…", 1, true);
                String str = c68024V6s.A0I;
                textPaint.getTextBounds(str, 0, AbstractC167007dF.A0A(str), A0U);
                this.A03 = A0z;
            }

            @Override // android.graphics.drawable.Drawable
            public final int getIntrinsicHeight() {
                C6RB c6rb = this.A03;
                return c6rb.A06 + C1H4.A01(c6rb.A0b.getFontMetrics().descent);
            }

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                this.A03.setAlpha(i);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.A03.setColorFilter(colorFilter);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                AbstractC167007dF.A0r(canvas);
                Drawable drawable3 = this.A01;
                if (drawable3 != null) {
                    AbstractC167017dG.A12(canvas, drawable3);
                }
                C68024V6s c68024V6s2 = this.A02;
                float f = c68024V6s2.A01;
                float height = c68024V6s2.A00 + this.A00.height() + c68024V6s2.A02;
                C6RB c6rb = this.A03;
                AbstractC167007dF.A0u(canvas, c6rb, f, height + c6rb.A0b.getFontMetrics().ascent);
            }
        };
        int A0C = AbstractC166987dD.A0C(context, 36);
        if (c68024V6s.A0N) {
            drawable2 = context.getDrawable(R.drawable.filled_grid_album_icon);
        } else {
            drawable2 = null;
        }
        this.A00 = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(new Rect(0, 0, A0C, A0C));
        }
    }
}
