package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class J4R implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C38085GpE A01;

    public J4R(Bundle bundle, C38085GpE c38085GpE) {
        this.A01 = c38085GpE;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C38085GpE c38085GpE = this.A01;
        c38085GpE.A02 = false;
        this.A00.remove("ClipsConstants.ARG_AUTO_LAUNCH_EXPLORE_CLIPS_VIEWER");
        UserSession userSession = c38085GpE.A04;
        FragmentActivity fragmentActivity = c38085GpE.A03;
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A2V, userSession);
        c116875Qr.A1G = c38085GpE.A05;
        AbstractC31173DnH.A1J(fragmentActivity, c116875Qr, userSession);
    }
}
