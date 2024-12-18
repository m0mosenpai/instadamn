package X;

/* loaded from: classes10.dex */
public final class RSR extends C1LC {
    public boolean A00;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.A00;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.A00) {
            this.A00 = true;
            return null;
        }
        throw AbstractC58318PtA.A13();
    }
}
