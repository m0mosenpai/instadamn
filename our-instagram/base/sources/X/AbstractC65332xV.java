package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2xV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC65332xV implements InterfaceC65342xW {
    public C2u2 A00;
    public List A01;
    public final java.util.Set A05;
    public final Map A04 = new HashMap();
    public final LinkedList A02 = new LinkedList();
    public final Map A03 = new HashMap();

    public abstract String A03(Object obj);

    public void A05() {
    }

    public final void A08(InterfaceC65952yX interfaceC65952yX) {
        C14360o3.A0B(interfaceC65952yX, 0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.A02.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC65952yX.EjD(next)) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            A0D(it2.next());
        }
        this.A01 = Collections.unmodifiableList(arrayList2);
        A00(this);
    }

    public void A09(Object obj) {
    }

    public final void A0A(Object obj) {
        A01(this, obj, this.A02.size(), true);
    }

    public final void A0B(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A01(this, it.next(), this.A02.size(), true);
        }
    }

    public static final void A00(AbstractC65332xV abstractC65332xV) {
        Map map = abstractC65332xV.A03;
        map.clear();
        int size = abstractC65332xV.A01.size();
        for (int i = 0; i < size; i++) {
            map.put(abstractC65332xV.A03(abstractC65332xV.A01.get(i)), Integer.valueOf(i));
        }
    }

    public int A02() {
        return this.A01.size();
    }

    public void A04() {
        this.A04.clear();
        this.A02.clear();
        this.A01 = Collections.unmodifiableList(new ArrayList());
        this.A03.clear();
        A05();
        for (InterfaceC61752rc interfaceC61752rc : this.A05) {
            if (interfaceC61752rc != null) {
                interfaceC61752rc.DNz();
            }
        }
    }

    public final void A06() {
        this.A01 = Collections.unmodifiableList(new ArrayList(this.A02));
        A00(this);
    }

    public final void A07(int i) {
        java.util.Set<InterfaceC61752rc> set = this.A05;
        if (!set.isEmpty()) {
            LinkedList linkedList = this.A02;
            int size = linkedList.size();
            while (i < size) {
                Object obj = linkedList.get(i);
                if (obj != null) {
                    for (InterfaceC61752rc interfaceC61752rc : set) {
                        if (interfaceC61752rc != null) {
                            interfaceC61752rc.DNG(obj, i);
                        }
                    }
                }
                i++;
            }
        }
    }

    public final boolean A0D(Object obj) {
        boolean remove = this.A02.remove(obj);
        this.A04.remove(A03(obj));
        if (remove && (this instanceof C65322xU)) {
            C65322xU c65322xU = (C65322xU) this;
            InterfaceC38381qS interfaceC38381qS = ((C3XG) obj).A05;
            if (interfaceC38381qS instanceof InterfaceC38371qR) {
                java.util.Set set = c65322xU.A01;
                C14360o3.A0C(interfaceC38381qS, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
                set.remove(((InterfaceC38371qR) interfaceC38381qS).BQN());
            }
        }
        for (InterfaceC61752rc interfaceC61752rc : this.A05) {
            if (interfaceC61752rc != null) {
                interfaceC61752rc.DNl();
            }
        }
        return remove;
    }

    public final boolean A0E(String str) {
        Number number = (Number) this.A03.get(str);
        if (number != null) {
            if (A0D(this.A01.get(number.intValue()))) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC65342xW
    public final Iterator EWm(InterfaceC61752rc interfaceC61752rc) {
        this.A05.add(interfaceC61752rc);
        Iterator it = this.A02.iterator();
        C14360o3.A07(it);
        return it;
    }

    public AbstractC65332xV() {
        List unmodifiableList = Collections.unmodifiableList(new ArrayList());
        C14360o3.A07(unmodifiableList);
        this.A01 = unmodifiableList;
        this.A05 = new HashSet();
    }

    public static final void A01(AbstractC65332xV abstractC65332xV, Object obj, int i, boolean z) {
        String A03 = abstractC65332xV.A03(obj);
        Map map = abstractC65332xV.A04;
        Object obj2 = map.get(A03);
        if (obj2 == null) {
            map.put(A03, obj);
            abstractC65332xV.A02.add(i, obj);
            if (z) {
                for (InterfaceC61752rc interfaceC61752rc : abstractC65332xV.A05) {
                    if (interfaceC61752rc != null) {
                        interfaceC61752rc.DNG(obj, i);
                    }
                }
            }
            abstractC65332xV.A09(obj);
            return;
        }
        C2u2 c2u2 = abstractC65332xV.A00;
        if (c2u2 != null) {
            c2u2.DNT(obj, abstractC65332xV.A02.indexOf(obj2), i);
        }
    }

    public final boolean A0C(Object obj) {
        String A03 = A03(obj);
        C14360o3.A0B(A03, 0);
        return this.A04.containsKey(A03);
    }
}
