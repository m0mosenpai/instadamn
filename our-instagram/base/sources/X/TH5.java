package X;

import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class TH5 implements MQM {
    public final /* synthetic */ Rb2 A00;

    public TH5(Rb2 rb2) {
        this.A00 = rb2;
    }

    @Override // X.MQM
    public final void DLE(Integer num) {
        AbstractC63248Sg4.A03(this.A00);
    }

    @Override // X.MQM
    public final void DLF() {
        Rb2 rb2 = this.A00;
        android.net.Uri uri = rb2.A02;
        if (uri != null) {
            if (uri.getPath() != null) {
                UserSession userSession = rb2.A08;
                C14360o3.A0A(userSession);
                android.net.Uri uri2 = rb2.A02;
                C14360o3.A0A(uri2);
                String path = uri2.getPath();
                C14360o3.A0A(path);
                new L7n(AuthenticityUploadMedium.IMAGE_PICKER, userSession, new TH4(rb2), path, rb2.A0B).A00();
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
