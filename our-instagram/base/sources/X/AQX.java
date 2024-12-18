package X;

import android.view.View;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

/* loaded from: classes4.dex */
public final class AQX implements View.OnClickListener {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public AQX(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1581261644);
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A00;
        ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
        ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, true, true, false);
        clipsTimelineEditorDrawerController.A0G = true;
        C0f9.A0C(1563059222, A05);
    }
}
