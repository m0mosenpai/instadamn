package X;

import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class Q5o extends TTS implements ListIterator, C0s1 {
    public int A00;
    public int A01;
    public Q5n A02;
    public final C64937TaD A03;

    public static final void A00(Q5o q5o) {
        if (q5o.A00 == q5o.A03.A0O()) {
        } else {
            throw AbstractC58318PtA.A0z();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void A01(Q5o q5o) {
        Q5n q5n;
        C64937TaD c64937TaD = q5o.A03;
        Object[] objArr = c64937TaD.A03;
        if (objArr == null) {
            q5n = null;
        } else {
            int A08 = AbstractC58318PtA.A08(c64937TaD) & (-32);
            int i = ((TTS) q5o).A00;
            if (i > A08) {
                i = A08;
            }
            int i2 = (c64937TaD.A00 / 5) + 1;
            Q5n q5n2 = q5o.A02;
            if (q5n2 == null) {
                q5n = new Q5n(objArr, i, A08, i2);
            } else {
                ((TTS) q5n2).A00 = i;
                ((TTS) q5n2).A01 = A08;
                q5n2.A00 = i2;
                Object[] objArr2 = q5n2.A02;
                if (objArr2.length < i2) {
                    objArr2 = new Object[i2];
                    q5n2.A02 = objArr2;
                }
                ?? r1 = 0;
                objArr2[0] = objArr;
                if (i == A08) {
                    r1 = 1;
                }
                q5n2.A01 = r1;
                Q5n.A00(q5n2, i - r1, 1);
                return;
            }
        }
        q5o.A02 = q5n;
    }

    public Q5o(C64937TaD c64937TaD, int i) {
        int size = c64937TaD.size();
        super.A00 = i;
        super.A01 = size;
        this.A03 = c64937TaD;
        this.A00 = c64937TaD.A0O();
        this.A01 = -1;
        A01(this);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Object[] objArr;
        A00(this);
        if (hasPrevious()) {
            int i = super.A00;
            int i2 = i - 1;
            this.A01 = i2;
            Q5n q5n = this.A02;
            if (q5n == null) {
                objArr = this.A03.A04;
                super.A00 = i2;
            } else {
                int i3 = ((TTS) q5n).A01;
                if (i > i3) {
                    objArr = this.A03.A04;
                    super.A00 = i2;
                    i2 -= i3;
                } else {
                    super.A00 = i2;
                    return q5n.previous();
                }
            }
            return objArr[i2];
        }
        throw AbstractC58318PtA.A13();
    }
}
