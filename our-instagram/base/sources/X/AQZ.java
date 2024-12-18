package X;

import android.view.View;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

/* loaded from: classes4.dex */
public final class AQZ implements View.OnClickListener {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public AQZ(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-299733246);
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A00;
        ClipsTimelineEditorDrawerController.A08(clipsTimelineEditorDrawerController);
        clipsTimelineEditorDrawerController.A0k.A0O();
        ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, false, true, false);
        C0f9.A0C(-827850543, A05);
    }
}
