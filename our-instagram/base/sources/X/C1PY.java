package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1PY, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1PY {
    public List A00;
    public final int A01;
    public final LinkedList A02;
    public final LinkedList A03;
    public final List A04;
    public final boolean A05;
    public final int A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public abstract InterfaceC42381xS A02(Integer num, Object obj, int i);

    public final void A06(Integer num, Integer num2, Collection collection, int i) {
        A07(num, num2, collection, i, true);
    }

    public boolean A08() {
        return false;
    }

    public final InterfaceC42381xS A00() {
        Object first = this.A02.getFirst();
        first.getClass();
        return (InterfaceC42381xS) first;
    }

    public final InterfaceC42381xS A01() {
        LinkedList linkedList = this.A02;
        InterfaceC42381xS interfaceC42381xS = (InterfaceC42381xS) linkedList.removeFirst();
        int size = linkedList.size();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC101974iC) it.next()).DZa(size + 1, size);
        }
        for (C3GT c3gt : this.A04) {
            int BUo = c3gt.BUo();
            if (BUo < size) {
                Object obj = linkedList.get(BUo);
                obj.getClass();
                c3gt.DNj(((InterfaceC42381xS) obj).BUM(), BUo);
            }
        }
        return interfaceC42381xS;
    }

    public final Collection A03() {
        return Collections.unmodifiableCollection(new LinkedList(this.A02));
    }

    public final LinkedList A04() {
        LinkedList linkedList = this.A02;
        LinkedList linkedList2 = new LinkedList(linkedList);
        if (this.A05) {
            LinkedList linkedList3 = this.A03;
            linkedList3.clear();
            linkedList3.addAll(linkedList);
        }
        linkedList.clear();
        return linkedList2;
    }

    public final void A05(C3GT c3gt) {
        List list = this.A04;
        if (!list.contains(c3gt)) {
            list.add(c3gt);
            int BUo = c3gt.BUo();
            for (int i = 0; i <= BUo; i++) {
                LinkedList linkedList = this.A02;
                if (i < linkedList.size()) {
                    Object obj = linkedList.get(i);
                    obj.getClass();
                    c3gt.DNj(((InterfaceC42381xS) obj).BUM(), BUo);
                } else {
                    return;
                }
            }
        }
    }

    public final boolean A09() {
        LinkedList linkedList = this.A02;
        if (linkedList.isEmpty()) {
            return true;
        }
        if (!A08()) {
            InterfaceC42381xS interfaceC42381xS = (InterfaceC42381xS) linkedList.peek();
            if (this.A07 && this.A06 > 0 && interfaceC42381xS != null) {
                return A0A(interfaceC42381xS);
            }
        }
        return false;
    }

    public final boolean A0A(InterfaceC42381xS interfaceC42381xS) {
        if ((this.A08 && interfaceC42381xS.Byg() != C05F.A0C) || ((this.A09 && interfaceC42381xS.BA4() <= 2) || System.currentTimeMillis() - interfaceC42381xS.Ask() < TimeUnit.MINUTES.toMillis(this.A06))) {
            return false;
        }
        return true;
    }

    public C1PY(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = new LinkedList();
        this.A03 = new LinkedList();
        this.A04 = new ArrayList();
        this.A00 = new ArrayList();
        this.A07 = z;
        this.A06 = i;
        this.A01 = i2;
        this.A05 = z4;
        this.A08 = z2;
        this.A09 = z3;
    }

    public final void A07(Integer num, Integer num2, Collection collection, int i, boolean z) {
        if (!collection.isEmpty()) {
            LinkedList linkedList = this.A02;
            int size = linkedList.size();
            if (num2 == C05F.A01) {
                LinkedList linkedList2 = new LinkedList();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    linkedList2.add(A02(num, it.next(), i));
                }
                linkedList.addAll(0, linkedList2);
            } else {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    linkedList.add(A02(num, it2.next(), i));
                }
            }
            int size2 = linkedList.size();
            if (z) {
                Iterator it3 = this.A00.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC101974iC) it3.next()).DZa(size, size2);
                }
                for (C3GT c3gt : this.A04) {
                    int BUo = c3gt.BUo();
                    for (int i2 = size; i2 <= BUo && i2 < linkedList.size(); i2++) {
                        Object obj = linkedList.get(i2);
                        obj.getClass();
                        c3gt.DNj(((InterfaceC42381xS) obj).BUM(), BUo);
                    }
                }
            }
        }
    }

    public C1PY() {
        this.A02 = new LinkedList();
        this.A03 = new LinkedList();
        this.A04 = new ArrayList();
        this.A00 = new ArrayList();
        this.A07 = false;
        this.A06 = 0;
        this.A01 = 0;
        this.A05 = false;
        this.A08 = false;
        this.A09 = false;
    }
}
