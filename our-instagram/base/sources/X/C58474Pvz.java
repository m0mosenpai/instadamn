package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Pvz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C58474Pvz implements Iterator, InterfaceC15590qF {
    public int A00;
    public Object A01;
    public final Map A02;

    public C58474Pvz(Object obj, Map map) {
        C14360o3.A0B(map, 2);
        this.A01 = obj;
        this.A02 = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 >= this.A02.size()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this instanceof C65136TeB) {
            C65136TeB c65136TeB = (C65136TeB) this;
            if (c65136TeB.A02) {
                C58479Pw5 c58479Pw5 = c65136TeB.A03;
                C15500q5.A00(c58479Pw5).remove(c65136TeB.A01);
                c65136TeB.A01 = null;
                c65136TeB.A02 = false;
                c65136TeB.A00 = c58479Pw5.A03.A00;
                ((C58474Pvz) c65136TeB).A00--;
                return;
            }
            throw AbstractC58318PtA.A0Z();
        }
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object obj = this.A01;
            this.A00++;
            Object obj2 = this.A02.get(obj);
            if (obj2 != null) {
                this.A01 = ((C58524Pws) obj2).A00;
                return obj;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Hash code of an element (");
            A1C.append(obj);
            throw new ConcurrentModificationException(AbstractC166997dE.A0x(") has changed after it was added to the persistent set.", A1C));
        }
        throw AbstractC58318PtA.A13();
    }
}
