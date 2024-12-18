package X;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* loaded from: classes6.dex */
public abstract class F2G {
    public static final CharSequence A00(Context context, String str, String str2, boolean z) {
        int A08;
        AbstractC167017dG.A1P(str, str2);
        if (z && (A08 = AbstractC001900j.A08(str, str2, 0, false)) != -1) {
            boolean A02 = AbstractC13620mo.A02(context);
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
            if (!A02) {
                A08 += str2.length();
            }
            C85963sQ.A04(context, A0H, A08);
            return A0H;
        }
        return str;
    }
}
