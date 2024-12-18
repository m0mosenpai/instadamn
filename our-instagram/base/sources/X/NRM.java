package X;

/* loaded from: classes9.dex */
public final class NRM extends C55654Onf {
    public final C47Z A00;

    public NRM(C47Z c47z) {
        this.A00 = c47z;
    }

    @Override // X.C55654Onf, X.InterfaceC65613To4
    public final void onBytesTransferred(long j, long j2) {
        super.onBytesTransferred(j, j2);
        if (j2 > 0) {
            double d = j / j2;
            C47Z c47z = this.A00;
            if (c47z.A1G == EnumC40111tc.A0Q) {
                c47z.A0e(C05F.A00, d);
                c47z.A0e(C05F.A01, d);
                if (c47z.A0D().A00 && c47z.A0z()) {
                    return;
                }
            }
            c47z.A0e(C05F.A0C, d);
        }
    }
}
