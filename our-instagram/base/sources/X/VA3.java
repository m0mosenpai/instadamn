package X;

/* loaded from: classes11.dex */
public final class VA3 extends Tx3 {
    public final C38657Gyy A00;

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        if ((abstractC127945qN instanceof VA3) && C14360o3.A0K(this.A00, ((VA3) abstractC127945qN).A00)) {
            return true;
        }
        return false;
    }

    public VA3(C38657Gyy c38657Gyy) {
        super("see_results");
        this.A00 = c38657Gyy;
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 30L;
    }
}
