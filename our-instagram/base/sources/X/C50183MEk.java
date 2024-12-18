package X;

/* renamed from: X.MEk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50183MEk extends C0YY implements InterfaceC16820sZ {
    public static final C50183MEk A00 = new C50183MEk();

    public C50183MEk() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        double d;
        InterfaceC09390do interfaceC09390do = AbstractC47192KtR.A00;
        if (AbstractC167027dH.A01(interfaceC09390do) > 480) {
            d = 4.0d;
        } else if (AbstractC167027dH.A01(interfaceC09390do) > 320) {
            d = 3.0d;
        } else if (AbstractC167027dH.A01(interfaceC09390do) > 240) {
            d = 2.0d;
        } else if (AbstractC167027dH.A01(interfaceC09390do) > 160) {
            d = 1.5d;
        } else {
            d = 1.0d;
        }
        return Double.valueOf(d);
    }
}
