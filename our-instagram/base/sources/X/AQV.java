package X;

import android.view.View;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

/* loaded from: classes4.dex */
public final class AQV implements View.OnClickListener {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public AQV(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(300919873);
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A00;
        if (clipsTimelineEditorDrawerController.A0n.A04 != null) {
            clipsTimelineEditorDrawerController.onBackPressed();
        } else {
            ClipsTimelineEditorDrawerController.A08(clipsTimelineEditorDrawerController);
            ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, false, true, false);
        }
        C0f9.A0C(-2118690283, A05);
    }
}
