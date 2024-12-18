package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* loaded from: classes8.dex */
public final class L6T {
    public final /* synthetic */ KBV A00;

    public L6T(KBV kbv) {
        this.A00 = kbv;
    }

    public final void A00(String str) {
        SegmentedProgressBar segmentedProgressBar;
        String str2;
        C14360o3.A0B(str, 0);
        KBV kbv = this.A00;
        View view = kbv.A00;
        if (view == null) {
            str2 = "childCameraFragmentHolder";
        } else {
            view.setVisibility(8);
            View view2 = kbv.A01;
            if (view2 == null) {
                str2 = "childViewerFragmentHolder";
            } else {
                view2.setVisibility(0);
                C47949LGf c47949LGf = kbv.A04;
                if (c47949LGf == null) {
                    str2 = "timelineController";
                } else {
                    c47949LGf.A01();
                    Fragment A0Q = kbv.getChildFragmentManager().A0Q(kbv.A06);
                    C14360o3.A0C(A0Q, "null cannot be cast to non-null type com.instagram.direct.visual.DirectVisualMessageViewerFragment");
                    DirectVisualMessageViewerController directVisualMessageViewerController = ((KCV) A0Q).A01;
                    if (directVisualMessageViewerController != null) {
                        if (directVisualMessageViewerController.A0f.isAdded()) {
                            C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
                            if (c47946LGa != null) {
                                DirectVisualMessageViewerController.A0F(directVisualMessageViewerController);
                                DirectVisualMessageViewerController.A0K(directVisualMessageViewerController, 11);
                                if (DirectVisualMessageViewerController.A00(directVisualMessageViewerController, C17060sy.A01.A01(directVisualMessageViewerController.A0m), str) == -1) {
                                    boolean z = true;
                                    if (directVisualMessageViewerController.A0c == 1) {
                                        z = false;
                                    }
                                    DirectVisualMessageViewerController.A0L(directVisualMessageViewerController, 1, z);
                                    return;
                                }
                                DirectVisualMessageViewerController.A0E(directVisualMessageViewerController);
                                int i = c47946LGa.A00;
                                C45093JxN A01 = c47946LGa.A01(i);
                                if (A01 == null || !A01.A0Y || (segmentedProgressBar = directVisualMessageViewerController.progressBar) == null) {
                                    return;
                                }
                                segmentedProgressBar.A05(i);
                                return;
                            }
                            return;
                        }
                        directVisualMessageViewerController.A0Q = str;
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
