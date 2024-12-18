package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.Cog, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28872Cog implements InterfaceC30915DiS {
    public long A00 = 0;
    public final InterfaceC30909DiM A01;
    public final Alignment A02;

    @Override // X.InterfaceC30915DiS
    public final long AFF(C28268CdD c28268CdD, AnonymousClass583 anonymousClass583, long j, long j2) {
        long E6O = this.A01.E6O();
        if (!AbstractC119395aw.A02(E6O)) {
            E6O = this.A00;
        }
        this.A00 = E6O;
        return C119235af.A01(C119235af.A01(AbstractC113765Bo.A00(c28268CdD.A01, c28268CdD.A03), AbstractC113765Bo.A01(E6O)), this.A02.AB9(anonymousClass583, j2, 0L));
    }

    public C28872Cog(InterfaceC30909DiM interfaceC30909DiM, Alignment alignment) {
        this.A02 = alignment;
        this.A01 = interfaceC30909DiM;
    }
}
