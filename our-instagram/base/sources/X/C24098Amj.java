package X;

/* renamed from: X.Amj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24098Amj implements InterfaceC1119153d {
    public final /* synthetic */ C1825387s A00;

    public C24098Amj(C1825387s c1825387s) {
        this.A00 = c1825387s;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        C1825387s c1825387s = this.A00;
        C189448aO c189448aO = c1825387s.A01;
        if (c189448aO != null) {
            c189448aO.A0T = null;
        }
        c1825387s.A00 = null;
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        try {
            C189478aR c189478aR = this.A00.A00;
            if (c189478aR != null) {
                c189478aR.A05();
            }
        } catch (IllegalStateException e) {
            C0w9.A06("GreenscreenGallery", "exception when clearing BottomSheet back stack", e);
        }
    }
}
