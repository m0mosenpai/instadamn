package X;

import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;

/* renamed from: X.GGj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36714GGj implements InterfaceC125355lh {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;

    public C36714GGj(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        KL4 kl4 = this.A00.A0I;
        if (kl4 == null) {
            C14360o3.A0F("pagerAdapter");
            throw C00O.createAndThrow();
        }
        kl4.A03 = false;
    }
}
