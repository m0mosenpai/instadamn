package X;

/* renamed from: X.T5t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64244T5t implements InterfaceC65254Tgk {
    public final int A00;
    public final InterfaceC65255Tgl A01;
    public final Object[] A02;

    public C64244T5t(InterfaceC65255Tgl interfaceC65255Tgl, Object[] objArr) {
        char charAt;
        this.A01 = interfaceC65255Tgl;
        this.A02 = objArr;
        int A00 = AbstractC58318PtA.A00("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a");
        if (A00 >= 55296) {
            int i = A00 & 8191;
            int i2 = 1;
            int i3 = 13;
            while (true) {
                int i4 = i2 + 1;
                charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                i = AbstractC58318PtA.A03(charAt, i3, i);
                i3 += 13;
                i2 = i4;
            }
            A00 = (charAt << i3) | i;
        }
        this.A00 = A00;
    }
}
