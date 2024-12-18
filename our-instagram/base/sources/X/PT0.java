package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PT0 implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;

    public PT0(Bundle bundle, Fragment fragment, UserSession userSession) {
        this.A01 = fragment;
        this.A02 = userSession;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C22P c22p = C22P.A12;
        Fragment fragment = this.A01;
        AbstractC41671Ic3.A01(fragment.requireActivity(), this.A00, fragment, c22p, this.A02, true, false);
    }
}
