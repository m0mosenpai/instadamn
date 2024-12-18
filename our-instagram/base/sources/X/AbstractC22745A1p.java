package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.A1p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22745A1p {
    public static final C194808jg A00(Context context, UserSession userSession, C217859kI c217859kI, String str) {
        ArrayList A12 = AbstractC166997dE.A12(c217859kI, 3);
        if (c217859kI.A00.A01 != null) {
            A12.add(new C220949pI(context, c217859kI, str, "group_mention_sticker_bundle_id"));
        }
        C217859kI A01 = c217859kI.A01();
        A01.A03(null);
        Integer num = A01.A01;
        do {
            A12.add(new C220949pI(context, A01, str, "group_mention_sticker_bundle_id"));
            A01 = A01.A01();
            A01.A02(AEI.A01(A01.A01));
        } while (A01.A01 != num);
        C194808jg c194808jg = new C194808jg(context, userSession, A12);
        c194808jg.A03 = c217859kI;
        ACE ace = c194808jg.A01;
        if (ace instanceof C217709k3) {
            ((C217709k3) ace).A00 = true;
        } else if (ace instanceof C9PD) {
            ((C9PD) ace).A00 = true;
            return c194808jg;
        }
        return c194808jg;
    }
}
