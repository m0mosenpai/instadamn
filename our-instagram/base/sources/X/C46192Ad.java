package X;

/* renamed from: X.2Ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46192Ad {
    public int A00;
    public int A01;
    public Integer A02 = C05F.A00;
    public final /* synthetic */ C2AZ A03;

    public C46192Ad(C2AZ c2az) {
        this.A03 = c2az;
    }

    public final void A00(boolean z, boolean z2) {
        int intValue = this.A02.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (!z) {
                    if (z2) {
                        return;
                    }
                }
                this.A02 = C05F.A01;
                this.A00++;
            }
            if (!z2) {
                if (z) {
                    return;
                }
            }
            this.A02 = C05F.A0C;
            this.A01++;
            return;
            this.A02 = C05F.A00;
            return;
        }
        if (!z) {
            if (!z2) {
                return;
            }
            this.A02 = C05F.A0C;
            this.A01++;
            return;
        }
        this.A02 = C05F.A01;
        this.A00++;
    }
}
