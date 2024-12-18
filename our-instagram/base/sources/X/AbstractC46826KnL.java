package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.instagram.common.session.UserSession;

/* renamed from: X.KnL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46826KnL {
    public static final CharSequence A00(UserSession userSession, String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        SpannableStringBuilder A0H;
        if (z) {
            A0H = AbstractC25225BEi.A0H("");
        } else {
            A0H = AbstractC25225BEi.A0H(AnonymousClass001.A0C(str, ' '));
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
            int length = str.length();
            A0H.setSpan(foregroundColorSpan, 0, length, 33);
            A0H.setSpan(new StyleSpan(1), 0, length, 33);
        }
        if (str2 != null) {
            C85383rT c85383rT = new C85383rT(AbstractC25225BEi.A0H(str2), userSession);
            c85383rT.A02(null);
            c85383rT.A03(null);
            c85383rT.A04 = i2;
            c85383rT.A03 = i3;
            c85383rT.A01 = i4;
            CharSequence concat = TextUtils.concat(A0H, c85383rT.A00());
            C14360o3.A0A(concat);
            return concat;
        }
        return A0H;
    }
}
