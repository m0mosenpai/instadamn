package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TIn implements Iterable {
    public final int A00;

    public TIn(int i) {
        this.A00 = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A00) {
            case 0:
                return S8I.A01;
            case 1:
                return S96.A01;
            default:
                return S9C.A01;
        }
    }
}
