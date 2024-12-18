package X;

/* renamed from: X.Weh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70661Weh implements XCR {
    public final /* synthetic */ XCK A00;

    public C70661Weh(XCK xck) {
        this.A00 = xck;
    }

    @Override // X.XCR
    public final void DFf() {
        this.A00.DFf();
    }

    @Override // X.XCR
    public final void DqL(boolean z, boolean z2) {
        if (!z && !z2) {
            this.A00.DFf();
        } else {
            this.A00.onSuccess();
        }
    }
}
