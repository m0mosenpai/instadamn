package X;

/* loaded from: classes10.dex */
public final class T72 implements InterfaceC65424Tjv {
    public final /* synthetic */ C58427Pv6 A00;
    public final /* synthetic */ C48262Jq A01;

    public T72(C58427Pv6 c58427Pv6, C48262Jq c48262Jq) {
        this.A01 = c48262Jq;
        this.A00 = c58427Pv6;
    }

    @Override // X.InterfaceC65424Tjv
    public final void onFailure(Exception exc) {
        this.A00.A00(exc);
    }
}
