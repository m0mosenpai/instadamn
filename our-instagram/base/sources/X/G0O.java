package X;

import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;

/* loaded from: classes6.dex */
public final class G0O implements InterfaceC30936Diq {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;

    public G0O(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // X.InterfaceC30936Diq
    public final void Dmq(int i, int i2) {
        KL4 kl4 = this.A00.A0I;
        if (kl4 == null) {
            C14360o3.A0F("pagerAdapter");
            throw C00O.createAndThrow();
        }
        kl4.A05 = true;
    }
}
