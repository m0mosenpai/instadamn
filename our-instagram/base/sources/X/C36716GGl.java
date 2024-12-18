package X;

import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;

/* renamed from: X.GGl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36716GGl implements InterfaceC125355lh {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;

    public C36716GGl(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        InterfaceC37230Gaf interfaceC37230Gaf;
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        KL4 kl4 = directAggregatedMediaViewerController.A0I;
        if (kl4 == null) {
            C14360o3.A0F("pagerAdapter");
            throw C00O.createAndThrow();
        }
        kl4.A03 = false;
        if (directAggregatedMediaViewerController.A1H && (interfaceC37230Gaf = directAggregatedMediaViewerController.A0M) != null) {
            interfaceC37230Gaf.A9G();
        }
    }
}
