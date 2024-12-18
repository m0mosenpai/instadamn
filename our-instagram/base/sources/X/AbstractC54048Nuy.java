package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;

/* renamed from: X.Nuy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54048Nuy {
    public static final void A00(TextView textView, UserSession userSession, LeadGenPrivacyPolicy leadGenPrivacyPolicy, boolean z) {
        SpannableStringBuilder A0H;
        SpannableStringBuilder append;
        String str;
        C14360o3.A0B(userSession, 2);
        Context context = textView.getContext();
        String str2 = leadGenPrivacyPolicy.A04;
        boolean z2 = false;
        if (str2 != null) {
            z2 = AbstractC001900j.A0a(str2, ";;/;;", false);
        }
        if (z2) {
            A0H = AbstractC37300Gc1.A01();
            if (str2 != null) {
                try {
                    if (leadGenPrivacyPolicy.A01 != null) {
                        String str3 = leadGenPrivacyPolicy.A00;
                        if (str3 != null) {
                            A0H.append((CharSequence) AbstractC002300n.A0d(str2, ";;/;;", str3, false));
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        A0H.append((CharSequence) AbstractC002300n.A0d(str2, ";;/;;", "", false));
                    }
                } catch (NullPointerException unused) {
                    A0H.append((CharSequence) str2);
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else if (str2 != null) {
            A0H = AbstractC25225BEi.A0H(str2);
            if (leadGenPrivacyPolicy.A01 != null) {
                SpannableStringBuilder append2 = A0H.append((CharSequence) " ");
                String str4 = leadGenPrivacyPolicy.A02;
                if (str4 != null) {
                    append = append2.append((CharSequence) str4).append((CharSequence) context.getResources().getString(2131961132));
                    str = leadGenPrivacyPolicy.A00;
                    if (str == null) {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else if (leadGenPrivacyPolicy.A03 != null) {
                append = A0H.append((CharSequence) " ");
                str = leadGenPrivacyPolicy.A02;
                if (str == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            append.append((CharSequence) str);
        } else {
            throw AbstractC166987dD.A14("Required value was null.");
        }
        String str5 = leadGenPrivacyPolicy.A03;
        if (str5 != null) {
            String str6 = leadGenPrivacyPolicy.A02;
            if (str6 != null) {
                android.net.Uri A0B = AbstractC25227BEk.A0B(str5);
                C14360o3.A0A(context);
                C50767MbY c50767MbY = new C50767MbY(context, A0B, userSession, z);
                String A19 = AbstractC166987dD.A19(A0H);
                int A08 = AbstractC001900j.A08(A19, str6, 0, false);
                while (A08 >= 0) {
                    InterfaceC09390do interfaceC09390do = AbstractC13670mt.A09;
                    int length = A08 + str6.length();
                    A0H.setSpan(new C50767MbY(c50767MbY.A00, c50767MbY.A01, c50767MbY.A02, c50767MbY.A03), A08, length, 33);
                    A08 = AbstractC001900j.A08(A19, str6, length, false);
                }
                AbstractC25227BEk.A11(textView);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        String str7 = leadGenPrivacyPolicy.A01;
        if (str7 != null) {
            String str8 = leadGenPrivacyPolicy.A00;
            if (str8 != null) {
                android.net.Uri A0B2 = AbstractC25227BEk.A0B(str7);
                C14360o3.A0A(context);
                AnonymousClass773.A05(A0H, new C50767MbY(context, A0B2, userSession, z), str8);
                AbstractC25227BEk.A11(textView);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        textView.setText(A0H);
    }
}
