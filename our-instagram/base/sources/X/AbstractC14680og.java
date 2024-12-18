package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.Locale;

/* renamed from: X.0og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14680og {
    public static final String A00(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        char upperCase = (char) Character.toUpperCase(lowerCase.codePointAt(0));
        String substring = lowerCase.substring(lowerCase.offsetByCodePoints(0, 1));
        C14360o3.A07(substring);
        String A0D = AnonymousClass001.A0D(substring, upperCase);
        C14360o3.A07(A0D);
        return A0D;
    }

    public static final void A01(View view, Integer num, boolean z) {
        String str;
        String obj;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setAllCaps(false);
            CharSequence text = textView.getText();
            if (text != null && (obj = text.toString()) != null) {
                str = A00(obj);
            } else {
                str = null;
            }
            textView.setText(str);
            int i = R.drawable.igds_prism_new_badge_background;
            if (z) {
                i = R.drawable.igds_prism_new_badge_background_with_border;
            }
            textView.setBackgroundResource(i);
            textView.setIncludeFontPadding(false);
            Context context = textView.getContext();
            C14360o3.A07(context);
            Integer num2 = C05F.A00;
            int i2 = 12;
            if (num == num2) {
                i2 = 6;
            }
            int A01 = AbstractC13690mv.A01(context, i2);
            int i3 = 6;
            if (num == num2) {
                i3 = 3;
            }
            int A012 = AbstractC13690mv.A01(context, i3);
            int i4 = 12;
            if (num == num2) {
                i4 = 6;
            }
            int A013 = AbstractC13690mv.A01(context, i4);
            int i5 = 6;
            if (num == num2) {
                i5 = 3;
            }
            textView.setPadding(A01, A012, A013, AbstractC13690mv.A01(context, i5));
            Integer num3 = C05F.A01;
            int i6 = R.style.igds_new_badge_small;
            if (num == num3) {
                i6 = R.style.igds_new_badge_large;
            }
            textView.setTextAppearance(i6);
            AbstractC14710oj.A07(context, null, textView, num3);
            if (textView.getLayoutParams() != null) {
                textView.getLayoutParams().height = -2;
            } else {
                textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
        }
    }

    public static final void A02(View view, Integer num, boolean z) {
        C14650od c14650od;
        if ((view instanceof TextView) && (c14650od = C14650od.A03) != null) {
            boolean A06 = C18U.A06(C06090Tz.A05, c14650od.A00, 36320296450138437L);
            if (Boolean.valueOf(A06) != null && A06) {
                A01(view, num, z);
            }
        }
    }
}
