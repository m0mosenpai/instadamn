package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Exk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33882Exk {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        HashMap hashMap;
        String str = (String) c6fw.A01();
        List list = c6fw.A00;
        Map map = (Map) list.get(1);
        if (map != null) {
            hashMap = C6BQ.A0H(map);
        } else {
            hashMap = null;
        }
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        AbstractC116275Og.A01 = AbstractC25228BEl.A0t(list, 2);
        AbstractC116275Og.A00 = c6fq;
        C1VN c1vn = C1VN.A00;
        if (c1vn != null) {
            c1vn.A00(A04, A0W, str, hashMap);
            return null;
        }
        AbstractC116275Og.A00();
        return null;
    }
}
