package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.9xm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225679xm {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        HashMap hashMap;
        if (AbstractC167007dF.A1W(C1VN.A00)) {
            AbstractC12990ll A0B = C6BQ.A0B(c6fq);
            C14360o3.A0C(A0B, AbstractC111324zv.A00(6));
            UserSession userSession = (UserSession) A0B;
            FragmentActivity A04 = C6BQ.A04(c6fq);
            Object A01 = c6fw.A01();
            C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.String");
            String str = (String) A01;
            Object obj = c6fw.A00.get(1);
            if (obj != null) {
                hashMap = VM9.A00((HashMap) obj);
            } else {
                hashMap = null;
            }
            AbstractC31282Dp4.A00().A01(A04, userSession, str, hashMap);
        }
        return null;
    }
}
