package X;

/* loaded from: classes11.dex */
public final class U4H implements C2W5 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C2W5 A04;
    public final C2WC A05;
    public final Object A06;

    public U4H(C2W5 c2w5, C2WC c2wc) {
        this(c2w5, c2wc, null, c2w5.getWidth(), c2w5.getHeight(), 0, 0);
    }

    @Override // X.C2W5
    public final int Ang() {
        return 1;
    }

    @Override // X.C2W5
    public final int Bat() {
        return 0;
    }

    @Override // X.C2W5
    public final int Bau() {
        return 0;
    }

    @Override // X.C2W5
    public final int Baw() {
        return 0;
    }

    @Override // X.C2W5
    public final int Bax() {
        return 0;
    }

    @Override // X.C2W5
    public final Object BMS() {
        return this.A06;
    }

    @Override // X.C2W5
    public final C2WC Bmi() {
        return this.A05;
    }

    @Override // X.C2W5
    public final int getHeight() {
        return this.A02;
    }

    @Override // X.C2W5
    public final int getWidth() {
        return this.A03;
    }

    @Override // X.C2W5
    public final C2W5 AnV(int i) {
        return this.A04;
    }

    @Override // X.C2W5
    public final int CI4(int i) {
        return this.A00;
    }

    @Override // X.C2W5
    public final int CIb(int i) {
        return this.A01;
    }

    public U4H(C2W5 c2w5, C2WC c2wc, Object obj, int i, int i2, int i3, int i4) {
        this.A05 = c2wc;
        this.A04 = c2w5;
        this.A03 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A06 = obj;
    }
}
