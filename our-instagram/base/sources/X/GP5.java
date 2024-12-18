package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GP5 implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ InterfaceC114785Gl A01;
    public final /* synthetic */ UserSession A02;

    public GP5(Fragment fragment, InterfaceC114785Gl interfaceC114785Gl, UserSession userSession) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = interfaceC114785Gl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.isResumed()) {
            boolean z = C3CZ.A0G;
            C69923Cb.A03(this.A01, this.A02, null);
        }
    }
}
