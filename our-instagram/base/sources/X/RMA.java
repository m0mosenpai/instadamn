package X;

/* loaded from: classes10.dex */
public final class RMA extends TSQ {
    public static final Object A01 = AbstractC58318PtA.A0b();
    public Object A00;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC25229BEm.A1a(this.A00, A01);
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.A00;
        Object obj2 = A01;
        if (obj != obj2) {
            this.A00 = obj2;
            return obj;
        }
        throw AbstractC58318PtA.A13();
    }
}
