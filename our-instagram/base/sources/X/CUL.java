package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class CUL {
    public C126995od A00;
    public AnonymousClass583 A01;
    public final C5C8 A02;
    public final C118125Vw A03;
    public final C5DD A04;
    public final InterfaceC1128957x A05;
    public final List A06;
    public final boolean A07;

    public final void A00(AnonymousClass583 anonymousClass583) {
        C126995od c126995od = this.A00;
        if (c126995od == null || anonymousClass583 != this.A01 || c126995od.BCg()) {
            this.A01 = anonymousClass583;
            c126995od = new C126995od(this.A02, AbstractC122525gn.A00(this.A03, anonymousClass583), this.A04, this.A05, this.A06);
        }
        this.A00 = c126995od;
    }

    public CUL(C5C8 c5c8, C118125Vw c118125Vw, C5DD c5dd, InterfaceC1128957x interfaceC1128957x, List list, boolean z) {
        this.A02 = c5c8;
        this.A03 = c118125Vw;
        this.A07 = z;
        this.A05 = interfaceC1128957x;
        this.A04 = c5dd;
        this.A06 = list;
    }
}
