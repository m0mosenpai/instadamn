package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;

/* renamed from: X.Nqt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53803Nqt {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        String str;
        UserSession userSession;
        String str2;
        Collections.unmodifiableList(c6fw.A00);
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        Integer[] A00 = C05F.A00(2);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A00[i];
                if (1 - num.intValue() != 0) {
                    str2 = "xar";
                } else {
                    str2 = "ccp";
                }
                if (str2.equals(A03)) {
                    break;
                }
                i++;
            } else {
                num = null;
                break;
            }
        }
        if (num != null) {
            boolean A01 = C6DZ.A01(c6fw.A03(1));
            Object A032 = c6fw.A03(2);
            C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.String");
            for (Integer num2 : C05F.A00(2)) {
                if (1 - num2.intValue() != 0) {
                    str = "is_set_to_all_reels";
                } else {
                    str = "is_set_to_this_reel";
                }
                if (str.equals(A032)) {
                    AbstractC12990ll A0B = C6BQ.A0B(c6fq);
                    if (!(A0B instanceof UserSession) || (userSession = (UserSession) A0B) == null) {
                        return null;
                    }
                    int intValue = num2.intValue();
                    if (intValue != 0) {
                        if (intValue == 1) {
                            int intValue2 = num.intValue();
                            if (intValue2 != 0) {
                                if (intValue2 == 1) {
                                    C200108tF.A02(userSession, A01);
                                    return null;
                                }
                                throw B4Z.A00();
                            }
                            AbstractC25651Mw.A00(userSession).A05(new C56020Otr(C05F.A00, A01, false));
                            return null;
                        }
                        throw B4Z.A00();
                    }
                    int intValue3 = num.intValue();
                    if (intValue3 != 0) {
                        if (intValue3 == 1) {
                            C200108tF.A01.A0C(userSession, "BLOKS", A01, false);
                            return null;
                        }
                        throw B4Z.A00();
                    }
                    C200108tF.A01.A0B(C6BQ.A07(C6BQ.A09(c6fq)), userSession, "BLOKS", null, A01, false);
                    return null;
                }
            }
            throw AbstractC166987dD.A12("Required value was null.");
        }
        throw AbstractC166987dD.A12("Required value was null.");
    }
}
