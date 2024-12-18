package X;

/* renamed from: X.Wej, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70663Wej implements XCS {
    public final /* synthetic */ XCK A00;

    public C70663Wej(XCK xck) {
        this.A00 = xck;
    }

    @Override // X.XCS
    public final void DFf() {
        this.A00.DFf();
    }

    @Override // X.XCS
    public final void DqJ(boolean z) {
        XCK xck = this.A00;
        if (z) {
            xck.onSuccess();
        } else {
            xck.DFf();
        }
    }
}
