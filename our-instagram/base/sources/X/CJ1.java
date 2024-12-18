package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class CJ1 {
    public static final SpannableStringBuilder A00(String str, String str2) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        String lowerCase2 = str2.toLowerCase(locale);
        C14360o3.A07(lowerCase2);
        int A0E = AbstractC25230BEn.A0E(lowerCase, lowerCase2);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
        if (A0E != -1) {
            A0H.setSpan(new StyleSpan(1), A0E, AbstractC25226BEj.A04(str2, A0E), 33);
        }
        return A0H;
    }
}
