package X;

/* renamed from: X.GkJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37804GkJ implements InterfaceC73023Pd {
    public final /* synthetic */ C120985dq A00;
    public final /* synthetic */ C37644Ghd A01;
    public final /* synthetic */ C37563GgJ A02;
    public final /* synthetic */ C37626GhL A03;
    public final /* synthetic */ C25370BKn A04;

    @Override // X.InterfaceC73023Pd
    public final void DFp() {
    }

    public C37804GkJ(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C37626GhL c37626GhL, C25370BKn c25370BKn) {
        this.A01 = c37644Ghd;
        this.A02 = c37563GgJ;
        this.A03 = c37626GhL;
        this.A00 = c120985dq;
        this.A04 = c25370BKn;
    }

    @Override // X.InterfaceC73023Pd
    public final void DPX(C73083Pj c73083Pj) {
        C75113Zb c75113Zb = this.A01.A0E;
        if (c75113Zb != null) {
            C37563GgJ c37563GgJ = this.A02;
            int position = c75113Zb.getPosition();
            C37556GgC A0N = c37563GgJ.A01.A0N();
            if (A0N.A04() <= position && position <= A0N.A06()) {
                C37626GhL c37626GhL = this.A03;
                C57782kr A00 = C57782kr.A00(c37626GhL.A04);
                C38321qM c38321qM = this.A00.A02;
                if (c38321qM != null) {
                    A00.A0O(c38321qM.A2u(), c37626GhL.A03.A0n);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            this.A04.A02().A0E = null;
        }
    }
}
