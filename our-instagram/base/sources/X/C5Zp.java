package X;

/* renamed from: X.5Zp, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Zp extends C58J implements InterfaceC1129358c, InterfaceC1129458d {
    public C6OE A00;
    public boolean A01;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ps, java.lang.Object] */
    @Override // X.InterfaceC1129358c
    public final void DWO() {
        C6OD c6od;
        ?? obj = new Object();
        AbstractC137676Lo.A00(this, new C9F8(0, obj, this));
        C6OF c6of = (C6OF) obj.A00;
        if (this.A01) {
            C6OE c6oe = this.A00;
            if (c6oe != null) {
                c6oe.release();
            }
            if (c6of != null) {
                c6od = c6of.E4L();
            } else {
                c6od = null;
            }
            this.A00 = c6od;
        }
    }
}
