package X;

/* renamed from: X.PuV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58391PuV implements InterfaceC65180TfO {
    public final int A00;
    public final InterfaceC65625Tpl A01;
    public final String A02;
    public final Object[] A03;

    public C58391PuV(InterfaceC65625Tpl interfaceC65625Tpl, String str, Object[] objArr) {
        char charAt;
        this.A01 = interfaceC65625Tpl;
        this.A02 = str;
        this.A03 = objArr;
        int A00 = AbstractC58318PtA.A00(str);
        if (A00 >= 55296) {
            int i = A00 & 8191;
            int i2 = 13;
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                charAt = str.charAt(i3);
                if (charAt < 55296) {
                    break;
                }
                i |= (charAt & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
            A00 = i | (charAt << i2);
        }
        this.A00 = A00;
    }
}
