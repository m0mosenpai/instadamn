package X;

import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class G58 implements InterfaceC50435MOp {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;

    public G58(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // X.InterfaceC50435MOp
    public final C83403nh BSc(String str) {
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        DirectThreadKey A02 = JRE.A02(directAggregatedMediaViewerController.A0T);
        if (A02 != null) {
            return AbstractC28761aE.A00(directAggregatedMediaViewerController.A0y).BSh(A02, str);
        }
        return null;
    }
}
