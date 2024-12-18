package X;

import java.util.Iterator;

/* renamed from: X.RQi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60756RQi extends AbstractC58576Pxu {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C60756RQi(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.A00 != 0) {
            return new RSM(this.A02, ((Iterable) this.A01).iterator(), 0);
        }
        Iterator it = ((Iterable) this.A02).iterator();
        InterfaceC28041Xi interfaceC28041Xi = (InterfaceC28041Xi) this.A01;
        it.getClass();
        return new RQ4(interfaceC28041Xi, it);
    }
}
