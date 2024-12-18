package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class KKd extends C5RN {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public float A05;
    public float A06;
    public float A07;
    public Rect A08;
    public UserSession A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final ValueAnimator A0E;
    public final Typeface A0F;
    public final Drawable A0G;
    public final C6RB A0H;
    public final C6RB A0I;
    public final String A0J;
    public final List A0K;

    public static void A00(KKd kKd, int i) {
        C6RB c6rb = kKd.A0H;
        c6rb.A0M(Integer.toString(i));
        A01(kKd, c6rb, 0.0f);
    }

    public static void A01(KKd kKd, C6RB c6rb, float f) {
        if (c6rb != null) {
            float f2 = c6rb.A0A;
            float f3 = kKd.A05;
            float f4 = f2 / 2.0f;
            float f5 = kKd.A06;
            float f6 = kKd.A07;
            c6rb.setBounds(AbstractC166987dD.A0V((int) (f3 - f4), (int) ((f5 - f6) + f), (int) (f3 + f4), (int) (f5 + f6 + f)));
        }
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0K;
    }

    public final void A08() {
        if (!this.A03) {
            this.A03 = true;
            this.A02 = 9;
            ValueAnimator valueAnimator = this.A0E;
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(50L);
            C6RB c6rb = this.A0I;
            c6rb.A0M(Integer.toString(this.A02));
            A01(this, c6rb, -this.A0A);
            this.A00 = 0;
            this.A04 = true;
            valueAnimator.start();
        }
    }

    public final void A09(int i, boolean z) {
        int i2;
        int i3 = this.A02;
        if (i3 != i && (i2 = this.A01) != i && !this.A03) {
            if (z && !this.A04 && i2 != -1) {
                this.A02 = i;
                C6RB c6rb = this.A0I;
                c6rb.A0M(Integer.toString(i));
                A01(this, c6rb, -this.A0A);
                if (C18U.A06(C06090Tz.A05, this.A09, 36324307949006942L)) {
                    C176567tE.A00(new Runnable() { // from class: X.M2K
                        @Override // java.lang.Runnable
                        public final void run() {
                            KKd kKd = KKd.this;
                            kKd.A00 = 0;
                            kKd.A04 = true;
                            kKd.A0E.start();
                        }
                    });
                    return;
                }
                this.A00 = 0;
                this.A04 = true;
                this.A0E.start();
                return;
            }
            this.A01 = i;
            A00(this, i);
        } else if (i3 == i) {
            return;
        } else {
            this.A00 = 0;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.A0G.draw(canvas);
        canvas.save();
        canvas.clipRect(this.A08);
        canvas.translate(0.0f, this.A00);
        this.A0I.draw(canvas);
        this.A0H.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0B;
    }

    public KKd(Context context, Typeface typeface, UserSession userSession, int i, int i2, int i3) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0K = A1E;
        this.A04 = false;
        this.A00 = 0;
        this.A01 = -1;
        this.A02 = -1;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        this.A07 = 0.0f;
        this.A08 = AbstractC166987dD.A0U();
        this.A09 = userSession;
        this.A0B = i;
        this.A0A = i2;
        this.A0F = typeface;
        Resources resources = context.getResources();
        this.A0D = i3 == -1 ? resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin) : i3;
        this.A0J = resources.getString(2131956874);
        this.A0C = context.getColor(R.color.countdown_sticker_title_text_color);
        Drawable drawable = context.getDrawable(R.drawable.countdown_sticker_digit_background);
        this.A0G = drawable;
        C6RB A0z = AbstractC166987dD.A0z(context, i);
        this.A0H = A0z;
        C6RB A0z2 = AbstractC166987dD.A0z(context, i);
        this.A0I = A0z2;
        AMr.A05(context, userSession, A0z, this.A0D);
        A0z.A0M(this.A0J);
        A0z.A0F(this.A0C);
        Typeface typeface2 = this.A0F;
        if (typeface2 != null) {
            A0z.A0I(typeface2);
        }
        AMr.A05(context, userSession, A0z2, this.A0D);
        A0z2.A0M(this.A0J);
        A0z2.A0F(this.A0C);
        Typeface typeface3 = this.A0F;
        if (typeface3 != null) {
            A0z2.A0I(typeface3);
        }
        Collections.addAll(A1E, drawable, A0z, A0z2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0E = ofFloat;
        ofFloat.setDuration(400L);
        LMA.A01(ofFloat, this, 33);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(0);
        LLs.A00(ofFloat, this, 16);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        this.A05 = f;
        float f2 = (i2 + i4) / 2.0f;
        this.A06 = f2;
        float f3 = this.A0B;
        int i5 = this.A0A;
        C6RB c6rb = this.A0H;
        this.A07 = c6rb.A06 / 2.0f;
        float f4 = f3 / 2.0f;
        float f5 = i5 / 2.0f;
        Rect A0V = AbstractC166987dD.A0V((int) (f - f4), (int) (f2 - f5), (int) (f + f4), (int) (f2 + f5));
        this.A08 = A0V;
        this.A0G.setBounds(A0V);
        A01(this, c6rb, 0.0f);
        A01(this, this.A0I, -i5);
    }
}
