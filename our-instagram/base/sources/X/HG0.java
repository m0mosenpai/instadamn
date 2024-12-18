package X;

import android.content.Context;
import instagram.features.stories.fragment.ReelViewerFragment;

/* loaded from: classes7.dex */
public final class HG0 extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C1P1 A01;
    public final /* synthetic */ C145176gc A02;
    public final /* synthetic */ boolean A03;

    public HG0(Context context, C1P1 c1p1, C145176gc c145176gc, boolean z) {
        this.A02 = c145176gc;
        this.A00 = context;
        this.A03 = z;
        this.A01 = c1p1;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1224932423);
        super.onFail(abstractC115105If);
        if (!((ReelViewerFragment) this.A02.A18).A2r) {
            C9GR.A0D(this.A00, "onEffectSaveStateChanged_network_error");
            this.A01.onFail(abstractC115105If);
        }
        C0f9.A0A(719247336, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1122018956);
        int A0N = AbstractC167017dG.A0N(obj, 646415108);
        super.onSuccess(obj);
        if (!((ReelViewerFragment) this.A02.A18).A2r) {
            Context context = this.A00;
            int i = 2131972335;
            if (this.A03) {
                i = 2131972834;
            }
            C9GR.A07(context, i);
            this.A01.onSuccess(obj);
        }
        C0f9.A0A(-1734946373, A0N);
        C0f9.A0A(-358050151, A03);
    }
}
