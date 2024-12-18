package X;

/* loaded from: classes10.dex */
public final class Q5k extends TTS {
    public final Object[] A00;

    public Q5k(Object[] objArr, int i, int i2) {
        super.A00 = i;
        this.A01 = i2;
        this.A00 = objArr;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            Object[] objArr = this.A00;
            int i = super.A00 - 1;
            super.A00 = i;
            return objArr[i];
        }
        throw AbstractC58318PtA.A13();
    }
}
