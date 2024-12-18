package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.sup.voltron.SUPMediaStreamControllerDownloader;

/* loaded from: classes9.dex */
public final class P4P implements InterfaceC191378do {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ SUPMediaStreamControllerDownloader A02;

    @Override // X.InterfaceC191378do
    public final void onFailure(String str, boolean z) {
        C14360o3.A0B(str, 0);
        AbstractC195978lm.A02.A04("sup:MediaStreamControllerDownloader", str, null);
        this.A02.A05.compareAndSet(true, false);
    }

    public P4P(Context context, UserSession userSession, SUPMediaStreamControllerDownloader sUPMediaStreamControllerDownloader) {
        this.A02 = sUPMediaStreamControllerDownloader;
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC191378do
    public final void onSuccess() {
        SUPMediaStreamControllerDownloader sUPMediaStreamControllerDownloader = this.A02;
        AbstractC166987dD.A1Z(new C57166PZk(this.A00, sUPMediaStreamControllerDownloader, this.A01, null, 31), sUPMediaStreamControllerDownloader.A07);
    }
}
