package X;

/* loaded from: classes9.dex */
public final class NRO extends C55654Onf {
    public final /* synthetic */ C47Z A00;

    public NRO(C47Z c47z) {
        this.A00 = c47z;
    }

    @Override // X.C55654Onf, X.InterfaceC65613To4
    public final void onBytesTransferred(long j, long j2) {
        super.onBytesTransferred(j, j2);
        if (j2 > 0) {
            this.A00.A0e(C05F.A01, ((float) j) / ((float) j2));
        }
    }
}
