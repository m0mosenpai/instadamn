package X;

/* renamed from: X.Is6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42527Is6 implements C3CQ {
    public final /* synthetic */ C38016Go3 A00;

    @Override // X.C3CQ
    public final boolean AJk(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C42748Ivm c42748Ivm = (C42748Ivm) ((AbstractC65202xI) this.A00.A01()).A00;
        String id = c38321qM.getId();
        if (id != null) {
            return c42748Ivm.A04(id);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C3CQ
    public final void DSP(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C38018Go6.A00(this.A00.A01());
    }

    public C42527Is6(C38016Go3 c38016Go3) {
        this.A00 = c38016Go3;
    }
}
