package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9p0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220769p0 extends AbstractC130945vi implements Drawable.Callback, C5RR {
    public final C6RL A00;
    public final C216229hf A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Drawable A06;
    public final Drawable A07;
    public final C24010Ako A08;
    public final C216119hU A09;
    public final C6RB A0A;
    public final C124385ju A0B;
    public final ArrayList A0C;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A0A.draw(canvas);
        this.A0B.draw(canvas);
        this.A09.draw(canvas);
        this.A00.draw(canvas);
    }

    public C220769p0(Context context, C24010Ako c24010Ako) {
        boolean A1V = AbstractC167007dF.A1V(c24010Ako);
        this.A08 = c24010Ako;
        int A0C = AbstractC166987dD.A0C(context, 270);
        int A0C2 = AbstractC166987dD.A0C(context, 4);
        int A0C3 = AbstractC166987dD.A0C(context, 18);
        this.A05 = AbstractC166987dD.A0C(context, 9);
        int A0C4 = AbstractC166987dD.A0C(context, 24);
        this.A04 = AbstractC166987dD.A0C(context, 10);
        int A0C5 = AbstractC166987dD.A0C(context, 4);
        int A0C6 = AbstractC166987dD.A0C(context, 32);
        this.A03 = AbstractC166987dD.A0C(context, 14);
        this.A02 = AbstractC166987dD.A0C(context, 12);
        float A04 = AbstractC13880nE.A04(context, A1V ? 1 : 0);
        int A0C7 = AbstractC166987dD.A0C(context, 12);
        long millis = TimeUnit.SECONDS.toMillis(5L);
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0C = A1E;
        C216229hf c216229hf = new C216229hf(context);
        this.A01 = c216229hf;
        Drawable drawable = context.getDrawable(R.drawable.subscriptions_crown_drawable);
        C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        this.A07 = drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.circle_background_drawable);
        Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.A06 = mutate;
        C6RB A0X = AbstractC167007dF.A0X(context, A0C3, A0C);
        this.A0A = A0X;
        C124385ju c124385ju = new C124385ju(context, A04, AbstractC53242c7.A04(context), 80);
        this.A0B = c124385ju;
        C216119hU c216119hU = new C216119hU(context, FanClubStoriesTeaserType.A05);
        this.A09 = c216119hU;
        C6RK c6rk = new C6RK(context, this, A0C);
        c6rk.A01(2131974840);
        c6rk.A01 = A0C7;
        c6rk.A03 = millis;
        this.A00 = c6rk.A00();
        c216229hf.A03 = A0C;
        c216229hf.A0F(GradientDrawable.Orientation.TL_BR);
        c216229hf.A09(AbstractC166997dE.A01(context));
        c216229hf.A0A(A0C5);
        c216229hf.A02 = A0C6;
        c216229hf.A0D(drawable, mutate, A0C2);
        User user = c24010Ako.A00.A00;
        if (user != null) {
            c216229hf.A0B.A00(user.Bhu());
            A0X.A0A(A0C4);
            AbstractC167017dG.A0z(context, A0X);
            A0X.setAlpha(A1V ? 1 : 0);
            String A0f = AbstractC167007dF.A0f(context, user.getUsername(), 2131974842);
            C14360o3.A07(A0f);
            Locale locale = Locale.US;
            C14360o3.A08(locale);
            A0X.A0M(AbstractC166997dE.A10(locale, A0f));
            AbstractC167017dG.A10(context, A0X, R.attr.igds_color_text_on_white);
            Collections.addAll(A1E, c216229hf, A0X, c124385ju, c216119hU);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0C;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AbstractC166987dD.A0F(this.A0B, this.A01.A00 + this.A05 + this.A0A.A06 + this.A04) + this.A03 + this.A09.A00.A06 + this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        C216229hf c216229hf = this.A01;
        float f2 = c216229hf.A03 / 2.0f;
        float A06 = AbstractC166987dD.A06(this) / 2.0f;
        float f3 = A03 - A06;
        float f4 = A03 + A06;
        float f5 = c216229hf.A00;
        C6RB c6rb = this.A0A;
        float f6 = c6rb.A0A;
        float f7 = f6 / 2.0f;
        float f8 = f5 + f3 + this.A05;
        float f9 = c6rb.A06 + f8;
        C124385ju c124385ju = this.A0B;
        float f10 = this.A04 + f9;
        float A062 = AbstractC166987dD.A06(c124385ju) + f10;
        C216119hU c216119hU = this.A09;
        C6RB c6rb2 = c216119hU.A00;
        float f11 = c6rb2.A0A;
        float f12 = c6rb2.A06;
        float f13 = f11 / 2.0f;
        float f14 = this.A03 + A062;
        int i5 = (int) (f - f2);
        int i6 = (int) (f2 + f);
        c216229hf.setBounds(i5, (int) f3, i6, (int) f4);
        AbstractC166997dE.A1E(c6rb, f - f7, f8, f7 + f, f9);
        c124385ju.setBounds(i5, (int) f10, i6, (int) A062);
        AbstractC166997dE.A1E(c216119hU, f - f13, f14, f + f13, f12 + f14);
    }
}
