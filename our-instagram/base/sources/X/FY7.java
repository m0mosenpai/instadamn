package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import java.text.NumberFormat;

/* loaded from: classes6.dex */
public abstract class FY7 {
    public static final void A00(Context context, View view, int i, int i2) {
        TextView A0N = AbstractC167007dF.A0N(view, i);
        int A0H = AbstractC53242c7.A0H(context, R.attr.glyphColorPrimary);
        StateListDrawable A08 = C3LQ.A08(context, i2, A0H, i2, A0H);
        A08.setBounds(0, 0, A08.getIntrinsicWidth(), A08.getIntrinsicHeight());
        A0N.setCompoundDrawables(A08, null, null, null);
    }

    public static final void A01(Resources resources, TextView textView, int i, int i2) {
        textView.setText(NumberFormat.getInstance(C1Q2.A02()).format(i));
        textView.setContentDescription(AbstractC31175DnJ.A0W(resources, Integer.valueOf(i), i2, i));
        AbstractC13880nE.A0d(textView, 0);
        AbstractC13880nE.A0Y(textView, 0);
        textView.setVisibility(0);
    }
}
