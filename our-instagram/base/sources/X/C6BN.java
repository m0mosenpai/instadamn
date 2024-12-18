package X;

/* renamed from: X.6BN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6BN implements C2W5 {
    public final int A00;
    public final C2WC A01;
    public final Object A02;
    public final int A03;

    @Override // X.C2W5
    public final int Ang() {
        return 0;
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
    public final C2W5 AnV(int i) {
        throw new IllegalArgumentException("A MountableLayoutResult has no children");
    }

    @Override // X.C2W5
    public final Object BMS() {
        return this.A02;
    }

    @Override // X.C2W5
    public final C2WC Bmi() {
        return this.A01;
    }

    @Override // X.C2W5
    public final int CI4(int i) {
        throw new IllegalArgumentException("A MountableLayoutResult has no children");
    }

    @Override // X.C2W5
    public final int CIb(int i) {
        throw new IllegalArgumentException("A MountableLayoutResult has no children");
    }

    @Override // X.C2W5
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.C2W5
    public final int getWidth() {
        return this.A03;
    }

    public C6BN(C2WC c2wc, Object obj, int i, int i2) {
        this.A01 = c2wc;
        this.A03 = i;
        this.A00 = i2;
        this.A02 = obj;
    }
}
