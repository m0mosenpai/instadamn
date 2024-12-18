package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: X.9S9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9S9 extends Drawable {
    public boolean A00;
    public int A01;
    public C6RB A02;
    public C6RB A03;
    public boolean A04;
    public final float A05;
    public final long A06;
    public final C74P A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Resources A0D;
    public final Typeface A0E;
    public final GradientDrawable A0F;
    public final SpannableString A0G;
    public final C6RB A0H;
    public final String A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final boolean A0M;

    public static final int A00(long j, int i, int i2) {
        float f = (float) j;
        float f2 = i;
        float f3 = 2000.0f - 1600.0f;
        float f4 = i2 - f2;
        float f5 = 0.0f;
        if (f3 != 0.0f) {
            f5 = (f - 1600.0f) / f3;
        }
        return (int) ((f5 * f4) + f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C74P c74p;
        C14360o3.A0B(canvas, 0);
        int i = (canvas.getClipBounds().top + canvas.getClipBounds().bottom) / 2;
        GradientDrawable gradientDrawable = this.A0F;
        gradientDrawable.draw(canvas);
        if (this.A00) {
            long currentTimeMillis = (System.currentTimeMillis() - this.A06) % 2000;
            if (currentTimeMillis < 1600) {
                if (this.A04) {
                    C6RB c6rb = this.A02;
                    this.A02 = this.A03;
                    this.A03 = c6rb;
                    List list = this.A0K;
                    int i2 = this.A01 + 1;
                    this.A01 = i2;
                    AbstractC166997dE.A1Q(c6rb, A01((String) AbstractC167007dF.A0e(list, i2)));
                    this.A04 = false;
                }
                C6RB c6rb2 = this.A02;
                int i3 = (canvas.getClipBounds().left + canvas.getClipBounds().right) / 2;
                int i4 = (canvas.getClipBounds().top + canvas.getClipBounds().bottom) / 2;
                int i5 = c6rb2.A0A;
                int i6 = (int) this.A05;
                int i7 = (i5 + i6) / 2;
                int i8 = c6rb2.A06 / 2;
                c6rb2.setBounds((i3 - i7) + i6, i4 - i8, i3 + i7, i8 + i4);
                c74p = this.A07;
                int i9 = i6 / 2;
                c74p.setBounds(AbstractC166987dD.A0E(c6rb2) - c74p.getIntrinsicWidth(), i4 - i9, AbstractC166987dD.A0E(c6rb2), i4 + i9);
                this.A02.draw(canvas);
                C6RB c6rb3 = this.A03;
                int i10 = (canvas.getClipBounds().left + canvas.getClipBounds().right) / 2;
                int i11 = (canvas.getClipBounds().top + canvas.getClipBounds().bottom) / 2;
                int i12 = (c6rb3.A0A + i6) / 2;
                c6rb3.setBounds((i10 - i12) + i6, (i11 - (c6rb3.A06 / 2)) - canvas.getHeight(), i10 + i12, (i11 + (c6rb3.A06 / 2)) - canvas.getHeight());
            } else {
                A02(canvas, this.A02, A00(currentTimeMillis, AbstractC166987dD.A0D(this.A02), (this.A02.A06 / 2) + i + canvas.getClipBounds().height()));
                int A0D = AbstractC166987dD.A0D(this.A03);
                C6RB c6rb4 = this.A03;
                A02(canvas, c6rb4, A00(currentTimeMillis, A0D, i + (c6rb4.A06 / 2)));
                C74P c74p2 = this.A07;
                c74p = c74p2;
                int A00 = A00(currentTimeMillis, AbstractC166987dD.A0E(c74p2), AbstractC166987dD.A0E(this.A03) - c74p2.getIntrinsicWidth());
                c74p2.setBounds(A00, c74p2.getBounds().top, c74p2.getIntrinsicWidth() + A00, AbstractC166987dD.A0D(c74p2));
                canvas.save();
                canvas.clipRect(gradientDrawable.getBounds());
                this.A02.draw(canvas);
                this.A03.draw(canvas);
                canvas.restore();
                this.A04 = true;
            }
            c74p.draw(canvas);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C9S9(Context context, UserSession userSession, C148276lx c148276lx, boolean z) {
        EnumC15950qp enumC15950qp;
        String str;
        this.A0M = z;
        Resources resources = context.getResources();
        this.A0D = resources;
        this.A06 = System.currentTimeMillis();
        C15980qs A00 = AbstractC15960qq.A00(context);
        if (z) {
            enumC15950qp = EnumC15950qp.A0Y;
        } else {
            enumC15950qp = EnumC15950qp.A0V;
        }
        this.A0E = A00.A02(enumC15950qp);
        String string = resources.getString(z ? 2131964315 : 2131964314);
        C14360o3.A0A(string);
        this.A0I = string;
        List A1Q = AbstractC16960so.A1Q(AbstractC111324zv.A00(1663), "Gamer", "Festival", "Anime", "Dolphin", "Burger");
        this.A0J = A1Q;
        List list = c148276lx.A0R;
        List A1H = C0eM.A1H(list != null ? list : A1Q);
        this.A0L = A1H;
        if (!z) {
            ArrayList A0i = AbstractC167007dF.A0i(A1H);
            Iterator it = A1H.iterator();
            while (it.hasNext()) {
                A0i.add(AbstractC166997dE.A10(Locale.ROOT, AbstractC166987dD.A1B(it)));
            }
            A1H = A0i;
        }
        this.A0K = A1H;
        double A002 = AbstractC172687md.A00(userSession);
        this.A09 = (int) (AbstractC166997dE.A0A(this.A0D) * A002);
        this.A08 = (int) (AbstractC166997dE.A0C(this.A0D) * A002);
        this.A0B = (int) (AbstractC166997dE.A08(this.A0D) * A002);
        this.A0C = (int) (AbstractC166997dE.A07(this.A0D) * A002);
        this.A05 = (float) (this.A0D.getDimensionPixelSize(R.dimen.abc_star_medium) * A002);
        int dimensionPixelSize = (int) (this.A0D.getDimensionPixelSize(R.dimen.contextual_sticker_tray_text_size) * A002);
        this.A0A = dimensionPixelSize;
        SpannableString spannableString = new SpannableString(this.A0I);
        spannableString.setSpan(new ForegroundColorSpan(-16777216), 0, this.A0I.length(), 33);
        this.A0G = spannableString;
        Spannable spannable = C6RB.A0d;
        C6RB A0z = AbstractC166987dD.A0z(context, AbstractC188878Yd.A01(context));
        A0z.A0L(spannableString);
        float f = dimensionPixelSize;
        A0z.A0A(f);
        A0z.A0I(this.A0E);
        this.A02 = A0z;
        C6RB A0z2 = AbstractC166987dD.A0z(context, AbstractC188878Yd.A01(context));
        A0z2.A0L(A01((String) A1H.get(this.A01)));
        A0z2.A0A(f);
        A0z2.A0I(this.A0E);
        this.A03 = A0z2;
        ArrayList A0i2 = AbstractC167007dF.A0i(A1H);
        Iterator it2 = A1H.iterator();
        while (it2.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it2);
            C6RB A0z3 = AbstractC166987dD.A0z(context, AbstractC188878Yd.A01(context));
            StringBuilder A1C = AbstractC166987dD.A1C();
            if (z) {
                A1C.append(A1B);
                str = " me";
            } else {
                A1C.append(A1B);
                str = " ME";
            }
            A0z3.A0M(AbstractC166997dE.A0x(str, A1C));
            A0z3.A0A(this.A0A);
            A0z3.A0I(this.A0E);
            A0z3.A0F(-16777216);
            A0i2.add(A0z3);
        }
        Iterator it3 = A0i2.iterator();
        if (it3.hasNext()) {
            Object next = it3.next();
            if (it3.hasNext()) {
                int i = ((C6RB) next).A0A;
                do {
                    Object next2 = it3.next();
                    int i2 = ((C6RB) next2).A0A;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it3.hasNext());
            }
            this.A0H = (C6RB) next;
            String A02 = AbstractC56412ia.A02(context.getResources(), R.drawable.fb_feed_answersheet_meta_ai_rotate);
            A02 = A02 == null ? "" : A02;
            String valueOf = String.valueOf(R.drawable.fb_feed_answersheet_meta_ai_rotate);
            int i3 = (int) this.A05;
            this.A07 = new C74P(context, userSession, new C74V(-1, i3, i3), C05F.A01, A02, valueOf, (String) null, 1.0f, context.getColor(R.color.fds_transparent), context.getColor(R.color.fds_transparent), false);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(-1);
            gradientDrawable.setCornerRadius(this.A09);
            this.A0F = gradientDrawable;
            return;
        }
        throw new NoSuchElementException();
    }

    private final SpannableString A01(String str) {
        String str2;
        int parseColor = Color.parseColor("#FF0866FF");
        int parseColor2 = Color.parseColor("#FF0C1014");
        boolean z = this.A0M;
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (z) {
            A1C.append(str);
            str2 = " me";
        } else {
            A1C.append(str);
            str2 = " ME";
        }
        String A0x = AbstractC166997dE.A0x(str2, A1C);
        SpannableString spannableString = new SpannableString(A0x);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(parseColor);
        int length = str.length();
        spannableString.setSpan(foregroundColorSpan, 0, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(parseColor2), length, A0x.length(), 33);
        return spannableString;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0H.A06 + (this.A0B * 2) + (this.A0C * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0H.A0A + (this.A08 * 2) + ((int) this.A05);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0F.setAlpha(i);
        this.A07.setAlpha(i);
        this.A02.setAlpha(i);
        this.A03.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0F.setColorFilter(colorFilter);
        this.A07.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
        this.A03.setColorFilter(colorFilter);
    }

    private final void A02(Canvas canvas, C6RB c6rb, int i) {
        int i2 = (canvas.getClipBounds().left + canvas.getClipBounds().right) / 2;
        int i3 = c6rb.A0A;
        int i4 = (int) this.A05;
        int i5 = (i3 + i4) / 2;
        c6rb.setBounds((i2 - i5) + i4, i - c6rb.A06, i2 + i5, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        int i6 = (i2 + i4) / 2;
        int intrinsicWidth = getIntrinsicWidth() / 2;
        int intrinsicHeight = getIntrinsicHeight() / 2;
        int i7 = this.A0B;
        int i8 = (i6 + intrinsicHeight) - i7;
        this.A0F.setBounds(i5 - intrinsicWidth, (i6 - intrinsicHeight) + i7, i5 + intrinsicWidth, i8);
    }
}
