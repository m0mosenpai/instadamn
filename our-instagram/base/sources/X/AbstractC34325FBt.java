package X;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: X.FBt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34325FBt {
    public static void A00(Context context, FMP fmp, FLN fln) {
        ViewGroup viewGroup = fmp.A00;
        viewGroup.setVisibility(0);
        fmp.A02.A02();
        fln.A01.getClass();
        TextView textView = fmp.A01;
        textView.getClass();
        textView.setText(fln.A02);
        ViewOnClickListenerC35687FpM.A00(viewGroup, 64, fln, fmp);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, new ColorDrawable(AbstractC167007dF.A09(context, com.facebook.R.attr.backgroundColorSecondary)));
        viewGroup.setBackground(stateListDrawable);
    }
}
