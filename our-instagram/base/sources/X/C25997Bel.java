package X;

/* renamed from: X.Bel, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25997Bel extends C0T6 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final long A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25997Bel) {
                C25997Bel c25997Bel = (C25997Bel) obj;
                if (C119145aW.A01(this.A01, c25997Bel.A01) && C119145aW.A01(this.A02, c25997Bel.A02) && C119145aW.A01(this.A00, c25997Bel.A00)) {
                    long j = this.A05;
                    long j2 = c25997Bel.A05;
                    long j3 = C1132359l.A01;
                    if (j != j2 || !C119145aW.A01(this.A03, c25997Bel.A03) || !C119145aW.A01(this.A04, c25997Bel.A04)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C25997Bel() {
        long j = C1132359l.A09;
        this.A01 = 25.0f;
        this.A02 = 5.0f;
        this.A00 = 5.0f;
        this.A05 = j;
        this.A03 = 15.0f;
        this.A04 = 30.0f;
    }

    public final int hashCode() {
        int A00 = AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25235BEs.A02(this.A01), this.A02), this.A00);
        long j = this.A05;
        long j2 = C1132359l.A01;
        int A002 = AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25236BEt.A01(j, A00), this.A03), this.A04);
        int A003 = AbstractC53644Nnp.A00();
        return ((A002 + A003) * 31) + A003;
    }
}
