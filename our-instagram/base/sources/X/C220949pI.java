package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.List;

/* renamed from: X.9pI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220949pI extends AbstractC130945vi implements C5RR, InterfaceC133125ze, InterfaceC133135zf {
    public int A00;
    public final int A01;
    public final Drawable A02;
    public final C6RL A03;
    public final C217859kI A04;
    public final C6RB A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final C216189hb A0A;
    public final String A0B;
    public final String A0C;

    public C220949pI(Context context, C217859kI c217859kI, String str, String str2) {
        C14360o3.A0B(context, 1);
        AbstractC167017dG.A1R(str, c217859kI);
        this.A09 = context;
        this.A0B = str;
        this.A04 = c217859kI;
        this.A0C = str2;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material);
        this.A06 = dimensionPixelOffset;
        this.A07 = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
        this.A01 = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.call_participant_text_max_width);
        this.A08 = dimensionPixelSize;
        Drawable drawable = context.getDrawable(R.drawable.interactive_sticker_group_mention_background);
        if (drawable != null) {
            drawable.setTint(AbstractC22747A1r.A00(c217859kI));
            this.A02 = drawable;
            C216189hb c216189hb = new C216189hb(context, c217859kI, str);
            c216189hb.setCallback(this);
            this.A0A = c216189hb;
            int i = (dimensionPixelSize - c216189hb.A03) - (dimensionPixelOffset * 2);
            C6RB A0z = AbstractC166987dD.A0z(context, i);
            A0z.A0G(1, "");
            String A00 = A00(A0z);
            Context context2 = A0z.A0Z;
            C14360o3.A07(context2);
            AbstractC167017dG.A0z(context2, A0z);
            ALl aLl = ALl.A00;
            TextPaint textPaint = A0z.A0b;
            C14360o3.A07(textPaint);
            C14360o3.A0B(A00, 1);
            float dimension = context2.getResources().getDimension(R.dimen.group_mention_sticker_title_text_size_step);
            float dimension2 = context2.getResources().getDimension(R.dimen.direct_emoji_quick_reply_emoji_item_size);
            float dimension3 = context2.getResources().getDimension(R.dimen.group_mention_sticker_title_text_size);
            TextPaint textPaint2 = new TextPaint(textPaint);
            textPaint2.setTextSize(dimension3);
            A0z.A0A(Math.max(ALl.A00(textPaint2, aLl, A00, dimension3, dimension, dimension3, i), dimension2));
            A0z.A0K(Layout.Alignment.ALIGN_NORMAL);
            A0z.setCallback(this);
            this.A05 = A0z;
            C6RK c6rk = new C6RK(context, this, context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_v2_1_winner_submission_width));
            c6rk.A01(2131963352);
            c6rk.A02(R.dimen.abc_text_size_menu_header_material);
            c6rk.A03 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
            this.A03 = c6rk.A00();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC133135zf
    public final Drawable AKx(String str) {
        C14360o3.A0B(str, 0);
        return new C220949pI(this.A09, this.A04, this.A0B, str);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A02.draw(canvas);
        this.A05.draw(canvas);
        this.A0A.draw(canvas);
        this.A03.draw(canvas);
    }

    private final String A00(C6RB c6rb) {
        C217859kI c217859kI = this.A04;
        Context context = this.A09;
        AbstractC167017dG.A1N(c217859kI, context);
        String str = c217859kI.A00.A03;
        if (str == null || str.length() == 0) {
            str = "@";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new C9T8(spannableStringBuilder, null, AbstractC22746A1q.A00(context, c217859kI)), 0, spannableStringBuilder.length(), 18);
        c6rb.A0L(spannableStringBuilder);
        String obj = c6rb.A0F.toString();
        int A01 = ALl.A01(context, obj);
        C02R.A00(A01);
        this.A00 = Math.max(0, (A01 / 2) - this.A01);
        return obj;
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A02, this.A05, this.A0A);
    }

    @Override // X.InterfaceC133135zf
    public final void AGx(EnumC222529rt enumC222529rt, int i) {
        C217859kI c217859kI = this.A04;
        c217859kI.A03(AbstractC166997dE.A0z("#%06X", AbstractC166997dE.A1b(Integer.valueOf(i & 16777215), 1)));
        C216189hb c216189hb = this.A0A;
        C6RB c6rb = c216189hb.A00;
        if (c6rb != null) {
            c6rb.A0F(C216189hb.A00(c216189hb));
            c6rb.invalidateSelf();
        }
        int A00 = AbstractC22747A1r.A00(c216189hb.A06);
        for (C89533yt c89533yt : c216189hb.A07) {
            c89533yt.A03.setColor(A00);
            c89533yt.invalidateSelf();
        }
        this.A02.setTint(AbstractC22747A1r.A00(c217859kI));
        A00(this.A05);
        invalidateSelf();
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A04;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.A05.A06, this.A0A.A02) + (this.A01 * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(this.A05.A0A + this.A0A.A03 + (this.A06 * 2) + this.A07, this.A08);
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        this.A05.setAlpha(i);
        this.A0A.setAlpha(i);
        if (i == 0) {
            this.A03.A00();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float intrinsicWidth = getIntrinsicWidth() / 2.0f;
        int i5 = (int) (f - intrinsicWidth);
        float A05 = AbstractC166987dD.A05(this);
        int i6 = (int) (A03 - A05);
        int i7 = (int) (f + intrinsicWidth);
        int i8 = (int) (A03 + A05);
        int i9 = this.A06;
        int i10 = i5 + i9;
        int i11 = this.A01;
        int i12 = i6 + i11;
        int i13 = i4 - i11;
        int i14 = i7 - i9;
        this.A02.setBounds(i5, i6, i7, i8);
        C216189hb c216189hb = this.A0A;
        c216189hb.setBounds(i14 - c216189hb.A03, i12, i14, i13);
        C6RB c6rb = this.A05;
        int A0H = AbstractC166997dE.A0H(c6rb);
        c6rb.setBounds(i10, i12 - this.A00, AbstractC166987dD.A0E(c216189hb) - this.A07, i13 - this.A00);
        if (A0H != AbstractC166997dE.A0H(c6rb)) {
            Context context = c6rb.A0Z;
            C14360o3.A07(context);
            Integer num = this.A04.A01;
            int A0H2 = AbstractC166997dE.A0H(c6rb);
            C14360o3.A0B(num, 1);
            int[] iArr = new int[5];
            C50L.A03(context, null, iArr, AEI.A00(num));
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, A0H2, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
            TextPaint textPaint = c6rb.A0b;
            if (textPaint.getShader() != linearGradient) {
                textPaint.setShader(linearGradient);
                c6rb.A0R();
            }
        }
    }
}
