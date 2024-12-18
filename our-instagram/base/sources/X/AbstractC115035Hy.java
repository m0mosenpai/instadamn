package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.instagram.common.session.UserSession;

/* renamed from: X.5Hy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115035Hy {
    public static final void A01(SpannableStringBuilder spannableStringBuilder, C115025Hx c115025Hx, C115015Hw c115015Hw, C75113Zb c75113Zb) {
        int length;
        spannableStringBuilder.append((CharSequence) c115015Hw.A06);
        String str = c115015Hw.A05;
        if (str != null && (length = str.length()) != 0) {
            spannableStringBuilder.append((CharSequence) AnonymousClass001.A0D(str, ' '));
            if (C14360o3.A0K(c115015Hw.A01, true)) {
                int length2 = spannableStringBuilder.length() - length;
                int i = length + length2;
                spannableStringBuilder.setSpan(new StyleSpan(1), length2, i, 33);
                spannableStringBuilder.setSpan(new C44394JjX(c115025Hx, c115015Hw, c75113Zb), length2, i, 33);
            }
        }
    }

    public static final boolean A02(UserSession userSession, C115015Hw c115015Hw) {
        C14360o3.A0B(userSession, 0);
        String str = c115015Hw.A06;
        if (str == null || str.length() == 0 || !C18U.A06(C06090Tz.A05, userSession, 36318346534197356L)) {
            return false;
        }
        return true;
    }

    public static final void A00(SpannableStringBuilder spannableStringBuilder, C115025Hx c115025Hx, C115015Hw c115015Hw, C75113Zb c75113Zb) {
        int i;
        int length = spannableStringBuilder.length();
        String str = c115015Hw.A02;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new C44393JjW(c115025Hx, c115015Hw, c75113Zb), length, i + length, 33);
    }
}
