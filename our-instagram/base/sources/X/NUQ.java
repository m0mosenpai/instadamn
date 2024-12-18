package X;

/* loaded from: classes9.dex */
public final class NUQ extends Tx3 {
    public final C69727VuM A00;

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        if ((abstractC127945qN instanceof NUQ) && C14360o3.A0K(this.A00, ((NUQ) abstractC127945qN).A00)) {
            return true;
        }
        return false;
    }

    public NUQ(C69727VuM c69727VuM) {
        super(AnonymousClass001.A0i("hcm_", AbstractC68481VSm.A00(c69727VuM.A01()), c69727VuM.A03, '_'));
        this.A00 = c69727VuM;
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 30L;
    }
}
