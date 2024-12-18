package X;

/* renamed from: X.GgY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37577GgY {
    public final C64842wi A00;
    public final C37756GjV A01;

    public C37577GgY(C64842wi c64842wi, C37756GjV c37756GjV) {
        AbstractC167017dG.A1P(c37756GjV, c64842wi);
        this.A01 = c37756GjV;
        this.A00 = c64842wi;
    }

    public final void A00(C4NL c4nl, Integer num) {
        boolean A1a = AbstractC167017dG.A1a(c4nl, num);
        this.A00.Dco(c4nl, num, null);
        if (num == C05F.A0N) {
            C37756GjV c37756GjV = this.A01;
            C120985dq c120985dq = (C120985dq) c37756GjV.A02.get(c4nl);
            if (c120985dq != null) {
                C37546Gg2.A03(c37756GjV.A03).A0U(c120985dq, A1a);
            }
        }
    }
}
