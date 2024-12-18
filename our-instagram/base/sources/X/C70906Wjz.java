package X;

/* renamed from: X.Wjz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70906Wjz implements XAp {
    public final /* synthetic */ C38934HCh A00;

    public C70906Wjz(C38934HCh c38934HCh) {
        this.A00 = c38934HCh;
    }

    @Override // X.XAp
    public final void DKL(float f) {
        C65823Tug c65823Tug = this.A00.A03;
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
