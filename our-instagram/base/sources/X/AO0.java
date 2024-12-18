package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

/* loaded from: classes4.dex */
public final class AO0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public AO0(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A00;
        UserSession userSession = clipsTimelineEditorDrawerController.A0a;
        AnonymousClass229.A01(userSession).A1m(MSV.A00(340));
        C447024a c447024a = AnonymousClass229.A01(userSession).A02;
        AbstractC167027dH.A10(c447024a);
        C447024a.A00(c447024a, "user_template_discard_video_click");
        ClipsTimelineEditorDrawerController.A08(clipsTimelineEditorDrawerController);
        clipsTimelineEditorDrawerController.A0k.A0O();
        ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, false, true, false);
    }
}
