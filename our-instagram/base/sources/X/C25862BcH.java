package X;

/* renamed from: X.BcH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25862BcH extends AbstractC52922bZ {
    public final C05A A00;
    public final C0UO A01;

    public static final void A00(C25862BcH c25862BcH, C5Hb c5Hb) {
        Object value;
        String str;
        String str2;
        C05A c05a = c25862BcH.A00;
        do {
            value = c05a.getValue();
            MUW muw = (MUW) value;
            str = muw.A02;
            str2 = muw.A03;
            C14360o3.A0B(c5Hb, 3);
        } while (!c05a.AIi(value, new MUW((C211819a8) null, str, str2, c5Hb)));
    }

    public final void A01(String str) {
        Object value;
        String str2;
        C211819a8 c211819a8;
        C5Hb c5Hb;
        C05A c05a = this.A00;
        do {
            value = c05a.getValue();
            MUW muw = (MUW) value;
            str2 = muw.A02;
            c211819a8 = (C211819a8) muw.A01;
            c5Hb = (C5Hb) muw.A00;
            C14360o3.A0B(c5Hb, 3);
        } while (!c05a.AIi(value, new MUW(c211819a8, str2, str, c5Hb)));
    }

    public C25862BcH() {
        C008002u A1H = AbstractC25225BEi.A1H(new MUW());
        this.A00 = A1H;
        this.A01 = A1H;
    }
}
