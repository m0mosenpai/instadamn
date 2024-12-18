package X;

/* loaded from: classes11.dex */
public final class WVX implements InterfaceC71970XDc {
    public final C70163WEd A00;

    @Override // X.InterfaceC71970XDc
    public final int B8b(int i) {
        return this.A00.A0A[i];
    }

    @Override // X.InterfaceC71970XDc
    public final int BPM() {
        return this.A00.A01;
    }

    @Override // X.InterfaceC71970XDc
    public final int getFrameCount() {
        return this.A00.A06.getFrameCount();
    }

    @Override // X.InterfaceC71970XDc
    public final int getLoopCount() {
        return this.A00.A06.getLoopCount();
    }

    public WVX(C70163WEd c70163WEd) {
        this.A00 = c70163WEd;
    }
}
