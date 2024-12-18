package X;

/* renamed from: X.MYb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50660MYb extends MYc {
    public final /* synthetic */ C50668MYm A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ boolean A02;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1248128195);
        C38071Gp0 c38071Gp0 = (C38071Gp0) obj;
        int A0N = AbstractC167017dG.A0N(c38071Gp0, -1000780247);
        this.A00.A03.DgT(c38071Gp0, this.A01, super.A00, this.A02, c38071Gp0.CR4());
        C0f9.A0A(594594275, A0N);
        C0f9.A0A(-1628337119, A03);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50660MYb(C50668MYm c50668MYm, Object obj, boolean z) {
        super(c50668MYm, obj);
        this.A00 = c50668MYm;
        this.A02 = z;
        this.A01 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1636250784);
        this.A00.A03.Dfr(abstractC115105If, super.A00);
        C0f9.A0A(542583452, A0N);
    }
}
