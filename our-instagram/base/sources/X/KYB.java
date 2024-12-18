package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class KYB extends AbstractC99734dr {
    @Override // X.AbstractC99734dr
    public final void A02(int i, int i2) {
    }

    @Override // X.AbstractC99734dr
    public final void A03(Resources resources, TextView textView) {
        Context A06 = AbstractC31173DnH.A06(textView, 0);
        ColorStateList A02 = C02G.A02(A06, AbstractC53242c7.A09(A06));
        textView.setTextAppearance(R.style.igds_emphasized_body_2);
        textView.setTextColor(A02);
        textView.setCompoundDrawableTintList(A02);
    }

    @Override // X.AbstractC99734dr
    public final void A04(Canvas canvas) {
    }

    @Override // X.AbstractC99734dr
    public final void A05(View view, View view2, TextView textView, boolean z) {
    }

    @Override // X.AbstractC99734dr
    public final void A08(SpinnerImageView spinnerImageView) {
    }

    @Override // X.AbstractC99734dr
    public final void A07(EnumC99714dp enumC99714dp) {
    }
}
