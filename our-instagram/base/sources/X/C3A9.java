package X;

import android.view.View;
import android.widget.Adapter;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3A9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3A9 {
    public final Map A00;
    public final Map A01;
    public final Map A02;
    public final java.util.Set A03;
    public final C3A6 A04;
    public final C3A8 A05;
    public final C3AB A06;
    public final C3AB A07;

    public static C36Z A00(C3A9 c3a9, Object obj) {
        return (C36Z) c3a9.A00.get(c3a9.A04.CAN(obj));
    }

    public final void A01() {
        C3A8 c3a8 = this.A05;
        c3a8.FDq(this.A07, this);
        Map map = this.A01;
        if (!map.isEmpty()) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    C36Z A00 = A00(this, next);
                    if (A00 != null) {
                        A00.CtG(next);
                    }
                    it.remove();
                }
            }
        }
        Map map2 = this.A02;
        if (!map2.isEmpty()) {
            Iterator it2 = map2.values().iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (next2 != null) {
                    C36Z A002 = A00(this, next2);
                    if (A002 != null) {
                        A002.CtH(next2);
                    }
                    it2.remove();
                }
            }
        }
        c3a8.FDq(this.A06, this);
    }

    public final void A02(C3AB c3ab, int i) {
        String obj;
        Object CAM = this.A04.CAM(i);
        if (CAM != null) {
            C36Z A00 = A00(this, CAM);
            if (A00 != null) {
                A00.FDm(c3ab, i);
                return;
            }
            if (CAM instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) CAM;
                AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
                C2UU c2uu = recyclerView.A0A;
                c2uu.getClass();
                String name = c2uu.getClass().getName();
                abstractC70663Fe.getClass();
                obj = AnonymousClass001.A0g(name, "/", abstractC70663Fe.getClass().getName());
            } else if (!(CAM instanceof ListView)) {
                return;
            } else {
                obj = CAM.getClass().toString();
            }
            if (obj == null) {
                return;
            }
            java.util.Set set = this.A03;
            if (set.contains(obj)) {
                return;
            }
            set.add(obj);
            C0w9.A03("Missing VisibleItemTracker", AnonymousClass001.A0R("Please ensure all the items are being tracked with VisibleItemTracker from ", obj));
        }
    }

    public C3A9(C3A6 c3a6, C3A8 c3a8, List list) {
        this.A07 = new C3AB() { // from class: X.3AA
            @Override // X.C3AB
            public final void FDp(View view, Object obj, String str, double d) {
            }

            @Override // X.C3AB
            public final void FDn(String str, Object obj, int i) {
                C36Z A00;
                C3A9 c3a9 = C3A9.this;
                Map map = c3a9.A01;
                boolean z = !map.containsKey(str);
                map.put(str, null);
                if (z && (A00 = C3A9.A00(c3a9, obj)) != null) {
                    A00.CtI(obj, i);
                }
            }

            @Override // X.C3AB
            public final void FDo(String str, Object obj, int i) {
                C36Z A00;
                C3A9 c3a9 = C3A9.this;
                Map map = c3a9.A02;
                boolean z = !map.containsKey(str);
                map.put(str, null);
                if (z && (A00 = C3A9.A00(c3a9, obj)) != null) {
                    A00.CtJ(obj, i);
                }
            }
        };
        this.A06 = new C3AB() { // from class: X.3AC
            @Override // X.C3AB
            public final void FDn(String str, Object obj, int i) {
                C3A9.this.A01.put(str, obj);
            }

            @Override // X.C3AB
            public final void FDo(String str, Object obj, int i) {
                C3A9.this.A02.put(str, obj);
            }

            @Override // X.C3AB
            public final void FDp(View view, Object obj, String str, double d) {
                C36Z A00 = C3A9.A00(C3A9.this, obj);
                if (A00 != null) {
                    A00.CtL(view, obj, d);
                }
            }
        };
        this.A02 = new HashMap();
        this.A01 = new HashMap();
        this.A03 = new HashSet();
        this.A00 = new HashMap();
        this.A04 = c3a6;
        this.A05 = c3a8;
        for (int i = 0; i < list.size(); i++) {
            C36Z c36z = (C36Z) list.get(i);
            Class CAO = c36z.CAO();
            C18C.A0G(!this.A00.containsKey(CAO), "VisibleItemTracker cannot register two Tracked with the same class");
            this.A00.put(CAO, c36z);
        }
    }

    public C3A9(Adapter adapter, InterfaceC60682pr interfaceC60682pr, C36Z... c36zArr) {
        this(new C3A5(adapter), new C3A7(interfaceC60682pr), Arrays.asList(c36zArr));
    }

    public C3A9(RecyclerView recyclerView, C3A6 c3a6, C36Z... c36zArr) {
        this(c3a6, new C65926TwX(recyclerView), Arrays.asList(c36zArr));
    }
}
