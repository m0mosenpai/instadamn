package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class XiD {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        String str = (String) list.get(0);
        String str2 = (String) list.get(1);
        String str3 = (String) list.get(2);
        if (str != null && str2 != null && str3 != null) {
            C73457YEa A00 = AbstractC72645Xjb.A00((UserSession) C6BQ.A0B(c6fq));
            A00.A00++;
            String str4 = A00.A02;
            if (str4 != null) {
                str = str4;
            }
            A00.A02 = str;
            String str5 = A00.A03;
            if (str5 != null) {
                str2 = str5;
            }
            A00.A03 = str2;
            String str6 = A00.A04;
            if (str6 != null) {
                str3 = str6;
            }
            A00.A04 = str3;
            return null;
        }
        return null;
    }
}
