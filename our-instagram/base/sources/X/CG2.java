package X;

import android.content.res.Resources;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class CG2 {
    public static final C51722Yv A00(Resources resources, C167297di c167297di, C166047bW c166047bW, C25814BbV c25814BbV, UserSession userSession, C131325wL c131325wL, boolean z) {
        int i;
        String string;
        AbstractC167007dF.A1E(userSession, 0, c25814BbV);
        C14360o3.A0B(c131325wL, 4);
        Integer num = c167297di.A0G;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(C05F.A1F, new DI9(2, c166047bW, c25814BbV, c167297di, userSession, c131325wL, z), 4));
        boolean A1O = AbstractC167007dF.A1O(i);
        C50369MLw c50369MLw = new C50369MLw(42, c25814BbV, c167297di);
        Integer num2 = C05F.A03;
        if (!A1O) {
            c50369MLw = null;
        }
        C51722Yv A00 = C9CV.A00(A0h, num2, c50369MLw, 4);
        boolean z2 = c167297di.A0S;
        if (i > 0) {
            int i2 = 2131975221;
            if (z2) {
                i2 = 2131975225;
            }
            string = AbstractC166997dE.A0r(resources, Integer.valueOf(AbstractC167017dG.A0K(num)), i2);
        } else {
            int i3 = 2131975220;
            if (z2) {
                i3 = 2131975224;
            }
            string = resources.getString(i3);
        }
        if (string != null) {
            return C9CV.A00(A00, C05F.A0N, string, 0);
        }
        return A00;
    }
}
