package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.VQp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68433VQp {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserSession userSession;
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        boolean A01 = C6DZ.A01(c6fw.A02());
        if (MSY.A1X(c6fw.A00())) {
            FragmentActivity A04 = C6BQ.A04(c6fq);
            A04.getSharedPreferences(AnonymousClass001.A0R(A04.getPackageName(), "_preferences"), 0).edit().putBoolean(A0e, A01).apply();
            return null;
        }
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && (userSession = (UserSession) A0B) != null) {
            AbstractC31177DnL.A1N(C1AT.A01(userSession).A03(C1AV.A3X), A0e, A01);
            return null;
        }
        throw new IllegalArgumentException(AbstractC111324zv.A00(25));
    }
}
