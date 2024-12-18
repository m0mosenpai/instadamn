package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.VQr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68435VQr {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        List list = c6fw.A00;
        if (list.size() == 0) {
            str = "";
        } else {
            str = (String) AbstractC166987dD.A16(list);
        }
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        Fragment A00 = C6BQ.A00(C6BQ.A09(c6fq));
        FragmentActivity A04 = C6BQ.A04(c6fq);
        FragmentActivity A042 = C6BQ.A04(c6fq);
        C71166Wp1 c71166Wp1 = new C71166Wp1(new C19270xB("quiet_mode"), userSession, str);
        C57312k6 A0S = AbstractC25235BEs.A0S(A00);
        AbstractC23641Du.A05(AnonymousClass191.A00, new MCJ(c71166Wp1, userSession, null, 35), A0S);
        if (str == null) {
            str = "unknown";
        }
        AbstractC34914Fa0.A00(A04, A042, userSession, str);
        return null;
    }
}
