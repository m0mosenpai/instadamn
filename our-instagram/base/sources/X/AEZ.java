package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes4.dex */
public abstract class AEZ {
    public static final void A01(TextView textView) {
        C14360o3.A0B(textView, 0);
        textView.setTypeface(AbstractC167017dG.A0R(AbstractC166997dE.A0L(textView)));
    }

    public static final void A00(Context context, C6RB c6rb) {
        Typeface A0R;
        if (AbstractC14710oj.A08()) {
            A0R = AbstractC14710oj.A01(context);
        } else {
            A0R = AbstractC167017dG.A0R(context);
        }
        c6rb.A0I(A0R);
    }
}
