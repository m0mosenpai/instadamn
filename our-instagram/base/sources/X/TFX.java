package X;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class TFX implements InterfaceC65592TnX, InterfaceC65528Tlx {
    public InterfaceC65528Tlx A00;
    public final InterfaceC65592TnX A01;

    @Override // X.InterfaceC65592TnX
    public final void DED(C61030Rdy c61030Rdy) {
        C14360o3.A0B(c61030Rdy, 0);
        C11T.A05("This operation can't be run on UI thread.");
        this.A01.DED(c61030Rdy);
    }

    @Override // X.InterfaceC65528Tlx
    public final void AGv(int i, boolean z) {
        InterfaceC65528Tlx interfaceC65528Tlx = this.A00;
        if (interfaceC65528Tlx != null) {
            interfaceC65528Tlx.AGv(i, z);
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void DgD() {
        C11T.A05("This operation can't be run on UI thread.");
        this.A01.DgD();
    }

    @Override // X.InterfaceC65592TnX
    public final void Dgg(C3JQ c3jq) {
        C11T.A05("This operation can't be run on UI thread.");
        this.A01.Dgg(c3jq);
    }

    @Override // X.InterfaceC65592TnX
    public final void E22() {
        C11T.A05("This operation can't be run on UI thread.");
        this.A01.E22();
    }

    @Override // X.InterfaceC65528Tlx
    public final void cancel() {
        InterfaceC65528Tlx interfaceC65528Tlx = this.A00;
        if (interfaceC65528Tlx != null) {
            this.A00 = null;
            interfaceC65528Tlx.cancel();
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void onBody(ByteBuffer byteBuffer) {
        C11T.A05("This operation can't be run on UI thread.");
        this.A01.onBody(byteBuffer);
    }

    @Override // X.InterfaceC65592TnX
    public final void onEOM() {
        C11T.A05("This operation can't be run on UI thread.");
        this.A01.onEOM();
    }

    @Override // X.InterfaceC65592TnX
    public final void onFirstByteFlushed(long j) {
        C11T.A05("This operation can't be run on UI thread.");
        this.A01.onFirstByteFlushed(j);
    }

    @Override // X.InterfaceC65592TnX
    public final void onHeaderBytesReceived(long j, long j2) {
        C11T.A05("This operation can't be run on UI thread.");
        this.A01.onHeaderBytesReceived(j, j2);
    }

    @Override // X.InterfaceC65592TnX
    public final void onLastByteAcked(long j, long j2) {
        C11T.A05("This operation can't be run on UI thread.");
        this.A01.onLastByteAcked(j, j2);
    }

    public TFX(InterfaceC65592TnX interfaceC65592TnX) {
        this.A01 = interfaceC65592TnX;
    }
}
