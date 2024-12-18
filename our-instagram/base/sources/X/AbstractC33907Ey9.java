package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ey9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33907Ey9 {
    public static final Boolean A00(C6FQ c6fq, C6FW c6fw) {
        Context context;
        boolean z = false;
        String A0i = AbstractC31180DnO.A0i(c6fw, 0);
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            context = c6fg.A00;
        } else {
            context = null;
        }
        if (A0i == null) {
            A0i = "";
        }
        EnumC47122Ee A03 = C92I.A03(context, A0S, A0i);
        if (context != null) {
            C14360o3.A0B(A03, 1);
            Boolean A00 = AbstractC47112Ed.A00(context, A03, false);
            if (A03 == EnumC47122Ee.A0c || A00 == null || A00.booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }
}
