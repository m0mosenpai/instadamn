package X;

/* renamed from: X.Dyy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31839Dyy extends AbstractC52922bZ {
    public final C05A A00;
    public final C0UO A01;

    public final void A01(EnumC33423Epu enumC33423Epu, String str) {
        Object value;
        EnumC33421Eps enumC33421Eps;
        C05A c05a = this.A00;
        do {
            value = c05a.getValue();
            enumC33421Eps = (EnumC33421Eps) ((C51757Mtg) value).A00;
            C14360o3.A0B(enumC33421Eps, 0);
        } while (!c05a.AIi(value, new C51757Mtg(enumC33421Eps, enumC33423Epu, str)));
    }

    public C31839Dyy() {
        C008002u A1H = AbstractC25225BEi.A1H(new C51757Mtg(EnumC33421Eps.A07, EnumC33423Epu.A08, ""));
        this.A00 = A1H;
        this.A01 = A1H;
    }

    public static C51757Mtg A00(AbstractC32348EMv abstractC32348EMv) {
        return (C51757Mtg) abstractC32348EMv.A04().A01.getValue();
    }
}
