package X;

import android.widget.TextView;

/* renamed from: X.9PY, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9PY {
    public static final void A00(TextView textView, String str, int i) {
        if ((str != null && str.length() != 0) || (i != 0 && (str = textView.getContext().getString(i)) != null)) {
            textView.setText(str);
            textView.setVisibility(0);
            textView.requestLayout();
            return;
        }
        textView.setVisibility(8);
    }
}
