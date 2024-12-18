package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Nqs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53802Nqs {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        UserSession userSession;
        C35038FcB A01;
        String str;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A03;
        C14360o3.A0B(str2, 0);
        Integer[] A00 = C05F.A00(2);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A00[i];
                if (1 - num.intValue() != 0) {
                    str = "DISMISS";
                } else {
                    str = "VIEW";
                }
                Locale locale = Locale.ROOT;
                if (AbstractC31172DnG.A16(locale, str).equals(AbstractC31172DnG.A16(locale, str2))) {
                    break;
                }
                i++;
            } else {
                num = null;
                break;
            }
        }
        String A0Z = AbstractC31175DnJ.A0Z(c6fw, "null cannot be cast to non-null type kotlin.String");
        List list = c6fw.A00;
        Number number = (Number) list.get(2);
        String A0y = AbstractC43593JPy.A0y(c6fw, 3);
        Collections.unmodifiableList(list);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && (userSession = (UserSession) A0B) != null) {
            if (num == C05F.A01 && number != null && (A01 = FXY.A01(userSession, number.intValue())) != null) {
                A01.A00();
            }
            AbstractC25651Mw.A00(userSession).A05(new C51809MvD(A0Z, num, A0y));
            C200138tI A002 = AbstractC200128tH.A00(userSession);
            C14360o3.A0B(A0Z, 0);
            A002.A01(AnonymousClass001.A0R("impression_from_variant:", A0Z));
        }
        return null;
    }
}
