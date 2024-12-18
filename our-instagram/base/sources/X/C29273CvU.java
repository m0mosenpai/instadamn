package X;

/* renamed from: X.CvU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29273CvU implements C7GU {
    public final /* synthetic */ C123735in A00;
    public final /* synthetic */ BTX A01;

    public C29273CvU(C123735in c123735in, BTX btx) {
        this.A01 = btx;
        this.A00 = c123735in;
    }

    @Override // X.C7GU
    public final void Cy3() {
        this.A01.A03(true);
    }

    @Override // X.C7GU
    public final void Cy4(int i, int i2, boolean z) {
        BTX btx = this.A01;
        btx.A01(i2 - i);
        btx.A03(false);
        if (i == i2) {
            this.A00.A02(true);
        }
    }
}
