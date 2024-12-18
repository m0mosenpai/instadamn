package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Exj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33881Exj {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        HashMap hashMap;
        C1VN c1vn = C1VN.A00;
        if (AbstractC167007dF.A1W(c1vn) && c1vn != null) {
            UserSession A0W = AbstractC31172DnG.A0W(c6fq);
            FragmentActivity A04 = C6BQ.A04(c6fq);
            String str = (String) c6fw.A01();
            List list = c6fw.A00;
            if (list.get(1) != null) {
                hashMap = C6BQ.A0H((HashMap) list.get(1));
            } else {
                hashMap = null;
            }
            C1VN.A00.A00(A04, A0W, str, hashMap);
        }
        return null;
    }
}
