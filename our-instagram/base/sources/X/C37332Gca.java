package X;

import android.view.View;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Gca, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C37332Gca implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ReelViewerFragment A01;

    public /* synthetic */ C37332Gca(ReelViewerFragment reelViewerFragment, int i) {
        this.A01 = reelViewerFragment;
        this.A00 = i;
    }

    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        C148566mR c148566mR;
        C41551w4 c41551w4;
        ReelViewerFragment reelViewerFragment = this.A01;
        int i = this.A00;
        InterfaceC143576dw interfaceC143576dw = (InterfaceC143576dw) AbstractC31172DnG.A0x((View) obj);
        if ((reelViewerFragment.A2h || ((i < 0 || (reelViewerFragment.A1C.Blt(i) != null && !reelViewerFragment.A1C.Blt(i).A0H.A1O)) && (c41551w4 = reelViewerFragment.A0a) != null && c41551w4.A0H.A1O && !reelViewerFragment.A2N)) && !reelViewerFragment.A2V && ((c148566mR = reelViewerFragment.mSuggestedHighlightsController) == null || (!c148566mR.A01))) {
            reelViewerFragment.A2N = true;
            View A0D = ((C147256kA) reelViewerFragment.mViewPager).A04.A0D(i);
            if (i > -1 && A0D != null) {
                InterfaceC143576dw interfaceC143576dw2 = (InterfaceC143576dw) A0D.getTag();
                C41551w4 Blt = reelViewerFragment.A1C.Blt(i);
                if (Blt != null && !Blt.A0E(reelViewerFragment.getSession()) && interfaceC143576dw2 != null) {
                    interfaceC143576dw2.EJj();
                }
            }
            interfaceC143576dw.EnN();
        } else {
            interfaceC143576dw.AGV();
        }
        return C0eB.A00;
    }
}
