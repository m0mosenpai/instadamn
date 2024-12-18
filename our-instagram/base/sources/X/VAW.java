package X;

/* loaded from: classes11.dex */
public final class VAW extends C70077W1u implements InterfaceC71959XCl {
    public VJX A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.VJX, java.lang.Object] */
    public final void A00(String str) {
        ?? obj = new Object();
        obj.A02 = str;
        obj.A01 = str;
        this.A00 = obj;
    }

    @Override // X.InterfaceC71959XCl
    public final VJX Ac4() {
        return this.A00;
    }

    @Override // X.InterfaceC71959XCl
    public final boolean CM8() {
        VJX vjx = this.A00;
        if (vjx != null && vjx.A02 != null) {
            return true;
        }
        return false;
    }
}
