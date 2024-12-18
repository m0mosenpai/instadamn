package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Deprecated;

@Deprecated(message = "Sync all changes with the Kotlin implementation of @StoryAdTextUtilKt")
/* renamed from: X.6RX, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6RX {
    public static final Pattern A00 = Pattern.compile("\\p{Punct}");

    public static int A00(C6QX c6qx) {
        String str = c6qx.A03;
        if (str == null) {
            return -1;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(c6qx.A04)) {
            sb.insert(1, c6qx.A04);
        }
        return AbstractC13950nL.A0C(sb.toString(), -1);
    }

    public static SpannableStringBuilder A01(UserSession userSession, C138886Qu c138886Qu, CharSequence charSequence, int i) {
        C85383rT c85383rT = new C85383rT(new SpannableStringBuilder(charSequence), userSession);
        c85383rT.A03 = i;
        c85383rT.A01 = i;
        c85383rT.A0f = true;
        c85383rT.A0d = true;
        c85383rT.A02(c138886Qu);
        c85383rT.A03(c138886Qu);
        return c85383rT.A00();
    }

    public static User A02(C6QX c6qx, String str) {
        Map map;
        User user;
        String lowerCase = str.toLowerCase(Locale.US);
        if (c6qx == null || (map = c6qx.A08) == null || map.isEmpty() || (user = (User) map.get(lowerCase)) == null) {
            return new User("-1", lowerCase);
        }
        return user;
    }

    public static ArrayList A03(CharSequence charSequence, String str, List list, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JMQ jmq = (JMQ) it.next();
            String C99 = jmq.C99();
            if (C99 != null && !TextUtils.isEmpty(C99)) {
                int indexOf = charSequence.toString().indexOf(C99, i2);
                int length = indexOf + C99.length();
                String charSequence2 = charSequence.toString();
                if (charSequence2 != null) {
                    i = charSequence2.length();
                } else {
                    i = 0;
                }
                if (z) {
                    i -= str.length();
                }
                if (jmq.BKq() != null && jmq.BKt() != null && jmq.BKt() != StoryAdKeywordStyleEnum.A06 && indexOf != -1 && length <= i) {
                    arrayList.add(jmq);
                    i2 = length;
                }
            }
        }
        return arrayList;
    }
}
