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
public final class KYE extends AbstractC99734dr {
    public EnumC99714dp A00;
    public int A01;
    public Resources A02;
    public final Paint A03;
    public final C1QL A04;
    public final RectF A05;

    public KYE(EnumC99714dp enumC99714dp, C1QL c1ql) {
        AbstractC167007dF.A1D(c1ql, 1, enumC99714dp);
        this.A04 = c1ql;
        this.A00 = enumC99714dp;
        this.A03 = AbstractC166987dD.A0S(1);
        this.A05 = AbstractC166987dD.A0X();
    }

    @Override // X.AbstractC99734dr
    public final void A08(SpinnerImageView spinnerImageView) {
        C14360o3.A0B(spinnerImageView, 0);
        Context A0L = AbstractC166997dE.A0L(spinnerImageView);
        spinnerImageView.setImageDrawable(AbstractC85953sP.A01(A0L, R.drawable.nav_spinner, AbstractC53242c7.A08(A0L)));
    }

    @Override // X.AbstractC99734dr
    public final void A09(View view, TextView textView, boolean z) {
        C14360o3.A0B(textView, 1);
        int i = 77;
        float f = 0.3f;
        if (z) {
            i = 255;
            f = 1.0f;
        }
        this.A03.setAlpha(i);
        textView.setAlpha(f);
    }

    @Override // X.AbstractC99734dr
    public final void A01() {
        Resources resources;
        int i;
        if (this.A04.A00 && this.A00 == EnumC99714dp.A03) {
            resources = this.A02;
            if (resources != null) {
                i = R.dimen.account_discovery_bottom_gap;
                this.A01 = resources.getDimensionPixelSize(i);
                return;
            }
            C14360o3.A0F("resources");
            throw C00O.createAndThrow();
        }
        resources = this.A02;
        if (resources != null) {
            i = R.dimen.abc_button_padding_horizontal_material;
            this.A01 = resources.getDimensionPixelSize(i);
            return;
        }
        C14360o3.A0F("resources");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC99734dr
    public final void A02(int i, int i2) {
        RectF rectF = this.A05;
        rectF.set(0.0f, 0.0f, i, i2);
        JQ0.A0v(rectF, this.A03);
    }

    @Override // X.AbstractC99734dr
    public final void A04(Canvas canvas) {
        RectF rectF = this.A05;
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, this.A03);
    }

    @Override // X.AbstractC99734dr
    public final void A07(EnumC99714dp enumC99714dp) {
        this.A00 = enumC99714dp;
    }

    @Override // X.AbstractC99734dr
    public final void A03(Resources resources, TextView textView) {
        AbstractC167017dG.A1N(textView, resources);
        Paint paint = this.A03;
        Context context = textView.getContext();
        AbstractC166987dD.A1N(context, paint, AbstractC53242c7.A0D(context));
        AbstractC166987dD.A1R(paint);
        textView.setTextAppearance(R.style.igds_emphasized_body_1);
        int A01 = AbstractC31174DnI.A01(context);
        textView.setTextColor(A01);
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(A01));
        this.A02 = resources;
        A01();
    }

    @Override // X.AbstractC99734dr
    public final void A05(View view, View view2, TextView textView, boolean z) {
        AbstractC167017dG.A1Q(textView, view2);
        int i = 8;
        textView.setVisibility(AbstractC31175DnJ.A01(z ? 1 : 0));
        if (z) {
            i = 0;
        }
        view2.setVisibility(i);
    }

    @Override // X.AbstractC99734dr
    public final void A0A(View view, TextView textView, boolean z) {
        int i;
        float f;
        AbstractC167017dG.A1P(textView, view);
        if (view.isEnabled()) {
            i = 255;
            f = 1.0f;
            if (z) {
                i = 179;
                f = 0.7f;
            }
        } else {
            i = 77;
            f = 0.3f;
        }
        this.A03.setAlpha(i);
        textView.setAlpha(f);
        view.postInvalidate();
    }
}
