package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BPD implements JIH {
    public final /* synthetic */ C2XI A00;
    public final /* synthetic */ C2XI A01;
    public final /* synthetic */ C2XI A02;
    public final /* synthetic */ C2XI A03;
    public final /* synthetic */ BPC A04;

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
        C14360o3.A0B(c120985dq, 0);
        BPC bpc = this.A04;
        if (c120985dq.equals(bpc.A01)) {
            this.A03.A00(Integer.valueOf(i));
            C75113Zb c75113Zb = bpc.A02.A0E;
            if (c75113Zb != null) {
                int intValue = ((Number) c75113Zb.A3X.A00).intValue();
                Integer valueOf = Integer.valueOf(intValue);
                int i3 = 0;
                if (intValue >= 0 && valueOf != null) {
                    C2XI c2xi = this.A01;
                    c2xi.A00(valueOf);
                    Number number = (Number) c2xi.A00;
                    if (number != null) {
                        i3 = number.intValue();
                    }
                    this.A02.A00(Long.valueOf(C36J.A06(C36G.A09, C36H.A03(C36G.A06, ((i3 * i2) + i2) - i)) + 1));
                }
            }
        }
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
        C14360o3.A0B(c120985dq, 0);
        if (C14360o3.A0K(this.A04.A01, c120985dq)) {
            this.A00.A00(true);
        }
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
        C14360o3.A0B(c120985dq, 0);
        if (C14360o3.A0K(this.A04.A01, c120985dq)) {
            this.A00.A00(false);
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    public BPD(C2XI c2xi, C2XI c2xi2, C2XI c2xi3, C2XI c2xi4, BPC bpc) {
        this.A04 = bpc;
        this.A03 = c2xi;
        this.A01 = c2xi2;
        this.A02 = c2xi3;
        this.A00 = c2xi4;
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
