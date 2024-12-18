package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public abstract class JX9 {
    public static final C11L A00 = new C11L("@(\\w+(\\.\\w+)*)");

    public static final CharSequence A02(FragmentActivity fragmentActivity, C2Y0 c2y0, UserSession userSession, Integer num, Long l, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1R(userSession, str2);
        if (str.length() != 0 && C18U.A06(C06090Tz.A05, userSession, 36323702358420987L)) {
            return A00(fragmentActivity, c2y0, userSession, num, l, str, str2, str3, str4, str5, true);
        }
        return str;
    }

    public static final CharSequence A03(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        AbstractC25233BEq.A0v(0, str, userSession, str2);
        if (str.length() != 0 && C18U.A06(C06090Tz.A05, userSession, 36316053022445485L)) {
            return A00(fragmentActivity, null, userSession, null, null, str, str2, null, null, null, false);
        }
        return str;
    }

    public static final CharSequence A04(UserSession userSession, String str) {
        C14360o3.A0B(str, 0);
        if (str.length() != 0 && C18U.A06(C06090Tz.A05, userSession, 36316053022445485L)) {
            return A01(str);
        }
        return str;
    }

    public static final String A05(Context context, long j) {
        int i;
        Object[] objArr;
        Integer valueOf;
        String string;
        int A05 = JQ0.A05(j);
        int i2 = A05 / 60;
        if (i2 == 0 && A05 == 0) {
            string = context.getString(2131968811);
        } else {
            if (i2 == 0) {
                i = 2131968810;
                objArr = new Object[1];
                valueOf = Integer.valueOf(A05);
            } else {
                i = 2131968809;
                objArr = new Object[1];
                valueOf = Integer.valueOf(i2);
            }
            objArr[0] = valueOf;
            string = context.getString(i, objArr);
        }
        C14360o3.A0A(string);
        return string;
    }

    public static final void A06(IgTextView igTextView, IgTextView igTextView2, C45842KQx c45842KQx) {
        String str;
        C14360o3.A0B(c45842KQx, 2);
        if (igTextView != null) {
            Context context = igTextView2.getContext();
            if (context != null) {
                str = context.getString(2131954924);
            } else {
                str = null;
            }
            igTextView.setText(str);
        }
        igTextView2.setText(c45842KQx.A0B);
    }

    public static final void A07(IgTextView igTextView, IgTextView igTextView2, C45842KQx c45842KQx) {
        String str;
        C14360o3.A0B(c45842KQx, 2);
        if (igTextView != null) {
            Context context = igTextView2.getContext();
            if (context != null) {
                str = context.getString(2131954926);
            } else {
                str = null;
            }
            igTextView.setText(str);
        }
        igTextView2.setText(c45842KQx.A0B);
    }

    public static final SpannableStringBuilder A00(FragmentActivity fragmentActivity, C2Y0 c2y0, UserSession userSession, Integer num, Long l, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
        for (C117315Sq A06 = A00.A06(str, 0); A06 != null; A06 = A06.A02()) {
            C117335Ss A09 = A06.A02.A09(1);
            if (A09 != null) {
                str6 = A09.A00;
            } else {
                str6 = "";
            }
            A0H.setSpan(new C46066KaN(fragmentActivity, c2y0, userSession, num, l, str6, str2, str3, str4, str5, AbstractC31174DnI.A02(fragmentActivity), z), A06.A01().A00, A06.A01().A01 + 1, 33);
            A0H.setSpan(new StyleSpan(1), A06.A01().A00, A06.A01().A01 + 1, 33);
        }
        return A0H;
    }

    public static final SpannableStringBuilder A01(String str) {
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
        for (C117315Sq A06 = A00.A06(str, 0); A06 != null; A06 = A06.A02()) {
            A0H.setSpan(new StyleSpan(1), A06.A01().A00, A06.A01().A01 + 1, 33);
        }
        return A0H;
    }
}
