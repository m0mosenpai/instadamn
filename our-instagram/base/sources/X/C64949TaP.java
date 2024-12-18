package X;

/* renamed from: X.TaP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64949TaP extends AbstractC16870sf {
    public long A00;
    public boolean A01;
    public final long A02;
    public final long A03 = 1;

    public C64949TaP(long j, long j2) {
        this.A02 = j2;
        boolean z = j <= j2;
        this.A01 = z;
        this.A00 = z ? j : j2;
    }

    @Override // X.AbstractC16870sf
    public final long A00() {
        long j = this.A00;
        if (j == this.A02) {
            if (this.A01) {
                this.A01 = false;
                return j;
            }
            throw AbstractC58318PtA.A13();
        }
        this.A00 = this.A03 + j;
        return j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01;
    }
}
