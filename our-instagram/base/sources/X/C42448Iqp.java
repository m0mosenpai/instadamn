package X;

/* renamed from: X.Iqp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42448Iqp implements InterfaceC43450JHo {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC43450JHo
    public final String Anz() {
        return this.A01;
    }

    @Override // X.InterfaceC43450JHo
    public final Integer Bms() {
        return this.A00;
    }

    @Override // X.InterfaceC43450JHo
    public final String Bmu() {
        return this.A02;
    }

    @Override // X.InterfaceC43450JHo
    public final String C5f() {
        return this.A03;
    }

    public C42448Iqp(JM9 jm9) {
        this.A01 = jm9.Anz();
        this.A02 = jm9.Bmu();
        this.A03 = jm9.C5f();
        Integer Bmr = jm9.Bmr();
        Integer num = C05F.A01;
        if (Bmr == null || Bmr.intValue() != 1) {
            num = C05F.A00;
            if (Bmr == null || Bmr.intValue() != 0) {
                num = null;
            }
        }
        this.A00 = num;
    }
}
