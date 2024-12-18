package X;

import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.Krs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47097Krs {
    public static final void A00(LinearLayout.LayoutParams layoutParams, LinearLayout linearLayout, String str) {
        TextView textView = new TextView(linearLayout.getContext());
        textView.setTextSize(15.0f);
        textView.setTextColor(-16711936);
        textView.setText(str);
        linearLayout.addView(textView, layoutParams);
    }
}
