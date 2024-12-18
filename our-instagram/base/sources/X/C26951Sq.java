package X;

/* renamed from: X.1Sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26951Sq extends C0R8 {
    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "SharedPrefsANRFixer";
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (A05(C10420hA.class) != null && C20150ym.A07(AbstractC20100yh.A00(36314103109257654L))) {
            if (!((Boolean) C1TM.A04.get()).booleanValue()) {
                A09("RefQueuedWork is not supported");
            } else {
                new C1TP(this).A01();
                A08();
            }
        }
    }
}
