package X;

import android.content.Context;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.KjD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46574KjD {
    public static final void A00(TextView textView, TextView textView2) {
        AbstractC167017dG.A1N(textView, textView2);
        Context A0L = AbstractC166997dE.A0L(textView);
        AbstractC47994LKy.A04(A0L, textView, R.attr.sc_primary_text);
        textView.setTextSize(0, AbstractC47994LKy.A00(A0L, R.attr.selfie_title_size));
        Context A0L2 = AbstractC166997dE.A0L(textView2);
        AbstractC47994LKy.A04(A0L2, textView2, R.attr.sc_secondary_text);
        textView2.setTextSize(0, AbstractC47994LKy.A00(A0L2, R.attr.selfie_subtitle_size));
    }
}
