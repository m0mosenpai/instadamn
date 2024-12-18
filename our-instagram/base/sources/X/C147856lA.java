package X;

/* renamed from: X.6lA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147856lA {
    public InterfaceC147636ko A00;
    public final C147866lB A01;
    public final EnumC142806cg A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final C0UO A06;
    public final C0UO A07;
    public final C0UO A08;

    public /* synthetic */ C147856lA(EnumC142806cg enumC142806cg) {
        C147866lB c147866lB = new C147866lB();
        this.A02 = enumC142806cg;
        this.A01 = c147866lB;
        C008002u A00 = C10E.A00(Long.valueOf(c147866lB.A00));
        this.A04 = A00;
        this.A07 = AbstractC208910l.A02(A00);
        C008002u A002 = C10E.A00(c147866lB.A02);
        this.A03 = A002;
        this.A06 = AbstractC208910l.A02(A002);
        C008002u A003 = C10E.A00(c147866lB.A03);
        this.A05 = A003;
        this.A08 = AbstractC208910l.A02(A003);
    }

    public final long A00() {
        int ordinal = this.A02.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal == 1) {
                    InterfaceC147636ko interfaceC147636ko = this.A00;
                    if (interfaceC147636ko != null) {
                        return interfaceC147636ko.AXr();
                    }
                    return 0L;
                }
                throw new RuntimeException();
            }
            return Long.MAX_VALUE;
        }
        return this.A01.A00;
    }
}
