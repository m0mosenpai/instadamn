package X;

/* loaded from: classes11.dex */
public final class VA5 extends Tx3 {
    public final C69749Vuj A00;

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        if ((abstractC127945qN instanceof VA5) && C14360o3.A0K(this.A00, ((VA5) abstractC127945qN).A00)) {
            return true;
        }
        return false;
    }

    public VA5(C69749Vuj c69749Vuj) {
        super("no_results");
        this.A00 = c69749Vuj;
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 30L;
    }
}
