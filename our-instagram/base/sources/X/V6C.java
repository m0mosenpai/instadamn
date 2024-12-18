package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V6C extends AbstractRunnableC14200nk {
    public final /* synthetic */ C70780Wgt A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6C(C70780Wgt c70780Wgt) {
        super(804, 3, false, false);
        this.A00 = c70780Wgt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C69622VsP A00;
        long j;
        VD9 vd9;
        C70780Wgt c70780Wgt = this.A00;
        C11T.A05("This operation can't be run on UI thread.");
        W93 w93 = c70780Wgt.A01;
        C1UM c1um = w93.A04;
        HashMap Aax = c1um.Aax();
        LinkedHashSet<C69622VsP> linkedHashSet = new LinkedHashSet();
        Iterator A14 = AbstractC166997dE.A14(Aax);
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) A14.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                C69622VsP A002 = W93.A00((String) value);
                if (A002 != null) {
                    linkedHashSet.add(A002);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("found invalid value: ");
                sb.append(str);
                C0w9.A03("IgVideoCacheStore", AbstractC167017dG.A0n(value, " : ", sb));
            }
            C1ZT AR9 = c1um.AR9();
            AR9.A06(str);
            AR9.A03();
        }
        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet();
        long currentTimeMillis = System.currentTimeMillis();
        for (C69622VsP c69622VsP : linkedHashSet) {
            long j2 = c69622VsP.A00;
            if (1 > j2 || j2 >= currentTimeMillis) {
                long j3 = c69622VsP.A01;
                String str2 = c69622VsP.A02;
                boolean z = c69622VsP.A04;
                boolean z2 = c69622VsP.A05;
                if (z) {
                    j = c70780Wgt.A00;
                } else {
                    if (!z2) {
                        if (str2.equals(AbstractC111324zv.A00(413))) {
                            vd9 = VD9.A06;
                        } else if (AbstractC002300n.A0h(str2, "reel", false)) {
                            vd9 = VD9.A08;
                        } else if (AbstractC002300n.A0h(str2, "clips", false)) {
                            vd9 = VD9.A02;
                        } else if (str2.equals("explore_popular")) {
                            vd9 = VD9.A04;
                        } else if (!AbstractC002300n.A0h(str2, "feed_contextual", false) && !AbstractC002300n.A0h(str2, "explore_video_chaining", false) && !AbstractC002300n.A0h(str2, "explore_event_viewer", false)) {
                            if (AbstractC001900j.A0a(str2, "igtv", false)) {
                                vd9 = VD9.A05;
                            } else {
                                vd9 = VD9.A07;
                            }
                        } else {
                            vd9 = VD9.A03;
                        }
                        Number number = (Number) c70780Wgt.A03.get(vd9);
                        if (number != null) {
                            j = number.longValue();
                        }
                    }
                    j = C70780Wgt.A05;
                }
                if (currentTimeMillis - j3 >= j) {
                }
            }
            linkedHashSet2.add(c69622VsP.A03);
        }
        if (!linkedHashSet2.isEmpty()) {
            C41711wL c41711wL = c70780Wgt.A02;
            List A0a = AbstractC001800i.A0a(linkedHashSet2);
            C2BZ c2bz = c41711wL.A00.A06;
            if (c2bz != null) {
                c2bz.A06(A0a);
            }
            for (String str3 : linkedHashSet2) {
                C1ZT AR92 = c1um.AR9();
                AR92.A06(str3);
                AR92.A03();
            }
        }
        C11T.A05("This operation can't be run on UI thread.");
        int size = c1um.getSize();
        int i = w93.A03;
        if (size > i) {
            HashMap Aax2 = c1um.Aax();
            ArrayList arrayList = new ArrayList();
            Iterator A142 = AbstractC166997dE.A14(Aax2);
            while (A142.hasNext()) {
                Map.Entry entry2 = (Map.Entry) A142.next();
                String str4 = (String) entry2.getKey();
                Object value2 = entry2.getValue();
                if ((value2 instanceof String) && (A00 = W93.A00((String) value2)) != null) {
                    arrayList.add(A00);
                } else {
                    C1ZT AR93 = c1um.AR9();
                    AR93.A06(str4);
                    AR93.A03();
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (C14360o3.A0K(((C69622VsP) next).A02, AbstractC111324zv.A00(2275))) {
                    arrayList2.add(next);
                } else {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (C14360o3.A0K(((C69622VsP) next2).A02, AbstractC111324zv.A00(513))) {
                    arrayList4.add(next2);
                } else {
                    arrayList5.add(next2);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                Object next3 = it3.next();
                if (((C69622VsP) next3).A04) {
                    arrayList6.add(next3);
                } else {
                    arrayList7.add(next3);
                }
            }
            C1ZT AR94 = c1um.AR9();
            C14360o3.A0A(AR94);
            double d = i;
            double d2 = w93.A02;
            W93.A01(AR94, arrayList4, (int) (d * d2));
            double d3 = w93.A00;
            W93.A01(AR94, arrayList2, (int) (d * d3));
            double d4 = w93.A01;
            W93.A01(AR94, arrayList6, (int) (d * d4));
            W93.A01(AR94, arrayList7, (int) (d * (((1.0d - d3) - d4) - d2)));
            AR94.A03();
        }
    }
}
