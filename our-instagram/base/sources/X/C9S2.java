package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9S2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9S2 extends Drawable {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final C6RB A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;
    public final RectF A0A = AbstractC166987dD.A0X();
    public final RectF A0B = AbstractC166987dD.A0X();
    public final RectF A0C = AbstractC166987dD.A0X();
    public final Interpolator A0D = new DecelerateInterpolator(2.0f);
    public final UserSession A0E;

    public C9S2(Context context, UserSession userSession) {
        Resources resources = context.getResources();
        this.A0E = userSession;
        this.A04 = AbstractC166997dE.A07(resources);
        this.A01 = AbstractC166997dE.A08(resources);
        this.A05 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A06 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A02 = resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A07 = A0S;
        AbstractC166987dD.A1N(context, A0S, R.color.chat_sticker_chat_bubble_color);
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A08 = A0S2;
        AbstractC166987dD.A1N(context, A0S2, R.color.direct_light_mode_glyph_color_tertiary);
        Paint A0S3 = AbstractC166987dD.A0S(1);
        this.A09 = A0S3;
        AbstractC166987dD.A1N(context, A0S3, R.color.audio_bar_action_color_enabled);
        int A09 = AbstractC166997dE.A09(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
        String A0q = AbstractC166997dE.A0q(resources, 2131971248);
        Spannable spannable = C6RB.A0d;
        C6RB A0z = AbstractC166987dD.A0z(context, AbstractC13880nE.A0A(context));
        this.A03 = A0z;
        A0z.A0K(Layout.Alignment.ALIGN_CENTER);
        A0z.A0M(A0q);
        AbstractC167017dG.A10(context, A0z, R.attr.igds_color_gradient_lavender);
        float f = A09;
        AbstractC167017dG.A1N(userSession, context);
        AbstractC167017dG.A0z(context, A0z);
        AbstractC167007dF.A1A(A0z, dimensionPixelSize, f, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            boolean r0 = r8.A00
            r7 = 0
            if (r0 == 0) goto La0
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 4200(0x1068, double:2.075E-320)
            long r1 = r1 % r3
            r3 = 350(0x15e, double:1.73E-321)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L71
            float r4 = (float) r1
            r3 = 1135542272(0x43af0000, float:350.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r7
            float r2 = r2 - r7
            r1 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L25
            float r4 = r4 - r7
            float r1 = r4 / r3
        L25:
            float r1 = r1 * r2
            float r1 = r1 + r7
            android.view.animation.Interpolator r0 = r8.A0D
            float r2 = r0.getInterpolation(r1)
            int r0 = r8.A01
            float r5 = (float) r0
        L30:
            float r2 = r2 * r5
        L31:
            r9.save()
            int r0 = r8.A01
            float r0 = (float) r0
            float r0 = r0 + r2
            r9.translate(r7, r0)
            android.graphics.RectF r1 = r8.A0B
            int r0 = r8.A04
            float r3 = (float) r0
            android.graphics.Paint r0 = r8.A08
            r9.drawRoundRect(r1, r3, r3, r0)
            float r2 = -r2
            r9.translate(r7, r2)
            android.graphics.RectF r1 = r8.A0A
            android.graphics.Paint r0 = r8.A07
            r9.drawRoundRect(r1, r3, r3, r0)
            r9.translate(r7, r2)
            android.graphics.RectF r2 = r8.A0C
            int r0 = r8.A06
            float r1 = (float) r0
            android.graphics.Paint r0 = r8.A09
            r9.drawRoundRect(r2, r1, r1, r0)
            X.6RB r1 = r8.A03
            android.text.TextPaint r0 = r1.A0b
            float r0 = r0.descent()
            float r0 = -r0
            X.AbstractC167007dF.A0u(r9, r1, r7, r0)
            boolean r0 = r8.A00
            if (r0 == 0) goto L70
            r8.invalidateSelf()
        L70:
            return
        L71:
            r3 = 2100(0x834, double:1.0375E-320)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto La0
            r3 = 2450(0x992, double:1.2105E-320)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9e
            float r6 = (float) r1
            r5 = 1065353216(0x3f800000, float:1.0)
            r4 = 1157840896(0x45034000, float:2100.0)
            r3 = 1159274496(0x45192000, float:2450.0)
            float r3 = r3 - r4
            float r2 = r5 - r7
            r1 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L91
            float r6 = r6 - r4
            float r1 = r6 / r3
        L91:
            float r1 = r1 * r2
            float r1 = r1 + r7
            android.view.animation.Interpolator r0 = r8.A0D
            float r0 = r0.getInterpolation(r1)
            float r5 = r5 - r0
            int r0 = r8.A01
            float r2 = (float) r0
            goto L30
        L9e:
            r2 = 0
            goto L31
        La0:
            int r0 = r8.A01
            float r2 = (float) r0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9S2.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A02 + (this.A01 * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        this.A08.setAlpha(i);
        this.A09.setAlpha(i);
        this.A03.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        this.A08.setColorFilter(colorFilter);
        this.A09.setColorFilter(colorFilter);
        this.A03.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        C6RB c6rb = this.A03;
        float f2 = c6rb.A0A;
        int i5 = this.A02;
        float f3 = f2 / 2.0f;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = A03 - (((this.A01 * 2) + i5) / 2.0f);
        RectF rectF = this.A0A;
        int i6 = this.A05;
        float f7 = i6;
        float f8 = i5 + f6;
        rectF.set(f7 + f4, f6, f5 - f7, f8);
        float f9 = i6 * 2;
        this.A0B.set(f9 + f4, f6, f5 - f9, f8);
        this.A0C.set(f4, f6, f5, f8);
        int i7 = (int) f6;
        c6rb.setBounds((int) f4, i7, (int) f5, i5 + i7);
    }
}
