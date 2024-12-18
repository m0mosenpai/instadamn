package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3YO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YO implements InterfaceC13000lm {
    public final Map A00 = new LinkedHashMap();

    public final Integer A01(InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC11380iw, 0);
        C3YQ A00 = A00(interfaceC11380iw);
        if (A00 != null) {
            return A00.A01;
        }
        return null;
    }

    public final Integer A02(InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC11380iw, 0);
        C3YQ A00 = A00(interfaceC11380iw);
        if (A00 != null) {
            return A00.A02;
        }
        return null;
    }

    public final List A03(InterfaceC11380iw interfaceC11380iw) {
        C3YQ c3yq;
        C14360o3.A0B(interfaceC11380iw, 0);
        C3YP A00 = C5SH.A00(interfaceC11380iw);
        if (A00 != null && (c3yq = (C3YQ) this.A00.get(A00)) != null) {
            List list = c3yq.A04;
            return AbstractC001800i.A0a(list.subList(c3yq.A00, list.size()));
        }
        return C16930sl.A00;
    }

    public final List A04(InterfaceC11380iw interfaceC11380iw, List list) {
        List list2;
        C14360o3.A0B(interfaceC11380iw, 0);
        C3YP A00 = C5SH.A00(interfaceC11380iw);
        if (A00 == null) {
            if (list == null) {
                return C16930sl.A00;
            }
            return list;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        if (list != null) {
            builder.addAll(list);
        }
        C3YQ c3yq = (C3YQ) this.A00.get(A00);
        if (c3yq != null) {
            List list3 = c3yq.A04;
            list2 = AbstractC001800i.A0a(list3.subList(c3yq.A00, list3.size()));
        } else {
            list2 = C16930sl.A00;
        }
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC28059CYn.A00(((C25615BUc) it.next()).A04));
        }
        builder.addAll(arrayList);
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }

    public final void A07(C25615BUc c25615BUc) {
        C3YP c3yp = c25615BUc.A00;
        Map map = this.A00;
        C3YQ c3yq = (C3YQ) map.get(c3yp);
        if (c3yq == null) {
            c3yq = new C3YQ(c3yp);
            map.put(c3yp, c3yq);
        }
        List list = c3yq.A04;
        String str = c3yq.A03;
        Integer num = c25615BUc.A04;
        Integer num2 = c25615BUc.A03;
        String str2 = c25615BUc.A06;
        Integer num3 = c25615BUc.A01;
        Integer num4 = c25615BUc.A05;
        Integer num5 = c25615BUc.A02;
        C14360o3.A0B(c3yp, 0);
        C14360o3.A0B(num, 1);
        list.add(new C25615BUc(c3yp, num, num2, num3, num4, num5, str, str2));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }

    private final C3YQ A00(InterfaceC11380iw interfaceC11380iw) {
        C3YP A00 = C5SH.A00(interfaceC11380iw);
        if (A00 == null) {
            return null;
        }
        Map map = this.A00;
        C3YQ c3yq = (C3YQ) map.get(A00);
        if (c3yq != null) {
            return c3yq;
        }
        C3YQ c3yq2 = new C3YQ(A00);
        map.put(A00, c3yq2);
        return c3yq2;
    }

    public final void A05(InterfaceC11380iw interfaceC11380iw, Integer num) {
        C3YQ A00 = A00(interfaceC11380iw);
        if (A00 != null) {
            A00.A01 = num;
        }
    }

    public final void A06(InterfaceC11380iw interfaceC11380iw, Integer num) {
        C3YQ A00 = A00(interfaceC11380iw);
        if (A00 != null) {
            A00.A02 = num;
        }
    }
}
