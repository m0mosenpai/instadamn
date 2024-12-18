package X;

import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.Multisets$ImmutableEntry;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public abstract class RSS extends C1LC {
    public Integer A00 = C05F.A01;
    public Object A01;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.RQ4] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.RSS] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.RQ3] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        ?? r2;
        Object next;
        Object key;
        Collection A00;
        Map.Entry A1K;
        int i;
        Integer num = this.A00;
        Integer num2 = C05F.A0N;
        C18C.A0F(AbstractC25229BEm.A1a(num, num2));
        int intValue = num.intValue();
        if (intValue == 2) {
            return false;
        }
        if (intValue == 0) {
            return true;
        }
        this.A00 = num2;
        if (this instanceof RQ3) {
            r2 = (RQ3) this;
            do {
                Iterator it = r2.A00;
                if (it.hasNext()) {
                    A1K = AbstractC166987dD.A1K(it);
                    i = ((AtomicInteger) A1K.getValue()).get();
                } else {
                    r2.A00 = C05F.A0C;
                    next = null;
                }
            } while (i == 0);
            next = new Multisets$ImmutableEntry(A1K.getKey(), i);
        } else {
            r2 = (RQ4) this;
            switch (r2.A00) {
                case 0:
                    do {
                        Iterator it2 = (Iterator) r2.A01;
                        if (it2.hasNext()) {
                            Map.Entry A1K2 = AbstractC166987dD.A1K(it2);
                            key = A1K2.getKey();
                            A00 = RQN.A00(new C64287T7w(((C60766RRp) r2.A02).A00.A00, key), AbstractC58318PtA.A0y(A1K2));
                        } else {
                            r2.A00 = C05F.A0C;
                            next = null;
                            break;
                        }
                    } while (A00.isEmpty());
                    next = new ImmutableEntry(key, A00);
                    break;
                case 1:
                    do {
                        Iterator it3 = (Iterator) r2.A02;
                        if (it3.hasNext()) {
                            next = it3.next();
                        } else {
                            r2.A00 = C05F.A0C;
                            next = null;
                            break;
                        }
                    } while (!((InterfaceC28041Xi) r2.A01).apply(next));
                case 2:
                    do {
                        Iterator it4 = (Iterator) r2.A01;
                        if (it4.hasNext()) {
                            next = it4.next();
                        } else {
                            r2.A00 = C05F.A0C;
                            next = null;
                            break;
                        }
                    } while (!((RSK) r2.A02).A01.contains(next));
                default:
                    do {
                        Iterator it5 = (Iterator) r2.A01;
                        if (it5.hasNext()) {
                            next = it5.next();
                        } else {
                            r2.A00 = C05F.A0C;
                            next = null;
                            break;
                        }
                    } while (((RSJ) r2.A02).A01.contains(next));
            }
        }
        this.A01 = next;
        if (this.A00 == C05F.A0C) {
            return false;
        }
        this.A00 = C05F.A00;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.A00 = C05F.A01;
            Object obj = this.A01;
            this.A01 = null;
            return obj;
        }
        throw AbstractC58318PtA.A13();
    }
}
