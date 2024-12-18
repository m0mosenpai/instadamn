package X;

import com.facebook.proxygen.HTTPTransportCallback;

/* renamed from: X.Szc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64120Szc implements HTTPTransportCallback {
    public final C1QW A00;
    public final InterfaceC65592TnX A01;
    public final C18240vB A02;

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public final void bodyBytesGenerated(long j) {
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public final void bodyBytesReceived(long j) {
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public final void firstHeaderByteFlushed() {
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public final int getEnabledCallbackFlag() {
        return 106;
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public final void headerBytesGenerated(long j, long j2) {
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public final void lastByteFlushed() {
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public final void headerBytesReceived(long j, long j2) {
        this.A02.ATO(new C60911RbQ(this, j, j2));
    }

    public C64120Szc(C1QW c1qw, InterfaceC65592TnX interfaceC65592TnX, C18240vB c18240vB) {
        AbstractC167027dH.A13(interfaceC65592TnX, c18240vB, c1qw);
        this.A01 = interfaceC65592TnX;
        this.A02 = c18240vB;
        this.A00 = c1qw;
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public final void firstByteFlushed() {
        this.A02.ATO(new C60910RbP(this, System.currentTimeMillis()));
    }

    @Override // com.facebook.proxygen.HTTPTransportCallback
    public final void lastByteAcked(long j) {
        this.A02.ATO(new C60912RbR(this, j, System.currentTimeMillis()));
    }
}
