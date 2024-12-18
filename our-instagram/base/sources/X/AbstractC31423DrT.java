package X;

import android.text.SpannableStringBuilder;
import java.util.ArrayDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.DrT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31423DrT {
    public static void A00(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, String str, ArrayDeque arrayDeque, Object[] objArr, int i) {
        C18C.A0F(arrayDeque.isEmpty());
        Matcher matcher = Pattern.compile(Pattern.quote(str)).matcher(spannableStringBuilder);
        if (matcher.find()) {
            int start = matcher.start();
            spannableStringBuilder.replace(start, matcher.end(), charSequence);
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2 = 1) {
                spannableStringBuilder.setSpan(objArr[i2], start, charSequence.length() + start, i);
            }
        }
    }
}
