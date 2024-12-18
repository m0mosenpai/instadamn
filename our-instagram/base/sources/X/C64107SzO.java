package X;

import java.util.Map;

/* renamed from: X.SzO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64107SzO implements InterfaceC65573Tn7 {
    public long A00;
    public int A01 = 1;
    public final long A02;
    public final long A03;
    public final long A04;

    @Override // X.InterfaceC65573Tn7
    public final boolean AJu() {
        return AbstractC31175DnJ.A1S((this.A00 > this.A02 ? 1 : (this.A00 == this.A02 ? 0 : -1)));
    }

    @Override // X.InterfaceC65573Tn7
    public final InterfaceC65573Tn7 AKs() {
        return new C64107SzO(this.A04, this.A03, this.A02);
    }

    @Override // X.InterfaceC65573Tn7
    public final long B2t() {
        return this.A00;
    }

    @Override // X.InterfaceC65573Tn7
    public final Map BOo() {
        long j;
        int i = this.A01;
        if (i == 1) {
            j = 0;
        } else {
            j = this.A00;
        }
        return AbstractC25232BEp.A1F(RhW.A0L.A00, String.valueOf(j), AbstractC166987dD.A1L(RhW.A0M.A00, "backoff"), AbstractC166987dD.A1L(RhW.A0J.A00, String.valueOf(i)));
    }

    @Override // X.InterfaceC65573Tn7
    public final void ECP() {
        this.A00 *= this.A03;
        this.A01++;
    }

    public C64107SzO(long j, long j2, long j3) {
        this.A04 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A00 = j;
    }
}
