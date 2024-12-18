package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/* renamed from: X.CcH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28217CcH {
    public static final C28217CcH A00 = new Object();

    public final Spanned A01(Context context, int i) {
        String str;
        if (i > 2) {
            str = AbstractC167007dF.A0f(context, C84963qk.A04(AbstractC166997dE.A0M(context), Integer.valueOf(i - 1), 1000, true, true), 2131974445);
        } else {
            str = "";
        }
        C14360o3.A0A(str);
        if (str == null) {
            str = "";
        }
        Spanned fromHtml = Html.fromHtml(str);
        C14360o3.A07(fromHtml);
        return fromHtml;
    }

    public final SpannableStringBuilder A00(Context context, String str, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String A0g = AnonymousClass001.A0g("<b>", str, "</b>");
        if (A0g == null) {
            A0g = "";
        }
        Spanned fromHtml = Html.fromHtml(A0g);
        C14360o3.A07(fromHtml);
        spannableStringBuilder.append((CharSequence) fromHtml);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) A01(context, i));
        return spannableStringBuilder;
    }
}
