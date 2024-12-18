package X;

/* loaded from: classes9.dex */
public final class NQL extends MYc {
    public final /* synthetic */ C50668MYm A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ boolean A02;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1292452917);
        C73448YDr c73448YDr = (C73448YDr) obj;
        int A0N = AbstractC167017dG.A0N(c73448YDr, -264948103);
        this.A00.A03.DgT(c73448YDr, this.A01, super.A00, this.A02, c73448YDr.CR4());
        C0f9.A0A(-330687658, A0N);
        C0f9.A0A(196216436, A03);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NQL(C50668MYm c50668MYm, Object obj, boolean z) {
        super(c50668MYm, obj);
        this.A00 = c50668MYm;
        this.A02 = z;
        this.A01 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -731839132);
        this.A00.A03.Dfr(abstractC115105If, super.A00);
        C0f9.A0A(-19750948, A0N);
    }
}
