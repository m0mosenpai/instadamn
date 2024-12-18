package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9p1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220779p1 extends AbstractC130945vi implements Drawable.Callback, C5RR {
    public int A00;
    public C6RL A01;
    public Drawable A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final C216229hf A08;
    public final C9SC A09;
    public final C51853Mvx A0A;
    public final C6RB A0B;
    public final int A0C;
    public final int A0D;
    public final ArrayList A0E;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A08.draw(canvas);
        this.A0B.draw(canvas);
        this.A01.draw(canvas);
    }

    public C220779p1(Context context, C51853Mvx c51853Mvx) {
        Drawable drawable;
        boolean A1V = AbstractC167007dF.A1V(c51853Mvx);
        this.A07 = context;
        this.A0A = c51853Mvx;
        int A0C = AbstractC166987dD.A0C(context, 38);
        this.A03 = A0C;
        int A0C2 = AbstractC166987dD.A0C(context, 4);
        int A0C3 = AbstractC166987dD.A0C(context, 18);
        this.A06 = A0C3;
        this.A0D = AbstractC166987dD.A0C(context, 9);
        int A0C4 = AbstractC166987dD.A0C(context, 24);
        this.A0C = AbstractC166987dD.A0C(context, 18);
        int A0C5 = AbstractC166987dD.A0C(context, 16);
        int A0C6 = AbstractC166987dD.A0C(context, 4);
        int A0C7 = AbstractC166987dD.A0C(context, 32);
        int A0C8 = AbstractC166987dD.A0C(context, 280);
        this.A04 = A0C8;
        this.A05 = AbstractC166987dD.A0C(context, 180);
        this.A00 = A0C8;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0E = A1E;
        C216229hf c216229hf = new C216229hf(context);
        this.A08 = c216229hf;
        C9SC c9sc = new C9SC(context, R.drawable.instagram_badge_pano_filled_24, A0C, A0C);
        this.A09 = c9sc;
        C6RB A0X = AbstractC167007dF.A0X(context, A0C3, this.A00);
        this.A0B = A0X;
        C15980qs A00 = AbstractC15960qq.A00(context);
        Drawable drawable2 = context.getDrawable(R.drawable.interactive_sticker_background);
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        this.A02 = drawable;
        c216229hf.A03 = A0C8;
        c216229hf.A0F(GradientDrawable.Orientation.TL_BR);
        c216229hf.A09(-1);
        c216229hf.A0A(A0C6);
        c216229hf.A02 = A0C7;
        c216229hf.A0D(c9sc, this.A02, A0C2);
        c216229hf.setCallback(this);
        A0X.A0A(A0C4);
        AbstractC166987dD.A1U(EnumC15950qp.A0W, A00, A0X);
        A0X.setAlpha(A1V ? 1 : 0);
        A0X.setCallback(this);
        C6RK c6rk = new C6RK(context, this, A0C8);
        c6rk.A01(2131976480);
        c6rk.A01 = A0C5;
        this.A01 = c6rk.A00();
        Collections.addAll(A1E, c216229hf, A0X);
        C6RB c6rb = this.A0B;
        C51853Mvx c51853Mvx2 = this.A0A;
        String str = c51853Mvx2.A06;
        str = AbstractC001900j.A0T(str) ? c6rb.A0Z.getString(2131976478) : str;
        C14360o3.A0A(str);
        Locale locale = Locale.getDefault();
        C14360o3.A07(locale);
        c6rb.A0M(AbstractC166997dE.A10(locale, str));
        AbstractC167017dG.A10(c6rb.A0Z, c6rb, R.attr.igds_color_text_on_white);
        C216229hf c216229hf2 = this.A08;
        c216229hf2.A0B.A00(c51853Mvx2.A01);
        C9SC c9sc2 = this.A09;
        float f = this.A03;
        Context context2 = this.A07;
        c9sc2.A01 = new LinearGradient(0.0f, f, f, 0.0f, context2.getColor(R.color.activator_card_progress_bad), AbstractC167007dF.A09(context2, R.attr.igds_color_gradient_purple), Shader.TileMode.REPEAT);
        int i = c6rb.A0A;
        int i2 = this.A06 * 2;
        int i3 = i + i2;
        if (i3 < this.A04) {
            int i4 = this.A05;
            i4 = i4 < i3 ? i3 : i4;
            this.A00 = i4;
            c216229hf2.A03 = i4;
            c6rb.A0E(i4 - i2);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0E;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A08.A00 + this.A0D + this.A0B.A06 + this.A0C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A08.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        C216229hf c216229hf = this.A08;
        float f2 = c216229hf.A03 / 2.0f;
        float A06 = AbstractC166987dD.A06(this) / 2.0f;
        float f3 = A03 - A06;
        float f4 = c216229hf.A00;
        C6RB c6rb = this.A0B;
        float f5 = c6rb.A0A;
        float f6 = c6rb.A06;
        float f7 = f5 / 2.0f;
        float f8 = f4 + f3 + this.A0D;
        AbstractC166997dE.A1E(c216229hf, f - f2, f3, f2 + f, A03 + A06);
        AbstractC166997dE.A1E(c6rb, f - f7, f8, f + f7, f6 + f8);
    }
}
