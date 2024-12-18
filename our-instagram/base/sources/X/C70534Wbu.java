package X;

/* renamed from: X.Wbu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70534Wbu implements XDB {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C97974ac A04;

    @Override // X.XDB
    public final int B6w() {
        return -1;
    }

    @Override // X.XDB
    public final int Bq5() {
        return this.A03;
    }

    @Override // X.XDB
    public final int E8G() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A02();
        }
        if (i == 16) {
            return this.A04.A05();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 == 0) {
            int A02 = this.A04.A02();
            this.A00 = A02;
            return (A02 & 240) >> 4;
        }
        return this.A00 & 15;
    }

    public C70534Wbu(C98314bA c98314bA) {
        C97974ac c97974ac = c98314bA.A00;
        this.A04 = c97974ac;
        c97974ac.A0G(12);
        this.A02 = c97974ac.A04() & 255;
        this.A03 = c97974ac.A04();
    }
}
