package X;

/* renamed from: X.Ivh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42743Ivh implements InterfaceC64542wD {
    public final /* synthetic */ C114485Es A00;

    @Override // X.InterfaceC64542wD
    public final void Ds9() {
    }

    public C42743Ivh(C114485Es c114485Es) {
        this.A00 = c114485Es;
    }

    @Override // X.InterfaceC64542wD
    public final void DsA() {
        HLQ hlq = this.A00.A07;
        if (hlq == null) {
            C14360o3.A0F("feedMediaLoadingTracker");
            throw C00O.createAndThrow();
        }
        hlq.A08(null, false);
    }
}
