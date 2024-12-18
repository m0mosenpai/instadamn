package X;

/* loaded from: classes10.dex */
public final class Q5n extends TTS {
    public int A00;
    public boolean A01;
    public Object[] A02;

    public static final void A00(Q5n q5n, int i, int i2) {
        int i3 = (q5n.A00 - i2) * 5;
        while (i2 < q5n.A00) {
            Object[] objArr = q5n.A02;
            objArr[i2] = AbstractC58322PtE.A1b(objArr, i2 - 1)[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    public Q5n(Object[] objArr, int i, int i2, int i3) {
        super.A00 = i;
        super.A01 = i2;
        this.A00 = i3;
        Object[] objArr2 = new Object[i3];
        this.A02 = objArr2;
        boolean A1P = AbstractC167007dF.A1P(i, i2);
        this.A01 = A1P;
        objArr2[0] = objArr;
        A00(this, i - (A1P ? 1 : 0), 1);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = super.A00 - 1;
            super.A00 = i;
            if (this.A01) {
                this.A01 = false;
            } else {
                int i2 = 0;
                while (((i >> i2) & 31) == 31) {
                    i2 += 5;
                }
                if (i2 > 0) {
                    A00(this, i, ((this.A00 - 1) - (i2 / 5)) + 1);
                }
            }
            int i3 = super.A00 & 31;
            Object obj = this.A02[this.A00 - 1];
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
            return ((Object[]) obj)[i3];
        }
        throw AbstractC58318PtA.A13();
    }
}
