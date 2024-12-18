package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class CI8 {
    public static final void A00(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        Serializable serializable;
        C63 c63;
        C14360o3.A0B(userSession, 1);
        Bundle bundle = abstractC59962oe.mArguments;
        if (bundle != null) {
            serializable = bundle.getSerializable(AbstractC43591JPw.A00(18));
        } else {
            serializable = null;
        }
        if ((serializable instanceof C63) && (c63 = (C63) serializable) != null) {
            int ordinal = c63.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    AbstractC25225BEi.A0r(abstractC59962oe.requireActivity(), userSession).A0G(null, 0);
                    return;
                }
                return;
            }
            AbstractC25231BEo.A16(abstractC59962oe);
        }
    }
}
