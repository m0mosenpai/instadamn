package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.model.keyword.Keyword;
import com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IS3 {
    public static final Keyword A00(AbstractC127945qN abstractC127945qN) {
        Object obj;
        C132835z6 c132835z6;
        C130505uv c130505uv = abstractC127945qN.A03;
        if (c130505uv != null) {
            obj = c130505uv.A0F;
            C14360o3.A0A(obj);
        } else {
            obj = null;
        }
        if (!(obj instanceof C132835z6) || (c132835z6 = (C132835z6) obj) == null) {
            return null;
        }
        return c132835z6.A00();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Vi0, java.lang.Object] */
    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, C37330GcY c37330GcY, AnonymousClass309 anonymousClass309, C38321qM c38321qM, Keyword keyword, String str, String str2, String str3, String str4, List list, boolean z) {
        ArrayList A1F;
        AbstractC167007dF.A1F(userSession, 1, c38321qM);
        if (c37330GcY != null) {
            c37330GcY.A02(anonymousClass309.E6P());
        }
        Bundle A0b = AbstractC166987dD.A0b();
        ?? obj = new Object();
        obj.A00 = str3;
        A0b.putParcelable(AbstractC111324zv.A00(2189), new KeywordSerpContextualFeedConfig(new SectionPagination(obj), keyword, str2, str4, str));
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        C31569Dtv c31569Dtv = new C31569Dtv("feed_contextual_keyword");
        c31569Dtv.A06 = AbstractC111324zv.A00(3660);
        if (list instanceof ArrayList) {
            A1F = (ArrayList) list;
        } else {
            A1F = AbstractC166987dD.A1F(list);
        }
        c31569Dtv.A0A(A1F);
        c31569Dtv.A0F = !z;
        c31569Dtv.A08 = c38321qM.getId();
        c31569Dtv.A01 = A0b;
        c31569Dtv.A07 = keyword.A04;
        c31569Dtv.A0A = str;
        if (c37330GcY != null) {
            c31569Dtv.A09(c37330GcY);
        }
        AbstractC25229BEm.A18(c31569Dtv.A08(), A0r);
    }
}
