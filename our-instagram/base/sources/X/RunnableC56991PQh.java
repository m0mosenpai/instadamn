package X;

/* renamed from: X.PQh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56991PQh implements Runnable {
    public final /* synthetic */ C3O0 A00;
    public final /* synthetic */ InterfaceC58191Pqx A01;

    public RunnableC56991PQh(C3O0 c3o0, InterfaceC58191Pqx interfaceC58191Pqx) {
        this.A00 = c3o0;
        this.A01 = interfaceC58191Pqx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC58191Pqx interfaceC58191Pqx;
        C3O0 c3o0 = this.A00;
        if (c3o0.A0B == C05F.A0C) {
            C54971OTd c54971OTd = c3o0.A06;
            if (c54971OTd != null) {
                interfaceC58191Pqx = c54971OTd.A02;
            } else {
                interfaceC58191Pqx = null;
            }
            if (interfaceC58191Pqx == this.A01) {
                C3O0.A02(c3o0);
            }
        }
    }
}
