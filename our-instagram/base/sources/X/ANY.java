package X;

import android.content.DialogInterface;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

/* loaded from: classes4.dex */
public final class ANY implements DialogInterface.OnCancelListener {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public ANY(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        AnonymousClass229.A01(this.A00.A0a).A1m("EXIT_DIALOG_CANCEL");
    }
}
