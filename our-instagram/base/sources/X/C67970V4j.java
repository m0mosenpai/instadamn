package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.V4j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67970V4j extends AbstractC60592pi {
    public int A00;
    public long A01;
    public long A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final boolean A08;
    public final List A09;

    public C67970V4j(UserSession userSession, InterfaceC60442pS interfaceC60442pS, boolean z) {
        C14360o3.A0B(userSession, 3);
        this.A04 = interfaceC60442pS;
        this.A08 = z;
        this.A03 = userSession;
        this.A05 = new HashMap();
        this.A09 = new ArrayList();
        this.A06 = new HashMap();
        this.A07 = new HashMap();
    }

    public final void A02(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A05;
        if (map.containsKey(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            Map map2 = this.A06;
            int A0K = AbstractC167017dG.A0K((Number) map2.get(str));
            Object obj = map.get(str);
            if (obj != null) {
                int max = A0K + ((int) Math.max(0L, currentTimeMillis - ((C68728Vb7) obj).A00));
                map.remove(str);
                AbstractC37301Gc2.A1T(str, map2, max);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A00(C67970V4j c67970V4j) {
        long currentTimeMillis = System.currentTimeMillis();
        c67970V4j.A01 += currentTimeMillis - c67970V4j.A02;
        c67970V4j.A02 = currentTimeMillis;
        ArrayList arrayList = new ArrayList(c67970V4j.A05.keySet());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c67970V4j.A02((String) it.next());
        }
        c67970V4j.A09.addAll(arrayList);
    }

    public final void A01() {
        long currentTimeMillis = System.currentTimeMillis();
        this.A02 = currentTimeMillis;
        List<String> list = this.A09;
        for (String str : list) {
            this.A05.put(str, new C68728Vb7(str, currentTimeMillis));
        }
        list.clear();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        A00(this);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        A01();
    }
}
