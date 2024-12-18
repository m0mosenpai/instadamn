package X;

/* loaded from: classes9.dex */
public final class PPN implements Runnable {
    public final /* synthetic */ C55039OZl A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public PPN(C55039OZl c55039OZl, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c55039OZl;
        this.A01 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A03.remove(this.A01);
    }
}
