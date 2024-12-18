package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* loaded from: classes6.dex */
public abstract class F06 {
    public static final Boolean A00(C6FQ c6fq, C6FW c6fw) {
        boolean z = false;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        Reel A0M = C1OU.A04(A0W).A0M(A0d);
        if (A0M != null && A0M.A16(A0W)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
