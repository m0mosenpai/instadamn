package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;

/* renamed from: X.Hzs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40634Hzs {
    public static final CharSequence A00(Context context, String str, String str2, String str3) {
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        if (str3 == null) {
            int i = 2131976862;
            if (AbstractC13670mt.A0G(str2, "SALE")) {
                i = 2131976884;
            }
            str3 = AbstractC166997dE.A0p(context, i);
        }
        if (str != null) {
            A01.append((CharSequence) str3);
            A01.setSpan(new StyleSpan(1), 0, A01.length(), 17);
            return A01;
        }
        return str3;
    }
}
