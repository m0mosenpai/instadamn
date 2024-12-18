package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import java.util.List;

/* renamed from: X.9p9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220859p9 extends AbstractC130945vi implements InterfaceC133125ze {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final RectF A0B;
    public final Drawable A0C;
    public final C6RB A0D;
    public final C6RB A0E;

    public C220859p9(Context context) {
        int i;
        C14360o3.A0B(context, 1);
        this.A0A = context;
        Resources resources = context.getResources();
        Drawable drawable = context.getDrawable(R.drawable.instagram_business_images_spa_good_ideas);
        if (drawable != null) {
            this.A0C = drawable;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.alert_dialog_margin_horizontal);
            this.A05 = dimensionPixelSize;
            int i2 = (dimensionPixelSize * 7) / 10;
            this.A06 = i2;
            this.A0B = AbstractC166987dD.A0X();
            this.A02 = AbstractC166997dE.A01(context);
            this.A03 = resources.getDimensionPixelSize(R.dimen.share_professional_profile_background_corner_radius_without_images);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
            this.A08 = dimensionPixelSize2;
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
            this.A09 = dimensionPixelSize3;
            int A0E = AbstractC166997dE.A0E(resources);
            int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.support_personalized_ads_sticker_secondary_text_size);
            Spannable spannable = C6RB.A0d;
            C6RB A0z = AbstractC166987dD.A0z(context, AbstractC188878Yd.A01(context));
            this.A0D = A0z;
            C6RB A0z2 = AbstractC166987dD.A0z(context, AbstractC188878Yd.A01(context));
            this.A0E = A0z2;
            AMr.A06(context, A0z, A0E, 0.0f);
            AMr.A06(context, A0z2, dimensionPixelSize4, 0.0f);
            A0z.A0L(A00(AbstractC166997dE.A10(C1Q2.A02(), AbstractC166997dE.A0q(resources, 2131975008))));
            int A00 = AbstractC167027dH.A00(A0z);
            this.A04 = A00;
            A0z2.A0L(A00(AbstractC166997dE.A10(C1Q2.A02(), AbstractC166997dE.A0q(resources, 2131975009))));
            int A002 = AbstractC167027dH.A00(A0z2);
            this.A07 = A002;
            A0z2.A0E(A002);
            if (A00 > A002) {
                A002 = dimensionPixelSize2 * 2;
                i = A002;
            } else {
                A00 = dimensionPixelSize2 * 2;
                i = A00;
            }
            this.A01 = A00 + A002;
            this.A00 = i2 + i + dimensionPixelSize3 + A0z.A06 + A0z2.A06;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return "support_personalized_ads_sticker_id";
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setColor(this.A02);
        RectF rectF = this.A0B;
        float f = this.A03;
        canvas.drawRoundRect(rectF, f, f, A0R);
        this.A0C.draw(canvas);
        this.A0D.draw(canvas);
        this.A0E.draw(canvas);
    }

    private final SpannableStringBuilder A00(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Context context = this.A0A;
        spannableStringBuilder.setSpan(new C9T8(spannableStringBuilder, null, new int[]{context.getResources().getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_yellow)), context.getResources().getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_red))}), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // X.C5RN
    public final List A07() {
        return C16930sl.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float A02 = AbstractC166987dD.A02(i + i3);
        int i5 = this.A06 + i2;
        Drawable drawable = this.A0C;
        int i6 = (int) A02;
        int i7 = this.A05;
        int i8 = i7 / 2;
        drawable.setBounds(i6 - i8, i2, i8 + i6, i7 + i2);
        this.A0B.set(i, i5, i3, i4);
        int i9 = this.A04 / 2;
        int i10 = i5 + this.A08;
        C6RB c6rb = this.A0D;
        int i11 = c6rb.A06 + i10;
        c6rb.setBounds(i6 - i9, i10, i9 + i6, i11);
        int i12 = this.A07 / 2;
        int i13 = i6 - i12;
        int i14 = i11 + this.A09;
        int i15 = i6 + i12;
        C6RB c6rb2 = this.A0E;
        c6rb2.setBounds(i13, i14, i15, c6rb2.A06 + i14);
    }
}
