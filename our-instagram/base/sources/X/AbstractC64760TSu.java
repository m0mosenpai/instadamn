package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TSu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64760TSu implements Iterator {
    public final Iterator A00;

    public final Object A00(Object obj) {
        InterfaceC65418Tjp interfaceC65418Tjp;
        if (this instanceof RNp) {
            return ((Map.Entry) obj).getValue();
        }
        if (this instanceof RNr) {
            interfaceC65418Tjp = ((RNr) this).A00.A00;
        } else {
            interfaceC65418Tjp = ((RNq) this).A00.A00;
        }
        return interfaceC65418Tjp.FFd(obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return A00(this.A00.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }

    public AbstractC64760TSu(Iterator it) {
        it.getClass();
        this.A00 = it;
    }
}
