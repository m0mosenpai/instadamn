package X;

/* renamed from: X.Mfc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50969Mfc extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GT A01;
    public final OH4 A02;
    public final C05A A03;
    public final C05A A04;

    public final String A00() {
        if (this instanceof NPA) {
            return ((NPA) this).A03;
        }
        return ((NPB) this).A03;
    }

    public AbstractC50969Mfc(OH4 oh4) {
        this.A02 = oh4;
        C008002u A1H = AbstractC25225BEi.A1H(EnumC53267Nh5.A06);
        this.A03 = A1H;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A00 = AbstractC58232lf.A00(anonymousClass191, A1H);
        C008002u A0y = MSZ.A0y();
        this.A04 = A0y;
        this.A01 = AbstractC58232lf.A00(anonymousClass191, A0y);
    }
}
