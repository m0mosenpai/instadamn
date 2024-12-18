package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final /* synthetic */ class BQ1 extends C03E implements InterfaceC16660sJ {
    public BQ1(Object obj) {
        super(1, obj, BKF.class, "launchClipsSpinsAuthorsLinkTap", "launchClipsSpinsAuthorsLinkTap(Lcom/instagram/feed/media/Media;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C38321qM c38321qM = (C38321qM) obj;
        BKF bkf = (BKF) AbstractC25229BEm.A0o(c38321qM, this);
        Fragment fragment = bkf.A00;
        InterfaceC60442pS interfaceC60442pS = bkf.A02;
        UserSession userSession = bkf.A01;
        AbstractC55229Oez.A0C(fragment, userSession, c38321qM, interfaceC60442pS, fragment.getString(2131975629), c38321qM.A3u(userSession));
        return C0eB.A00;
    }
}
