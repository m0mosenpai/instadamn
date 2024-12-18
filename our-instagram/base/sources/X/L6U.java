package X;

import com.instagram.direct.visual.DirectVisualMessageViewerController;

/* loaded from: classes8.dex */
public final class L6U {
    public final /* synthetic */ KBV A00;

    public L6U(KBV kbv) {
        this.A00 = kbv;
    }

    public final void A00() {
        DirectVisualMessageViewerController directVisualMessageViewerController;
        KBV kbv = this.A00;
        KCV kcv = (KCV) kbv.getChildFragmentManager().A0Q(kbv.A06);
        if (kcv != null && kcv.isResumed() && (directVisualMessageViewerController = kcv.A01) != null) {
            directVisualMessageViewerController.A0X("resume");
        }
    }
}
