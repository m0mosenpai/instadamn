package X;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/* loaded from: classes10.dex */
public final class TT0 implements Iterator {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public Object A03;
    public List A04;
    public Queue A05;
    public boolean A06;
    public final /* synthetic */ TZL A07;

    public TT0(final TZL this$0) {
        this.A07 = this$0;
        this.A00 = this$0.A00;
    }

    private void A00(int c) {
        Iterator it;
        if (this.A02 < c) {
            if (this.A04 != null) {
                loop0: while (true) {
                    TZL tzl = this.A07;
                    if (c >= tzl.size()) {
                        break;
                    }
                    List list = this.A04;
                    Object A00 = TZL.A00(tzl, c);
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() == A00) {
                            break;
                        }
                    }
                    break loop0;
                    it.remove();
                    c++;
                }
            }
            this.A02 = c;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Queue queue;
        TZL tzl = this.A07;
        if (tzl.A00 == this.A00) {
            A00(this.A01 + 1);
            if (this.A02 < tzl.size() || ((queue = this.A05) != null && !queue.isEmpty())) {
                return true;
            }
            return false;
        }
        throw AbstractC58318PtA.A0z();
    }

    @Override // java.util.Iterator
    public final Object next() {
        TZL tzl = this.A07;
        if (tzl.A00 == this.A00) {
            A00(this.A01 + 1);
            int i = this.A02;
            int size = tzl.size();
            if (i < size) {
                this.A01 = i;
                this.A06 = true;
                return TZL.A00(tzl, i);
            }
            Queue queue = this.A05;
            if (queue != null) {
                this.A01 = size;
                Object poll = queue.poll();
                this.A03 = poll;
                if (poll != null) {
                    this.A06 = true;
                    return poll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }
        throw AbstractC58318PtA.A0z();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        List A17;
        AbstractC58321PtD.A1T(this.A06);
        TZL tzl = this.A07;
        int i = tzl.A00;
        int i2 = this.A00;
        if (i == i2) {
            this.A06 = false;
            this.A00 = i2 + 1;
            int i3 = this.A01;
            if (i3 < tzl.size()) {
                C62498SEa removeAt = tzl.removeAt(i3);
                if (removeAt != null) {
                    if (this.A05 == null || (A17 = this.A04) == null) {
                        this.A05 = new ArrayDeque();
                        A17 = AbstractC25225BEi.A17(3);
                        this.A04 = A17;
                    }
                    Object obj = removeAt.A01;
                    Iterator it = A17.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next() == obj) {
                                it.remove();
                                break;
                            }
                        } else {
                            this.A05.add(obj);
                            break;
                        }
                    }
                    Queue queue = this.A05;
                    Object obj2 = removeAt.A00;
                    Iterator it2 = queue.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next() == obj2) {
                                it2.remove();
                                break;
                            }
                        } else {
                            this.A04.add(obj2);
                            break;
                        }
                    }
                }
                this.A01--;
                this.A02--;
                return;
            }
            Object obj3 = this.A03;
            obj3.getClass();
            int i4 = 0;
            while (true) {
                if (i4 < tzl.A01) {
                    if (tzl.A02[i4] == obj3) {
                        tzl.removeAt(i4);
                        z = true;
                        break;
                    }
                    i4++;
                } else {
                    z = false;
                    break;
                }
            }
            C18C.A0F(z);
            this.A03 = null;
            return;
        }
        throw AbstractC58318PtA.A0z();
    }
}
