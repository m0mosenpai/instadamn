package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.FgT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35235FgT {
    public static final void A01(Context context, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C34918Fa4.A01, userSession), "instagram_two_fac_setup_action");
        AbstractC31171DnF.A1C(A0f, "link");
        A0f.AAP("view", "");
        AbstractC31181DnP.A0c(A0f);
        A0f.AAP("url", str);
        A0f.Cht();
        SimpleWebViewActivity.A02.A02(context, userSession, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, str2, str));
    }

    public static final void A02(ClickableSpan clickableSpan, ClickableSpan clickableSpan2, TextView textView, String str, String str2) {
        C14360o3.A0B(textView, 0);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
        A0H.setSpan(clickableSpan, 0, str.length(), 33);
        SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(str2);
        A0H2.setSpan(clickableSpan2, 0, str2.length(), 33);
        AbstractC25227BEk.A11(textView);
        textView.setHighlightColor(0);
        textView.setText(AbstractC25225BEi.A0H(A0H).append((CharSequence) " • ").append((CharSequence) A0H2));
    }

    public static final void A03(TextView textView, TextView textView2, String str) {
        C14360o3.A0B(str, 0);
        if (str.length() != 32) {
            C0w9.A03("two factor", "instagram key length invalid");
            textView.setText(str);
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        for (int i = 0; i < 16; i++) {
            if (i != 0 && i % 4 == 0) {
                A1C.append("  ");
            }
            A1C.append(str.charAt(i));
        }
        textView.setText(A1C);
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        int i2 = 16;
        while (true) {
            A1C2.append(str.charAt(i2));
            i2++;
            if (i2 < 32) {
                if (i2 != 16 && i2 % 4 == 0) {
                    A1C2.append("  ");
                }
            } else {
                textView2.setText(A1C2);
                return;
            }
        }
    }

    public static final void A05(UserSession userSession, FragmentActivity fragmentActivity) {
        C14360o3.A0B(userSession, 0);
        AbstractC35075Fcm.A00(userSession, C05F.A1I);
        AbstractC35179FfW.A03();
        AbstractC31177DnL.A16(new EJF(), fragmentActivity, userSession);
    }

    public static final String A00(String str) {
        int length = str.length();
        if (length >= 4) {
            return AbstractC25227BEk.A0w(str, length - 4, length);
        }
        C0w9.A03("two fac util", AnonymousClass001.A0g("phone number :", str, " length less then 4"));
        return "xxxx";
    }

    public static void A04(Fragment fragment, UserSession userSession, int i) {
        String string = fragment.getString(i);
        C14360o3.A07(string);
        A01(fragment.requireContext(), userSession, AbstractC31182DnR.A05(217, 52, 60), string);
    }
}
