package X;

import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.model.reels.Reel;

/* loaded from: classes11.dex */
public final class Wm5 implements InterfaceC63982vJ {
    public final int A00;
    public final Object A01;

    public Wm5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC63982vJ
    public final void DHC(Reel reel, C6X4 c6x4) {
        switch (this.A00) {
            case 0:
                LocationDetailFragment locationDetailFragment = (LocationDetailFragment) this.A01;
                if (!locationDetailFragment.isResumed()) {
                    return;
                }
                LocationDetailFragment.A01(locationDetailFragment);
                C66095TzW.A00(locationDetailFragment.A01.A03);
                ((MediaMapFragment) locationDetailFragment.requireParentFragment()).mMapChromeController.A03();
                return;
            case 1:
                C52198N8n c52198N8n = ((V1F) this.A01).A02;
                if (c52198N8n == null) {
                    C14360o3.A0F("searchAdapter");
                    throw C00O.createAndThrow();
                }
                c52198N8n.A00();
                return;
            case 2:
                ((InterfaceC16820sZ) this.A01).invoke();
                return;
            case 3:
                ((C65921TwS) this.A01).A02.DeJ();
                return;
            case 4:
                V1E.A00(((C70987Wlx) this.A01).A00);
                return;
            default:
                V1D.A00(((C70988Wly) this.A01).A00);
                return;
        }
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }
}
