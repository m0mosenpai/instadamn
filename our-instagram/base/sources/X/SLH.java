package X;

import X.C14360o3;
import android.text.SpannableString;
import android.view.View;
import com.fbpay.common.URLSpanNoUnderline;
import java.util.List;

/* loaded from: classes10.dex */
public class SLH {
    public final CharSequence A00;
    public final List A01;

    public SpannableString A00(final InterfaceC65383TjG interfaceC65383TjG, final boolean z) {
        SpannableString spannableString = new SpannableString(this.A00);
        for (final C62901SWh c62901SWh : this.A01) {
            int i = c62901SWh.A02;
            if (i >= 0) {
                final String str = c62901SWh.A03;
                spannableString.setSpan(new URLSpanNoUnderline(str) { // from class: com.fbpay.common.LinkableText$makeSpannable$1
                    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        C14360o3.A0B(view, 0);
                        if (z) {
                            view.cancelPendingInputEvents();
                        }
                        interfaceC65383TjG.DP6(c62901SWh);
                    }
                }, i, i + c62901SWh.A01, 33);
            }
        }
        return spannableString;
    }

    public SLH(CharSequence charSequence, List list) {
        this.A00 = charSequence;
        this.A01 = list;
    }
}
