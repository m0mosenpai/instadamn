package X;

import android.content.res.Resources;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4LL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4LL {
    public final C25671My A00;
    public final UserSession A01;
    public final C2DS A02;
    public final C4LM A03 = C4LM.A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.570, java.lang.Object] */
    public static void A00(C4LL c4ll, String str, Map map) {
        if ("inactive".equals(str)) {
            Resources resources = AbstractC12290kX.A00.getResources();
            String string = resources.getString(2131959717);
            String string2 = resources.getString(2131959716);
            ?? obj = new Object();
            obj.A03 = string;
            obj.A01 = string2;
            obj.A04 = false;
            for (Map.Entry entry : map.entrySet()) {
                java.util.Set set = (java.util.Set) entry.getValue();
                DirectThreadKey directThreadKey = (DirectThreadKey) entry.getKey();
                if (!set.isEmpty()) {
                    C2DS c2ds = c4ll.A02;
                    ArrayList arrayList = new ArrayList(set);
                    C2EY c2ey = C2EY.A1O;
                    C2DU c2du = (C2DU) c2ds;
                    synchronized (c2du) {
                        C14360o3.A0B(directThreadKey, 0);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C83403nh) it.next()).A18(c2ey, obj);
                        }
                        c2du.A06.E4s(new C2Io(directThreadKey, C05F.A0N, null, null, arrayList, false));
                        C2DU.A0F(c2du, c2du.A0P(directThreadKey));
                    }
                    c2ds.ELu(directThreadKey);
                } else {
                    c4ll.A00.E4s(new C2Io(directThreadKey, C05F.A0j, null, null, null, false));
                }
            }
            return;
        }
        if (AppStateModule.APP_STATE_ACTIVE.equals(str)) {
            for (Map.Entry entry2 : map.entrySet()) {
                DirectThreadKey directThreadKey2 = (DirectThreadKey) entry2.getKey();
                String str2 = directThreadKey2.A00;
                if (str2 != null) {
                    java.util.Set set2 = (java.util.Set) entry2.getValue();
                    if (!set2.isEmpty()) {
                        AbstractC162277Op.A01(c4ll.A01, str2, set2);
                    }
                    c4ll.A00.E4s(new C2Io(directThreadKey2, C05F.A0j, null, null, null, false));
                }
            }
        }
    }

    public C4LL(UserSession userSession) {
        this.A01 = userSession;
        this.A02 = AbstractC28761aE.A00(userSession);
        this.A00 = AbstractC25651Mw.A00(userSession);
    }
}
