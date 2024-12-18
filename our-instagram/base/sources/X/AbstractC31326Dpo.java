package X;

import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* renamed from: X.Dpo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31326Dpo {
    public static final void A00(TextView textView, E72 e72, String str, boolean z) {
        boolean A1a = AbstractC167017dG.A1a(textView, str);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
        if (z) {
            C85963sQ.A08(AbstractC166997dE.A0L(textView), A0H, A1a);
        }
        if (e72 != null) {
            FVH.A01(AbstractC166997dE.A0L(textView), A0H, A1a, !z, e72.A02);
            textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC35722Fpw(textView, e72, str));
        }
        textView.setText(A0H);
    }
}
