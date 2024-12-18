package X;

/* loaded from: classes11.dex */
public final class VA4 extends Tx3 {
    public final XFM A00;

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        if ((abstractC127945qN instanceof VA4) && this.A00 == ((VA4) abstractC127945qN).A00) {
            return true;
        }
        return false;
    }

    public VA4(XFM xfm) {
        super("meta_ai_suggestion");
        this.A00 = xfm;
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 30L;
    }
}
