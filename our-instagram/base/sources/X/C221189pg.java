package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9pg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221189pg extends AbstractC220929pG implements JFZ {
    public boolean A00;
    public final int A01;
    public final Drawable A02;
    public final C6RL A03;
    public final C6RB A04;
    public final List A05;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A0F.draw(canvas);
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        C6RB c6rb = this.A04;
        if (c6rb != null) {
            c6rb.draw(canvas);
        }
        this.A0E.draw(canvas);
        this.A03.draw(canvas);
    }

    public static final void A00(C221189pg c221189pg) {
        C6RB c6rb;
        AlD alD = c221189pg.A0D;
        if (alD != null && alD.A02() > 0 && (c6rb = c221189pg.A04) != null) {
            Context context = c221189pg.A09;
            c6rb.A0M(AbstractC167017dG.A0k(context.getResources(), alD.A02(), R.plurals.clips_question_sticker_response_count_text));
            c6rb.A0F(AbstractC13950nL.A07(alD.A04(context), 0.6f));
        }
    }

    @Override // X.AbstractC130945vi
    public final Integer A08() {
        return C05F.A0j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        int i2 = super.A05 + this.A0F.A06;
        int i3 = super.A04;
        int i4 = i2 + i3;
        int i5 = this.A01;
        C6RB c6rb = this.A04;
        if (c6rb != null) {
            i = c6rb.A06;
        } else {
            i = 0;
        }
        return i4 + i5 + i + (super.A02 * 2) + this.A0E.A06 + i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        super.setBounds(i, i2, i3, i4);
        int i6 = (i + i3) / 2;
        int i7 = (i2 + i4) / 2;
        int intrinsicHeight = getIntrinsicHeight() / 2;
        int i8 = i7 - intrinsicHeight;
        int i9 = i7 + intrinsicHeight;
        int i10 = super.A05;
        C6RB c6rb = this.A0F;
        int i11 = i10 + c6rb.A06;
        int i12 = this.A01;
        C6RB c6rb2 = this.A04;
        if (c6rb2 != null) {
            i5 = c6rb2.A06;
        } else {
            i5 = 0;
        }
        int i13 = i12 + i5;
        int i14 = super.A02;
        C6RB c6rb3 = this.A0E;
        int i15 = i14 + c6rb3.A06;
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(i, i8, i3, i9);
        }
        int i16 = c6rb.A0A / 2;
        int i17 = i8 + i11;
        c6rb.setBounds(i6 - i16, i10 + i8, i16 + i6, i17);
        if (c6rb2 != null) {
            int i18 = c6rb2.A0A / 2;
            c6rb2.setBounds(i6 - i18, i12 + i17, i18 + i6, i17 + i13);
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            int i19 = super.A04;
            int i20 = i9 - i19;
            drawable2.setBounds(i + i19, (i20 - i15) - i14, i3 - i19, i20);
        }
        int i21 = c6rb3.A0A / 2;
        int i22 = i9 - super.A04;
        c6rb3.setBounds(i6 - i21, i22 - i15, i6 + i21, i22 - i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C221189pg(Context context, UserSession userSession, AlD alD) {
        super(context, userSession, alD);
        Drawable drawable;
        boolean A1V = AbstractC167007dF.A1V(context);
        this.A01 = AbstractC166997dE.A08(this.A0A);
        Drawable drawable2 = context.getDrawable(R.drawable.interactive_sticker_background);
        C6RB c6rb = null;
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        this.A02 = drawable;
        AlD alD2 = this.A0D;
        if (alD2 != null && Integer.valueOf(alD2.A02()) != null && alD2.A02() > 0) {
            c6rb = AbstractC166987dD.A0z(context, this.A08);
            c6rb.A0M(AbstractC167017dG.A0k(context.getResources(), alD2.A02(), R.plurals.clips_question_sticker_response_count_text));
            c6rb.A0A(super.A03);
            AbstractC166997dE.A1A(context, c6rb, AbstractC53242c7.A0A(context));
            c6rb.A0C(0.0f, this.A07);
            c6rb.A0K(Layout.Alignment.ALIGN_CENTER);
        }
        this.A04 = c6rb;
        this.A05 = AbstractC166987dD.A1E();
        this.A00 = A1V;
        C6RK c6rk = new C6RK(context, this, this.A08);
        c6rk.A01(2131955700);
        c6rk.A02(R.dimen.challenge_sticker_subtitle_text_size);
        this.A03 = c6rk.A00();
        Collections.addAll(AbstractC001800i.A0U(this.A05), drawable, this.A0F, this.A0B, this.A0E);
        if (alD2 != null) {
            int A03 = alD2.A03(this.A09);
            Drawable drawable3 = this.A02;
            if (drawable3 == null) {
                C0w9.A03("ClipsQuestionStickerDrawable", "background drawable is null");
            } else {
                Drawable mutate = drawable3.mutate();
                if (mutate != null) {
                    mutate.setColorFilter(new PorterDuffColorFilter(A03, PorterDuff.Mode.SRC));
                }
            }
        }
        A00(this);
        A0C();
        A0B();
    }
}
