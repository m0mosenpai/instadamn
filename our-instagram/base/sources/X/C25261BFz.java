package X;

import java.util.Arrays;

/* renamed from: X.BFz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25261BFz {
    public long A00;
    public final BG0 A01;
    public final BG0 A02;

    public final void A01() {
        BG0 bg0 = this.A01;
        Arrays.fill(bg0.A05, 0, 20, (Object) null);
        bg0.A00 = 0;
        BG0 bg02 = this.A02;
        Arrays.fill(bg02.A05, 0, 20, (Object) null);
        bg02.A00 = 0;
        this.A00 = 0L;
    }

    public final void A02(long j, long j2) {
        this.A01.A01(j, C119365at.A01(j2));
        this.A02.A01(j, C119365at.A02(j2));
    }

    public C25261BFz() {
        Integer num = C05F.A00;
        this.A01 = new BG0(num, false);
        this.A02 = new BG0(num, false);
    }

    public final long A00(long j) {
        float A00 = AbstractC25231BEo.A00(j);
        if (A00 > 0.0f) {
            float A002 = AbstractC25232BEp.A00(j);
            if (A002 > 0.0f) {
                return AbstractC25248BFh.A00(this.A01.A00(A00), this.A02.A00(A002));
            }
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("maximumVelocity should be a positive value. You specified=");
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append('(');
        A1C2.append(AbstractC25231BEo.A00(j));
        A1C2.append(", ");
        A1C2.append(AbstractC25232BEp.A00(j));
        AbstractC28290Cdc.A01(AbstractC166997dE.A0v(AbstractC166997dE.A0x(") px/sec", A1C2), A1C));
        throw C00O.createAndThrow();
    }
}
