package X;

/* loaded from: classes9.dex */
public final class NQM extends MYc {
    public final /* synthetic */ C50668MYm A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ boolean A02;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1501588058);
        HY1 hy1 = (HY1) obj;
        int A0N = AbstractC167017dG.A0N(hy1, 1631363951);
        this.A00.A03.DgT(hy1, this.A01, super.A00, this.A02, hy1.CR4());
        C0f9.A0A(-1324184006, A0N);
        C0f9.A0A(-261248581, A03);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NQM(C50668MYm c50668MYm, Object obj, boolean z) {
        super(c50668MYm, obj);
        this.A00 = c50668MYm;
        this.A02 = z;
        this.A01 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1330587410);
        this.A00.A03.Dfr(abstractC115105If, super.A00);
        C0f9.A0A(-28943565, A0N);
    }
}
