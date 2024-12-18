package X;

import android.widget.Filterable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7E0, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7E0 extends C7E1 implements Filterable {
    public final void A0C(List list, Map map) {
        String str;
        String fullName;
        C14360o3.A0B(list, 0);
        List list2 = ((C159637Dz) this).A0F;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass172 anonymousClass172 = (AnonymousClass172) it.next();
            String str2 = null;
            if (map != null) {
                str = (String) map.get(anonymousClass172.getId());
            } else {
                str = null;
            }
            String fullName2 = anonymousClass172.getFullName();
            String username = anonymousClass172.getUsername();
            anonymousClass172.CQw();
            if (str != null) {
                fullName2 = str;
            } else if (fullName2 == null || fullName2.isEmpty()) {
                fullName2 = username;
            }
            C14360o3.A07(fullName2);
            if (str != null && str.length() != 0) {
                fullName = anonymousClass172.getUsername();
            } else {
                fullName = anonymousClass172.getFullName();
                String username2 = anonymousClass172.getUsername();
                int BJ8 = anonymousClass172.BJ8();
                boolean CQw = anonymousClass172.CQw();
                boolean CPk = anonymousClass172.CPk();
                if (BJ8 != 0) {
                    fullName = null;
                } else if (AbstractC101904i3.A09(fullName, CQw, CPk) && !username2.equals(fullName)) {
                    fullName = username2;
                }
            }
            Long BTC = anonymousClass172.BTC();
            if (BTC != null) {
                str2 = BTC.toString();
            }
            list2.add(new C1575075i(anonymousClass172.Bhu(), fullName2, fullName, str, str2, anonymousClass172.getId(), anonymousClass172.getUsername(), anonymousClass172.BJ8(), anonymousClass172.isVerified()));
        }
    }
}
