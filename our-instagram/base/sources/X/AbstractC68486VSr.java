package X;

import android.widget.TextView;

/* renamed from: X.VSr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68486VSr {
    public static final void A00(TextView textView, String str) {
        if (str != null && str.length() != 0) {
            textView.setVisibility(0);
            textView.setText(str);
            textView.setFocusable(true);
            return;
        }
        textView.setVisibility(8);
    }
}
