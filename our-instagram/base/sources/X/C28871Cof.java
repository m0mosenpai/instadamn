package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.Cof, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28871Cof implements InterfaceC30915DiS {
    public final long A00;
    public final Alignment A01;

    @Override // X.InterfaceC30915DiS
    public final long AFF(C28268CdD c28268CdD, AnonymousClass583 anonymousClass583, long j, long j2) {
        Alignment alignment = this.A01;
        int i = c28268CdD.A02;
        int i2 = c28268CdD.A01;
        int i3 = c28268CdD.A00;
        int i4 = c28268CdD.A03;
        long AB9 = alignment.AB9(anonymousClass583, 0L, AbstractC119215ad.A00(i - i2, i3 - i4));
        long j3 = ((-((int) (r4 & 4294967295L))) & 4294967295L) | ((-((int) (alignment.AB9(anonymousClass583, 0L, j2) >> 32))) << 32);
        long j4 = this.A00;
        int i5 = (int) (j4 >> 32);
        int i6 = -1;
        if (anonymousClass583 == AnonymousClass583.Ltr) {
            i6 = 1;
        }
        return C119235af.A01(C119235af.A01(C119235af.A01(AbstractC113765Bo.A00(i2, i4), AB9), j3), AbstractC113765Bo.A00(i5 * i6, (int) (j4 & 4294967295L)));
    }

    public C28871Cof(Alignment alignment, long j) {
        this.A01 = alignment;
        this.A00 = j;
    }
}
