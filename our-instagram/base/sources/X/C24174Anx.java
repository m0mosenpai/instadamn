package X;

import android.view.ViewGroup;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;

/* renamed from: X.Anx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24174Anx implements InterfaceC59892oW {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;

    public C24174Anx(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // X.InterfaceC59892oW
    public final void Dnp(int i, int i2) {
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        ViewGroup viewGroup = directAggregatedMediaViewerController.A08;
        if (viewGroup != null) {
            AbstractC13880nE.A0s(viewGroup, new GRE(viewGroup, directAggregatedMediaViewerController, i, i2));
        }
    }
}
