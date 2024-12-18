package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Ewi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33818Ewi {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0d = AbstractC31177DnL.A0d(c6fw);
        boolean A01 = C6DZ.A01(c6fw.A03(1));
        UserSession A012 = AbstractC03270Dk.A01(C6BQ.A0B(c6fq));
        if (A012 != null) {
            AbstractC166997dE.A0Y(A012).A03.EVc(true);
            ArrayList A1E = AbstractC166987dD.A1E();
            if (A01) {
                AbstractC25651Mw.A00(A012).E4s(new C1563870i(A0d, AbstractC31172DnG.A19(A1E)));
                return null;
            }
            return null;
        }
        return null;
    }
}
