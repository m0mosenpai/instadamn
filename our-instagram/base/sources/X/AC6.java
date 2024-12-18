package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class AC6 {
    public final C23031Ai A00;
    public final ConcurrentHashMap A01;

    public AC6(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC23021Ah.A00(userSession);
        this.A01 = new ConcurrentHashMap();
        List A0m = AbstractC167007dF.A0m(this.A00.A01.C2s("feed_refresh_instructions"), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        ArrayList A0q = AbstractC167017dG.A0q(A0m);
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            List A0m2 = AbstractC167007dF.A0m(AbstractC166987dD.A1B(it), ":", 0);
            if (A0m2.size() == 2) {
                AbstractC166997dE.A1U(A0m2.get(0), this.A01, AbstractC167007dF.A0C(A0m2, 1));
            }
            A0q.add(C0eB.A00);
        }
    }

    public final void A01(Map map) {
        ConcurrentHashMap concurrentHashMap = this.A01;
        java.util.Set keySet = concurrentHashMap.keySet();
        C14360o3.A07(keySet);
        java.util.Set A02 = AnonymousClass090.A02(map.keySet(), keySet);
        ArrayList arrayList = new ArrayList(map.size());
        Iterator A15 = AbstractC166997dE.A15(map);
        boolean z = false;
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            int A0H = AbstractC166987dD.A0H(A1K.getValue());
            Number number = (Number) concurrentHashMap.put(key, Integer.valueOf(A0H));
            if (number == null || number.intValue() != A0H) {
                z = true;
            }
            arrayList.add(C0eB.A00);
        }
        if (!A02.isEmpty()) {
            ArrayList A0q = AbstractC167017dG.A0q(A02);
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                A0q.add(concurrentHashMap.remove(it.next()));
            }
        } else if (!z) {
            return;
        }
        C23031Ai c23031Ai = this.A00;
        ArrayList arrayList2 = new ArrayList(concurrentHashMap.size());
        Iterator A14 = AbstractC166997dE.A14(concurrentHashMap);
        while (A14.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A14);
            arrayList2.add(AnonymousClass001.A0G((String) A1K2.getKey(), ':', AbstractC166987dD.A0H(A1K2.getValue())));
        }
        String A0P = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", arrayList2, null);
        InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.EEj("feed_refresh_instructions");
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7K("feed_refresh_instructions", A0P);
        ARD2.apply();
    }

    public final Integer A00(C1EN c1en, boolean z) {
        String str;
        String str2;
        int ordinal = c1en.ordinal();
        if (ordinal != 2) {
            if (ordinal != 15) {
                return null;
            }
            str = "auto_refresh_timer_in_s";
        } else {
            str = "warm_start_refresh_timer_in_s";
        }
        ConcurrentHashMap concurrentHashMap = this.A01;
        if (z) {
            str2 = "on_peak_";
        } else {
            str2 = "";
        }
        return (Integer) concurrentHashMap.get(AnonymousClass001.A0R(str2, str));
    }
}
