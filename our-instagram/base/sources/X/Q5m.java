package X;

/* loaded from: classes10.dex */
public final class Q5m extends TTS {
    public final Q5n A00;
    public final Object[] A01;

    public Q5m(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super.A00 = i;
        super.A01 = i2;
        this.A01 = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.A00 = new Q5n(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = super.A00;
            Q5n q5n = this.A00;
            int i2 = ((TTS) q5n).A01;
            if (i > i2) {
                Object[] objArr = this.A01;
                int i3 = i - 1;
                super.A00 = i3;
                return objArr[i3 - i2];
            }
            super.A00 = i - 1;
            return q5n.previous();
        }
        throw AbstractC58318PtA.A13();
    }
}
