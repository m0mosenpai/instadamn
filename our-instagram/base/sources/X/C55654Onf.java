package X;

/* renamed from: X.Onf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C55654Onf implements XE6, InterfaceC65613To4 {
    public int A00;
    public long A01 = -1;
    public final C95394Qz A02 = new C95394Qz();
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(C57395Pdt.A00);

    @Override // X.XE6
    public final void D1z() {
    }

    @Override // X.XE6
    public final void D6h(W63 w63) {
    }

    @Override // X.XE6
    public final void DFz(VIA via) {
    }

    @Override // X.XE6
    public final void Dbk(float f) {
        float min = Math.min(Math.max(f, 0.0f), 1.0f);
        onBytesTransferred(min * ((float) r2), this.A01);
    }

    @Override // X.XE6
    public final void onStart() {
    }

    public void onBytesTransferred(long j, long j2) {
        this.A01 = j2;
        if (AbstractC167007dF.A1Z(this.A03)) {
            try {
                Thread.sleep(50L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
