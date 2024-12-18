package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.io.File;

/* loaded from: classes9.dex */
public final class PP8 implements Runnable {
    public final /* synthetic */ ClipsEditMetadataController A00;

    public PP8(ClipsEditMetadataController clipsEditMetadataController) {
        this.A00 = clipsEditMetadataController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClipsEditMetadataController clipsEditMetadataController = this.A00;
        if (!clipsEditMetadataController.A0S) {
            File file = clipsEditMetadataController.A0L;
            if (file != null) {
                C38321qM c38321qM = clipsEditMetadataController.A0D;
                if (c38321qM != null) {
                    String A2a = c38321qM.A2a();
                    UserSession userSession = clipsEditMetadataController.A0s;
                    boolean A1b = AbstractC43593JPy.A1b(userSession);
                    if (A2a != null && AbstractC50633MWu.A08(userSession, file, A2a, -1L) != null) {
                        A1b = true;
                    } else {
                        C0f5 AEp = C18950wb.A01.AEp("ClipsEditMetadataController", 817902720);
                        AEp.ABW(DialogModule.KEY_MESSAGE, "Attempt to download failed. Could not find cache or file.");
                        AEp.report();
                    }
                    clipsEditMetadataController.A0S = A1b;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        AbstractC167007dF.A0J().post(new PP7(clipsEditMetadataController));
    }
}
