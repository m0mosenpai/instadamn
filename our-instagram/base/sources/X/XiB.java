package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public abstract class XiB {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str = (String) c6fw.A00.get(0);
        if (str != null) {
            UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
            C73457YEa A00 = AbstractC72645Xjb.A00(userSession);
            if (str.equals(A00.A02)) {
                A00.A01 += System.currentTimeMillis();
            }
            C73457YEa A002 = AbstractC72645Xjb.A00(userSession);
            A002.A00--;
            return null;
        }
        return null;
    }
}
