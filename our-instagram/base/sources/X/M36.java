package X;

/* loaded from: classes8.dex */
public final class M36 implements Runnable {
    public final /* synthetic */ C168127f7 A00;
    public final /* synthetic */ InterfaceC166277bw A01;

    public M36(C168127f7 c168127f7, InterfaceC166277bw interfaceC166277bw) {
        this.A00 = c168127f7;
        this.A01 = interfaceC166277bw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.A03(C05F.A0N, ((C167827ec) this.A01).A01);
        } catch (IllegalArgumentException unused) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Error processing ui action ");
            C0K8.A0C("CommentListComponent", AbstractC166997dE.A0v(this.A01, A1C));
        }
    }
}
