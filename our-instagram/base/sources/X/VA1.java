package X;

/* loaded from: classes11.dex */
public final class VA1 extends Tx3 {
    public C69727VuM A00;
    public UPQ A01;

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        if (abstractC127945qN instanceof VA1) {
            VA1 va1 = (VA1) abstractC127945qN;
            if (C14360o3.A0K(this.A00, va1.A00) && C14360o3.A0K(this.A01, va1.A01)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 30L;
    }
}
