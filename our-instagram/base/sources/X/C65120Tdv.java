package X;

/* renamed from: X.Tdv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65120Tdv extends C6C6 {
    public final Object A00;

    public C65120Tdv(Object obj, int i) {
        super.A00 = i;
        this.A01 = 1;
        this.A00 = obj;
    }

    @Override // X.C6C6, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            super.A00++;
            return this.A00;
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            super.A00--;
            return this.A00;
        }
        throw AbstractC58318PtA.A13();
    }
}
