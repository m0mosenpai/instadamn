package X;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F16 {
    public static final void A00(TextView textView, UserSession userSession, String str) {
        AbstractC167007dF.A1K(textView, userSession);
        Spanned fromHtml = Html.fromHtml(str);
        C14360o3.A07(fromHtml);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(fromHtml);
        int A01 = AbstractC31173DnH.A01(textView.getContext());
        C15370ps A1F = AbstractC25225BEi.A1F();
        Object[] spans = A0H.getSpans(0, A0H.length(), URLSpan.class);
        C14360o3.A07(spans);
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            A1F.A00 = uRLSpan.getURL();
            A0H.setSpan(new ForegroundColorSpan(A01), A0H.getSpanStart(uRLSpan), A0H.getSpanEnd(uRLSpan), 17);
            A0H.removeSpan(uRLSpan);
        }
        AbstractC31176DnK.A1G(textView, A0H);
        C0fQ.A00(new ViewOnClickListenerC35684FpJ(9, userSession, A1F, textView), textView);
    }
}
