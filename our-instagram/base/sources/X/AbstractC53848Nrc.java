package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Nrc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53848Nrc {
    public static final String A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        Reel A0R = MSY.A0R(A0W, A0d);
        if (A0R != null) {
            synchronized (A0R.A1n) {
                C41181vS A09 = A0R.A09(A0W);
                if (A09 != null) {
                    str = A09.A0j;
                } else {
                    str = null;
                }
            }
            return str;
        }
        return null;
    }
}
