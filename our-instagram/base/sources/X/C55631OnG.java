package X;

/* renamed from: X.OnG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55631OnG implements InterfaceC57898Pm2 {
    public final /* synthetic */ C55039OZl A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public C55631OnG(C55039OZl c55039OZl, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c55039OZl;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC57898Pm2
    public final void cancel() {
        C55039OZl c55039OZl = this.A00;
        MSW.A09(c55039OZl.A04).post(new PPN(c55039OZl, this.A01));
    }
}
