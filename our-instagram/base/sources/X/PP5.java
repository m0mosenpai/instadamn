package X;

import androidx.fragment.app.FragmentActivity;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.io.File;

/* loaded from: classes9.dex */
public final class PP5 implements Runnable {
    public final /* synthetic */ ClipsEditMetadataController A00;

    public PP5(ClipsEditMetadataController clipsEditMetadataController) {
        this.A00 = clipsEditMetadataController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClipsEditMetadataController clipsEditMetadataController = this.A00;
        FragmentActivity activity = clipsEditMetadataController.A0q.getActivity();
        if (activity != null) {
            File file = clipsEditMetadataController.A0L;
            if (file != null) {
                file.delete();
            }
            activity.onBackPressed();
        }
    }
}
