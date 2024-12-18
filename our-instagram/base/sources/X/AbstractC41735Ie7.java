package X;

import android.text.SpannableStringBuilder;
import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.Ie7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41735Ie7 {
    public static final Pattern A00 = Pattern.compile("\\p{Punct}");

    public static final SpannableStringBuilder A01(UserSession userSession, C138886Qu c138886Qu, CharSequence charSequence, int i) {
        AbstractC167007dF.A1E(charSequence, 1, c138886Qu);
        C85383rT c85383rT = new C85383rT(AbstractC25225BEi.A0H(charSequence), userSession);
        c85383rT.A03 = i;
        c85383rT.A01 = i;
        c85383rT.A0f = true;
        c85383rT.A0d = true;
        c85383rT.A02(c138886Qu);
        c85383rT.A03(c138886Qu);
        SpannableStringBuilder A002 = c85383rT.A00();
        C14360o3.A07(A002);
        return A002;
    }

    public static final int A00(C6QX c6qx) {
        String str = c6qx.A03;
        if (str == null) {
            return -1;
        }
        StringBuilder sb = new StringBuilder(str);
        String str2 = c6qx.A04;
        if (str2 != null && str2.length() != 0) {
            sb.insert(1, str2);
        }
        return AbstractC13950nL.A0C(sb.toString(), -1);
    }

    public static final User A02(C6QX c6qx, String str) {
        Map map;
        User user;
        String A0h = AbstractC167007dF.A0h(str);
        if (c6qx == null || (map = c6qx.A08) == null || !(!map.isEmpty()) || (user = (User) map.get(A0h)) == null) {
            return new User("-1", A0h);
        }
        return user;
    }

    public static final ArrayList A03(CharSequence charSequence, String str, List list, boolean z) {
        int length;
        int i;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            JMQ jmq = (JMQ) it.next();
            String C99 = jmq.C99();
            if (C99 != null && (length = C99.length()) != 0) {
                int A08 = AbstractC001900j.A08(charSequence.toString(), C99, i2, false);
                int i3 = A08 + length;
                String obj = charSequence.toString();
                if (obj != null) {
                    i = obj.length();
                } else {
                    i = 0;
                }
                if (z) {
                    i -= str.length();
                }
                if (jmq.BKq() != null && jmq.BKt() != null && jmq.BKt() != StoryAdKeywordStyleEnum.A06 && A08 != -1 && i3 <= i) {
                    A1E.add(jmq);
                    i2 = i3;
                }
            }
        }
        return A1E;
    }
}
