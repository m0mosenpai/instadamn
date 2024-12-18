package X;

import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;

/* renamed from: X.Fww, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36122Fww implements InterfaceC41501vz {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;

    public C36122Fww(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController;
        C158797Aq A05;
        String str;
        int A03 = C0f9.A03(-1692414199);
        int A032 = C0f9.A03(1638210307);
        if (obj != null && (A05 = DirectAggregatedMediaViewerController.A05((directAggregatedMediaViewerController = this.A00))) != null && (str = A05.A0S) != null) {
            String str2 = directAggregatedMediaViewerController.A0Y;
            if (str2 != null) {
                F2D.A00(directAggregatedMediaViewerController.A0y).A0B(str, str2);
            }
            DirectAggregatedMediaViewerController.A0Y(directAggregatedMediaViewerController, false);
        }
        C0f9.A0A(1693836542, A032);
        C0f9.A0A(1599994063, A03);
    }
}
