package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebookpay.offsite.models.message.AvailabilityResponse;
import com.facebookpay.offsite.models.message.AvailableMessageContent;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.facebookpay.widget.accessibility.AccessibleTextView;
import com.fbpay.hub.common.link.LinkParams;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VKC {
    public Q1y A00;
    public Map A01;

    public void A01() {
        View findViewById;
        View view = ((BrowserLiteFragment) ((C67718Uwj) this).A00).A0C;
        if (view != null && (findViewById = view.findViewById(R.id.metapay_disclosure_footer)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void A02() {
        C67718Uwj c67718Uwj = (C67718Uwj) this;
        View view = ((BrowserLiteFragment) c67718Uwj.A00).A0C;
        if (view != null) {
            View findViewById = view.findViewById(R.id.metapay_disclosure_footer);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                return;
            }
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.top_addon_footer_stub);
            if (viewStub == null) {
                return;
            }
            viewStub.setLayoutResource(R.layout.ads_disclosure_footer_metapay);
            View inflate = viewStub.inflate();
            C14360o3.A07(inflate);
            Q1y q1y = ((VKC) c67718Uwj).A00;
            if (q1y == null) {
                return;
            }
            AccessibleTextView accessibleTextView = (AccessibleTextView) inflate.findViewById(R.id.metapay_disclosure_footer_body_text);
            View findViewById2 = inflate.findViewById(R.id.metapay_disclosure_footer_divider);
            String A0p = AbstractC166997dE.A0p(q1y, R.string.res_0x7f13007f_name_removed);
            String A0b = AbstractC31177DnL.A0b(q1y, A0p, R.string.res_0x7f130082_name_removed);
            Q1y q1y2 = ((VKC) c67718Uwj).A00;
            CharSequence charSequence = A0b;
            if (q1y2 != null) {
                ArrayList arrayList = new ArrayList();
                W4W w4w = new W4W();
                w4w.A01("https://www.facebook.com/privacy/explanation/");
                w4w.A01 = R.string.res_0x7f130080_name_removed;
                w4w.A03 = "[[data_terms_token]]";
                arrayList.add(new LinkParams(w4w));
                W4W w4w2 = new W4W();
                w4w2.A01("https://www.facebook.com/terms.php");
                w4w2.A01 = R.string.res_0x7f130081_name_removed;
                w4w2.A03 = "[[terms_token]]";
                arrayList.add(new LinkParams(w4w2));
                C60613RDi A00 = SSE.A00(q1y2, AbstractC31173DnH.A0L(arrayList), A0b);
                WbN wbN = new WbN(c67718Uwj, 4);
                C14360o3.A0B(wbN, 0);
                charSequence = A00.A00(wbN, false);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            StyleSpan styleSpan = new StyleSpan(1);
            int A08 = AbstractC001900j.A08(spannableStringBuilder, A0p, 0, false);
            spannableStringBuilder.setSpan(styleSpan, A08, A0p.length() + A08, 33);
            AbstractC31176DnK.A1G(accessibleTextView, spannableStringBuilder);
            accessibleTextView.A00(AbstractC166997dE.A0p(q1y, R.string.res_0x7f130057_name_removed));
            WF7.A02(accessibleTextView, VEP.A14);
            C2FP.A0A();
            AbstractC31174DnI.A1C(inflate, q1y.getColor(R.color.igds_elevated_background));
            C2FP.A0A();
            AbstractC31174DnI.A1C(findViewById2, q1y.getColor(R.color.igds_separator));
        }
    }

    public boolean A03(AvailabilityResponse availabilityResponse) {
        String str;
        AvailableMessageContent availableMessageContent = availabilityResponse.content;
        if (availableMessageContent != null) {
            str = availableMessageContent.availability;
        } else {
            str = null;
        }
        if (!C14360o3.A0K(str, MessageAvailabilityResponseId$Companion.AVAILABLE)) {
            return false;
        }
        C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36314489656707738L);
        return C18U.A06(C06090Tz.A06, C2FP.A0D().A00, 36314489656707738L);
    }
}
