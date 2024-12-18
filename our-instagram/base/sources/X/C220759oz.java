package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.9oz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220759oz extends AbstractC130945vi {
    public final int A00;
    public final C50744May A01;
    public final C24012Akq A02;
    public final C216229hf A03;
    public final C6RB A04;
    public final int A05;
    public final int A06;

    public C220759oz(Context context, UserSession userSession, C24012Akq c24012Akq) {
        Drawable drawable;
        this.A02 = c24012Akq;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.chat_sticker_width);
        this.A00 = dimensionPixelSize;
        int A03 = AbstractC167017dG.A03(context);
        int A07 = AbstractC167017dG.A07(context);
        this.A05 = AbstractC167017dG.A05(context);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        int i = dimensionPixelSize - (A03 * 2);
        this.A06 = AbstractC167017dG.A03(context);
        int A0E = AbstractC167017dG.A0E(context);
        C216229hf c216229hf = new C216229hf(context);
        int A01 = AbstractC166997dE.A01(context);
        c216229hf.A0B(A01);
        float f = A0E;
        float[] fArr = {f, f, f, f};
        AbstractC167017dG.A1X(fArr, 0.0f);
        c216229hf.A0A.setCornerRadii(fArr);
        c216229hf.A09(A01);
        c216229hf.A0A(A07);
        c216229hf.A0B.A00(new SimpleImageUrl(c24012Akq.A00.A0G));
        if ((c24012Akq.A09() || c24012Akq.A08()) && (drawable = context.getDrawable(R.drawable.subscriptions_crown_badge_drawable)) != null) {
            Drawable drawable2 = c216229hf.A04;
            if (drawable2 != null) {
                c216229hf.A0C.remove(drawable2);
            }
            c216229hf.A04 = drawable;
            c216229hf.A01 = AbstractC167017dG.A0G(c216229hf.A09);
            c216229hf.A0C.add(c216229hf.A04);
        }
        this.A03 = c216229hf;
        String str = c24012Akq.A00.A0M;
        this.A01 = new C50744May(context, dimensionPixelSize, 0, str == null ? "" : str);
        C6RB A0z = AbstractC166987dD.A0z(context, i);
        A0z.A0J(Typeface.SANS_SERIF, 0);
        AbstractC166997dE.A1A(context, A0z, R.color.challenge_sticker_subtitle_text_color);
        A0z.A0M(c24012Akq.A04(context, userSession));
        A0z.A0A(dimensionPixelSize2);
        this.A04 = A0z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A03.draw(canvas);
        this.A01.draw(canvas);
        this.A04.draw(canvas);
    }

    public static final Rect A00(Rect rect, C220759oz c220759oz, float f) {
        int i = rect.bottom + c220759oz.A05;
        return AbstractC166987dD.A0V((int) (f - (r3.A0A / 2.0f)), i, (int) AbstractC167007dF.A02(c220759oz.A01, f), c220759oz.A04.A06 + i);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A03, this.A01, this.A04);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int intrinsicHeight = this.A01.getIntrinsicHeight() + this.A05;
        return this.A03.A00 + intrinsicHeight + this.A04.A06 + this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float f2 = this.A00 / 2.0f;
        float A01 = AbstractC167007dF.A01(this, A03);
        float A05 = A03 + AbstractC166987dD.A05(this);
        AbstractC166997dE.A1G(this.A03, (int) (f - f2), (int) A01, (int) (f2 + f), (int) A05);
        C50744May c50744May = this.A01;
        float f3 = A01 + r7.A00;
        AbstractC166997dE.A1G(c50744May, (int) AbstractC167007dF.A03(c50744May, f), (int) f3, (int) AbstractC167007dF.A02(c50744May, f), (int) (f3 + AbstractC166987dD.A06(c50744May)));
        this.A04.setBounds(A00(AbstractC166987dD.A0W(c50744May), this, f));
    }
}
