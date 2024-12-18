package X;

/* loaded from: classes10.dex */
public final class Q5l extends TTS {
    public final Object A00;

    public Q5l(Object obj, int i) {
        super.A00 = i;
        this.A01 = 1;
        this.A00 = obj;
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
