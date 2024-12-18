package X;

/* renamed from: X.AyY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24812AyY implements Runnable {
    public final /* synthetic */ InterfaceC25201BCz A00;
    public final /* synthetic */ C198278pc A01;
    public final /* synthetic */ C15370ps A02;

    public RunnableC24812AyY(InterfaceC25201BCz interfaceC25201BCz, C198278pc c198278pc, C15370ps c15370ps) {
        this.A01 = c198278pc;
        this.A00 = interfaceC25201BCz;
        this.A02 = c15370ps;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C198278pc c198278pc = this.A01;
        if (!AbstractC166987dD.A1b(c198278pc.A09) && c198278pc.A03 == null) {
            this.A00.onFailure((Exception) this.A02.A00);
        } else {
            this.A00.onSuccess();
        }
    }
}
