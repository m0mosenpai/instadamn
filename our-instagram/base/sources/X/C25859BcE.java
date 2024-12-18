package X;

/* renamed from: X.BcE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25859BcE extends AbstractC52922bZ {
    public final KZA A00;
    public final String A01;
    public final String A02;
    public final java.util.Set A03;
    public final java.util.Set A04;
    public final InterfaceC24731Iq A05;
    public final C05A A06;
    public final C0UO A07;

    public C25859BcE(KZA kza, String str, String str2, java.util.Set set, java.util.Set set2) {
        EnumC27388C6r enumC27388C6r;
        AbstractC167027dH.A0a(1, str, str2, set, set2);
        this.A02 = str;
        this.A01 = str2;
        this.A04 = set;
        this.A03 = set2;
        this.A00 = kza;
        if (!set.isEmpty()) {
            enumC27388C6r = EnumC27388C6r.A05;
        } else {
            enumC27388C6r = EnumC27388C6r.A04;
        }
        C008002u A1H = AbstractC25225BEi.A1H(enumC27388C6r);
        this.A06 = A1H;
        this.A07 = AbstractC208910l.A01(A00((InterfaceC57806PkY) this.A00.A04.getValue()), AbstractC141776au.A00(this), C10Q.A03(new C57181PaA(this, (InterfaceC23621Ds) null, 20), A1H, kza.A04), C10I.A01);
        this.A05 = AbstractC25229BEm.A12();
    }

    public static final C26236Bj5 A00(InterfaceC57806PkY interfaceC57806PkY) {
        Iterable iterable;
        if (!MU9.A01(interfaceC57806PkY, 1) || (iterable = ((C51701MsW) ((MU9) interfaceC57806PkY).A01).A06) == null) {
            iterable = C16930sl.A00;
        }
        return new C26236Bj5(AbstractC133095zb.A00(iterable), AbstractC133095zb.A04(C27341C4w.A00, C27342C4x.A00));
    }
}
