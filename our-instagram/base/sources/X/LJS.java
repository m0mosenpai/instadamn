package X;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;

/* loaded from: classes8.dex */
public final class LJS {
    public static final LJS A00 = new Object();

    public static final C909943r A00(C9CN c9cn, int i) {
        Integer num;
        int A0A = i + AbstractC167007dF.A0A(c9cn.A05);
        boolean A1a = AbstractC31177DnL.A1a((Boolean) c9cn.A01);
        String str = c9cn.A03;
        if (str == null) {
            str = "#999999";
        }
        String str2 = c9cn.A02;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = c9cn.A04;
        if (str3 != null) {
            num = C55O.A00(str3);
        } else {
            num = null;
        }
        return new C909943r(num, str, str2, i, A0A, A1a);
    }

    public static final void A01(SpannableString spannableString, C909943r c909943r, int i, boolean z, boolean z2) {
        if (c909943r.A05) {
            spannableString.setSpan(new StyleSpan(1), c909943r.A01, c909943r.A00, 33);
        }
        if (!z2) {
            if (!z) {
                i = Color.parseColor(c909943r.A04);
            }
            spannableString.setSpan(new ForegroundColorSpan(i), c909943r.A01, c909943r.A00, 33);
        }
    }
}
