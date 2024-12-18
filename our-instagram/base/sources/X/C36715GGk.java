package X;

import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;

/* renamed from: X.GGk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36715GGk implements InterfaceC125355lh {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;

    public C36715GGk(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        DirectAggregatedMediaViewerController.A0P(directAggregatedMediaViewerController);
        FIW fiw = (FIW) C15500q5.A04(AbstractC34378FDu.A00).remove(directAggregatedMediaViewerController.A0Z);
        if (fiw != null) {
            fiw.A00.DHB();
        }
        DirectAggregatedMediaViewerController.A0O(directAggregatedMediaViewerController);
    }
}
