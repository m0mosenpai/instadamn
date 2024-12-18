package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

/* loaded from: classes4.dex */
public final class AQW implements View.OnClickListener {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public AQW(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-825176397);
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A00;
        C54842OMn c54842OMn = new C54842OMn(clipsTimelineEditorDrawerController.A0a);
        Context context = clipsTimelineEditorDrawerController.A0W;
        c54842OMn.A00(context, new ViewOnClickListenerC55457OkB(clipsTimelineEditorDrawerController, 24), AbstractC166997dE.A0p(context, 2131972368), R.drawable.instagram_report_pano_outline_24);
        new OJT(c54842OMn).A00(clipsTimelineEditorDrawerController.A0Y);
        C0f9.A0C(633632041, A05);
    }
}
