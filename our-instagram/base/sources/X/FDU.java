package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;

/* loaded from: classes6.dex */
public abstract class FDU {
    public static final void A00(Context context, FK2 fk2, String str) {
        String A0b = AbstractC31177DnL.A0b(context, str, 2131975002);
        int A08 = AbstractC001900j.A08(A0b, str, 0, false);
        SpannableString spannableString = new SpannableString(A0b);
        AbstractC31178DnM.A0u(spannableString, new StyleSpan(1), str, A08);
        fk2.A01.setText(spannableString);
    }
}
