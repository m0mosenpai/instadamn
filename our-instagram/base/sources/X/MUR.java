package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MUR implements InterfaceC13000lm {
    public long A00;
    public List A01;
    public Map A02;
    public C5Hc A03;
    public boolean A04;
    public final C50581MUp A05;

    public MUR(C50581MUp c50581MUp) {
        C14360o3.A0B(c50581MUp, 2);
        this.A05 = c50581MUp;
        this.A01 = C16930sl.A00;
        this.A03 = C5HZ.A01;
        this.A00 = System.currentTimeMillis();
        this.A02 = AbstractC166987dD.A1I();
    }

    public final List A02() {
        List list = this.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) ((C51757Mtg) it.next()).A00;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str = ((BJF) it2.next()).A01;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            AnonymousClass016.A16(arrayList, A1E);
        }
        return A1E;
    }

    public final List A03() {
        Map map = this.A02;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            List list = (List) ((Map.Entry) A15.next()).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((BJF) it.next()).A01;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            AnonymousClass016.A16(arrayList, A1E);
        }
        return A1E;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.clear();
    }

    public final String A00() {
        List A03 = A03();
        if (A03.isEmpty()) {
            return null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A03) {
            if (((String) obj).length() > 0) {
                A1E.add(obj);
            }
        }
        return AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1E, null);
    }

    public final List A01() {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        for (C51757Mtg c51757Mtg : this.A01) {
            for (BJF bjf : (List) c51757Mtg.A00) {
                if (bjf.A03) {
                    Object obj = A1I.get(c51757Mtg);
                    if (obj == null) {
                        obj = new ArrayList();
                        A1I.put(c51757Mtg, obj);
                    }
                    ((List) obj).add(bjf);
                }
            }
        }
        Collection<List> values = A1I.values();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (List list : values) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((BJF) it.next()).A01;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            AnonymousClass016.A16(arrayList, A1E);
        }
        return A1E;
    }
}
