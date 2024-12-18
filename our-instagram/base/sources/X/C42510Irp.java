package X;

/* renamed from: X.Irp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42510Irp implements XDO {
    public final /* synthetic */ C38P A00;

    public C42510Irp(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.XDO
    public final long BUA() {
        return AbstractC166987dD.A0N(this.A00.A0v.getValue());
    }

    @Override // X.XDO
    public final boolean CPJ() {
        boolean z = C23051Ak.A05;
        return C23061Al.A00(this.A00.getSession()).A00(EnumC23071Am.A0D);
    }

    @Override // X.XDO
    public final boolean CZL() {
        C24151Gk c24151Gk = AbstractC24161Gl.A00;
        if (c24151Gk != null) {
            boolean A1N = AbstractC167007dF.A1N(c24151Gk.A00.get());
            if (Boolean.valueOf(A1N) != null) {
                return A1N;
            }
            return false;
        }
        return false;
    }
}
