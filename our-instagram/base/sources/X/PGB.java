package X;

/* loaded from: classes9.dex */
public final class PGB implements InterfaceC57990Pna {
    public final /* synthetic */ C128175qm A00;
    public final /* synthetic */ N6J A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public PGB(C128175qm c128175qm, N6J n6j, String str, String str2, boolean z) {
        this.A01 = n6j;
        this.A04 = z;
        this.A02 = str;
        this.A00 = c128175qm;
        this.A03 = str2;
    }

    @Override // X.InterfaceC57990Pna
    public final void afterSelection(boolean z) {
        N6J n6j = this.A01;
        if (n6j.getRootActivity() != null) {
            boolean z2 = this.A04;
            N6J.A0D(this.A00, n6j, this.A02, this.A03, z2);
        }
    }
}
