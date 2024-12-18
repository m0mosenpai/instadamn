package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public abstract class XiC {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str = (String) c6fw.A00.get(0);
        if (str != null) {
            C73457YEa A00 = AbstractC72645Xjb.A00((UserSession) C6BQ.A0B(c6fq));
            if (str.equals(A00.A02)) {
                A00.A01 -= System.currentTimeMillis();
                return null;
            }
            return null;
        }
        return null;
    }
}
