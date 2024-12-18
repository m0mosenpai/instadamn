package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.registration.ui.NotificationBar;
import java.util.regex.Pattern;

/* renamed from: X.Fgt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35259Fgt {
    public static void A07(Fragment fragment, AbstractC10360h2 abstractC10360h2, String str) {
        C14240no c14240no;
        if (abstractC10360h2.A0Q(str) == null) {
            c14240no = new C14240no(abstractC10360h2);
            c14240no.A0D(fragment, str, R.id.layout_container_main);
            c14240no.A0I(null);
        } else {
            c14240no = new C14240no(abstractC10360h2);
            abstractC10360h2.A0x(null, 1);
            c14240no.A0D(fragment, str, R.id.layout_container_main);
        }
        c14240no.A01();
    }

    public static void A04(Bundle bundle, AbstractC10360h2 abstractC10360h2) {
        C14240no c14240no = new C14240no(abstractC10360h2);
        abstractC10360h2.A0x(null, 1);
        AbstractC31172DnG.A1A();
        C32316ELf c32316ELf = new C32316ELf();
        c32316ELf.setArguments(bundle);
        c14240no.A0A(c32316ELf, R.id.layout_container_main);
        c14240no.A00();
    }

    public static void A08(NotificationBar notificationBar, String str) {
        if (!"".equals(str)) {
            Context context = notificationBar.getContext();
            notificationBar.A04(str, context.getColor(AbstractC53242c7.A03(context)), context.getColor(AbstractC53242c7.A02(context)));
        }
    }

    public static String A00(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        String stripSeparators = PhoneNumberUtils.stripSeparators(AnonymousClass001.A0g(str, " ", str2));
        Pattern pattern = AbstractC13670mt.A01;
        if (stripSeparators == null) {
            return "";
        }
        return stripSeparators;
    }

    public static void A01(Context context, View view, ImageView imageView) {
        int A0A = AbstractC13880nE.A0A(context);
        Drawable drawable = imageView.getDrawable();
        drawable.getClass();
        imageView.getLayoutParams().width = Math.min(drawable.getIntrinsicWidth(), (int) (A0A * 0.45f));
        if (view != null) {
            view.getLayoutParams().width = imageView.getLayoutParams().width + AbstractC166987dD.A0C(context, 48);
        }
    }

    public static void A02(Context context, TextView textView, AbstractC12990ll abstractC12990ll) {
        String string = context.getString(2131964751);
        String A0f = AbstractC167007dF.A0f(context, string, 2131956686);
        int A02 = AbstractC31174DnI.A02(context);
        textView.setHighlightColor(0);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0f);
        String A022 = AbstractC63260SgI.A02(context, "https://www.facebook.com/help/instagram/261704639352628?ref=learn_more");
        C14360o3.A07(A022);
        AnonymousClass773.A05(A0H, new C33246Elg(context, abstractC12990ll, A022, A02), string);
        AbstractC31176DnK.A1G(textView, A0H);
    }

    public static void A03(Context context, TextView textView, AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, String str, String str2, String str3, boolean z, boolean z2) {
        int i;
        Object[] objArr;
        String string = context.getString(2131964756);
        String string2 = context.getString(2131964753);
        String string3 = context.getString(2131964752);
        if (z) {
            i = 2131973080;
            objArr = new Object[]{str2, str3, string, string2, string3};
        } else {
            if ("eu".equals(str)) {
                i = 2131964748;
                if (EnumC33445EqI.A07.equals(enumC33445EqI)) {
                    i = 2131973078;
                }
            } else if ("row".equals(str)) {
                if (EnumC33445EqI.A07.equals(enumC33445EqI)) {
                    i = 2131973079;
                } else {
                    i = 2131964749;
                    if (z2) {
                        i = 2131964750;
                    }
                }
            } else {
                String string4 = context.getString(2131964756);
                String string5 = context.getString(2131964755);
                String A0t = AbstractC31174DnI.A0t(context, string4, string5, 2131964747);
                int A03 = AbstractC31174DnI.A03(context);
                textView.setHighlightColor(0);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0t);
                AnonymousClass773.A05(A0H, new C33246Elg(context, abstractC12990ll, C1HO.A03("/legal/terms/"), A03), string4);
                AnonymousClass773.A05(A0H, new C33246Elg(context, abstractC12990ll, C1HO.A03("/legal/privacy/"), A03), string5);
                AbstractC31176DnK.A1G(textView, A0H);
                textView.setTextColor(A03);
                return;
            }
            objArr = new Object[]{string, string2, string3};
        }
        String string6 = context.getString(i, objArr);
        int A02 = AbstractC31174DnI.A02(context);
        textView.setHighlightColor(0);
        SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(string6);
        String A022 = AbstractC63260SgI.A02(context, MSV.A00(97));
        C14360o3.A07(A022);
        AnonymousClass773.A05(A0H2, new C33246Elg(context, abstractC12990ll, A022, A02), string);
        String A023 = AbstractC63260SgI.A02(context, MSV.A00(31));
        C14360o3.A07(A023);
        AnonymousClass773.A05(A0H2, new C33246Elg(context, abstractC12990ll, A023, A02), string2);
        String A024 = AbstractC63260SgI.A02(context, "https://i.instagram.com/legal/cookies/");
        C14360o3.A07(A024);
        AnonymousClass773.A05(A0H2, new C33246Elg(context, abstractC12990ll, A024, A02), string3);
        AbstractC31176DnK.A1G(textView, A0H2);
    }

    public static void A05(View view, Fragment fragment, AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, EnumC31713DwI enumC31713DwI, boolean z) {
        TextView A0T = AbstractC166997dE.A0T(view, R.id.log_in_button);
        AbstractC31180DnO.A13(AbstractC166997dE.A0N(fragment), A0T, 2131952945);
        C0fQ.A00(new ViewOnClickListenerC35617Fo8(2, enumC33445EqI, abstractC12990ll, fragment, enumC31713DwI, z), A0T);
    }

    public static void A06(TextView textView) {
        if (TextUtils.isEmpty(AbstractC31174DnI.A0u(textView))) {
            textView.requestFocus();
            AbstractC13880nE.A0R(textView);
        } else {
            AbstractC13880nE.A0O(textView);
        }
    }
}
