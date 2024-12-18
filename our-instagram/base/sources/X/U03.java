package X;

/* loaded from: classes11.dex */
public final class U03 implements XAp {
    public final /* synthetic */ C38P A00;

    public U03(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.XAp
    public final void DKL(float f) {
        C65823Tug c65823Tug = this.A00.A06;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        UHC uhc = c65823Tug.A03;
        if (uhc != null) {
            uhc.A00 = (int) f;
        }
    }
}
