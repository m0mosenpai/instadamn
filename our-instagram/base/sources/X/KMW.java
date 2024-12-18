package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KMW extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C47142Eg A01;
    public final /* synthetic */ DirectThreadKey A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ Map A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMW(UserSession userSession, C47142Eg c47142Eg, DirectThreadKey directThreadKey, String str, List list, Map map, boolean z) {
        super(1155983366, 3, false, false);
        this.A00 = userSession;
        this.A02 = directThreadKey;
        this.A04 = list;
        this.A05 = map;
        this.A01 = c47142Eg;
        this.A03 = str;
        this.A06 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A00;
        C2DS A00 = C2JD.A00(userSession);
        DirectThreadKey directThreadKey = this.A02;
        C81663kb B3U = A00.B3U(directThreadKey);
        if (B3U != null) {
            List list = this.A04;
            Map map = this.A05;
            C47142Eg c47142Eg = this.A01;
            String str = this.A03;
            boolean z = this.A06;
            AbstractC207749He.A00();
            List list2 = (List) JVE.A01(userSession).A09(new C7OH(B3U), null, "bulk_replace_messages", list, null, 0, B3U.C7O().longValue(), C18U.A01(C06090Tz.A05, userSession, 36600336913338232L)).A00;
            list2.size();
            if (AbstractC166987dD.A1b(list2)) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C83403nh A0e = AbstractC43592JPx.A0e(it);
                    A1E.add(A0e);
                    Object obj = (Collection) map.get(A0e.A0g());
                    if (obj == null) {
                        obj = C16930sl.A00;
                    }
                    A1E.addAll(obj);
                }
                AbstractC161587Lt.A01(userSession, c47142Eg, directThreadKey, str, A1E, z, false);
            }
        }
    }
}
