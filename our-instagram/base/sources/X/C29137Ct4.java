package X;

import com.instagram.api.schemas.Achievement;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ct4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29137Ct4 implements InterfaceC11380iw {
    public static final C29137Ct4 A00 = new Object();
    public static final String __redex_internal_original_name = "AchievementsLoggingUtil";

    public static final List A00(List list) {
        EnumC72423XdT enumC72423XdT;
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((Achievement) it.next()).A03.A00;
            C14360o3.A0B(str, 0);
            EnumC72423XdT[] values = EnumC72423XdT.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    enumC72423XdT = values[i];
                    if (!str.equals(enumC72423XdT.A00)) {
                        i++;
                    }
                } else {
                    enumC72423XdT = null;
                    break;
                }
            }
            A0q.add(enumC72423XdT);
        }
        return A0q;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "creator_logging_util";
    }

    public final void A01(UserSession userSession) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, userSession), "instagram_clips_toast_tap");
        if (A0f.isSampled()) {
            A0f.A8R(BQL.A0T, "action");
            AbstractC25225BEi.A1M(EnumC120795dP.A0r, A0f);
            AbstractC25225BEi.A1O(A0f, "creator_logging_util");
            A0f.AAP("media_compound_key", "");
            A0f.A9K("media_index", AbstractC167007dF.A0d());
            AbstractC25225BEi.A1P(A0f, "");
            A0f.Cht();
        }
    }
}
