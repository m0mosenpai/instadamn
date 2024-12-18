package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;

/* renamed from: X.Exg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33878Exg {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        if (c6fq.A03 != null) {
            Object A02 = c6fw.A02();
            AbstractC25225BEi.A1S(A02);
            UserSession A0L = AbstractC31179DnN.A0L(c6fq);
            Context context = C6BQ.A09(c6fq).A00;
            C54892fn c54892fn = new C54892fn(A0L);
            c54892fn.A01.markerPoint(716775037, c54892fn.A02.A00("chain_interstitial_bloks_action", false, false));
            if (((String) A02).equals(String.valueOf(QuickPromotionSurface.A0B.A00))) {
                C54882fm c54882fm = new C54882fm(context, A0L);
                if (C54882fm.A08 == null) {
                    c54882fm.A03();
                    return null;
                }
                c54882fm.A02();
                return null;
            }
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
