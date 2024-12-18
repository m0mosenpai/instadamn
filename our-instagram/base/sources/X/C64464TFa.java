package X;

import com.facebook.proxygen.HTTPRequestHandler;

/* renamed from: X.TFa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64464TFa implements InterfaceC65528Tlx {
    public final HTTPRequestHandler A00;

    @Override // X.InterfaceC65528Tlx
    public final void AGv(int i, boolean z) {
        this.A00.changePriority((byte) i, z);
    }

    @Override // X.InterfaceC65528Tlx
    public final void cancel() {
        this.A00.cancel();
    }

    public C64464TFa(HTTPRequestHandler hTTPRequestHandler) {
        this.A00 = hTTPRequestHandler;
    }
}
