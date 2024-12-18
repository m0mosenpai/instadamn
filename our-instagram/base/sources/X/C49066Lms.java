package X;

/* renamed from: X.Lms, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49066Lms implements InterfaceC50432MOm {
    public final /* synthetic */ C1579977j A00;
    public final /* synthetic */ C43678JTm A01;
    public final /* synthetic */ C7SX A02;

    public C49066Lms(C1579977j c1579977j, C43678JTm c43678JTm, C7SX c7sx) {
        this.A00 = c1579977j;
        this.A01 = c43678JTm;
        this.A02 = c7sx;
    }

    @Override // X.InterfaceC50432MOm
    public final void D6U(Object obj) {
        AbstractC167007dF.A0J().post(new RunnableC49995M5k(this.A00, this.A01, AbstractC46828KnN.A00(this.A02, (String) obj)));
    }
}
