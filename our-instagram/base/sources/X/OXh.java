package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.session.FoaUserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class OXh {
    public static final void A00(InterfaceC02550Ad interfaceC02550Ad, String str, String str2, String str3, List list, Map map, boolean z) {
        InterfaceC02590Ai A0H;
        int i;
        C14360o3.A0B(list, 2);
        if (z) {
            A0H = MSY.A0H(interfaceC02550Ad, "rp_client_reliability_critical_event");
            i = 375;
        } else {
            A0H = MSY.A0H(interfaceC02550Ad, "rp_client_reliability_normal_event");
            i = 376;
        }
        C25531Mh A0A = AbstractC31171DnF.A0A(A0H, i);
        if (AbstractC25226BEj.A1Z(A0A)) {
            A0A.A0k(str);
            A0A.A0S("tags", list);
            if (map != null) {
                ((AbstractC02600Aj) A0A).A00.A9M("event_data", map);
            }
            if (str2 != null) {
                A0A.A0R("local_call_id", str2);
            }
            if (str3 != null) {
                A0A.A0R("shared_call_id", str3);
            }
            A0A.Cht();
        }
    }

    public static final void A02(FoaUserSession foaUserSession, String str, String str2, String str3, List list, Map map, boolean z) {
        List A0a;
        UserSession A00;
        AbstractC167017dG.A1N(str, list);
        OXE oxe = OXE.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Reliability event:\n");
        A1C.append(str);
        A1C.append("\nlocalCallId=");
        A1C.append(str2);
        A1C.append("\nsharedCallId=");
        A1C.append(str3);
        oxe.A00("RpAnalyticsLog", AbstractC167017dG.A0n(map, "\neventData=", A1C));
        O6W o6w = O6W.A01;
        if (o6w == null) {
            o6w = new O6W();
            O6W.A01 = o6w;
        }
        List list2 = o6w.A00;
        synchronized (list2) {
            A0a = AbstractC001800i.A0a(list2);
        }
        Iterator it = A0a.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onReliabilityEvent");
        }
        if (foaUserSession != null && (A00 = AbstractC28057CYl.A00(foaUserSession)) != null) {
            A00(AbstractC12220kQ.A02(A00), str, str2, str3, list, map, z);
        }
    }

    public static final void A01(EnumC53332NiC enumC53332NiC, FoaUserSession foaUserSession, String str, String str2, Map map) {
        A02(foaUserSession, enumC53332NiC.A00, str, str2, enumC53332NiC.A01, map, true);
    }
}
