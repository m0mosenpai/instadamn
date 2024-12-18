package X;

/* renamed from: X.GpJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38090GpJ implements InterfaceC64542wD {
    public final /* synthetic */ C38P A00;

    @Override // X.InterfaceC64542wD
    public final void Ds9() {
    }

    public C38090GpJ(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.InterfaceC64542wD
    public final void DsA() {
        C38082GpB c38082GpB = this.A00.A0I;
        if (c38082GpB == null) {
            C14360o3.A0F("gridMediaLoadingTracker");
            throw C00O.createAndThrow();
        }
        c38082GpB.A05(false, false);
    }
}
