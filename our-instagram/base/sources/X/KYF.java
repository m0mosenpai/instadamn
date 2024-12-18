package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class KYF extends AbstractC99734dr {
    public int A00;
    public Paint A01;
    public RectF A02;

    public KYF(EnumC99714dp enumC99714dp, C1QL c1ql) {
        this.A01 = AbstractC166987dD.A0S(1);
        this.A02 = AbstractC166987dD.A0X();
    }

    @Override // X.AbstractC99734dr
    public final void A08(SpinnerImageView spinnerImageView) {
        C14360o3.A0B(spinnerImageView, 0);
        Context A0L = AbstractC166997dE.A0L(spinnerImageView);
        spinnerImageView.setImageDrawable(AbstractC85953sP.A01(A0L, R.drawable.nav_spinner, AbstractC53242c7.A07(A0L)));
    }

    @Override // X.AbstractC99734dr
    public final void A09(View view, TextView textView, boolean z) {
        C14360o3.A0B(view, 2);
        Paint paint = this.A01;
        int i = 77;
        if (z) {
            i = 255;
        }
        paint.setAlpha(i);
        view.postInvalidate();
    }

    @Override // X.AbstractC99734dr
    public final void A0A(View view, TextView textView, boolean z) {
        int i;
        C14360o3.A0B(view, 2);
        Paint paint = this.A01;
        if (z) {
            i = 179;
        } else {
            i = 77;
            if (view.isEnabled()) {
                i = 255;
            }
        }
        paint.setAlpha(i);
        view.postInvalidate();
    }

    @Override // X.AbstractC99734dr
    public final void A02(int i, int i2) {
        this.A02.set(0.0f, 0.0f, i, i2);
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
        boolean A1a = AbstractC167017dG.A1a(textView, resources);
        Context context = textView.getContext();
        Paint A0S = AbstractC166987dD.A0S(A1a ? 1 : 0);
        this.A01 = A0S;
        AbstractC43594JPz.A14(context, A0S, R.attr.backgroundColorSecondary);
        AbstractC166987dD.A1R(this.A01);
        AbstractC31177DnL.A0z(textView, context);
        this.A00 = AbstractC166997dE.A08(resources);
        this.A02 = AbstractC166987dD.A0X();
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

    public KYF() {
        this(EnumC99714dp.A04, C1QL.A03);
    }
}
