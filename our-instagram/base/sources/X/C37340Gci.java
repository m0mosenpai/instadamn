package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Gci, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37340Gci implements InterfaceC41501vz {
    public final /* synthetic */ C142206bd A00;

    public C37340Gci(C142206bd c142206bd) {
        this.A00 = c142206bd;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1293992508);
        C42238InO c42238InO = (C42238InO) obj;
        int A032 = C0f9.A03(-1850654431);
        C14360o3.A0B(c42238InO, 0);
        boolean z = c42238InO.A00;
        C142206bd c142206bd = this.A00;
        if (z) {
            InterfaceC1118853a interfaceC1118853a = c142206bd.A02;
            interfaceC1118853a.EJ8(true);
            c142206bd.A00 = true;
            if (!((ReelViewerFragment) interfaceC1118853a).A2r) {
                interfaceC1118853a.EJE("BKStoryViewerTooltipEvent");
            }
        } else {
            c142206bd.A00 = false;
            InterfaceC1118853a interfaceC1118853a2 = c142206bd.A02;
            if (!((ReelViewerFragment) interfaceC1118853a2).A2r) {
                interfaceC1118853a2.EJJ();
            }
        }
        C0f9.A0A(-89881454, A032);
        C0f9.A0A(298461422, A03);
    }
}
