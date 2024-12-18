package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes6.dex */
public abstract class FC3 {
    public static void A00(Context context, GYT gyt, FLP flp, String str, int i, boolean z) {
        IgTextView igTextView = flp.A01;
        igTextView.setText(str);
        igTextView.setTextColor(i);
        int i2 = 0;
        igTextView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        SpinnerImageView spinnerImageView = flp.A02;
        if (!z) {
            i2 = 8;
        }
        spinnerImageView.setVisibility(i2);
        int A09 = AbstractC167007dF.A09(context, R.attr.glyphColorSecondary);
        spinnerImageView.setNormalColor(A09);
        spinnerImageView.setActiveColor(A09);
        if (gyt != null) {
            ViewOnClickListenerC35682FpH.A01(flp.A00, 17, gyt);
        }
    }
}
