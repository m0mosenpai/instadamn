package X;

/* loaded from: classes4.dex */
public final class AZ6 implements InterfaceC180227zC {
    public final InterfaceC178897x1 A00;
    public final C179877yd A01;
    public final InterfaceC180297zJ A02 = new Object();
    public final C180307zK A03;

    @Override // X.InterfaceC180227zC
    public final void AVe() {
    }

    @Override // X.InterfaceC180227zC
    public final void flush() {
    }

    @Override // X.InterfaceC180227zC
    public final void makeCurrent() {
    }

    @Override // X.InterfaceC180227zC
    public final void release() {
    }

    @Override // X.InterfaceC180227zC
    public final InterfaceC178897x1 B09() {
        InterfaceC178897x1 interfaceC178897x1 = this.A00;
        if (interfaceC178897x1 != null) {
            return interfaceC178897x1;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC180227zC
    public final C179877yd BiH() {
        return this.A01;
    }

    @Override // X.InterfaceC180227zC
    public final C180307zK Bmp() {
        return this.A03;
    }

    @Override // X.InterfaceC180227zC
    public final C180347zO C4K() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC180227zC
    public final InterfaceC180297zJ C6t() {
        return this.A02;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.7zJ] */
    public AZ6(InterfaceC178897x1 interfaceC178897x1, C179877yd c179877yd, C178847ww c178847ww, C178907x2 c178907x2) {
        this.A01 = c179877yd;
        this.A03 = new C180307zK(c178847ww, c178907x2);
        this.A00 = interfaceC178897x1;
    }

    @Override // X.InterfaceC180227zC
    public final InterfaceC178897x1 B0A(int i) {
        return B09();
    }
}
