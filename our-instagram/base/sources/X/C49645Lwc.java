package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Lwc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49645Lwc implements MPI {
    public final int A00;
    public final Object A01;

    public C49645Lwc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.MPI
    public final void Dd0() {
        if (this.A00 != 0) {
            ReelViewerFragment.A0I((ReelViewerFragment) this.A01, false);
            return;
        }
        InterfaceC1118853a interfaceC1118853a = ((C45442KAd) this.A01).A02;
        if (interfaceC1118853a == null) {
            C14360o3.A0F("reelViewerDelegate");
            throw C00O.createAndThrow();
        }
        interfaceC1118853a.EJJ();
    }
}
