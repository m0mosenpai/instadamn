package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* loaded from: classes10.dex */
public final class Qg0 extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0i = AbstractC166987dD.A0i(c94754Oe, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        C95124Py c95124Py = C95124Py.A00;
        return AbstractC58320PtC.A0U(c94754Oe, A0i, AbstractC166987dD.A0i(c95124Py, "is_epd"), AbstractC166987dD.A0i(c95124Py, "is_e2ee"), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
    }

    public Qg0(int i) {
        super(i);
    }

    public Qg0() {
        super(909549267);
    }
}
