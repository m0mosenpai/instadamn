package X;

/* renamed from: X.Ahr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23898Ahr implements InterfaceC184088Ex {
    public final /* synthetic */ LIj A00;

    public C23898Ahr(LIj lIj) {
        this.A00 = lIj;
    }

    @Override // X.InterfaceC184088Ex
    public final void DOq(int i) {
        LIj lIj = this.A00;
        C95334Qt c95334Qt = lIj.A03;
        if (c95334Qt != null) {
            c95334Qt.seekTo(i);
        }
        lIj.A01 = i;
    }

    @Override // X.InterfaceC184088Ex
    public final void DhS(int i) {
        LIj lIj = this.A00;
        C95334Qt c95334Qt = lIj.A03;
        if (c95334Qt != null) {
            c95334Qt.seekTo(lIj.A01);
        }
        lIj.A00 = i;
    }

    @Override // X.InterfaceC184088Ex
    public final void Djy(int i) {
        C95334Qt c95334Qt = this.A00.A03;
        if (c95334Qt != null) {
            c95334Qt.seekTo(i);
        }
    }

    @Override // X.InterfaceC184088Ex
    public final void DuJ(boolean z) {
        LIj lIj = this.A00;
        lIj.A04 = false;
        lIj.A08.postOnAnimation(lIj.A0D);
    }

    @Override // X.InterfaceC184088Ex
    public final void DuL(boolean z) {
        this.A00.A04 = true;
    }
}
