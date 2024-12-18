package X;

/* loaded from: classes9.dex */
public final class NK8 extends OX6 {
    public C52094N2u A00;
    public C47Z A01;
    public String A02;
    public final C52457NJb A03;
    public final C05A A04;
    public final C0UO A05;

    public final void A08(String str) {
        C51754Mtd A00;
        String str2 = str;
        if (C14360o3.A0K(str, "not_funded")) {
            str2 = null;
        }
        C47Z c47z = this.A01;
        if (c47z == null) {
            C14360o3.A0F("pendingMedia");
            throw C00O.createAndThrow();
        }
        c47z.A2w = str2;
        A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, null, A04(), null, null, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, -262145, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
        A07(A00);
    }

    public NK8(C52457NJb c52457NJb) {
        super(c52457NJb);
        this.A03 = c52457NJb;
        C008002u A1H = AbstractC25225BEi.A1H(new C52459NJd(false, null));
        this.A04 = A1H;
        this.A05 = A1H;
    }
}
