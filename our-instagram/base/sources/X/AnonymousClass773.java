package X;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import java.util.regex.Pattern;

/* renamed from: X.773, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass773 {
    public static final SpannableStringBuilder A00(android.net.Uri uri, String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(uri, 2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        A05(spannableStringBuilder, new C50761MbS(uri), str);
        return spannableStringBuilder;
    }

    public static final void A01(android.net.Uri uri, TextView textView, String str, String str2) {
        C14360o3.A0B(textView, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(uri, 3);
        textView.setText(A00(uri, str, str2));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    public static final void A02(SpannableStringBuilder spannableStringBuilder, CharacterStyle characterStyle, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(spannableStringBuilder, 1);
        String obj = spannableStringBuilder.toString();
        C14360o3.A07(obj);
        int A08 = AbstractC001900j.A08(obj, str, 0, false);
        if (A08 != -1) {
            Pattern pattern = AbstractC13670mt.A00;
            spannableStringBuilder.setSpan(characterStyle, A08, str.length() + A08, 33);
        }
    }

    public static final void A03(SpannableStringBuilder spannableStringBuilder, CharacterStyle characterStyle, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(spannableStringBuilder, 1);
        String obj = spannableStringBuilder.toString();
        C14360o3.A07(obj);
        int A07 = AbstractC001900j.A07(obj, str, obj.length() - 1);
        if (A07 != -1) {
            Pattern pattern = AbstractC13670mt.A00;
            spannableStringBuilder.setSpan(characterStyle, A07, str.length() + A07, 33);
        }
    }

    public static final void A04(SpannableStringBuilder spannableStringBuilder, ClickableSpan clickableSpan, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(spannableStringBuilder, 1);
        A02(spannableStringBuilder, clickableSpan, str);
    }

    public static final void A05(SpannableStringBuilder spannableStringBuilder, ClickableSpan clickableSpan, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(spannableStringBuilder, 1);
        A03(spannableStringBuilder, clickableSpan, str);
    }

    public static final void A07(ClickableSpan clickableSpan, TextView textView, String str, String str2) {
        C14360o3.A0B(textView, 0);
        C14360o3.A0B(str, 1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        A05(spannableStringBuilder, clickableSpan, str);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    public static final void A06(SpannableStringBuilder spannableStringBuilder, ClickableSpan clickableSpan, String str, int i) {
        String obj = spannableStringBuilder.toString();
        C14360o3.A07(obj);
        int A07 = AbstractC001900j.A07(obj, str, obj.length() - 1);
        if (A07 != -1) {
            Pattern pattern = AbstractC13670mt.A00;
            int length = str.length() + A07;
            spannableStringBuilder.setSpan(clickableSpan, A07, length, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), A07, length, 33);
        }
    }
}
