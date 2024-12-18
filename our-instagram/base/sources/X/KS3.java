package X;

/* loaded from: classes8.dex */
public final class KS3 extends AbstractC161667Mb {
    public final KHX A00;
    public final C44760Jrh A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KS3(KHX khx, C44760Jrh c44760Jrh) {
        super(c44760Jrh, khx);
        C14360o3.A0B(khx, 2);
        this.A01 = c44760Jrh;
        this.A00 = khx;
    }

    @Override // X.AbstractC161687Md
    public final boolean A01() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KS3) {
                KS3 ks3 = (KS3) obj;
                if (!C14360o3.A0K(this.A01, ks3.A01) || !C14360o3.A0K(this.A00, ks3.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }
}
