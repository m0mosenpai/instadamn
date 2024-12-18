package X;

/* loaded from: classes10.dex */
public final class TFD implements InterfaceC40801un {
    public int A00;
    public byte[] A01;
    public C23781El[] A02;
    public int A03;
    public long A04;

    @Override // X.InterfaceC40801un
    public final long getResponseTimestamp() {
        return this.A04;
    }

    @Override // X.InterfaceC40801un
    public final int getStatusCode() {
        return this.A00;
    }

    @Override // X.InterfaceC40801un
    public final boolean isOk() {
        return AbstractC167007dF.A1P(this.A00, 200);
    }

    @Override // X.InterfaceC40801un
    public final void setFromDiskCache(boolean z) {
    }

    @Override // X.InterfaceC40801un
    public final void setResponseId(int i) {
        this.A03 = i;
    }

    @Override // X.InterfaceC40801un
    public final void setResponseTimestamp(long j) {
        this.A04 = j;
    }

    @Override // X.InterfaceC40801un
    public final void setServerElapsedTime(long j) {
    }

    @Override // X.InterfaceC40801un
    public final void setStatusCode(int i) {
        this.A00 = i;
    }
}
