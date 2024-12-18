package X;

/* loaded from: classes10.dex */
public final class T6W implements TmQ {
    public final int A00;
    public final InterfaceC65665Tqv A01;
    public final String A02;
    public final Object[] A03;

    public final String A00() {
        return this.A02;
    }

    public final Object[] A01() {
        return this.A03;
    }

    @Override // X.TmQ
    public final InterfaceC65665Tqv FFZ() {
        return this.A01;
    }

    @Override // X.TmQ
    public final int FFy() {
        int i = this.A00;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    @Override // X.TmQ
    public final boolean FFw() {
        return AbstractC167007dF.A1P(this.A00 & 2, 2);
    }

    public T6W(InterfaceC65665Tqv interfaceC65665Tqv, String str, Object[] objArr) {
        char charAt;
        this.A01 = interfaceC65665Tqv;
        this.A02 = str;
        this.A03 = objArr;
        int A00 = AbstractC58318PtA.A00(str);
        if (A00 >= 55296) {
            int i = A00 & 8191;
            int i2 = 1;
            int i3 = 13;
            while (true) {
                int i4 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                i = AbstractC58318PtA.A03(charAt, i3, i);
                i3 += 13;
                i2 = i4;
            }
            A00 = i | (charAt << i3);
        }
        this.A00 = A00;
    }
}
