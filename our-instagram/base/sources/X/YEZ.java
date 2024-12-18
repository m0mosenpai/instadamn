package X;

/* loaded from: classes12.dex */
public final class YEZ implements InterfaceC12870lZ {
    public final /* synthetic */ C72501XfF A00;
    public final /* synthetic */ C72506XfL A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public YEZ(C72501XfF c72501XfF, C72506XfL c72506XfL, boolean z, boolean z2) {
        this.A03 = z;
        this.A01 = c72506XfL;
        this.A02 = z2;
        this.A00 = c72501XfF;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1827709525);
        if (this.A03) {
            this.A01.A00(2, null);
        }
        if (this.A02) {
            this.A01.A00(6, null);
        }
        C0f9.A0A(-1034895611, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1837140771);
        if (this.A03) {
            this.A01.A00(1, null);
        }
        if (this.A02) {
            this.A01.A00(5, this.A00);
        }
        C0f9.A0A(209747707, A03);
    }
}
