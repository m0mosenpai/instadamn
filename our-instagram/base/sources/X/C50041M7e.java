package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.M7e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50041M7e implements Iterator {
    public final Iterator A00;
    public final Iterator A01;
    public final /* synthetic */ C93834Jr A02;

    public C50041M7e(C93834Jr c93834Jr, Iterator it, Iterator it2) {
        this.A02 = c93834Jr;
        this.A01 = it;
        this.A00 = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.A01.hasNext() && !this.A00.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry A1K;
        C6C2 c6c2;
        Iterator it = this.A01;
        if (it.hasNext()) {
            A1K = AbstractC166987dD.A1K(it);
            c6c2 = new C6C2(AbstractC31172DnG.A17(A1K), null);
        } else {
            Iterator it2 = this.A00;
            if (it2.hasNext()) {
                A1K = AbstractC166987dD.A1K(it2);
                c6c2 = new C6C2(null, AbstractC31172DnG.A17(A1K));
            } else {
                throw new NoSuchElementException();
            }
        }
        return new C50043M7g(c6c2, A1K.getValue());
    }
}
