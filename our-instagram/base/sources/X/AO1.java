package X;

import android.content.DialogInterface;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

/* loaded from: classes4.dex */
public final class AO1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public AO1(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass229.A01(this.A00.A0a).A1m("EXIT_DIALOG_CANCEL");
    }
}
