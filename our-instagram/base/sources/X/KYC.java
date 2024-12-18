package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class KYC extends AbstractC99734dr {
    public int A00;
    public final Paint A01;
    public final RectF A02;

    public KYC(EnumC99714dp enumC99714dp, C1QL c1ql) {
        AbstractC167007dF.A1D(c1ql, 1, enumC99714dp);
        this.A01 = AbstractC166987dD.A0S(1);
        this.A02 = AbstractC166987dD.A0X();
    }

    @Override // X.AbstractC99734dr
    public final void A08(SpinnerImageView spinnerImageView) {
        Context A06 = AbstractC31173DnH.A06(spinnerImageView, 0);
        C14360o3.A0A(A06);
        spinnerImageView.setImageDrawable(AbstractC85953sP.A01(A06, R.drawable.nav_spinner, AbstractC53242c7.A0A(A06)));
    }

    @Override // X.AbstractC99734dr
    public final void A02(int i, int i2) {
        RectF rectF = this.A02;
        rectF.set(0.0f, 0.0f, i, i2);
        JQ0.A0v(rectF, this.A01);
    }

    @Override // X.AbstractC99734dr
    public final void A04(Canvas canvas) {
        RectF rectF = this.A02;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A01);
    }

    @Override // X.AbstractC99734dr
    public final void A07(EnumC99714dp enumC99714dp) {
    }

    @Override // X.AbstractC99734dr
    public final void A03(Resources resources, TextView textView) {
        AbstractC167017dG.A1N(textView, resources);
        Paint paint = this.A01;
        Context context = textView.getContext();
        AbstractC43594JPz.A14(context, paint, R.attr.igds_color_separator_or_stroke_on_media);
        paint.setStrokeWidth(AbstractC166997dE.A0B(resources));
        AbstractC43592JPx.A1E(paint);
        int color = context.getColor(AbstractC53242c7.A0A(context));
        textView.setTextColor(color);
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(color));
        try {
            this.A00 = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        } catch (Resources.NotFoundException unused) {
            C0w9.A03("IgdsButton", "Cannot find corner radius resource dimension in LabelInvertedOnMediaRenderer");
            this.A00 = 8;
        }
    }

    @Override // X.AbstractC99734dr
    public final void A05(View view, View view2, TextView textView, boolean z) {
        AbstractC167017dG.A1Q(textView, view2);
        int i = 0;
        int i2 = 0;
        if (z) {
            i2 = 4;
        }
        textView.setVisibility(i2);
        if (!z) {
            i = 8;
        }
        view2.setVisibility(i);
    }

    @Override // X.AbstractC99734dr
    public final void A09(View view, TextView textView, boolean z) {
        AbstractC167017dG.A1P(textView, view);
        Paint paint = this.A01;
        int i = 77;
        if (z) {
            i = 255;
        }
        paint.setAlpha(i);
        float f = 0.3f;
        if (z) {
            f = 1.0f;
        }
        textView.setAlpha(f);
        view.postInvalidate();
    }
}
