package X;

/* renamed from: X.Amk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24099Amk implements InterfaceC1119153d {
    public final /* synthetic */ C8ZD A00;

    public C24099Amk(C8ZD c8zd) {
        this.A00 = c8zd;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        C8ZD c8zd = this.A00;
        C189448aO c189448aO = c8zd.A01;
        if (c189448aO != null) {
            c189448aO.A0T = null;
        }
        c8zd.A00 = null;
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        try {
            C189478aR c189478aR = this.A00.A00;
            if (c189478aR != null) {
                c189478aR.A05();
            }
        } catch (IllegalStateException e) {
            C0w9.A06("MiniGallery", "exception when clearing BottomSheet back stack", e);
        }
    }
}
