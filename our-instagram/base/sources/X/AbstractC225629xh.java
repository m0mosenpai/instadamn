package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.9xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225629xh {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object obj;
        Integer num;
        String str;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean>");
        Map map = (Map) A01;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC166997dE.A1Z(map.get(obj), true)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str2 = (String) obj;
        Integer[] A00 = C05F.A00(3);
        int length = A00.length;
        int i = 0;
        while (true) {
            num = null;
            String str3 = null;
            if (i < length) {
                Integer num2 = A00[i];
                switch (num2.intValue()) {
                    case 1:
                        str = "share_once";
                        break;
                    case 2:
                        str = "dismiss";
                        break;
                    default:
                        str = "auto_xpost";
                        break;
                }
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                C14360o3.A07(lowerCase);
                if (str2 != null) {
                    str3 = str2.toLowerCase(locale);
                    C14360o3.A07(str3);
                }
                if (lowerCase.equals(str3)) {
                    num = num2;
                } else {
                    i++;
                }
            }
        }
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (!(A0B instanceof UserSession) || A0B == null) {
            return null;
        }
        AbstractC25651Mw.A00(A0B).A05(new C211849aB(num));
        return null;
    }
}
